package com.muravskyi.section26_midi;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

public class Bach {

    public static void main(String[] args)
        throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {

        Receiver receiver = MidiSystem.getReceiver();

        int[] notes = {
            60, 64, 67, 72, 76, 67, 72, 76, 60, 64, 67, 72, 76, 67, 72, 76,
            60, 62, 69, 74, 77, 69, 74, 77, 60, 62, 69, 74, 77, 69, 74, 77,
            59, 62, 67, 74, 77, 67, 74, 77, 59, 62, 67, 74, 77, 67, 74, 77,
            60, 64, 67, 72, 76, 67, 72, 76, 60, 64, 67, 72, 76, 67, 72, 76,
            60, 64, 69, 76, 81, 69, 76, 81, 60, 64, 69, 76, 81, 69, 76, 81,
            60, 62, 66, 69, 74, 66, 69, 74, 60, 62, 66, 69, 74, 66, 69, 74,
            59, 62, 67, 74, 79, 67, 74, 79, 59, 62, 67, 74, 79, 67, 74, 79,
            59, 60, 64, 67, 72, 64, 67, 72, 59, 60, 64, 67, 72, 64, 67, 72,
            57, 60, 64, 67, 72, 64, 67, 72, 57, 60, 64, 67, 72, 64, 67, 72,
            50, 57, 62, 66, 72, 62, 66, 72, 50, 57, 62, 66, 72, 62, 66, 72,
            55, 59, 62, 67, 71, 62, 67, 71, 55, 59, 62, 67, 71, 62, 67, 71,
            55, 58, 64, 67, 73, 64, 67, 73, 55, 58, 64, 67, 73, 64, 67, 73,
            53, 57, 62, 69, 74, 62, 69, 74, 53, 57, 62, 69, 74, 62, 69, 74,
            53, 56, 62, 65, 71, 62, 65, 71, 53, 56, 62, 65, 71, 62, 65, 71,
            52, 55, 60, 67, 72, 60, 67, 72, 52, 55, 60, 67, 72, 60, 67, 72,
        };
        int[] times = {0, 0, 0};

        for (int i = 0; i < notes.length; i++) {
            int note = notes[i];
//            int time = times[i];
//            receiver.send(new ShortMessage(ShortMessage.NOTE_ON, 0, note, 127), time * 1000);
            receiver.send(new ShortMessage(ShortMessage.NOTE_ON, 0, note, 99), 0);
            Thread.sleep(225);
        }


    }

}
