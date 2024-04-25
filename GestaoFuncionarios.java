public class GestaoFuncionarios {
    private listafuncionario listaFuncionarios;

    public GestaoFuncionarios() {
        this.listaFuncionarios = new listafuncionario();
    }

    public void cadastrarFuncionario(String nome, String cargo, String escala) {
        listaFuncionarios.adicionarFuncionario(nome, cargo, escala);
    }

    public void removerFuncionario(String nome, String cargo) {
        listaFuncionarios.removerFuncionario(nome, cargo);
    }

    public void consultarFuncionarios() {
        listaFuncionarios.consultarFuncionarios();
    }

    public boolean verificarExistenciaFuncionario(String nome, String cargo) {
        return listaFuncionarios.funcionarioExiste(nome, cargo);
    }

    public NodoFuncionario buscarFuncionario(String nome, String cargo) {
        return listaFuncionarios.buscarFuncionario(nome, cargo);
    }
}
