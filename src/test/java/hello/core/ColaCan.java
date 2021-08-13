package hello.core;

public class ColaCan {

    private static int numCreated;
    private int remainMl;

    public ColaCan(int remainMl) {
        ++numCreated;
        this.remainMl = remainMl;
    }

    public static void printStatus() {
        System.out.println("# Cola Produced: " + numCreated);
    }

}
