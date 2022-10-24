public class Main {
    public static void main(String[] args) {
        // Задание 1.
        int i = 1;
        for (i = 0; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        // Задание 2.
        int x = 10;
        for (x = 9; x <= 0; x--) {
            System.out.println("Итерация цикла " + x);
            // при попытке произвести вычитание цикл сходит с ума, и итерация становится бесконечной, так и не понял, что это
        }
        // Задание 3.
        int y = 2;
        for (y = 0; y < 17; y++) {
            if (y % 2 == 0) {
                System.out.println("Итерация цикла " + y);
            }
            // Задание 4.
            int a = 10;
            for (a = 10; a <= -10; a--) {
                System.out.println("Итерация цикла " + a);
            }
            // Задание 5.
            int year = 1904;
            for (year = 1904; year <= 2096; year = year + 4) {
                System.out.println("Високосный год " + year);
            }
            // Задание 6.
            int p = 1;
            for (p = 1; p <=512; p = p * 2) {
                System.out.println("Число " + p);
            }
            // Задание 7.
            int f = 7;
            for (f = 7; f <= 98; f = f + 7) {
                System.out.println("Число " + f);
            }
            // Задание 8.
            int s = 29000;
            int sum = 0;
            for (int m = 0; m < 12; m++) {
                sum = sum + s;
                System.out.println("Месяц " + m +"сумма накоплений равна " + sum);
            }
            // Задание 9.
            int s1 = 29000;
            int sum1 = 0;
            for (int m = 0; m < 12; m++) {
                sum1 = sum1 + sum1/100;
                sum1 = sum1 + s1;
                System.out.println("Месяц " + m +"сумма накоплений равна " + sum1);
            }
            // конец ДЗ


        }
    }
}

