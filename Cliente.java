public class Cliente {
    private String nome;
    private boolean contaAberta;
    private double totalConta;

    
    public Cliente(String nome) {
        this.nome = nome;
        this.contaAberta = true; // Ao criar um cliente, a conta está aberta por padrão
        this.totalConta = 0; // Inicializa o total da conta como zero
    }

    
    public String getNome() {
        return nome;
    }

    public boolean isContaAberta() {
        return contaAberta;
    }

    public double getTotalConta() {
        return totalConta;
    }

    // Método para fechar a conta do cliente
    public void fecharConta() {
        if (contaAberta) {
            // Verifica se há algum valor pendente na conta
            if (totalConta > 0) {
                
                
                System.out.println("Por favor, efetue o pagamento de R$" + totalConta);
            }
            // Fecha a conta
            contaAberta = false;
            totalConta = 0; // Zera o total da conta
            System.out.println("Conta fechada para o cliente " + nome);
        } else {
            System.out.println("A conta já está fechada para o cliente " + nome);
        }
    }

}
