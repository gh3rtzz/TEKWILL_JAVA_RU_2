package lecture_nr_14.genericClass;

public class AnotherMain {

    public static void main(String[] args) {

//        GenericTeam<String> stringTeam = new GenericTeam<>("String team"); Won't compile!

        GenericTeam<FootBallPlayer> footBallTeam = new GenericTeam<>("asd");
        GenericTeam<BasketBallPlayer> basketBallTeam = new GenericTeam<>("asd");

    }
}
