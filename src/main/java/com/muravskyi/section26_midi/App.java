package com.muravskyi.section26_midi;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

public class App {

    public static void main(String[] args)
        throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {

        Receiver receiver = MidiSystem.getReceiver();

        // create midi message1
        ShortMessage message1 = new ShortMessage();
        ShortMessage message2 = new ShortMessage();
        ShortMessage message3 = new ShortMessage();
        message1.setMessage(ShortMessage.NOTE_ON, 0, 60, 127);
        message2.setMessage(ShortMessage.NOTE_ON, 0, 64, 127);
        message3.setMessage(ShortMessage.NOTE_ON, 0, 67, 127);

        receiver.send(message1, -1);
        receiver.send(message2, -1);
        receiver.send(message3, -1);

        Thread.sleep(3000);


    }

}
