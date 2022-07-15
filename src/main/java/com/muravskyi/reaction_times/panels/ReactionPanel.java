package com.muravskyi.reaction_times.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;

import com.muravskyi.reaction_times.entity.ReactionTime;
import com.muravskyi.reaction_times.interfaces.TestListener;

public class ReactionPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private TestListener testListener;
	private int numTests = 10;
	private int test = 0;
	private SwingWorker<Boolean, Void> worker;

	List<com.muravskyi.reaction_times.entity.ReactionTime> reactionTimes = new ArrayList<>();
	Long startTime = 0L;

	public ReactionPanel() {
		JLabel textLabel = new JLabel("Press spacebar when color changes", SwingConstants.CENTER);
		setLayout(new BorderLayout());
		add(textLabel, BorderLayout.CENTER);
		setBackground(Color.red);

		addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent e) {
				startTest();
			}
		});

	}

	public void setNumTests(int num) {
		this.numTests = num;
	}

	public void startTest() {

		setBackground(Color.red);
		reactionTimes.clear();

		worker = new SwingWorker<Boolean, Void>() {

			@Override
			protected Boolean doInBackground() throws Exception {

				Random random = new Random();

				test = 0;

				while (test < numTests) {
					Thread.sleep(random.nextInt(5000) + 3000);
					setBackground(Color.green);
					startTime = System.currentTimeMillis();
					test++;
				}

				return true;
			}
		};

		worker.execute();
	}

	public void stop() {
		if (worker != null) {
			worker.cancel(true);
			testListener.testComplete();
		}
	}

	public void setTestListener(TestListener testListener) {
		this.testListener = testListener;

	}

	public boolean hasData() {
		return reactionTimes.size() != 0;
	}

	public void onSpacebar() {

		long currentTime = System.currentTimeMillis();

		if (getBackground() == Color.green) {
			long reactionTime = currentTime - startTime;

			reactionTimes.add(new ReactionTime(new Date(), reactionTime));
			
			setBackground(Color.red);

			if (test == numTests) {
				testListener.testComplete();
			}
		}
	}

	public long getAverageReactionTime() {
		return Math.round(reactionTimes.stream().mapToLong(a -> a.getReactionTime()).average().getAsDouble());
	}

	public List<com.muravskyi.reaction_times.entity.ReactionTime> getReactionTimes() {
		return reactionTimes;
	}
}
