
public class estatistica {
    private int pessoasNaFilaAlmoco;
    private int pessoasNaFilaCaixa;
    private int pessoasNoRestaurante;
    private int pessoasAtendidas;
    private int mesasLivres;

    public estatistica() {

        this.pessoasNaFilaAlmoco = 0;
        this.pessoasNaFilaCaixa = 0;
        this.pessoasNoRestaurante = 0;
        this.pessoasAtendidas = 0;
        this.mesasLivres = 0;
    }

    // Métodos para atualizar as estatísticas

    public void incrementarPessoasNaFilaAlmoco() {
        pessoasNaFilaAlmoco++;
    }

    public void decrementarPessoasNaFilaAlmoco() {
        pessoasNaFilaAlmoco--;
    }

    public void incrementarPessoasNaFilaCaixa() {
        pessoasNaFilaCaixa++;
    }

    public void decrementarPessoasNaFilaCaixa() {
        pessoasNaFilaCaixa--;
    }

    public void incrementarPessoasNoRestaurante() {
        pessoasNoRestaurante++;
    }

    public void decrementarPessoasNoRestaurante() {
        pessoasNoRestaurante--;
    }

    public void incrementarPessoasAtendidas() {
        pessoasAtendidas++;
    }

    public void decrementarMesasLivres() {
        mesasLivres--;
    }

    public void incrementarMesasLivres() {
        mesasLivres++;
    }

    // Métodos para consultar as estatísticas

    public int getPessoasNaFilaAlmoco() {
        return pessoasNaFilaAlmoco;
    }

    public int getPessoasNaFilaCaixa() {
        return pessoasNaFilaCaixa;
    }

    public int getPessoasNoRestaurante() {
        return pessoasNoRestaurante;
    }

    public int getPessoasAtendidas() {
        return pessoasAtendidas;
    }

    public int getMesasLivres() {
        return mesasLivres;
    }
}
