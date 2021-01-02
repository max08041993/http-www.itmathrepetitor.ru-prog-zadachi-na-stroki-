import org.apache.commons.lang3.ArrayUtils;

import java.util.Scanner;

public class eighteenTask {
    public static void main(String[] args) {
        System.out.println("18.Удалите в строке все 'abc', за которыми следует цифра.");
        Scanner scanner = new Scanner(System.in);
        char[] string = scanner.nextLine().toCharArray();
        boolean key=true;
        while (key){
            boolean key2=true;
            for (int i=2;i<string.length;i++){
                if (Character.isDigit(string[i])){
                    if (string[i-3]=='a'& string[i-2]=='b'& string[i-1]=='c'){
                        string=ArrayUtils.remove(string,i-1);
                        string=ArrayUtils.remove(string,i-2);
                        string=ArrayUtils.remove(string,i-3);
                        key2=false;
                    }
                }
                if (i+1==string.length & key2){
                    key=false;
                }
            }
        }
        System.out.println(string);
    }
}
