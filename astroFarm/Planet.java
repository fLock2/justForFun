public class Planet{
    private String name;
    private double gravity;
    private String air;
    public Planet(String name, double gravity, String air){
        this.name = name;
        this.gravity = gravity;
        this.air = air;
    }
    public String getName(){
        return name;
    }
    public double getGravity(){
        return gravity;
    }
    public String getAir(){
        return air;
    }
    public String toString(){
        String printString = "Name: " + name;
        printString+="\nGravity: " + gravity;
        printString+="\nAir type: " + air;
        /*printString+="\nCurrent Plants: ";
        for(Plant p : currentPlants){
            printString+=p + " ";
        }*/
        printString+="\n";
        return printString;
    }
}