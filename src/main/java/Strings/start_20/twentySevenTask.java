package Strings.start_20;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class twentySevenTask {
    public static void main(String[] args) throws IOException {
        System.out.println("27. Дан массив строк. Упорядочить массив по длине строк.");
        String inputFileName = "text.txt";
        ArrayList<String> var = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
        String line;
        while ((line = reader.readLine()) != null) {
            var.add(line);
        }
        System.out.println(var.size());
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (String s : var) {
            ints.add(s.length());
        }
        int[] aaa = new int[ints.size()];
        for (int i=0;i<aaa.length;i++){
            aaa[i]=ints.get(i);
        }
        Arrays.sort(aaa);
//        bubbleSort(aaa);
        for(int i = 0; i <  aaa.length; i++) {
            for (String s:var){
                if (s.length()==aaa[i]) {
                    System.out.println(s);
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
//            Сравниваем элементы попарно,
//              если они имеют неправильный порядок,
//              то меняем местами
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}

