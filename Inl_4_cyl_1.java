public class Inl_4_cyl_1 extends Thread{
    static int sensor = 0;
    public void run(){
        if(CrankshaftCalculator.measure_on){
            sensor++;
        }
        PlayTone.mChannels[9].setPitchBend(((((int) CrankshaftCalculator.rpm_out) + (int)( (Math.random()*150)-0))*100)/1200);
        PlayTone.mChannels[9].setPolyPressure(36,((((int) CrankshaftCalculator.rpm_out) + (int)( (Math.random()*150)-0))*100)/1200);
        PlayTone.mChannels[9].setPolyPressure(37,((((int) CrankshaftCalculator.rpm_out) + (int)( (Math.random()*150)-0))*100)/1200);

        run.framed.selectFire(1,true);
        PlayTone.mChannels[9].noteOn(36, 90);
        PlayTone.mChannels[9].noteOff(36);

        try {
            sleep(Inl_4.firing_delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        run.framed.selectFire(1,false);
    }
}
