import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /// First Step

//        int numer1 = 0; int numer2 = 0;
//        Scanner valisteVerga = new Scanner(System.in);
//
//        System.out.println("Ingrese primer numero ");
//        numer1 = valisteVerga.nextInt();
//
//        System.out.println("Ingrese segundo numero");
//        numer2 = valisteVerga.nextInt();
//
//        int respuesta =numer1+numer2;
//        System.out.println("repuesta: "+ respuesta+" final");

        // Second Step

        int[] agePerson= {12,24,23,14,25};
        String[] namePerson = {"Carlos", "Juan", "Pedro", "Camila", "Vanessa"};

        System.out.println("The length of the ages Arrays is " + agePerson.length);
        System.out.println("The length of the names Arrays is " + namePerson.length);
        System.out.println();

        for (int i = 0; i < namePerson.length; i++) {
            System.out.println("This is the iteration number " + i);
            System.out.println("The name is : " + namePerson[i] + " and the age is " + agePerson[i]);
            System.out.println();
        }

//        //
//
//        Integer[] arrayToSum = {1,5,8,5,9,2,8,1,8,21,8,1,8,2};
//        Integer[] newArray = new Integer[5];
//        int sum = 0;
//        for(int i = 0; i < arrayToSum.length; i ++) {
//            System.out.println("Webon decime que numero queres");
//            newArray[i] = newValue;
//        }
//
//        System.out.println("The Sum is " + sum);

        Scanner scaca = new Scanner(System.in);
        System.out.println("cuantos numeros quiere sumar");
        int numero = scaca.nextInt();
        Integer[] numeros = new Integer[numero];
        System.out.println("Digite los números");
        for (int i = 0; i < numeros.length; i++){
            int num = scaca.nextInt();
            numeros[i] = num;
            }
            int suma = 0;


        //
        System.out.println("This is the last 3 and the sum cant be more than 10");
        for (int i =numeros.length - 3; i < numeros.length; i++){

            if (suma + numeros[i] <= 10 ){
                suma = suma + numeros[i];
                System.out.println("Resultado es " + suma);

            } else {
                System.out.println("Cant ");
//                i = numeros.length + 1;
                return;
            }

        }

        System.out.println("The resul of the las sum is " + suma);






    }
}
