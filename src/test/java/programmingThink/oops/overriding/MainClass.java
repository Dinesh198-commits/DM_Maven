package programmingThink.oops.overriding;

public class MainClass {

    public static void main(String[] args){
        SBI sb = new SBI();
        PNB pnb = new PNB();
        System.out.println(sb.rateOfInterest());
        System.out.println(pnb.rateOfInterest());
    }
}
