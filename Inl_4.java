
public class Inl_4{
    public static int firing_delay = 25;
    private static Inl_4_cyl_1 cyl1;
    private static Inl_4_cyl_2 cyl2;
    private static Inl_4_cyl_3 cyl3;
    private static Inl_4_cyl_4 cyl4;

    public static void asynctestrun() throws InterruptedException {
      //  CompletableFuture.runAsync(cyl1).thenRun(cyl3).thenRun(cyl4).thenRun(cyl2);
        cyl1 = new Inl_4_cyl_1();cyl2 = new Inl_4_cyl_2();
        cyl3 = new Inl_4_cyl_3();cyl4 = new Inl_4_cyl_4();
        cyl1.start();cyl1.join();
        cyl3.start();cyl3.join();
        cyl4.start();cyl4.join();
        cyl2.start();cyl2.join();

    }
}

