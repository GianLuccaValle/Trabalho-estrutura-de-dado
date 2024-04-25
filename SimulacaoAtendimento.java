import java.util.List;

public class SimulacaoAtendimento {
    gestaoCliente gestaoClientes;
    private gestaoPedido gestaoPedidos;
    private gestaoMesa gestaoMesas;
    public void atenderPedidos(List<String> pedidos) {
        for (String pedido : pedidos) {
            gestaoPedidos.registrarNovoPedido(pedido);
            System.out.println("Pedido registrado: " + pedido);
        }
    }

    // Método para preparar os pedidos
    public void prepararPedidos() {
        System.out.println("Todos os pedidos foram preparados.");
    }

    // Método para entregar os pedidos aos clientes
    public void entregarPedidos(int numeroClientes) {
        System.out.println("Entregando pedidos aos clientes...");
        for (int i = 0; i < numeroClientes; i++) {
            // Supondo que cada cliente recebe seu pedido individualmente
            System.out.println("Pedido entregue ao Cliente " + (i + 1));
        }
    }

    // Método para cobrar as contas e fechar as contas
    public void cobrarContas() {
        System.out.println("Contas cobradas e fechadas. Obrigado pela visita!");
    }



    public SimulacaoAtendimento() {
        this.gestaoClientes = new gestaoCliente();
        this.gestaoPedidos = new gestaoPedido();
        this.gestaoMesas = new gestaoMesa(200);
    }
    public void encaminharClientes(int numeroClientes) {
        // Verificar se há mesas disponíveis
        int mesasDisponiveis = gestaoMesas.contarMesasDisponiveis();
        if (mesasDisponiveis < numeroClientes) {
            System.out.println("Desculpe, não há mesas suficientes para todos os clientes.");
            return;
        }
    
        // Associar cada cliente a uma mesa disponível
        for (int i = 0; i < numeroClientes; i++) {
            // Verificar se há uma mesa disponível
            NodoMesa mesaDisponivel = gestaoMesas.encontrarMesaDisponivel();
            if (mesaDisponivel != null) {
                // Associar o cliente à mesa disponível
                gestaoClientes.alocarClienteAMesa("carlos", mesaDisponivel.NumMesa);
                System.out.println("Cliente " + (i + 1) + " alocado na mesa " + mesaDisponivel.NumMesa);
            } else {
                System.out.println("Erro ao encontrar uma mesa disponível para o cliente " + (i + 1));
            }
        }
    }
    
    

    // Consultar clientes cadastrados
    public void consultarClientes() {
        gestaoClientes.consultarClientes();
    }
}