import java.util.*;

public class ex_4 {
    public static void println(Object l){
        System.out.println(l);
    }

    public static void main(String[] args){
        int n;
        double r;
        int ans = 0;

        while (true) {
            try{

                Scanner scn = new Scanner(System.in);

                while (true){
                    println("Введите количество точек:");
                    n = scn.nextInt();
                    if(n > 0){ break;} else { println("Столько точек не бывает :/");}
                }

                while (true){
                    println("Введите радиус окружности:");
                    r = scn.nextDouble();
                    if(r > 0.0){ break;} else { println("Такого радиуса не бывает :/");}
                }

                for (int i = 0; i <= n - 1; i++){
                    double x = 0.0;
                    double y = 0.0;
                    //x
                    while (true){
                        try {
                            scn = new Scanner(System.in);
                            println("Введите X" + (i+1) + ":");
                            x = scn.nextDouble();
                            break;
                        } catch (Exception e) {println("Incorrect input! :(");}
                    }
                    //y
                    while (true) {
                        try {
                            scn = new Scanner(System.in);
                            println("Введите Y" + (i+1) + ":");
                            y = scn.nextDouble();
                            break;
                        } catch (Exception e) {println("Incorrect input! :(");}
                    }

                    if ((x * x) + (y * y) <= r * r){
                        ans += 1;
                    }
                }

                println("Количество точек, попавших в круг радиусом " + r + ": " + ans);
                break;
            } catch (Exception e) {
                println("Incorrect input! :(");
            }
        }
    }
}
