import javax.sound.midi.*;

public class PlayTone{
    public static Synthesizer midiSynth;
    public static Instrument[] instr;
    public static MidiChannel[] mChannels;

    public static void config() throws MidiUnavailableException {
        midiSynth = MidiSystem.getSynthesizer();
        midiSynth.open();


        instr = midiSynth.getDefaultSoundbank().getInstruments();
        mChannels = midiSynth.getChannels();
        midiSynth.loadInstrument(instr[9]);
      //  PlayTone.mChannels[9].setPitchBend(90);
       // PlayTone.mChannels[9].setPolyPressure(37,90);
    }


    //old method
    public void run() {
        try {
            midiSynth = MidiSystem.getSynthesizer();
            midiSynth.open();


            instr = midiSynth.getDefaultSoundbank().getInstruments();
            mChannels = midiSynth.getChannels();
            //midiSynth.loadInstrument(instr[9]);
            midiSynth.loadInstrument(instr[0]);

                    //(int)(Math.random()*100)+80
            int tone_iteration = 1;
            while (true){
                Thread.sleep(Inl_4.firing_delay);

                int x = ((int)CrankshaftCalculator.rpm_out*100)/1200;
/*
 */
                int channel = 9;
                int notenumber = 37;

                if(tone_iteration==1){
                    mChannels[channel].noteOn(36, x);
                    mChannels[channel].noteOff(36);
                }else if(tone_iteration==2){
                    mChannels[channel].noteOn(36, x);
                    mChannels[channel].noteOff(36);
                }else if(tone_iteration==3){
                    mChannels[channel].noteOn(36, x);
                    mChannels[channel].noteOff(36);
                }else if(tone_iteration==4){
                    mChannels[channel].noteOn(36, x);
                    mChannels[channel].noteOff(36);
                }

                if(tone_iteration==4){
                    tone_iteration=1;
                }else if(tone_iteration!=4){
                    tone_iteration++;
                }
            }

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
