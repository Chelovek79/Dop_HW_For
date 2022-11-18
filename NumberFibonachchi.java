package Dop_HW_For;
/*
Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по
следующему правилу:
– Каждое следующее число равняется сумме двух предыдущих.
Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и
вывести.
Должно получиться следующее:
0 1 1 2 3 5 8 13 21 34
 */
public class NumberFibonachchi {
    public static void main(String[] args) {

        for (int i =0, a = 0, b = 1; i <= 4; i++) {
            System.out.print(a + " " + b + " ");
            a = a+b;
            b = b+a;

        }

    }
}
