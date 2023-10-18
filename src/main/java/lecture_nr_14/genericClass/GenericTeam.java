package lecture_nr_14.genericClass;

import java.util.ArrayList;
import java.util.List;

public class GenericTeam<T>{

    private final String teamName;
    private List<T> teamList;
    private Integer nrOfWins;
    private Integer nrOfLosses;
    private Integer nrOfDraws;

    public GenericTeam(String teamName) {
        this.teamName = teamName;
        teamList = new ArrayList<>();
        nrOfWins = 0;
        nrOfLosses = 0;
        nrOfDraws = 0;
    }

    public void addPlayersToList(T... inputPlayers){
        for (T element :
                inputPlayers) {
            teamList.add(element);
        }
    }

    public void printTeamStats(){
        System.out.println("-------------------");
        System.out.println("TEAM: " + teamName);
        System.out.println("-------------------");
        System.out.println("WINS: " + nrOfWins);
        System.out.println("Losses: " + nrOfLosses);
        System.out.println("Draws: " + nrOfDraws);
        System.out.println("-------------------");
    }

    public void addWin(){
        nrOfWins++;
    }

    public void addLoss(){
        nrOfLosses++;
    }

    public void addDraw(){
        nrOfDraws++;
    }
}
