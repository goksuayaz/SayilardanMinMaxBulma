import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç Tane Sayı Olacak : ");
        int N = inp.nextInt();

        int min = 0;
        int max = 0;
        int number;

        for(int i = 1; i <= N; i++){
            System.out.print(i + ". sayıyı giriniz : ");
            number = inp.nextInt();
            if(number < min || min == 0){
                min = number;
            }
            if(number > max){
                max = number;
            }

        }

        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);


    }
}