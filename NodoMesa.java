
public class NodoMesa {
    private int numMesa;
    private int numCadeira;
    boolean ocupada;
    NodoMesa proximaMesa;
    public int NumMesa;

    public NodoMesa(int numMesa, int numCadeira, boolean ocupada) {
        this.numMesa = numMesa;
        this.numCadeira = numCadeira;
        this.ocupada = ocupada;
        this.proximaMesa = null;
    }

    public void setProximaMesa(NodoMesa proxMesa) {
        this.proximaMesa = proxMesa;
    }

    public int getNumero() {
        return numMesa;
    }

    public int getNumcadeira() {
        return numCadeira;
    }

    public boolean getStatusOcupacao() {
        return ocupada;
    }

    public void setStatusOcupacao(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public NodoMesa getProximaMesa() {
        return proximaMesa;
    }
}
