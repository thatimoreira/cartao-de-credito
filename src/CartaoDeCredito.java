import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limiteCartao;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.saldo = limiteCartao;   // Variável saldo é sempre inicializada assim que se define o limite do cartão
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
        // verifica se tem limite suficiente
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra); // Adiciona na lista de compras
            return true;
        }
        return false;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    
}
