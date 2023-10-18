package lecture_nr_14.genericClass;

public class Main {

    public static void main(String[] args) {
        FootBallPlayer p1 = new FootBallPlayer("Messi", FootBallPlayerPositions.FORWARD);
        FootBallPlayer p2 = new FootBallPlayer("Ronaldo", FootBallPlayerPositions.FORWARD);
        FootBallPlayer p3 = new FootBallPlayer("Yashin", FootBallPlayerPositions.GOALKEEPER);
        FootBallPlayer p4 = new FootBallPlayer("Mudric", FootBallPlayerPositions.SEMI_DEFENSE);
        FootBallPlayer p5 = new FootBallPlayer("Cross", FootBallPlayerPositions.DEFENSE);
        FootBallPlayer p6 = new FootBallPlayer("Pique", FootBallPlayerPositions.SEMI_DEFENSE);
        FootBallPlayer p7 = new FootBallPlayer("Puyol", FootBallPlayerPositions.SEMI_DEFENSE);
        FootBallPlayer p8 = new FootBallPlayer("Ramos", FootBallPlayerPositions.SEMI_DEFENSE);

        BasketBallPlayer bp1 = new BasketBallPlayer("Lebron", BasketBallPositions.FORWARD);
        BasketBallPlayer bp2 = new BasketBallPlayer("Durant", BasketBallPositions.CENTER);
        BasketBallPlayer bp3 = new BasketBallPlayer("Curry", BasketBallPositions.POINT_GUARD);
        BasketBallPlayer bp4 = new BasketBallPlayer("Green", BasketBallPositions.SHOOTING_GUARD);
        BasketBallPlayer bp5 = new BasketBallPlayer("Ceban", BasketBallPositions.FORWARD);
        BasketBallPlayer bp6 = new BasketBallPlayer("Glodea", BasketBallPositions.SHOOTING_GUARD);
        BasketBallPlayer bp7 = new BasketBallPlayer("Kirilenko", BasketBallPositions.CENTER);
        BasketBallPlayer bp8 = new BasketBallPlayer("Mozgov", BasketBallPositions.FORWARD);

        GenericTeam<FootBallPlayer> team1 = new GenericTeam<>("Team Dream");
        GenericTeam<FootBallPlayer> team2 = new GenericTeam<>("Team Tekwill");

        GenericTeam<BasketBallPlayer> team3 = new GenericTeam<>("Team Pentalog");
        GenericTeam<BasketBallPlayer> team4 = new GenericTeam<>("Yankees");

        team1.addPlayersToList(p1, p2, p3, p4);
        team2.addPlayersToList(p5, p6, p7, p8);

        team3.addPlayersToList(bp1, bp2, bp3, bp4);
        team4.addPlayersToList(bp5, bp6, bp7, bp8);

        System.out.println("The match has started: Team Dream vs Team Tekwill");

        System.out.println("Team tekwill scored a goal!");
        System.out.println("Team Dream scored a pentalty");

        System.out.println("Team Tekwill wins the match!");

        team2.addWin();
        team1.addLoss();

        team1.printTeamStats();
        team2.printTeamStats();

        team1.addLoss();
        team1.addLoss();
        team1.addLoss();
        team1.addLoss();
        team1.addWin();
        team1.addWin();
        team1.addWin();
        team1.addWin();


        team2.addWin();
        team2.addWin();
        team2.addWin();
        team2.addWin();


        team1.printTeamStats();
        team2.printTeamStats();

        System.out.println("The match has started: Team Pentalog vs Team Yankees");

        System.out.println("Team pentalog scored a goal!");
        System.out.println("Team yankees scored a pentalty");

        System.out.println("Team pentalog wins the match!");

        team3.addWin();
        team4.addLoss();

        team3.printTeamStats();
        team4.printTeamStats();

        team3.addLoss();
        team3.addLoss();
        team3.addLoss();
        team3.addLoss();
        team3.addWin();
        team3.addWin();
        team3.addWin();
        team3.addWin();


        team4.addWin();
        team4.addWin();
        team4.addWin();
        team4.addWin();


        team3.printTeamStats();
        team4.printTeamStats();

    }
}
