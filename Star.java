package sjsu.edu;
/**
 * Star.java is another subclass to AstronomicalBody.java
 */

public class Star extends AstronomicalBody {
    /**
     * 1 constructor with 2 parameters
     */
    public Star (double mass, String name){
        super(mass, name);
    }
    /**
     * Since star does not rotate around a star. so we override the method
     *      in the method in AstronomicalBody.
     */
    @Override
    public void rotate(){

        System.out.println("Rotating around the center of a galaxy");
    }

    /**
     *This method to check if two stars are equal. If there
     * are equal then they are the same star.
     * @param other new object
     * @return true if name and mass are equal otherwise false
     */
    public boolean equals (Star other){
        if(this.name.equals(other.name) && (this.mass == other.mass))
            return true;
        else
            return false;
    }
}
