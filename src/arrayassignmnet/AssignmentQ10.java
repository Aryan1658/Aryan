package arrayassignmnet;

public class AssignmentQ10 {
    public static void main(String[] args) {

       /* int[] ageArray = new int[5];
        ageArray [0] = 20;
        ageArray [1] = 25;
        ageArray [2] = 30;
        ageArray [3] = 35;
        ageArray [4] = 40;

        System.out.println("The size of the arrray is: " + ageArray.length);

        System.out.println(ageArray[0]);
        System.out.println(ageArray[1]);
        System.out.println(ageArray[2]);
        System.out.println(ageArray[3]);
        System.out.println(ageArray[4])*/;

        int [] ageArray = { 20,25,30,35,40,45,50,55,60,65,70};

        System.out.println(" The size of the array is: "+ ageArray.length);

        System.out.print(ageArray[0] + " ");
        System.out.print(ageArray[1] + " ");
        System.out.print(ageArray[2]+ " ");
        System.out.print(ageArray[3]+ " ");
        System.out.print(ageArray[4]+ " ");

        for (int i = 0; i<=ageArray.length; i ++){
            System.out.print(  "\n"+ageArray[i] );

        }


    }
}
