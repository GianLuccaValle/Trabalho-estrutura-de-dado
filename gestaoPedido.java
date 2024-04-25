import java.util.List;
public class gestaoPedido {
    private listaPedido listaPedidos;
    private estatistica estatistica;

    public gestaoPedido() {
        this.listaPedidos = new listaPedido();
    }

    public gestaoPedido(estatistica estatistica, listaPedido listaPedidos) {
        this.estatistica = estatistica;
        this.listaPedidos = listaPedidos;
    }



    // cliente almoçando
    public void pedidoAtendido() {
        estatistica.decrementarPessoasNaFilaAlmoco();
        estatistica.incrementarPessoasNoRestaurante();
        estatistica.incrementarPessoasAtendidas();
    }

    public void registrarNovoPedido(String descricao) {
        listaPedidos.adicionarPedido(descricao);
    }

    public boolean cancelarPedido(String descricao) {
        return listaPedidos.cancelarPedido(descricao);
    }

    public boolean alterarPedido(String descricaoAntiga, String descricaoNova) {
        return listaPedidos.alterarPedido(descricaoAntiga, descricaoNova);
    }

    public void consultarPedidos() {
        listaPedidos.consultarPedidos();
    }

    public void adicionarPedido(String descricao) {
        listaPedidos.adicionarPedido(descricao);
    }

    public void registrarPedido(List<String> pedidos) {
        for (String pedido : pedidos) {
            adicionarPedido(pedido);
        }
    }

    // Método para preparar os pedidos
    public void prepararPedidos() {
        System.out.println("Preparando os pedidos...");
        NodoPedido aux = listaPedidos.inicioPedido;
        while (aux != null) {
            System.out.println("Pedido preparado: " + aux.descricao);
            aux = aux.proximoPedido;
        }
        System.out.println("Todos os pedidos foram preparados.");
    }

    // Método para registrar que um cliente foi atendido
    public void clienteAtendido() {
        estatistica.decrementarPessoasNaFilaAlmoco();
        estatistica.incrementarPessoasNoRestaurante();
        estatistica.incrementarPessoasAtendidas();
    }

}
