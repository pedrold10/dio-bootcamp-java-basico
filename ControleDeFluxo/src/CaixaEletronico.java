public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0; 

        if(saldo > valorSolicitado){
            saldo-=valorSolicitado;
            System.out.println("Saldo:\n"+saldo);
        }
        else{
            System.out.println("Valor maior que o saldo");
            System.out.println("Saldo:\n"+saldo);
        }
    }

    
}
    

