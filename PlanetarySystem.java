package sjsu.edu;

import java.util.ArrayList;

/**
 * PlanetarySystem.java represents a planetary system.
 * It extend arraylist<AstronomialBody></AstronomialBody>
 *
 * No constructor
 */

public class PlanetarySystem extends ArrayList<AstronomicalBody> {
    /**
     * One new instance variable Star star.
     */
    Star star;

    /**
     * ab is not a star object, then add it to
     * planetarysystem
     * @param ab object
     * @return true or false
     */

    public boolean add(AstronomicalBody ab){
        /**
         * If ab is an instance of Star, and the
         * instance variable not set yet and set
         * instance variable Star star to this star
         * and return true.
         */
        if(!(ab instanceof Star)){
            super.add(ab);
            return true;
        }
        else{
            if(star == null){
                super.add(ab);
                star = (Star) ab;
                return true;
            }
            /**
             * if the instance variable Star was
             * already set to some other star then
             * do not add to this planetary system
             * and return false.
             */
            else{
                return false;
            }
        }
    }

    /**
     * This method find the sum of astronomicalBody objects
     * @return sum of the mass of astronomical body
     */
    public double getTotalMass(){
        double total = 0;
        for (int i= 0; i<this.size();i++){
            total += this.get(i).mass;
        }
        return total;
    }

    /**
     * This checks if 2 planetary systems are equal if:
     * 1) stars are equal
     * 2) their total masses are equal
     * 3) their sizes are equal
     * @param other object
     * @return true if size & totalmass & their stars otherwise false
     */
    public boolean equals(PlanetarySystem other){
        if(this.star.equals(other.star)==true && this.getTotalMass()==other.getTotalMass() && this.size()==other.size()){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * This describes the detail of the planetary system
     * @return description of the planetery system
     */
    public String toString(){
        String descriptionOfPlanetarySystem = "Extraterrestrial bodies in a solar system: " + this.size();
        for(int k=0; k<this.size(); k++){
            descriptionOfPlanetarySystem+= this.get(k).name+ "->" +this.get(k).mass;
        }
        return descriptionOfPlanetarySystem;
    }
}
