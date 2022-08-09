package bankproject;

public class BankAccount {

    public String AccountHolderName;
    public int AccountNumber;
    public int PhoneNumber;
    public String IfscCode;
    DebitCard debitCard;



    public BankAccount(String AccountHolderName, int AccountNumber, int PhoneNumber, String IfscCode, DebitCard debitCard) {
        this.AccountHolderName = AccountHolderName;
        this.AccountNumber = AccountNumber;
        this.PhoneNumber = PhoneNumber;
        this.IfscCode = IfscCode;
        this.debitCard = debitCard;
    }

    public String getAccountHolderName() {
        return this.AccountHolderName;
    }

    public void setAccountHolderName(String AccountHolderName) {
        this.AccountHolderName = AccountHolderName;
    }

    public int getAccountNumber() {
        return this.AccountNumber;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public int getPhoneNumber() {
        return this.PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getIfscCode() {
        return this.IfscCode;
    }

    public void setIfscCode(String IfscCode) {
        this.IfscCode = IfscCode;
    }

    public DebitCard getDebitCard() {
        return this.debitCard;
    }

    public void setDebitCard(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    @Override
    public String toString() {
        return "{" +
            " AccountHolderName='" + getAccountHolderName() + "'" +
            ", AccountNumber='" + getAccountNumber() + "'" +
            ", PhoneNumber='" + getPhoneNumber() + "'" +
            ", IfscCode='" + getIfscCode() + "'" +
            ", debitCard='" + getDebitCard() + "'" +
            "}";
    }
}
    
   