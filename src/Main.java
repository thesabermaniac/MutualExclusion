public class Main {
    static int favoredThread = 1;
    static boolean t1WantsToEnter = false;
    static boolean t2WantsToEnter = false;

    public static void main(String[] args) {
        T1 t1 = new T1(favoredThread, t1WantsToEnter, t2WantsToEnter);
        T2 t2 = new T2(favoredThread, t1WantsToEnter, t2WantsToEnter);
        t1.start();
        t2.start();
    }
}
