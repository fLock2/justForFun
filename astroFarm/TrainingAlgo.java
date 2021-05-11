public class TrainingAlgo{
    Planet currPlanet;
    public TrainingAlgo(Planet planet){
        currPlanet = planet;
    }
    public Planet changePlanet(Planet newPlanet){
       Planet temp = currPlanet;
       currPlanet = newPlanet;
       return temp; 
    }
    public int getTicks(int level){
        int multiplier = Math.abs((currPlanet.getGravity()/9.8)-1);
    }
}