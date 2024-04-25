public class ListaCliente {
    private NodoCliente inicioClientes;

    public ListaCliente() {
        this.inicioClientes = null;
    }

    public void adicionarCliente(String nome) {
        NodoCliente novoCliente = new NodoCliente(nome);
        if (inicioClientes == null) {
            inicioClientes = novoCliente;
        } else {
            NodoCliente aux = inicioClientes;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novoCliente;
        }
    }

    public void removerCliente(String nome) {
        if (inicioClientes != null) {
            if (inicioClientes.nome.equals(nome)) {
                inicioClientes = inicioClientes.proximo;
            } else {
                NodoCliente aux = inicioClientes;
                while (aux.proximo != null && !aux.proximo.nome.equals(nome)) {
                    aux = aux.proximo;
                }
                if (aux.proximo != null) {
                    aux.proximo = aux.proximo.proximo;
                }
            }
        }
    }
    

    public void consultarClientes() {
        NodoCliente aux = inicioClientes;
        while (aux != null) {
            System.out.println("Nome: " + aux.nome);
            aux = aux.proximo;
        }
    }

    public void atualizarCliente(String nomeAntigo, String novoNome) {
        NodoCliente aux = inicioClientes;
        while (aux != null) {
            if (aux.nome.equals(nomeAntigo)) {
                aux.nome = novoNome;
            }
            aux = aux.proximo;
        }
    }

    public NodoCliente getInicioClientes() {
        return inicioClientes;
    }

   

    
}
