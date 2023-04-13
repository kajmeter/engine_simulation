public class Inl_4_cyl_4 extends Thread {
    public void run(){
        run.framed.selectFire(4,true);
   //     System.out.println("I fired as cylinder [ 4 ] from Inl_4");

        PlayTone.mChannels[9].noteOn(36, 95);//On channel 0, play note number 60 with velocity 100
        PlayTone.mChannels[9].noteOff(36);//turn of the note

        try {
            sleep(Inl_4.firing_delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        run.framed.selectFire(4,false);
    }
}
