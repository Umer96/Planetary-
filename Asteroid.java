package sjsu.edu;
/**
 * Asteroid.java is the subclass of AstronomicalBody.java
 *  with 2 constructor.
 */
public class Asteroid extends AstronomicalBody {
    /**
     * The first constructor has 2 parameters with
     *      mass and name. This constructor is for the
     *      asteroid has mass and name.
     */
    public Asteroid(double mass, String name){
        super(mass, name);
    }
    /**
     * The second constructor has 1 parameters with
     *      mass only. This constructor is for the
     *      asteroid has mass only (no names).
     */
    public Asteroid(double mass){
        super (mass, "");
    }
}
