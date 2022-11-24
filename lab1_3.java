import java.util.*;

public class ex_3 {
    public static void println(Object l){
        System.out.println(l);
    }

    public static void main(String[] args){
        int x = 0;
        int n = 0;
        long r = 1;
        double m = 1.0;

        while(true){
            try{
                Scanner scn = new Scanner(System.in);

                println("Введите натуральное число x, которое хотите возвести в степень:");
                x = scn.nextInt();
                while (true){
                    println("Введите степень n (натуральное число от -15 до 15), в которую хотите возвести x:");
                    n = scn.nextInt();
                    if (n >= -15 & n <= 15){ break; } else {println("от -15 до 15!!!!!!!");}
                }

                System.out.print("Результат: ");

                if (n == 0){
                    println(1);
                } else if(n > 0){
                    for(int i = 1; i<=n; i++){
                        r = r * x;
                    }
                    println(r);
                } else {
                    m = (double) x;
                    for(int i = -1; i>=n; i--){
                        m = m / x;
                    }
                    println(m);
                }
                break;
            } catch (Exception e) {
                println("Неверный ввод!!!");
            }
        }

    }
}
