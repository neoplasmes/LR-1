import java.util.*;

public class ex_1 {
    public static void println(Object l){
        System.out.println(l);
    }

    public static void main(String args[]){
        int day = 0;
        int month = 0;
        int year = 0;

        Calendar clr = Calendar.getInstance();
        int c_day = clr.get(Calendar.DATE);
        int c_month = clr.get(Calendar.MONTH) + 1;
        int c_year = clr.get(Calendar.YEAR);

        Scanner src = new Scanner(System.in);
        try {
            //день
            while (true){
                println("Введите день вашего рождения");
                day = src.nextInt();
                println(day);
                if (day >= 1 & day <= 31){
                    break;
                } else { println("так не бывает :/"); }
            }
            //месяц
            while (true){
                println("Введите месяц вашего рождения");
                month = src.nextInt();
                if (month >= 1 & month <= 12){
                    break;
                } else { println("так не бывает :/"); }
            }
            //год
            while (true){
                println("Введите год вашего рождения");
                year = src.nextInt();
                if (year >= 0 & year <= 2022){
                    break;
                } else { println("так не бывает :/"); }
            }
        } catch (Exception e) {
            println("Неверный ввод! :(");
        }

        println("Ваш возраст: " + (c_year - year) + " лет, " + (c_month - month) + " месяцев и " +
                (c_day - day) + ( (day % 10 >= 1 & day % 10 <= 4 & !(day >= 11 & day <= 19)) ? " дня" : " дней"));
    }
}