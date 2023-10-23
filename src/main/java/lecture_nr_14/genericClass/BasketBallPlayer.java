package lecture_nr_14.genericClass;

public class BasketBallPlayer extends Player{

    BasketBallPositions position;

    public BasketBallPlayer(String name, BasketBallPositions position) {
        super(name);
        this.position = position;
    }
}
