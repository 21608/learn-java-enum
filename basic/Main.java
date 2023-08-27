package basic;

public class Main {
    public static void main(String[] args) {
        System.out.println(HowToUseEnum.JANUARY.toString() + ":" + HowToUseEnum.JANUARY.setTemperature(2));
        System.out.println(HowToUseEnum.JULY.toString() + ":" + HowToUseEnum.JULY.setTemperature(37));

        System.out.println("APPLE:" + Ordinal.APPLE.numberOfFruits());
        System.out.println("ORANGE:" + Ordinal.ORANGE.numberOfFruits());
        System.out.println("BANANA:" + Ordinal.BANANA.numberOfFruits());
    }
}
