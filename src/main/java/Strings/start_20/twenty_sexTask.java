package Strings.start_20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class twenty_sexTask {
    public static void main(String[] args) throws IOException {
        System.out.println("26. Даны два слова. Найдите только те символы слов, которые встречаются в обоих словах только один раз.");
        String[] string = Files.lines(Paths.get("text.txt")).reduce("",String::concat).split(" ");
        ArrayList<String> aaa = new ArrayList<String>(Arrays.asList(string));
        ArrayList<Character> simOne = new ArrayList<Character>();
        for (String bb:aaa){
            for (char vv:bb.toCharArray()){
                if (!simOne.contains(vv)){
                    simOne.add(vv);
                }
            }
        }
        System.out.println(simOne);
    }
}
