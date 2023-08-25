public class ResultadoEscolar {
    public static void main(String[] args) {
        Integer nota = 4;
        String resultado = nota >=7 ? "Aluno aprovado" : nota>=5 && 7 > nota ? "Aluno em recuperação" : "Aluno Reprovado";
        System.out.println(resultado);
    }
    
}
