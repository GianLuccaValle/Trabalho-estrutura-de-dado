public class NodoCliente {
    String nome;
    NodoCliente proximo;


    public NodoCliente(String nome){
        this.nome = nome;
        this.proximo = null;
    }


    public void setProximoCliente(NodoCliente proximoCliente){
        this.proximo = proximoCliente;
    }


    public String getNome() {
        return nome;
    }


    public void entrarNaFilaCaixa() {
        System.out.println("Cliente " + nome + " entrou na fila do caixa.");
    }


    public NodoCliente getProximoCliente() {
        return proximo; 
    }
}
