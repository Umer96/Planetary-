package sjsu.edu;

/**
 * Planet.java is subclass of AstrologicalBody.java.
 *  It does not introduce any new instance variables
 *  or methods.
 */

public class Planet extends AstronomicalBody {
    /**
     * 1 constructor and 2 parameters that calls
     *      super class constructor.
     */
    public Planet (double mass, String name){
        super(mass, name);
    }
}
