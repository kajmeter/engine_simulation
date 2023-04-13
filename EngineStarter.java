public class EngineStarter extends Thread{
    public void run(){
        while(true){
            try {
                Inl_4.asynctestrun();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
