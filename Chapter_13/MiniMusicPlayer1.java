/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import static javax.sound.midi.ShortMessage.NOTE_OFF;
import static javax.sound.midi.ShortMessage.NOTE_ON;
import javax.sound.midi.Track;

/**
 *
 * @author User
 */
public class MiniMusicPlayer1 {
    public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException {
        MiniMusicPlayer1 mini = new MiniMusicPlayer1();
        mini.play();
    }
    
    public void play() throws InvalidMidiDataException, MidiUnavailableException{
        try{
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            
            Sequence seq = new Sequence(Sequence.PPQ, 10);
            
            Track track = seq.createTrack();
            
            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(NOTE_ON, 2, 67, 100);
            MidiEvent noteOn = new MidiEvent(msg1, 1);
            track.add(noteOn);
            
            ShortMessage msg2 = new ShortMessage();
            msg2.setMessage(NOTE_OFF, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(msg2, 16);
            track.add(noteOff);
            
            player.setSequence(seq);
            player.start();
        }
        catch(Exception e){
            e.printStackTrace(); 
        }
    }
}
