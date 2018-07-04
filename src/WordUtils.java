//доделать метод specialCompare и вставить в ReadFile
//коллекции интерфейс List и его реализация, ArrayList и LinkedList
// загрузить большой файл и заустить программу


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordUtils {


    public static boolean specialCompare(String str6, String str7) {
        int count1 =0;
//        List temp= new ArrayList<>();
//        temp = null;
//        for (int l = 0; l < str6.length(); l++) {
//            if (str6.charAt(l) == str7.charAt(l)) {
//                count1++;
//            }
//            if (str6.length() == count1) {
//                return false;
//            }
//        }
//        count1 =0;
//        if (compareWords(str6,str7)) return false;
//        for (int l = 0; l < str6.length(); l++) {
//            for (int k = 0; k < str7.length(); k++) {
//                if (str6.charAt(l) == str7.charAt(k)){
//                    count1++;
//                    break;
//                }
//            }
//        }
//        if (str6.length() == count1){
//            return true;
//        }
        //return false;

        char[] ch = str6.toCharArray();
        for (int l = 0; l < str6.length(); l++) {
            char lettre =  ch[l];


            int k1=0;
            for (int i = 0; i < str6.length(); i++) {
                if(str6.charAt(i) == lettre) {
                    k1++;
                }
            }
            int k2=0;
            for (int i = 0; i < str7.length(); i++) {
                if(str7.charAt(i) == lettre) {
                    k2++;
                }
            }
            if (k1 != k2){
              return false;
            }
        }

        return true;
    }

    public static boolean compareWords(String str6, String str7) {
        int count1 =0;
        for (int l = 0; l < str6.length(); l++) {
            if (str6.charAt(l) == str7.charAt(l)) {
                count1++;
            }
            if (str6.length() == count1) {
                return true;
            }
        }
        return false;
    }
}
