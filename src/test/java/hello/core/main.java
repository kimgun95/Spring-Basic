package hello.core;

public class main {

    public static void main(String[] args) {
//        int absVal = Math.abs(-2);
//        int minVal = Math.min(100, -200);
//        System.out.println(absVal + " and " + minVal);


//        Math math = new Math();
//        int absVal = math.abs(-2);
//        int minVal = Math.min(100, -200);

//        System.out.println(absVal + " and " + minVal);

//        ColaCan colaCan1 = new ColaCan();
//        ColaCan colaCan2 = new ColaCan();
//        colaCan1.printStatus();


        ColaCan colaCan1 = new ColaCan(100);
        ColaCan colaCan2 = new ColaCan(50);
        colaCan1.printStatus();

    }

}
