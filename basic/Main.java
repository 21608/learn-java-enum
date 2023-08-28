package basic;

import java.util.EnumSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(HowToUseEnum.JANUARY.toString() + ":" + HowToUseEnum.JANUARY.setTemperature(2));
        System.out.println(HowToUseEnum.JULY.toString() + ":" + HowToUseEnum.JULY.setTemperature(37));

        System.out.println("APPLE:" + Ordinal.APPLE.numberOfFruits());
        System.out.println("ORANGE:" + Ordinal.ORANGE.numberOfFruits());
        System.out.println("BANANA:" + Ordinal.BANANA.numberOfFruits());

        Set<HowToUseEnum> enumSets = EnumSet.of(HowToUseEnum.JANUARY, HowToUseEnum.JULY); 

        System.out.println("enumSets_size:" + enumSets.size());
        System.out.println("contain_JANUARY? " + enumSets.contains(HowToUseEnum.JANUARY));
        System.out.println("contain_JULY? " + enumSets.contains(HowToUseEnum.JULY));
    }
}
