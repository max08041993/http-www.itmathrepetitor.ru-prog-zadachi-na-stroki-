package Strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class twenty_nineTask {
    public static void main(String[] args) throws IOException {
        System.out.println("28. Дан массив строк. Переставить строки в зависимости от количества цифр в строке.");
        String inputFileName = "text.txt";
        ArrayList<String> var = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
        String line;
        while ((line = reader.readLine()) != null) {
            var.add(line);
        }
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (String s : var) {
            int count=0;
            for(char c:s.toCharArray()){
                if(Character.isDigit(c)){
                    count++;
                }
            }
            ints.add(count);
        }
        int[] ints1=new int[ints.size()];
        for (int i=0;i<ints.size();i++){
            ints1[i]=ints.get(i);
        }
        Arrays.sort(ints1);
        for(int i = 0; i <  ints1.length; i++) {
            for (String s:var){
                int count=0;
                for(char c:s.toCharArray()){
                    if(Character.isDigit(c)){
                        count++;
                    }
                }
                if (count==ints1[i]) {
                    System.out.println(s);
                }
            }
        }
    }
}
