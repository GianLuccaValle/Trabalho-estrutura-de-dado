

public class TestePedido {
    public static void main(String[] args) {
        estatistica stats = new estatistica();
        listaPedido pedidos = new listaPedido();

        gestaoPedido gestao = new gestaoPedido(stats, pedidos);

        // Registrando um novo pedido
        gestao.registrarNovoPedido("Pizza");
        gestao.registrarNovoPedido("pizza de queijo");

        // Consultando os pedidos
        gestao.consultarPedidos();
        gestao.alterarPedido("pizza de queijo", "PIzza de Frango");

        // Cancelando um pedido
        gestao.cancelarPedido("Pizza");

        // Registrando múltiplos pedidos
        gestao.registrarNovoPedido("hambuguer");
        gestao.registrarNovoPedido("pastel");
        // Consultando os pedidos novamente
        gestao.consultarPedidos();

        // Preparando os pedidos
        gestao.prepararPedidos();

        // Simulando um cliente atendido
        gestao.clienteAtendido();
    }
}
