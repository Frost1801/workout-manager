

public class Activity {
    public Activity( String name, int nOfSeries, int nOfReps, int pauseAmount, int weight){
        this.name = name;
        this.nOfSeries = nOfSeries;
        this.nOfReps = nOfReps;
        this.pauseAmount = pauseAmount;
        this.weight = weight;

    }
    public Activity( String name,int nOfSeries, int nOfReps,  int pauseAmount){
        this.name = name;
        this.nOfSeries = nOfSeries;
        this.nOfReps = nOfReps;
        this.pauseAmount = pauseAmount;
        this.weight = status.WEIGHTNOTINITIALIZED.getValue();
    }
    public Activity( String name, int nOfSeries, int nOfReps){
        this.name = name;
        this.nOfSeries = nOfSeries;
        this.nOfReps = nOfReps;
        this.weight = status.WEIGHTNOTINITIALIZED.getValue();
        this.pauseAmount = status.PAUSENOTINITIALIZED.getValue();

    }
    public void resetRep (){
        this.currentSeries = 0;
    }

    private String name;
    private int weight;
    private int nOfReps;
    private int nOfSeries;
    private int currentSeries;
    private int pauseAmount;
}
