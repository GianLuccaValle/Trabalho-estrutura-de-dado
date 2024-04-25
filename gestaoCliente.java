

public class gestaoCliente {
    private ListaCliente listaClientes;
    private estatistica estatistica;


    public gestaoCliente() {
        this.listaClientes = new ListaCliente();
        this.estatistica = new estatistica();
    }


    public gestaoCliente(estatistica estatistica) {
        this.listaClientes = new ListaCliente();
        this.estatistica = estatistica;
    }


    public void entrarNaFilaAlmoco() {
        estatistica.incrementarPessoasNaFilaAlmoco();
    }


    public void cadastrarClientes(String nome) {
        listaClientes.adicionarCliente(nome);
    }


    public void removerCliente(String nome) {
        listaClientes.removerCliente(nome);
    }


    public void consultarClientes() {
        NodoCliente clienteAtual = listaClientes.getInicioClientes();
        if (clienteAtual == null) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        System.out.println("Clientes cadastrados:");
        while (clienteAtual != null) {
            System.out.println(clienteAtual.getNome());
            clienteAtual = clienteAtual.getProximoCliente();
        }
    }
    


    public void atualizarCliente(String nomeAntigo, String novoNome) {
        listaClientes.atualizarCliente(nomeAntigo, novoNome);
    }


    // Método para associar um cliente a uma mesa
    public void alocarClienteAMesa(String nomeCliente, int numeroMesa) {
        // Implemente a lógica aqui para associar o cliente à mesa
        // Por exemplo:
        System.out.println("Cliente " + nomeCliente + " alocado na mesa " + numeroMesa);
    }


    public void clienteAtendido() {
        estatistica.decrementarPessoasNaFilaAlmoco();
        estatistica.incrementarPessoasNoRestaurante();
        estatistica.incrementarPessoasAtendidas();
    }


    // Método para fechar a conta de um cliente pelo nome
    public void fecharConta(String nomeCliente) {
        listaClientes.removerCliente(nomeCliente);
    }

    public void entrarNaFilaCaixa(String nomeCliente) {
        // Encontrar o cliente na lista
        NodoCliente clienteAtual = listaClientes.getInicioClientes();
        while (clienteAtual != null) {
            if (clienteAtual.getNome().equals(nomeCliente)) {
                // Cliente encontrado, chamar o método para entrar na fila do caixa
                clienteAtual.entrarNaFilaCaixa();
                return;
            }
            clienteAtual = clienteAtual.getProximoCliente();
        }
        // Se o cliente não for encontrado na lista
        System.out.println("Cliente não encontrado.");
    }
    
}
