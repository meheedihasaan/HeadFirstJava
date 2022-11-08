/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13;

import java.util.Scanner;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import static javax.sound.midi.ShortMessage.NOTE_OFF;
import static javax.sound.midi.ShortMessage.NOTE_ON;
import static javax.sound.midi.ShortMessage.PROGRAM_CHANGE;
import javax.sound.midi.Track;

/**
 *
 * @author User
 */
public class MiniMusicCommandLine {
    public static void main(String[] args) throws InvalidMidiDataException, MidiUnavailableException {
        MiniMusicCommandLine mini = new MiniMusicCommandLine();
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[2];
        arr[0] = sc.nextLine();
        arr[1] = sc.nextLine();
        
        if(arr.length > 2){
            System.out.println("Don't forget the instrument and note args");
        }
        else{
            int instrument = Integer.parseInt(arr[0]);
            int note = Integer.parseInt(arr[1]);
            mini.play(instrument, note);
        }
    }
    
    public void play(int instrument, int note) throws InvalidMidiDataException, MidiUnavailableException{
        try{
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            
            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(PROGRAM_CHANGE, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(msg1, 1);
            track.add(changeInstrument);
            
            ShortMessage msg2 = new ShortMessage();
            msg2.setMessage(NOTE_ON, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(msg2, 1);
            track.add(noteOn);
            
            ShortMessage msg3 = new ShortMessage();
            msg3.setMessage(NOTE_OFF, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(msg3, 16);
            track.add(noteOff);
            
            player.setSequence(seq);
            player.start();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
