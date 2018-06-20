import javafx.util.StringConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * Created by admin on 25.04.2018.
 */
public class ReadFile {
    Set<String> set = new HashSet<>();
    public void read(){
        int count = 0;
        boolean bool=false;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(ReadFile.class.getResourceAsStream("Text.txt"), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null ) {
              for(String s: line.split(" ")){
                  set.add(s);
              }
            }
            List<String> res2 = new ArrayList<>();
            List<String> res = new ArrayList<>();
            List<String> resResult = new ArrayList<>();
            List<String> res3 = new ArrayList<>();
            String str2 = null;
            for (String str : set) {
                if (str.length() < 3) continue;
                if (str.startsWith("(") || str.startsWith("[")) {
                    str2 = str.substring(1, str.length());
                    res.add(str2);
                    continue;
                }

                if (str.endsWith(").") || str.endsWith("),")) {
                    str2 = str.substring(0, str.length() - 2);
                    res.add(str2);
                    continue;
                }
                if (str.endsWith("...)")) {
                    str2 = str.substring(0, str.length() - 3);
                    res.add(str2);
                    continue;
                }

                if (str.endsWith(",") || str.endsWith(".") || str.endsWith("!") || str.endsWith("?") || str.endsWith("*")
                        || str.endsWith(")") || str.endsWith(")") || str.endsWith("'") || str.endsWith("]")) {
                    str2 = str.substring(0, str.length() - 1);
                    res.add(str2);
                    continue;
                }
                res.add(str);
            }
            Collections.sort(res, Collections.reverseOrder());
            Collections.reverse(res);

            boolean flag = false;
            for(String str3: res){
                if (((str3.startsWith("a") || str3.startsWith("A")) == false) & flag == false ) continue;
                res2.add(str3);
                flag = true;
            }
//            res2 = res;
            for (int i=0; i<res2.size()-1; ++i) {
//                if (WordUtils.compareWords(res2.get(i),res2.get(i+1)) && (i!=res2.size()-1)) continue;
                for (int j = i+1; j < res2.size()-1; ++j)
                    if (res2.get(i).length() != res2.get(j).length()) {
                        continue;
                    } else {
                        int intStr4 = 0;
                        int intStr5 = 0;
                        String str4 = "";
                        String str5 = "";
                        str4 = res2.get(i);
                        str5 = res2.get(j);
                        if (WordUtils.compareWords(str4, str5)) continue;
                        for (int k = 0; k < str4.length(); ++k) {
                            intStr4 = intStr4 + str4.charAt(k);
                            intStr5 = intStr5 + str5.charAt(k);
                        }
                        if (intStr4 == intStr5) {
                            bool = WordUtils.specialCompare(str4, str5);
                            if (bool) {

                                resResult.add(str4);
                                resResult.add(str5);
                            }

                        }
                        else continue;

                        if (bool) {
                            count++;
                            System.out.println("Sovpadenyi - " + count);
                            System.out.println();
                            System.out.println("Word1 = " + str4);
                            System.out.println("Word2 = " + str5);
                            System.out.println();
                            System.out.println("intStr4 = " + intStr4);
                            System.out.println("intStr5 = " + intStr5);
                            System.out.println();
                        }
                    }


                }
            for (int j = 0; j < resResult.size(); j++) {
                System.out.println();
                System.out.println(resResult.get(j));
            }

//            }
        } catch (IOException e){

        }
    }
}
