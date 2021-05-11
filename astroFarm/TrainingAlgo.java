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
        double gravMultiplier = Math.abs(currPlanet.getGravity()/9.8);
        if(gravMultiplier<1.0){
            gravMultiplier=1/gravMultiplier;
        }
        gravMultiplier*=3;
        double usedLevel = (double)level * 5;
        int calcTicks = (int)(gravMultiplier*usedLevel/15);
        return calcTicks;
    }
}