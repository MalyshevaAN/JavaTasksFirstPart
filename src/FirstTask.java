
public class FirstTask {
    public static void main(String[] args) {
        //первая задача
        int number = 155;
        if (number > 99 && number < 1000) {
            System.out.println("число трехзначное");
        } else {
            System.out.println("число не трехзначное");
        }

        // вторая задача
        if (number % 10 == 5) {
            System.out.println("число оканчивается на пять");
        } else {
            System.out.println("число не оканчивается на пять");
        }


        // третья задача
        if (number % 10 == Math.floor((number % 100) / 10)) {
            System.out.println("последние две цифры совпадают");
        } else {
            System.out.println("последние две цифры не совпадают");
        }

        // четвертая задача
        int Year = 2020;
        if (Year % 4 != 0) {
            System.out.println("обычный год");
        } else if (Year % 100 != 0) {
            System.out.println("високосный год");
        } else if (Year % 400 == 0) {
            System.out.println("високосный год");
        } else {
            System.out.println("обычный год");
        }

        // пятая задача
        int cats = 1573;
        if (cats % 100 > 4 && cats % 100 < 20 | cats % 10 == 0 | cats % 10 > 4 && cats % 10 <= 9) {
            System.out.println(cats + " котов");
        } else if (cats % 10 == 1) {
            System.out.println(cats + " кот");
        } else {
            System.out.println(cats + " котa");
        }

        // шестая задача
        int valA = 0, valB = 5, valC = 1;
        if (valA == 0) {
            if (valB == 0) {
                if (valC == 0) {
                    System.out.println("бесконечное множество решений");
                } else {
                    System.out.println("Нет решений");
                }
            } else {
                System.out.println("Решением является х = " + -valC / valB);
            }
        } else {
            double disk = Math.pow(valB, 2) - 4 * valA * valC;
            if (disk < 0) {
                System.out.println("Нет решений");
            } else if (disk == 0) {
                double ans = (-valB) / (2 * valA);
                System.out.println("Решением является х = " + ans);
            } else {
                disk = Math.pow(disk, 0.5);
                double ans1 = (-valB + disk) / (2 * valA);
                double ans2 = (-valB - disk) / (2 * valA);
                System.out.println("Решением является х1 = " + ans1 + "x2 = " + ans2);
            }
        }
        // седьмая задача
        int numb = 1609;
        String ans = IsSimple(numb);
        System.out.println(ans);
    }
    public static String IsSimple(int number) {
        int d = 2;
        while (number >= d*d && number % d != 0) {
            d += 1;
        }
        if (number < d*d){
            return "number is simple";
        }else{
            return "number is not simple";
        }

    }
}

