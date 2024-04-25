public class TesteFuncionario {
    public static void main(String[] args) {
        // Instanciando um objeto de GestaoFuncionarios
        GestaoFuncionarios gestaoFuncionarios = new GestaoFuncionarios();

        // Cadastrando funcionários
        gestaoFuncionarios.cadastrarFuncionario("João", "Atendente", "Segunda a Sexta");
        gestaoFuncionarios.cadastrarFuncionario("Maria", "Cozinheira", "Segunda a Sexta");

        // Consultando funcionários
        System.out.println("Funcionários cadastrados:");
        gestaoFuncionarios.consultarFuncionarios();

        // Verificando a existência de um funcionário
        String nome = "João";
        String cargo = "Atendente";
        boolean existe = gestaoFuncionarios.verificarExistenciaFuncionario(nome, cargo);
        if (existe) {
            System.out.println(nome + " é um " + cargo + " cadastrado.");
        } else {
            System.out.println(nome + " não está cadastrado como " + cargo + ".");
        }

        // Buscando um funcionário
        NodoFuncionario funcionario = gestaoFuncionarios.buscarFuncionario(nome, cargo);
        if (funcionario != null) {
            System.out.println("Informações de " + nome + ": Cargo - " + funcionario.getCargo() + ", Escala - " + funcionario.getEscala());
        } else {
            System.out.println("Funcionário não encontrado.");
        }

        // Removendo um funcionário
        gestaoFuncionarios.removerFuncionario(nome, cargo);

        // Consultando funcionários novamente para verificar se o funcionário foi removido
        System.out.println("\nFuncionários após a remoção:");
        gestaoFuncionarios.consultarFuncionarios();
    }
}


