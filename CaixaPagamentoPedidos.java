import java.util.HashMap;
import java.util.Map;

public class CaixaPagamentoPedidos {
    private Map<String, Double> historicoPagamentos;
    private estatistica estatistica;

    public CaixaPagamentoPedidos() {
        this.historicoPagamentos = new HashMap<>();
    }

    public CaixaPagamentoPedidos(estatistica estatistica) {
        this.estatistica = estatistica;
    }

    public void entrarNaFilaCaixa() {
        estatistica.incrementarPessoasNaFilaCaixa();
    }

    // Registro de pagamentos realizados pelos clientes
    public void registrarPagamento(String nomeCliente, double valorPago) {
        if (valorPago <= 0) {
            System.out.println("Valor inválido. O pagamento deve ser maior que zero.");
            return;
        }

        // Verifica se já existe um histórico de pagamentos para o cliente
        if (historicoPagamentos.containsKey(nomeCliente)) {
            double valorTotalPago = historicoPagamentos.get(nomeCliente);
            historicoPagamentos.put(nomeCliente, valorTotalPago + valorPago);
        } else {
            historicoPagamentos.put(nomeCliente, valorPago);
        }

        System.out.println("Pagamento de " + valorPago + " realizado por " + nomeCliente + " registrado com sucesso.");
    }

    // Cálculo de troco, se necessário
    public double calcularTroco(String nomeCliente, double valorCompra, double valorPago) {
        double valorTotalPago = historicoPagamentos.getOrDefault(nomeCliente, 0.0);
        double troco = valorTotalPago - valorCompra;

        if (troco < 0) {
            System.out.println("Valor insuficiente. Por favor, insira um valor maior ou igual ao total da compra.");
            return 0;
        }

        System.out.println("Troco: " + troco);
        return troco;
    }

    // Emissão de recibos ou comprovantes de pagamento
    public void emitirComprovante(String nomeCliente) {
        double valorTotalPago = historicoPagamentos.getOrDefault(nomeCliente, 0.0);
        System.out.println("Comprovante de pagamento para " + nomeCliente + ": Total pago = " + valorTotalPago);
    }

    // Consulta de histórico de pagamentos realizados
    public void consultarHistoricoPagamentos() {
        System.out.println("Histórico de pagamentos:");
        for (Map.Entry<String, Double> entry : historicoPagamentos.entrySet()) {
            System.out.println("Cliente: " + entry.getKey() + ", Valor pago: " + entry.getValue());
        }
    }
}
