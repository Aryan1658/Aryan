package fread;

/*
 * @user Aryan Rijal
 * Created Date: 13 October 2021
 * */
public class PaymentDetails {
    private double amount;
    private int delayDate;
    private String year;
    private String month;

    public PaymentDetails(double amount, int delayDate, String year, String month) {
        this.amount = amount;
        this.delayDate = delayDate;
        this.year = year;
        this.month = month;
    }

    public PaymentDetails() {

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getDelayDate() {
        return delayDate;
    }

    public void setDelayDate(int delayDate) {
        this.delayDate = delayDate;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "PaymentDetails{" +
                "amount=" + amount +
                ", delayDate=" + delayDate +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                '}';
    }
}


