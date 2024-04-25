public class ListaMesa {
    private NodoMesa inicioMesas;

    public ListaMesa() {
        this.inicioMesas = null;
    }

    public void adicionarMesa(int numero, int numeroCadeiras, boolean ocupada) {
        NodoMesa novaMesa = new NodoMesa(numero, numeroCadeiras, ocupada);
        if (inicioMesas == null) {
            inicioMesas = novaMesa;
        } else {
            NodoMesa aux = inicioMesas;
            while (aux.proximaMesa != null) {
                aux = aux.proximaMesa;
            }
            aux.proximaMesa = novaMesa;
        }
    }

    public void removerMesa(int numeroMesa) {
        if (inicioMesas != null) {
            if (inicioMesas.getNumero() == numeroMesa) {
                inicioMesas = inicioMesas.getProximaMesa();
            } else {
                NodoMesa anterior = inicioMesas;
                NodoMesa atual = inicioMesas.getProximaMesa();
                while (atual != null && atual.getNumero() != numeroMesa) {
                    anterior = atual;
                    atual = atual.getProximaMesa();
                }
                if (atual != null) {
                    anterior.setProximaMesa(atual.getProximaMesa());
                }
            }
        }
    }

    public void atualizarMesa(int numeroMesa, boolean ocupada) {
        NodoMesa mesa = encontrarMesa(numeroMesa);
        if (mesa != null) {
            mesa.setStatusOcupacao(ocupada);
        } else {
            System.out.println("A mesa " + numeroMesa + " não existe.");
        }
    }

    public void consultarMesas() {
        NodoMesa aux = inicioMesas;
        System.out.println("Mesas cadastradas:");
        while (aux != null) {
            System.out.println(
                    "Número da mesa: " + aux.getNumero() + ", Capacidade: " + aux.getNumcadeira() + ", Status: "
                            + (aux.getStatusOcupacao() ? "Ocupada" : "Livre"));
            aux = aux.getProximaMesa();
        }
    }

    public NodoMesa encontrarMesa(int numeroMesa) {
        NodoMesa aux = inicioMesas;
        while (aux != null) {
            if (aux.getNumero() == numeroMesa) {
                return aux;
            }
            aux = aux.proximaMesa;
        }
        return null;
    }

    public NodoMesa getInicioMesas() {
        return inicioMesas;
    }

    public int contarMesasDisponiveis() {
        int contador = 0;
        NodoMesa atual = inicioMesas;
        while (atual != null) {
            if (!atual.getStatusOcupacao()) {
                contador++;
            }
            atual = atual.getProximaMesa();
        }
        return contador;
    }

    public void alocarMesa(int numeroMesa, int numeroCadeiras) {
        NodoMesa atual = inicioMesas;
        while (atual != null) {
            if (atual.getNumero() == numeroMesa) {
                atual.setStatusOcupacao(true);
                // Você pode adicionar mais lógica aqui, dependendo dos requisitos específicos
                // do seu sistema
                return;
            }
            atual = atual.getProximaMesa();
        }
        System.out.println("Mesa não encontrada.");
    }

    public NodoMesa encontrarMesaDisponivel() {
        NodoMesa aux = inicioMesas;
        while (aux != null) {
            if (!aux.ocupada) {
                return aux;
            }
            aux = aux.proximaMesa;
        }
        return null; // Retorna null se nenhuma mesa estiver disponível
    }

}
