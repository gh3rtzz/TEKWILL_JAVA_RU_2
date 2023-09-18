package lecture_nr_6.encapsulation;

public class Main {

    public static void main(String[] args) {
        CreditCard c1 = new CreditCard(
                "1111222233334444",
                "John Doe",
                "01/29",
                "123");

        c1.setCardNumber("4444333322221111");

        System.out.println(c1.getCardNumber());
    }
}
