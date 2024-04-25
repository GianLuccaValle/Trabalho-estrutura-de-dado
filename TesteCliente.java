public class TesteCliente {

    public static void main(String[] args) {
        // Criando uma instância de gestaoCliente
        gestaoCliente gestao = new gestaoCliente();

        // Cadastrando alguns clientes
        gestao.cadastrarClientes("Luiz");
        gestao.cadastrarClientes("Carlos");
        gestao.cadastrarClientes("Maria");

        // Consultando os clientes cadastrados
        gestao.consultarClientes();

        // Removendo um cliente
        //gestao.removerCliente("Carlos");

        // Consultando os clientes novamente para verificar a remoção
        gestao.consultarClientes();

        // Atualizando o nome de um cliente
        gestao.atualizarCliente("Luiz", "Fernando");

        // Consultando os clientes novamente para verificar a atualização
        gestao.consultarClientes();

        // Associando um cliente a uma mesa
        gestao.alocarClienteAMesa("Novo Nome Fernando", 1);

        // Entrando na fila do almoço
        gestao.entrarNaFilaAlmoco();

        // Cliente sendo atendido
        gestao.clienteAtendido();

        // Fechando a conta de um cliente
        gestao.fecharConta("Novo Nome Fernando");

        // Entrando na fila do caixa
        gestao.entrarNaFilaCaixa("Maria");
        
    }
}
