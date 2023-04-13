public class CrankshaftCalculator extends Thread {
    public static boolean measure_on;
    public int remembered_turns;
    public static double rpm_out;
    public static int x;
    public void run(){
        while(true){
            Inl_4_cyl_1.sensor=0;
            measure_on = true;
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            measure_on=false;
            remembered_turns = Inl_4_cyl_1.sensor;

            rpm_out = ((remembered_turns*2)*120);
            if(((remembered_turns*2)*120)!=0){
                run.framed.refreshData(((int)rpm_out) + (int)( (Math.random()*150)-0));

            }
        }
    }
}
