public class T2 extends Thread {
    int favoredThread;
    boolean t1WantsToEnter;
    boolean t2WantsToEnter;

    public T2(int ft, boolean t1wte, boolean t2wte){
        favoredThread = ft;
        t1WantsToEnter = t1wte;
        t2WantsToEnter = t2wte;
    }

    public void run(){
        try {
            t2WantsToEnter = true;
            while (favoredThread == 1){
                while (t1WantsToEnter);
                favoredThread = 2;
            }
            System.out.println("T2 entering critical section");
            System.out.println("T2 exiting critical section");
            t2WantsToEnter = false;
            System.out.println("T2 entering non-critical section");
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
