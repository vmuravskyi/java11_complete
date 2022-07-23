package com.muravskyi.section26_midi;

import com.muravskyi.section26_midi.Chord.Type;
import java.util.List;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

public class App2 {

    public static void main(String[] args)
        throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {

        Receiver receiver = MidiSystem.getReceiver();

        List<Chord> chords = List.of(
            new Chord(60, Type.MAJOR),
            new Chord(60, Type.SUS4),
            new Chord(60, Type.MAJOR)
        );

        int time = 0;
        for (var chord : chords) {
            for (var note : chord) {
                receiver.send(new ShortMessage(ShortMessage.NOTE_ON, 0, note, 127), time * 1_000_000L);
                receiver.send(new ShortMessage(ShortMessage.NOTE_OFF, 0, note, 127), (time + 1) * 1_000_000L);
            }
            time++;
        }
        Thread.sleep(7000);

    }

}
