import java.util.*;
public class User {
        private final String[] atmospheres = {"No Atmosphere", "CO2 Heavy", "Earth-like", "Gas Giant"};
	private ArrayList<Planet> farmers;
    public static void main(String[] args){
       	Boolean keepGoing = true; 
	farmers = new ArrayList<Astronaut>();
        ArrayList<Planet> knownPlanets = new ArrayList<Planet>();
        addInitialPlanets(knownPlanets);
	printArrList(knownPlanets);
	System.out.print("What do you want to name your first Astronaut? ");
    }
    private static void addInitialPlanets(ArrayList<Planet> planetList){
        if(planetList.size()>=1){
            return;
        }
        planetList.add(new Planet("Mercury", 3.70, "No Atmosphere"));
	planetList.add(new Planet("Venus", 8.87, "CO2 Heavy"));
        planetList.add(new Planet("Earth", 9.81, "Earth-like"));
	planetList.add(new Planet("Mars", 3.72, "CO2 Heavy"));
	planetList.add(new Planet("Jupiter", 24.79, "Gas Giant"));
	planetList.add(new Planet("Saturn", 10.44, "Gas Giant"));
	planetList.add(new Planet("Uranus", 8.69, "Gas Giant"));
	planetList.add(new Planet("Neptune", 11.15, "Gas Giant"));
    }
    private static void printStatus(){
	System.out.println("\n current status of astronauts: ");
	for(Astronaut farmer : farmers){
		System.out.println(farmer.toString());
	}
    }
}
