import java.io.IOException;
import java.io.PrintWriter;

public class RateServlet{

    private static float KOR_RATE = 9.91F;
    private static float JPY_RATE = 0.10F;

    public RateServlet(){}
    public static float korea(float money){
        float result = 0;
        result = money / KOR_RATE;
        return result;
    }
    public static float japen(float money){
        float result = 0;
        result = money / JPY_RATE;
        return result;
    }
}

       