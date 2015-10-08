package org.study.example.pattern.singleton;

public class MainSingleton {

    public static void main(String[] args) {
        try {
            Universe godUniverse = Universe.getUniverse();
            Universe bigBangUniverse = Universe.getUniverse();

            godUniverse.setGalaxyCount(3);

            System.out.println("Galaxies in God Universe: " + godUniverse.getGalaxyCount());
            System.out.println("Galaxies in Big Bang Universe: " + bigBangUniverse.getGalaxyCount());
        } catch (Exception e) {
        }
    }

}
