package array;

public class MultiDim {
    public static void main(String[] args) {
        int[][] flats;
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        System.out.print(flats[0][0]+ "||");
        System.out.print(flats[0][1]+ "||");
        System.out.print(flats[0][2]+ "||"+"\n");
        System.out.print(flats[1][0]+ "||");
        System.out.print(flats[1][1]+ "||");
        System.out.print(flats[1][2]+ "||"+"\n");

        for (int i = 0;i< flats.length; i++){
            for (int j= 0; j<flats[i].length; j++){
                System.out.print(flats[i][j]+ " ");

            }

        }
    }
}
