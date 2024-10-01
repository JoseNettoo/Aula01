public class Produto {
    int codigo;
    String nome;
    double valor;
    int quantidade;

    Produto(int codigo, String nome, double valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    void vender(int quantidadeVendida) {
        quantidade -= quantidadeVendida;
    }






}
