package delivery;


/*
The distance of the truck from a delivery destination (x,y) is the square root of x^2+y^2.
If there are multiple ties,then return locations starting with the closest X-coordinates as long as you satisfy
returning exactly X delivery locations.The returned output can be in any order.
*/

// [[1,2],[3,4],[1,-1]]

//Output [[1,-1],[1,2]]
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class DeliveryCalculation {
    double distance = 0;

    public static void main(String[] args) {


        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        List<Integer> l3 = new ArrayList<>();
        l3.add(1);
        l3.add(-1);
        List<List<Integer>> data = new ArrayList<>();
        data.add(l1);
        data.add(l2);
        data.add(l3);


        DecimalFormat df = new DecimalFormat("0.00");

        double distanceCalculation1 = Double.parseDouble(df.format(Math.sqrt(Math.pow(l1.get(0), 2) + Math.pow(l1.get(1), 2))));
        double distanceCalculation2 = Double.parseDouble(df.format(Math.sqrt(Math.pow(l2.get(0), 2) + Math.pow(l2.get(1), 2))));
        double distanceCalculation3 = Double.parseDouble(df.format(Math.sqrt(Math.pow(l3.get(0), 2) + Math.pow(l3.get(1), 2))));


        System.out.println("---------------------------------------");
        System.out.println("Distance 1: " + distanceCalculation1 + " ; " + l1);
        System.out.println("Distance 2: " + distanceCalculation2 + " ; " + l2);
        System.out.println("Distance 3: " + distanceCalculation3 + " ; " + l3);
        System.out.println("---------------------------------------");

        if (distanceCalculation1 < distanceCalculation2 && distanceCalculation1 < distanceCalculation3) {
            data.clear();
            data.add(0, l1);
            if (distanceCalculation2 < distanceCalculation3) {
                data.add(1, l2);
                data.add(2, l3);
            } else if (distanceCalculation3 < distanceCalculation2) {
                data.add(1, l3);
                data.add(2, l2);
            }
        } else if (distanceCalculation2 < distanceCalculation3 && distanceCalculation2 < distanceCalculation1) {
            data.clear();
            data.add(0, l2);
            if (distanceCalculation1 < distanceCalculation3) {
                data.add(1, l1);
                data.add(2, l3);
            } else if (distanceCalculation3 < distanceCalculation1) {
                data.add(1, l3);
                data.add(2, l1);
            }
        } else if (distanceCalculation3 < distanceCalculation1 && distanceCalculation3 < distanceCalculation2) {
            data.clear();
            data.add(0, l3);
            if (distanceCalculation1 < distanceCalculation2) {
                data.add(1, l1);
                data.add(2, l2);
            } else if (distanceCalculation2 < distanceCalculation1) {
                data.add(1, l2);
                data.add(2, l1);
            }

        }
        System.out.println(data);

    }
}



