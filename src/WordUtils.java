import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//todo make hui

public class WordUtils {


    public static boolean specialCompare(String str6, String str7) {
        int count1 =0;

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

    public static String Sort(String str) {
        char[] str2 = str.toCharArray();
        String str3  = "";
        for (int i =0 ; i < str.length()-1; i++) {
            for (int j = i+1; j >0; j--){
                if (str2[j] <str2[j-1]) {
                    char temp = str2[j-1];
                    str2[j-1] = str2[j];
                    str2[j] = temp;
                }
            }

        }
        for (int i =0 ; i < str2.length-1; i++) {
            str3 = str3 + str2[i];
        }
        return str3;
    }
}
