public class NodoFuncionario {
    String nomeFun;
    String cargo;
    String escala;
    NodoFuncionario proximoFun;

    public NodoFuncionario(String nomeFun, String cargo, String escala) {
        this.nomeFun = nomeFun;
        this.cargo = cargo;
        this.escala = escala;
        this.proximoFun = null;
    }

    public void setProximoFuncionario(NodoFuncionario proxFunc) {
        this.proximoFun = proxFunc;
    }

    public String getNomeFun() {
        return nomeFun;
    }

    public String getCargo() {
        return cargo;
    }

    public String getEscala() {
        return escala;
    }
    
}
