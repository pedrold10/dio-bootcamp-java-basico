public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "i";
        String siglaTratada = sigla.toUpperCase();
        switch(siglaTratada){
            case "P":
                System.out.println("Tamanho PEQUENO");
                break;
            case "M":
                System.out.println("Tamanho MÉDIO");
                break;
            case "G":
                System.out.println("Tamanho GRANDE");
                break;
            default:
                System.out.println("Tamanho INDEFINIDO");
                break;
        }
    }
}
