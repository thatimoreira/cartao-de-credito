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
