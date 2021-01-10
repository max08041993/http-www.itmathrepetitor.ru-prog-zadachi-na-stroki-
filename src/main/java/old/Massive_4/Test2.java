package old.Massive_4;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int[] mass = new int[100];
        Random random = new Random();
        for(int i=0;i<mass.length;i++){
            mass[i]=random.nextInt(10000);
        }
        int max=0;
        for (int elem:mass){
            if (elem>max){
                max=elem;
            }
        }
        System.out.println(max);
        int min=10000;
        for (int elem:mass){
            if (elem<max){
                min=elem;
            }
        }
        System.out.println(min);
        int intNol=0;
        for (int j:mass){
            if (j%10==0){
                intNol++;
            }
        }
        System.out.println(intNol);

        int summEltmNol=0;
        for (int j:mass){
            if (j%10==0){
                summEltmNol+=j;
            }
        }
        System.out.println(summEltmNol);
    }
}
