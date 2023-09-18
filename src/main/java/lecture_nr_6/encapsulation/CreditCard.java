package lecture_nr_6.encapsulation;

public class CreditCard {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String CVV2;

    public CreditCard(String cardNumber, String cardHolderName, String expiryDate, String CVV2) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.CVV2 = CVV2;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setCVV2(String CVV2) {
        this.CVV2 = CVV2;
    }

    public String getCardNumber() {
        String returnString = "************";
        returnString += this.cardNumber.substring(12, 16);

        return returnString;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}
