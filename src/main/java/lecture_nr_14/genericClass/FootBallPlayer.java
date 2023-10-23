package lecture_nr_14.genericClass;

public class FootBallPlayer extends Player{

    FootBallPlayerPositions position;

    public FootBallPlayer(String name, FootBallPlayerPositions position) {
        super(name);
        this.name = name;
        this.position = position;
    }
}
