public class NodoPedido {
    String descricao;
    NodoPedido proximoPedido;

    public NodoPedido(String descricao) {
        this.descricao = descricao;
        this.proximoPedido = null;
    }

    public void setProximoPedido (NodoPedido proxPedido){
        this.proximoPedido = proxPedido;
    }
}
