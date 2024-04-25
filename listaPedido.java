public class listaPedido {
    NodoPedido inicioPedido;

    public listaPedido() {
        this.inicioPedido = null;
    }

    public void adicionarPedido(String descricao) {
        NodoPedido novoPedido = new NodoPedido(descricao);
        if (inicioPedido == null) {
            inicioPedido = novoPedido;
        } else {
            NodoPedido aux = inicioPedido;
            while (aux.proximoPedido != null) {
                aux = aux.proximoPedido;
            }
            aux.proximoPedido = novoPedido;
        }
    }

    public boolean cancelarPedido(String descricao) {
        if (inicioPedido != null) {
            if (inicioPedido.descricao.equals(descricao)) {
                inicioPedido = inicioPedido.proximoPedido;
                return true;
            } else {
                NodoPedido aux = inicioPedido;
                while (aux.proximoPedido != null && !aux.proximoPedido.descricao.equals(descricao)) {
                    aux = aux.proximoPedido;
                }
                if (aux.proximoPedido != null) {
                    aux.proximoPedido = aux.proximoPedido.proximoPedido;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean alterarPedido(String descricaoAntiga, String descricaoNova) {
        NodoPedido aux = inicioPedido;
        while (aux != null) {
            if (aux.descricao.equals(descricaoAntiga)) {
                aux.descricao = descricaoNova;
                return true;
            }
            aux = aux.proximoPedido;

        }
        return false;
    }

    public void consultarPedidos() {
        NodoPedido aux = inicioPedido;
        while (aux != null) {
            System.out.println("Descrição: " + aux.descricao);
            aux = aux.proximoPedido;
        }
    }
}
