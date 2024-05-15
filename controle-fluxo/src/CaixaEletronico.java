public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 50.21;
        double valorSolicitado = 30;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
            
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
}
