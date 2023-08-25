public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        if(nota < 5)
            System.out.println("Aluno reprovado!");
    
        else if(nota < 7 )
            System.out.println("Aluno está de recuperação");

        else
            System.out.println("Aluno aprovado!");
    }
    
}
