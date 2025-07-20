/**
 * Exercise for learning how the debug, breakpoint, and step-into
 * feature work.
 */
public class DebugExercise1 {
    public static double divideThenRound(double top, double bottom) {
        double quotient = top / bottom;
        double  result = Math.round(quotient);
        return result;
    }

    public static void main(String[] args) {
        double t = 10;
        double b = 2;
        double result = divideThenRound(t, b);
        System.out.println("round(" + t + "/" + b + ")=" + result);

        double t2 = 9;
        double b2 = 4;
        double result2 = divideThenRound(t2, b2);
        System.out.println("round(" + t2 + "/" + b2 + ")=" + result2);

        double t3 = 3;
        double b3 = 4;
        double result3 = divideThenRound(t3, b3);
        System.out.println("round(" + t3 + "/" + b3 + ")=" + result3);
    }
}

//结果不太对：round(10/2)=5
//round(9/4)=2
//round(3/4)=0
//要把整数除法  改为浮点数除法 把int 改成了doule