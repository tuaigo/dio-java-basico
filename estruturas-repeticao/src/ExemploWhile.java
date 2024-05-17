import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            mesada = mesada - valorDoce;
            
        }
        System.out.println("Valor da mesada: " + mesada);
        System.out.println("Joao gastou toda mesada em doces (vai ficar com diabetes essa peste)");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 10);
    
        
    }
    
}
