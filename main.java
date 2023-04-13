import javax.sound.midi.MidiUnavailableException;

public class main {
    public static void main(String[] args) throws InterruptedException, MidiUnavailableException {
        Inl_4 inl4 = new Inl_4();
        PlayTone.config();
        //tone.start();
        EngineStarter starter = new EngineStarter();
        starter.start();
        CrankshaftCalculator crcal = new CrankshaftCalculator();
        crcal.start();
        run.main();
    }
}
