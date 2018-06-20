import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 23.04.2018.
 */
public class Calc implements IMultiplication{

    @Override
    public int multiplication(int a1, int a2) {
        int res = a1*a2;
        return res;
    }

  public static void main(String arg[]){

//     Calc calc = new Calc();
//
//      int h = calc.multiplication(1,5);
//      System.out.println(h);
//      if (h==6) System.out.println("ZAEBIS");
//      else System.out.println("Hueivo");

      long now = System.currentTimeMillis();

      ReadFile readFile = new ReadFile();
      readFile.read();

      System.out.println(System.currentTimeMillis() - now);

    }
}
