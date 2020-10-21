package exercise4;


import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char arrSize = scanner.nextInt();
        
        char[] array = new char [arrSize];
        char[] reversedArray = new char [arrSize];

        for(int i = 0; i < array.length; i++){
        array[i] = scanner.nextLine().charAt(0);
        }
        for(int i = 0; i < array.lentgth; i++){
          reveresdArray[i] = array[array.length-1-i];

        }
        System.out.println(reversedArray);
    }
        }
