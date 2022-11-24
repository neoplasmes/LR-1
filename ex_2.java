import java.util.*;

public class ex_2 {

    public static void println(Object l){
        System.out.println(l);
    }

    public static void main(String args[]){
        int[] deb = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = 0;
        int month = 0;

        while (true){
            try {
                //день
                while (true){
                    println("Введите день:");
                    Scanner scr = new Scanner(System.in);
                    day = scr.nextInt();
                    println(day);
                    if (day >= 1 & day <= 31){

                        //месяц
                        println("Введите месяц:");
                        month = scr.nextInt();
                        if ( (month >= 1 & month <= 12) & (day <= deb[month - 1]) ){
                            break;
                        } else { println("так не бывает :/"); }

                    } else { println("так не бывает :/"); }
                }
                break;
            } catch (Exception e) {
                println("Неверный ввод! :(");
            }
        }

        String[] season = {"зима","зима","весна","весна","весна","лето","лето","лето","осень","осень","осень","зима"};
        println(season[month - 1]);

    }
}
