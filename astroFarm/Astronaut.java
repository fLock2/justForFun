public class Astronaut{
    String name;
    int level;
    int ticks;
    TrainingAlgo algo;
    //ArrayList<Plant> plants; TODO: implement plants, allow astronaut to have multiple amounts of various plants
    Boolean inTraining;
    public Astronaut(String name){
        this.name = name;
        level = 1;
        ticks = 0;
        algo = new TrainingAlgo();
        inTraining=false;
    }
    public Astronaut(String name, TrainingAlgo algo){
        this.name = name;
        level = 1;
        ticks = 0;
        this.algo = algo;
        inTraining=false;
    }
    public Astronaut(String name, TrainingAlgo algo, int level){
        this.name = name;
        this.level = level;
        ticks = 0;
        this.algo = algo;
        inTraining=false;
    }
    public Astronaut(String name, int level){
        this.name = name;
        this.level = level;
        ticks = 0;
        this.algo = new TrainingAlgo();
        inTraining=false;
    }
    public void train(){
        if(inTraining && ticks==1){
            level++;
            inTraining=false;
        }
       tick(); 
    }
    public void startTraining(){
        ticks = algo.getTicks(level);
    }
    public void tick(){
        if(ticks>0){
            ticks--;
        }
    }
    public String toString(){
        String printString = "Name: " + name;
        printString+="\nLevel: " + level;
        printString+="\nCurrent Status: ";
        if(ticks==0){
            printString+="Inactive";
        }
        else{
            /*if(currPlant!=null){ TODO: implement plants
                printString+="Planting " + getCurrPlants();
            }*/
            //else{
                printString+="Training, " + ticks + " ticks left.";
            //}
        }
        printString+="\nSoil type: " + soil;
        printString+="\n";
        return printString;
    }
}