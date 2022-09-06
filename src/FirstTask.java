import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        //System.out.print("введите новое число:");
        //Scanner scan = new Scanner(System.in);
        //int number = scan.nextInt();
        int number = 155;
        if (number > 99 && number < 1000){
            System.out.println("число трехзначное");
        }else {
            System.out.println("число не трехзначное");
        }
        if (number % 10 == 5) {
            System.out.println("число оканчивается на пять");
        }else {
            System.out.println("число не оканчивается на пять");
        }
        if (number % 10 == Math.floor((number % 100)/10)) {
            System.out.println("последние две цифры совпадают");
        }else {
            System.out.println("последние две цифры не совпадают");
        }
        int Year = 2020;
        if (Year % 4 != 0){
            System.out.println("обычный год");
        }else if(Year % 100 != 0){
            System.out.println("високосный год");
        }else if (Year % 400 == 0){
            System.out.println("високосный год");
        }else{
            System.out.println("обычный год");
        }
        int cats = 1573;
        if (cats%100 > 4 && cats%100< 20 | cats % 10 == 0 | cats % 10 > 4 && cats % 10 <= 9){
            System.out.println(cats + " котов");
        }else if (cats % 10 == 1){
            System.out.println(cats + " кот");
        }else{
            System.out.println(cats + " котa");
        }

    }

}

