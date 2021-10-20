package fread;
/*
 * @user Aryan Rijal
 * Created Date: 13 October 2021
 * */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataAnalysisClass {
    public static void main(String[] args) throws IOException {

        String fileName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name you want to search.");
        fileName = scanner.nextLine();


        File inputFile = new File(System.getProperty("user.home") + File.separator + "Desktop"
                + File.separator + fileName);
        List<PaymentDetails> paymentDetailsList = new ArrayList<>();
        if (inputFile.exists()) {

            System.out.println("File found.We can proceed to the next step");
            System.out.println("--------------------------------------------");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] splittedData = line.split(",");
                for (String d : splittedData) {
                    String[] subData = d.split(":");
                    String amountRelatedData = subData[0];
                    String dateRelatedData = subData[1];
                    String[] amtDataArray = amountRelatedData.split("/");
                    String[] dateDataArray = dateRelatedData.split("/");
                    String checker = amtDataArray[0];
                    if(checker.equals("XXX")){
                        continue;
                    }
                    paymentDetailsList.add(new PaymentDetails(Double.parseDouble(amtDataArray[0]),
                            Integer.parseInt(amtDataArray[1]),
                            dateDataArray[0],
                            dateDataArray[1]));
                }
            }
            List<ArrayList> delayDateList = FunctionManipulation.delayDate(paymentDetailsList);
            System.out.println("Output of Q1 is below:");
            System.out.println(delayDateList);
            List<ArrayList> dlyBtw = FunctionManipulation.dlyBtw(paymentDetailsList);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Output of Q2 is below:");
            System.out.println(dlyBtw);
            List<ArrayList> dateTwty  = FunctionManipulation.dateTwty(paymentDetailsList);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Output of Q3 is below:");
            System.out.println(dateTwty);
            List<ArrayList> amtGrt = FunctionManipulation.amtGrt(paymentDetailsList);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Output of Q4 is below:");
            System.out.println(amtGrt);
            List<ArrayList> amtBtw = FunctionManipulation.amtBtw(paymentDetailsList);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Output of Q5 is below:");
            System.out.println(amtBtw);
            double delayZero = FunctionManipulation.delayZero(paymentDetailsList);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Output of Q6 is below:");
            System.out.println(delayZero);

            FunctionManipulation.delayDateZero(paymentDetailsList);
            FunctionManipulation.yearlyBasis(paymentDetailsList);
            FunctionManipulation.totalDelay(paymentDetailsList);



        }
        else{
            System.out.println("Sorry!!! File not found.");

        }

    }
}

   