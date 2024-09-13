package entidades;

public class Produto {

    //Declaração do campo de instância.
    private int numero;
    private String nome;
    private int quantidade;
    private double preco;
    private boolean ativo;


    //Instanciar objetos de forma mais prática, com menos linhas.
    public Produto(int numero, String nome, int quantidade, double preco) {
        this.numero = numero;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "numero=" + numero +
                ",nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", status=" + ativo +
                '}';
    }
}
