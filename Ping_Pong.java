package Dop_HW_For;
/*
Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без
остатка, вывести ping, а если число делится на 5 без остатка, вывести pong.
Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
Допускается наличие пустых строк в выводе.
*/
public class Ping_Pong {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ": ");
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("ping pong");
            } else
                if (i % 5 == 0) {
                    System.out.println("pong");
                } else
                    if (i % 3 == 0){
                        System.out.println("ping");
                    } else System.out.println(" ");
        }

    }
}
