import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;


public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.err.println("utilize numeros. ");
        }
    }
}
