import java.util.Scanner;

public class ifCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //myScanner(scanner);
        System.out.println("Masukkan Nilai :");
        String input = scanner.next();
        int nilai = stringConverter(input);
        if (nilai <= 20){
            System.out.println("E");
        } else if (nilai <= 40){
            System.out.println("D");
        } else if (nilai <= 60){
            System.out.println("C");
        } else if (nilai <= 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }


    }

public static Integer stringConverter(String input){
        int result = 0;
        try{
            result = Integer.parseInt(input);
        } catch(Exception e){
            System.out.println("Error : " + e);
        }
        return result;
}

public static void myScanner(Scanner scanner){
    //input 1
    System.out.println("Masukkan input1: ");
    String angka = scanner.next();
    System.out.println("Hasil Input1: "+ angka);

    //input 2
    System.out.println("Masukkan input2: ");
    String kata = scanner.next();
    System.out.println("Hasil Input2: " + kata);

    System.out.println("=====CONVERT=====");
    System.out.println(". . . .");
    int angka1 = 0;
    int angka2 = 0;

    try {

        angka1 = Integer.parseInt(angka);
        angka2 = Integer.parseInt(kata);
    } catch (Exception e) {
        System.out.println("Error :" + e);

    }

    System.out.println("=====HITUNG======");
    int hasil = angka1 + angka2;
    System.out.println("Hasil Perjumlahan : " + hasil);

}

    }

