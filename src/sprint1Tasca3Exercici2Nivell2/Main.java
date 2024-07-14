package sprint1Tasca3Exercici2Nivell2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
        // HashSet per evitar duplicats (nom i puntuació iguals)
        Set<Restaurant> restaurantSet = new HashSet<>();
        
        restaurantSet.add(new Restaurant("restaurant1", 8));
        restaurantSet.add(new Restaurant("restaurant1", 7));
        restaurantSet.add(new Restaurant("restaurant1", 8)); // Duplicat, no s'afegirà
        restaurantSet.add(new Restaurant("restaurant2", 10));
        
        System.out.println("HashSet contents:");
        for (Restaurant r : restaurantSet) {
            System.out.println(r);
        }
        
        // TreeSet per ordenar els objectes
        Set<Restaurant> orderedSet = new TreeSet<>(restaurantSet);
        System.out.println("\nTreeSet (ordenat) contents:");
        for (Restaurant r : orderedSet) {
            System.out.println(r);
        }
    }
}

