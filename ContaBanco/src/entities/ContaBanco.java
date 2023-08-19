package entities;

public class ContaBanco {
    private Integer numero;
    private String agencia;
    private String nome;
    private Double saldo;
    
    public Integer getNumero() {
        return numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public String getNome() {
        return nome;
    }
    public Double getSaldo() {
        return saldo;
    }
    public ContaBanco(Integer numero, String agencia, String nome, Double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }
}   
