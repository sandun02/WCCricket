import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {

        System.out.println("------------Asia Cup 2022 - Batting Scores of the Sri Lankan Team----------\n ");

        Scanner readNumOfPlayers = new Scanner(System.in);
        Scanner readName = new Scanner(System.in);
        Scanner readBattingScore = new Scanner(System.in);
        Scanner readBallFaced = new Scanner(System.in);


        String name;
        int battingScore;
        int balledFaced;

        System.out.print("Enter the number of player records - ");

        int numOfPlayers = readNumOfPlayers.nextInt();
        System.out.println();

        List playerList = new List(numOfPlayers);

        for(int i= 0; i< numOfPlayers ; i++){

            System.out.print("Enter the name of the player - ");
            name = readName.nextLine();

            System.out.print("Enter the Batting Score of this player - ");
            battingScore= readBattingScore.nextInt();

            System.out.print("Enter the balls faced by this player - ");
            balledFaced = readBallFaced.nextInt();

            System.out.println("________________________________________________");

            Players playerObj = new Players(name, battingScore, balledFaced);

            playerList.insertLast(playerObj);
        }
        double highestScore = playerList.RetrieveList(0).battingScore;
        String highestScorePlayer = null;

        for(int i=1; i<numOfPlayers; i++){

            if(playerList.RetrieveList(i).battingScore > highestScore){

                highestScore = playerList.RetrieveList(i).battingScore;
                highestScorePlayer = playerList.RetrieveList(i).name;

            }
        }
        System.out.println("Highest Scoring Player : "+ highestScorePlayer +" with the Score of " +highestScore);


        double lowestNumOfBalls = playerList.RetrieveList(0).ballFaced;
        String lowestBallFacedPlayer = null;

        for(int i = 1; i< numOfPlayers; i++){

            if(playerList.RetrieveList(i).ballFaced < lowestNumOfBalls){

                lowestNumOfBalls= playerList.RetrieveList(i).ballFaced;
                lowestBallFacedPlayer = playerList.RetrieveList(i).name;
            }
        }
        System.out.print(lowestBallFacedPlayer+ " faced the lowest number of balls in the match.");

        System.out.println("\n______________________________________________");

        for(int i= 0; i< numOfPlayers; i++){
            System.out.println("Batting Strike Rate of "+ playerList.RetrieveList(i).name + " : "+ playerList.RetrieveList(i).displayBattingStrike());
        }

        System.out.println("______________________________________________________");


        double highestStrikeRate = playerList.RetrieveList(0).displayBattingStrike();
        String manOfTheMatch = null;

        for(int i=0; i< numOfPlayers; i++){

            if(playerList.RetrieveList(i).displayBattingStrike() > highestStrikeRate){
                highestStrikeRate = playerList.RetrieveList(i).displayBattingStrike();
                manOfTheMatch = playerList.RetrieveList(i).name;
            }
        }
        System.out.println("The Man of the Match - "+ manOfTheMatch + " with the batting strike rete of "+ highestStrikeRate);
    }
}
