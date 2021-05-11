public class Planet{
    private String name;
    private double gravity;
    private String air;
    private String soil;
    public Planet(String name, double gravity, String air, String soil){
        this.name = name;
        this.gravity = gravity;
        this.air = air;
        this.soil = soil;
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
    public String getSoil(){
        return soil;
    }
    public String toString(){
        String printString = "Name: " + name;
        printString+="\nGravity: " + gravity;
        printString+="\nAir type: " + air;
        printString+="\nSoil type: " + soil;
        /*printString+="\nCurrent Plants: ";
        for(Plant p : currentPlants){
            printString+=p + " ";
        }*/
        printString+="\n";
        return printString;
    }
}