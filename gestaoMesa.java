
public class gestaoMesa {
    private ListaMesa listaMesas;
    private int capacidadeTotal;
    private estatistica estatistica;

    public gestaoMesa(int capacidadeTotal) {
        this.listaMesas = new ListaMesa();
        this.capacidadeTotal = capacidadeTotal;
    }

    public gestaoMesa(estatistica estatistica) {
        this.estatistica = estatistica;
    }

    public void liberarMesa() {
        estatistica.incrementarMesasLivres();
    }

    public void adicionarMesa(int numero, int numeroCadeiras, boolean ocupada) {
        listaMesas.adicionarMesa(numero, numeroCadeiras, ocupada);
    }

    public void removerMesa(int numeroMesa) {
        listaMesas.removerMesa(numeroMesa);
    }

    public void atualizarMesa(int numeroMesa, boolean ocupada) {
        listaMesas.atualizarMesa(numeroMesa, ocupada);
    }

    public void consultarMesas() {
        listaMesas.consultarMesas();
    }

    public void alocarMesaParaCliente(int numeroMesa) {
        NodoMesa mesa = listaMesas.encontrarMesa(numeroMesa);
        if (mesa != null) {
            if (!mesa.getStatusOcupacao()) {
                mesa.setStatusOcupacao(true);
                System.out.println("Mesa " + numeroMesa + " alocada para o cliente com sucesso.");
            } else {
                System.out.println("A mesa " + numeroMesa + " já está ocupada.");
            }
        } else {
            System.out.println("A mesa " + numeroMesa + " não existe.");
        }
    }

    public void liberarMesa(int numeroMesa) {
        NodoMesa mesa = listaMesas.encontrarMesa(numeroMesa);
        if (mesa != null) {
            if (mesa.getStatusOcupacao()) {
                mesa.setStatusOcupacao(false);
                System.out.println("Mesa " + numeroMesa + " liberada com sucesso.");
            } else {
                System.out.println("A mesa " + numeroMesa + " já está livre.");
            }
        } else {
            System.out.println("A mesa " + numeroMesa + " não existe.");
        }
    }

    public void controleCapacidadeMesas() {
        int capacidadeAtual = 0;
        NodoMesa aux = listaMesas.getInicioMesas();
        while (aux != null) {
            capacidadeAtual += aux.getNumcadeira();
            aux = aux.getProximaMesa();
        }

        int capacidadeDisponivel = capacidadeTotal - capacidadeAtual;
        System.out.println("Capacidade total das mesas: " + capacidadeTotal);
        System.out.println("Capacidade atual das mesas: " + capacidadeAtual);
        System.out.println("Capacidade disponível das mesas: " + capacidadeDisponivel);
    }

    public void alocarMesa(int numero, int numeroCadeiras) {
        listaMesas.alocarMesa(numero, numeroCadeiras);
    }

    public int contarMesasDisponiveis() {
        return listaMesas.contarMesasDisponiveis();
    }

    public NodoMesa encontrarMesaDisponivel() {
        return listaMesas.encontrarMesaDisponivel();
    }

    // Método para alocar um cliente a uma mesa
    public void alocarClienteAMesa(String nomeCliente, int numeroMesa) {
        
        System.out.println("Cliente " + nomeCliente + " alocado na mesa " + numeroMesa);
    }

}
