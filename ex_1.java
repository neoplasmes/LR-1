import java.util.*;

public class ex_1 {
    public static void println(Object l){
        System.out.println(l);
    }

    public static void main(String args[]){
        int day = 0;
        int month = 0;
        int year = 0;
        int[] deb = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Calendar clr = Calendar.getInstance();
        int c_day = clr.get(Calendar.DATE);
        int c_month = clr.get(Calendar.MONTH) + 1;
        int c_year = clr.get(Calendar.YEAR);

        Scanner src = new Scanner(System.in);
        while(true) {
            try {
                //день
                while (true) {
                    println("Введите день:");
                    Scanner scr = new Scanner(System.in);
                    day = scr.nextInt();
                    if (day >= 1 & day <= 31) {

                        //месяц
                        println("Введите месяц:");
                        month = scr.nextInt();
                        if ((month >= 1 & month <= 12) & (day <= deb[month - 1])) {
                            break;
                        } else {
                            println("так не бывает :/");
                        }

                    } else {
                        println("так не бывает :/");
                    }
                }
                //год
                while (true) {
                    Scanner scr = new Scanner(System.in);
                    println("Введите год вашего рождения");
                    year = src.nextInt();
                    if (year >= 0 & year <= 2022) {
                        break;
                    } else {
                        println("так не бывает :/");
                    }
                }
                break;
            } catch (Exception e) {
                println("Неверный ввод! :(");
            }
        }

        println("Ваш возраст: " + (c_year - year) + " лет, " + (c_month - month) + " месяцев и " +
                (c_day - day) + ( (day % 10 >= 1 & day % 10 <= 4 & !(day >= 11 & day <= 19)) ? " дня" : " дней"));
    }
}
