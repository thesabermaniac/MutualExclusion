public class T1 extends Thread {
    int favoredThread;
    boolean t1WantsToEnter;
    boolean t2WantsToEnter;

    public T1(int ft, boolean t1wte, boolean t2wte){
        favoredThread = ft;
        t1WantsToEnter = t1wte;
        t2WantsToEnter = t2wte;
    }

    public void run(){
        try {
            Thread.sleep(1000);
            t1WantsToEnter = true;
            while (favoredThread == 2){
                while (t2WantsToEnter);
                favoredThread = 1;
            }
            System.out.println("T1 entering critical section");
            Thread.sleep(2000);
            System.out.println("T1 exiting critical section");
            t1WantsToEnter = false;
            System.out.println("T1 entering non-critical section");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
