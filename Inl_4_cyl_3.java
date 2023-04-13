public class Inl_4_cyl_3 extends Thread {
    public void run(){
        run.framed.selectFire(3,true);
     //   System.out.println("I fired as cylinder [ 3 ] from Inl_4");

        PlayTone.mChannels[9].noteOn(37, 100);//On channel 0, play note number 60 with velocity 100
        PlayTone.mChannels[9].noteOff(37);//turn of the note

        try {
            sleep(Inl_4.firing_delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        run.framed.selectFire(3,false);
    }
}
