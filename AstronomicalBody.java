package sjsu.edu;
/**
 * general class for asteroid, planet, and star.
 */

public class AstronomicalBody {
    /**
     * 2 instance variables: mass and name of planet/star/asteroid.
     */
    protected double mass;
    protected String name;

    /**
     * 1 constructor with 2 parameters: initialized as mass and
     *      name of the astrological body.
     */
    public AstronomicalBody(double mass, String name){
        this.mass = mass;
        this.name = name;
    }
    /**
     * method that prints out "Rotating around a star".
     */
    public void rotate() {
        System.out.println("Rotating around a star");
    }
}