
import java.util.Arrays;
import java.util.List;

public class TesteSimulacaoAtendimento {
    public static void main(String[] args) {
        // Instanciando a Simulação de Atendimento
        SimulacaoAtendimento simulacao = new SimulacaoAtendimento();

        // Nomes de pessoas para os clientes
        List<String> nomesClientes = Arrays.asList("Carlos", "Ana", "Pedro");

        // Testando o encaminhamento de clientes
        System.out.println("Testando o encaminhamento de clientes:");
        simulacao.encaminharClientes(nomesClientes.size()); // Encaminha os clientes para mesas disponíveis
        simulacao.consultarClientes(); // Consulta os clientes encaminhados

        // Testando o registro de pedidos
        System.out.println("\nTestando o registro de pedidos:");
        List<String> pedidos = Arrays.asList("Hamburguer", "Batata Frita", "Refrigerante");
        simulacao.atenderPedidos(pedidos);

        // Testando a preparação de pedidos
        System.out.println("\nTestando a preparação de pedidos:");

        // Testando a entrega de pedidos
        System.out.println("\nTestando a entrega de pedidos:");
        simulacao.entregarPedidos(nomesClientes.size()); // Entrega os pedidos aos clientes

        // Testando a cobrança e fechamento de contas
        System.out.println("\nTestando a cobrança e fechamento de contas:");
        simulacao.cobrarContas();
    }
}
