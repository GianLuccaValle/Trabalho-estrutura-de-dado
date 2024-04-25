public class listafuncionario {

    private NodoFuncionario inicioFuncionarios;

    public listafuncionario() {
        this.inicioFuncionarios = null;
    }

    public void adicionarFuncionario(String nomeFun, String cargo, String escala) {
        NodoFuncionario novoFuncionario = new NodoFuncionario(nomeFun, cargo, escala);
        if (inicioFuncionarios == null) {
            inicioFuncionarios = novoFuncionario;
        } else {
            NodoFuncionario aux = inicioFuncionarios;
            while (aux.proximoFun != null) {
                aux = aux.proximoFun;
            }
            aux.proximoFun = novoFuncionario;
        }
    }

    public void removerFuncionario(String nomeFun, String cargo) {
        if (inicioFuncionarios != null) {
            if (inicioFuncionarios.nomeFun.equals(nomeFun) && inicioFuncionarios.cargo.equals(cargo)) {
                inicioFuncionarios = inicioFuncionarios.proximoFun;
            } else {
                NodoFuncionario aux = inicioFuncionarios;
                while (aux.proximoFun != null && !aux.proximoFun.nomeFun.equals(nomeFun)
                        && !aux.proximoFun.cargo.equals(cargo)) {
                    aux = aux.proximoFun;
                }
                if (aux.proximoFun != null) {
                    aux.proximoFun = aux.proximoFun.proximoFun;
                }
            }
        }
    }

    public void consultarFuncionarios() {
        NodoFuncionario aux = inicioFuncionarios;
        while (aux != null) {
            System.out.println("nomeFun: " + aux.nomeFun + ", Cargo: " + aux.cargo + ", Escala: " + aux.escala);
            aux = aux.proximoFun;
        }
    }

    public boolean funcionarioExiste(String nomeFun, String cargo) {
        NodoFuncionario aux = inicioFuncionarios;
        while (aux != null) {
            if (aux.nomeFun.equals(nomeFun) && aux.cargo.equals(cargo)) {
                return true;
            }
            aux = aux.proximoFun;
        }
        return false;
    }

    public NodoFuncionario buscarFuncionario(String nomeFun, String cargo) {
        NodoFuncionario aux = inicioFuncionarios;
        while (aux != null) {
            if (aux.nomeFun.equals(nomeFun) && aux.cargo.equals(cargo)) {
                return aux;
            }
            aux = aux.proximoFun;
        }
        return null;
    }
}
