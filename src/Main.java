import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("op");
        System.out.print(" por favor ingrese un numero  y le haremos saber si es par o impar  ingrese numero por favor");
        int n = leer.nextInt();

        if ( n % 2 == 0 ) {


            System.out.printf("si el numero %d es PAR\n" , n);
        } else {


            System.out.printf("si el numero %d es IMPAR\n" , n);


        }
    }


}