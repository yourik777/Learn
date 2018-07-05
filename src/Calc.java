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

      long now = System.currentTimeMillis();

      ReadFile readFile = new ReadFile();
      readFile.read();

      System.out.println(System.currentTimeMillis() - now);

    }
}
