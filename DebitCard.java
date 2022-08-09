package bankproject;

public class DebitCard  {

    String DebitcardNumber;
    int DebitCardPin;
    int DebitCardCvv;
    String DebitCardExpiryDate;

    public DebitCard(String DebitcardNumber, 
    int DebitCardPin, int DebitCardCvv, String DebitCardExpiryDate) {
        
        this.DebitcardNumber = DebitcardNumber;
        this.DebitCardPin = DebitCardPin;
        this.DebitCardCvv = DebitCardCvv;
        this.DebitCardExpiryDate = DebitCardExpiryDate;
    }

    public String getDebitcardNumber() {
        return this.DebitcardNumber;
    }

    public void setDebitcardNumber(String DebitcardNumber) {
        this.DebitcardNumber = DebitcardNumber;
    }

    public int getDebitCardPin() {
        return this.DebitCardPin;
    }

    public void setDebitCardPin(int DebitCardPin) {
        this.DebitCardPin = DebitCardPin;
    }

    public int getDebitCardCvv() {
        return this.DebitCardCvv;
    }

    public void setDebitCardCvv(int DebitCardCvv) {
        this.DebitCardCvv = DebitCardCvv;
    }

    public String getDebitCardExpiryDate() {
        return this.DebitCardExpiryDate;
    }

    public void setDebitCardExpiryDate(String DebitCardExpiryDate) {
        this.DebitCardExpiryDate = DebitCardExpiryDate;
    }

    @Override
    public String toString() {
        return "{" +
            " DebitcardNumber='" + getDebitcardNumber() + "'" +
            ", DebitCardPin='" + getDebitCardPin() + "'" +
            ", DebitCardCvv='" + getDebitCardCvv() + "'" +
            ", DebitCardExpiryDate='" + getDebitCardExpiryDate() + "'" +
            "}";
    }
    


    
}
