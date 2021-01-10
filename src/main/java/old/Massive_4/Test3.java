package old.Massive_4;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        int[][] mass= new int[12][8];
        Random random = new Random();
        for (int i=0;i<mass.length;i++){
            for (int j =0; j<mass[i].length;j++){
                mass[i][j]=random.nextInt(50);
            }

        }

        int maxl=0;
        int maxSumLs = 0;

        for (int i=0;i<mass.length;i++){
            int sum=0;
            for (int j =0; j<mass[i].length;j++){
                sum+=mass[i][j];
                if(sum>=maxl){
                    maxl=sum;
                    maxSumLs = i;
                }
            }
        }
        System.out.println(maxSumLs);



    }
}
