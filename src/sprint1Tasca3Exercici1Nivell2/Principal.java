package sprint1Tasca3Exercici1Nivell2;

import java.util.HashSet;
import java.util.Set;
public class Principal {

	public static void main(String[] args) {
        Set<Restaurant> restaurantSet = new HashSet<>();
        
        restaurantSet.add(new Restaurant("restaurant1", 8));
        restaurantSet.add(new Restaurant("restaurant1", 7));
        restaurantSet.add(new Restaurant("restaurant1", 8)); // Duplicate, no s'afegirà
        restaurantSet.add(new Restaurant("restaurant2", 10));
        
        System.out.println("HashSet contents:");
        for (Restaurant r : restaurantSet) {
            System.out.println(r);
        }
    }
}
