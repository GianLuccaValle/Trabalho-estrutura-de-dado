public class TesteEstatistica {

    public static void main(String[] args) {
        // Instanciando a Estatística
        estatistica estatistica = new estatistica();

        // Testando a atualização das estatísticas
        System.out.println("Testando a atualização das estatísticas:");
        estatistica.incrementarPessoasNaFilaAlmoco();
        estatistica.incrementarPessoasNaFilaAlmoco();
        estatistica.incrementarPessoasNaFilaAlmoco();
        estatistica.incrementarPessoasNaFilaCaixa();
        estatistica.incrementarPessoasNaFilaCaixa();
        estatistica.incrementarPessoasNaFilaCaixa();
        estatistica.incrementarPessoasNoRestaurante();
        estatistica.incrementarPessoasNoRestaurante();
        estatistica.incrementarPessoasNoRestaurante();
        estatistica.incrementarPessoasAtendidas();
        estatistica.incrementarPessoasAtendidas();
        estatistica.incrementarMesasLivres();
        estatistica.incrementarMesasLivres();
        estatistica.incrementarMesasLivres();
        estatistica.incrementarMesasLivres();
        // remover se precisar
        estatistica.decrementarPessoasNaFilaAlmoco();
        estatistica.decrementarPessoasNoRestaurante();

        // Testando a consulta das estatísticas
        System.out.println("\nTestando a consulta das estatísticas:");
        System.out.println("Pessoas na fila do almoço: " + estatistica.getPessoasNaFilaAlmoco());
        System.out.println("Pessoas na fila do caixa: " + estatistica.getPessoasNaFilaCaixa());
        System.out.println("Pessoas no restaurante: " + estatistica.getPessoasNoRestaurante());
        System.out.println("Pessoas atendidas: " + estatistica.getPessoasAtendidas());
        System.out.println("Mesas livres: " + estatistica.getMesasLivres());
    }

}
