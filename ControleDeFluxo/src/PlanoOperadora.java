

public class PlanoOperadora {
    public static void main(String[] args) {
        String ligacao = "100 minutos de ligação\n";
        String whatsInsta = ligacao+"Whatsapp e Instagram grátis\n";
        String Yt5gb = whatsInsta+"5GB e Youtube";
        String plano = "B";

        switch(plano){
            case "B":
                System.out.println("Seu plano possui:\n"+ ligacao);
                break;
            case "M":
                System.out.println("Seu plano possui:\n"+whatsInsta);
                break;
            case "G":
                System.out.println("Seu plano possui:\n"+Yt5gb);
            

        }
    }
}
