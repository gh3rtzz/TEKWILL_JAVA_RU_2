package lecture_nr_4;

public class Car {

    int horsePower;
    int wheelSize;
    boolean isAWD;

    public Car(int horsePower, int wheelSize, boolean isAWD){
        this.horsePower = horsePower;
        this.wheelSize = wheelSize;
        this.isAWD = isAWD;
    }

    public void drive(){
        System.out.println("I'm driving");
    }

    public boolean returnAWDStatus(){
        return isAWD;
    }

}
