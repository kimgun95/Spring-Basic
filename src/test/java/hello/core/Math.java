package hello.core;

public class Math {

//    생성자를 못 만들게!!!
    private Math() {

    }

    public static int abs(int n) {
        return n < 0 ? -n : n;
    }
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
    public static int max(int a, int b) {
        return a > b ? a : b;
    }


}
