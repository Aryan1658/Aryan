package fread;

import java.util.ArrayList;
import java.util.List;

public class FunctionManipulation {

    public static List delayDate(List<PaymentDetails> paymentDetailsList) {
        List<PaymentDetails> delayDateGreater = new ArrayList<>();
        //1. Find the data whose delayDate is greater than 10
        for (int i = 0; i < paymentDetailsList.size(); i++) {
            if (paymentDetailsList.get(i).getDelayDate() > 10) {
                delayDateGreater.add(paymentDetailsList.get(i));
            }
        }
        return delayDateGreater;
    }

    public static List dlyBtw(List<PaymentDetails> paymentDetailsList) {
        List<PaymentDetails> delayDateBetween = new ArrayList<>();
        //  2. Find the data whose delayDate is between 5 and 10
        for (int i = 0; i < paymentDetailsList.size(); i++) {
            if (paymentDetailsList.get(i).getDelayDate() >= 5 && paymentDetailsList.get(i).getDelayDate() <= 10) {
                delayDateBetween.add(paymentDetailsList.get(i));
            }
        }
        return delayDateBetween;
    }

    public static List dateTwty(List<PaymentDetails> paymentDetailsList) {
        List<PaymentDetails> dateYear = new ArrayList<>();
        //3. Find the data whose year is 2020
        for (int i = 0; i < paymentDetailsList.size(); i++) {
            if (paymentDetailsList.get(i).getYear().equals("2020")) {
                dateYear.add(paymentDetailsList.get(i));
            }
        }
        return dateYear;
    }

    public static List amtGrt(List<PaymentDetails> paymentDetailsList) {
        List<PaymentDetails> amountGreaterThan = new ArrayList<>();
        //4. Find the data whose amount is greater than 50000.
        for (int i = 0; i < paymentDetailsList.size(); i++) {
            if (paymentDetailsList.get(i).getAmount() > 50000) {
                amountGreaterThan.add(paymentDetailsList.get(i));
            }
        }
        return amountGreaterThan;
    }

    public static List amtBtw(List<PaymentDetails> paymentDetailsList) {
        List<PaymentDetails> amountBetween = new ArrayList<>();
        //5. Find the data whose amount is in between 20000 and 60000
        for (int i = 0; i < paymentDetailsList.size(); i++) {
            if (paymentDetailsList.get(i).getAmount() >= 20000 && paymentDetailsList.get(i).getAmount() <= 60000) {
                amountBetween.add(paymentDetailsList.get(i));
            }
        }
        return amountBetween;
    }

    public static double delayZero(List<PaymentDetails> paymentDetailsList) {
        //6. Find the sum of amount whose delay date is 0.
        double sumOfDelayDate = 0;
        for (int i = 0; i < paymentDetailsList.size(); i++) {
            if (paymentDetailsList.get(i).getDelayDate() == 0) {
                sumOfDelayDate = sumOfDelayDate + paymentDetailsList.get(i).getAmount();
            }
        }
        return sumOfDelayDate;
    }

    public static void delayDateZero(List<PaymentDetails> paymentDetailsList) {
        double sumJan = 0, sumFeb = 0, sumMar = 0, sumApr = 0, sumMay = 0, sumJun = 0;
        for (int i = 0; i < paymentDetailsList.size(); i++) {
            //7. Find the sum of amount grouping by the month (eg : JAN ko sum , FEB ko sum)
            if (paymentDetailsList.get(i).getMonth().equalsIgnoreCase("Jan")) {
                sumJan = sumJan + paymentDetailsList.get(i).getAmount();
            }
            if (paymentDetailsList.get(i).getMonth().equalsIgnoreCase("Feb")) {
                sumFeb = sumFeb + paymentDetailsList.get(i).getAmount();
            }
            if (paymentDetailsList.get(i).getMonth().equalsIgnoreCase("Mar")) {
                sumMar = sumMar + paymentDetailsList.get(i).getAmount();
            }
            if (paymentDetailsList.get(i).getMonth().equalsIgnoreCase("Apr")) {
                sumApr = sumApr + paymentDetailsList.get(i).getAmount();
            }
            if (paymentDetailsList.get(i).getMonth().equalsIgnoreCase("May")) {
                sumMay = sumMay + paymentDetailsList.get(i).getAmount();
            }
            if (paymentDetailsList.get(i).getMonth().equalsIgnoreCase("Jun")) {
                sumJun = sumJun + paymentDetailsList.get(i).getAmount();
            }

        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Output of Q7 is below:");
        System.out.println("Sum of amount of January: " + sumJan);
        System.out.println("Sum of amount of February: " + sumFeb);
        System.out.println("Sum of amount of March: " + sumMar);
        System.out.println("Sum of amount of April: " + sumApr);
        System.out.println("Sum of amount of May: " + sumMay);
        System.out.println("Sum of amount of June: " + sumJun);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void yearlyBasis(List<PaymentDetails> paymentDetailsList) {
        double sum2019 = 0, sum2020 = 0, sum2021 = 0, sum2022 = 0, sum2023 = 0, sumTotal = 0;
        for (int i = 0; i < paymentDetailsList.size(); i++) {
            //8. Find the total amount on yearly basis and on overall
            if (paymentDetailsList.get(i).getYear().equals("2019")) {
                sum2019 = sum2019 + paymentDetailsList.get(i).getAmount();
            }
            if (paymentDetailsList.get(i).getYear().equals("2020")) {
                sum2020 = sum2020 + paymentDetailsList.get(i).getAmount();
            }
            if (paymentDetailsList.get(i).getYear().equals("2021")) {
                sum2021 = sum2021 + paymentDetailsList.get(i).getAmount();
            }
            if (paymentDetailsList.get(i).getYear().equals("2022")) {
                sum2022 = sum2022 + paymentDetailsList.get(i).getAmount();
            }
            if (paymentDetailsList.get(i).getYear().equals("2023")) {
                sum2023 = sum2023 + paymentDetailsList.get(i).getAmount();
            }
            sumTotal = sum2019 + sum2020 + sum2021 + sum2022 + sum2023 ;

        }
        System.out.println("Output of Q8 is below:");
        System.out.println("Sum of amount of 2019: " + sum2019);
        System.out.println("Sum of amount of 2020: " + sum2020);
        System.out.println("Sum of amount of 2021: " + sum2021);
        System.out.println("Sum of amount of 2022: " + sum2022);
        System.out.println("Sum of amount of 2023: " + sum2023);
        System.out.println("The sum of total amount = " + sumTotal);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void totalDelay(List<PaymentDetails> paymentDetailsList){
        int sumDelay = 0;
        // 9. Find the total delay date.
        for (int i = 0; i < paymentDetailsList.size(); i++) {
            if (paymentDetailsList.get(i).getDelayDate() >= 0) {
                sumDelay = sumDelay + paymentDetailsList.get(i).getDelayDate();
            }
        }
        System.out.println("Output of Q9 is below:");
        System.out.println("Total sum of delay dates is: " + sumDelay);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    // * 10. Find the sum whose delay date is maximum on every year.
}



