package hello.core;

public class ColaCan {

    private static int numCreated;
//    private int remainMl;

    public ColaCan() {
        ++numCreated;
//        this.remainMl = remainMl;
    }

    public void printStatus() {
        System.out.println("# Cola Produced: " + numCreated);
    }

}
