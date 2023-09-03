public class Players {
    String name;
    double battingScore;
    double ballFaced;
    double battingStrikeRate;

    //Generate Players constructor to instantiate Players objects
    public Players(String name, int battingScore, int balledFaced) {
        this.name = name;
        this.battingScore = battingScore;
        this.ballFaced = balledFaced;

    }
    double displayBattingStrike(){
        battingStrikeRate = (this.battingScore/ this.ballFaced)*100;
        return Math.round((battingStrikeRate)*100.0)/100.0;
    }
}





