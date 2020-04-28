package sjsu.edu;

public class PlanetarySystemTester {

    public static void main(String[] args) {
        Star sun = new Star(2000000, "Sun");
        Star aldebaran = new Star(3000000, "Aldebaran");
        Planet earth = new Planet(195, "Earth");
        Planet jupiter = new Planet(1234, "Jupiter");
        Planet aldebaranB = new Planet(4600, "Aldebaran b");
        Planet abc = new Planet(142, "Abc");
        Asteroid ceres = new Asteroid(42, "Ceres");
        Asteroid noName = new Asteroid(3);

        /**
         *  you can create more AstronomicalBodies
         */
        PlanetarySystem solarSystem = new PlanetarySystem();

        /**
         * 4 solarsystem (objects) created
         */

        PlanetarySystem solarSystem1 = new PlanetarySystem();
        PlanetarySystem solarSystem2 = new PlanetarySystem();
        PlanetarySystem solarSystem3 = new PlanetarySystem();
        PlanetarySystem solarSystem4 = new PlanetarySystem();

        solarSystem.add(sun);
        /**
         * should not be added and should not replace
         * sun as solarSystem star
         * since solarSystem star was already set
         */
        solarSystem.add(aldebaran);
        solarSystem.add(earth);
        solarSystem.add(ceres);

        /**
         * solarSystem1 has 2 planet, 1 asteroid, 1 star
         */
        solarSystem1.add(new Planet(1938, "Krypton"));
        solarSystem1.add(jupiter);
        solarSystem1.add(new Asteroid(84));
        solarSystem1.add(new Star(225, "Superman"));

        /**
         * solarSystem2 has 2 planet, 2 stars
         */
        solarSystem2.add(aldebaranB);
        solarSystem2.add(new Planet(1953, "MI6"));
        solarSystem2.add(new Star(0.07, "JamesBond"));
        solarSystem2.add(new Star(76, "M" ));

        /**
         * solarSystem3 has 2 planet, 2 asteroids
         */
        solarSystem3.add(abc);
        solarSystem3.add(new Planet(1939, "Batman"));
        solarSystem3.add(noName);
        solarSystem3.add(new Asteroid(1940, "Joker"));

        /**
         * identifical galaxy as solarsystem
         */
        solarSystem4.add(sun);
        solarSystem4.add(aldebaran);
        solarSystem4.add(earth);
        solarSystem4.add(ceres);

        /**
         * you can add more AstornomicalBodies
         *  to your planetary systems
         *  should call overridden toString
         */
        System.out.println(solarSystem);
        System.out.println("\n");
        System.out.println(solarSystem1.toString());
        System.out.println("\n");
        System.out.println(solarSystem2.toString());
        System.out.println("\n");
        System.out.println(solarSystem3.toString());

        /**
         * create two other PlanetarySystem
         * one should produce true when calling equals
         * method comparing with solarSystem
         * another should produce false
         */
        System.out.println("\n");
        System.out.println("Is solarSystem and solarSystem4 are the same? "+solarSystem.equals(solarSystem4));
        System.out.println("\n");
        System.out.println("Is solarSystem2 and solarSystem3 are the same? "+solarSystem2.equals(solarSystem1));
    }
}
