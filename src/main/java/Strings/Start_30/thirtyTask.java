package Strings.Start_30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class thirtyTask {
    public static void main(String[] args) throws IOException {
        System.out.println("30. Дан текст. Сформировать строку из символов, расположенных между первой и второй запятыми данного текста.");
        String[] str = Files.lines(Paths.get("text.txt")).reduce("",String::concat).split(" ");
        System.out.println(Arrays.toString(str).replaceAll(", "," "));
        ArrayList<String> string = new ArrayList<String>(Arrays.asList(str));
        ArrayList<String> characters = new ArrayList<String>();
        for (String c:str){
            if (c.contains(",")){
                characters.add(c);
            }
        }
        int i=0;
        do {
            string.remove(i);
            i++;
        }
        while (string.get(i).equals(characters.get(0)));
        string.remove(0);
        i=0;
        ArrayList<String> res = new ArrayList<String>();
        while (!string.get(i).equals(characters.get(1))){
            res.add(string.get(i));
            i++;
        }
        res.add(string.get(i));
        String var = res.toString().replaceAll(",","");
        System.out.println(var);

    }
}
