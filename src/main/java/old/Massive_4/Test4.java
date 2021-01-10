package old.Massive_4;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        int[] mass = new int[100];
        Random random = new Random();
        for (int i = 0; i<mass.length;i++){
            mass[i]=random.nextInt(10000);
        }
        int sum=0;
        int indexI=0;
        for (int i=0;i<mass.length-2;i++){
            int sum3 = 0;
            for (int j=i;j<i+3;j++) {
                sum3 += mass[j];
            }
            if(sum3>sum){
                  sum=sum3;
                  indexI=i;
            }
        }
        System.out.println(indexI);
        System.out.println(sum);
    }
}
