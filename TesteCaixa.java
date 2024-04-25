public class TesteCaixa {

    public static void main(String[] args) {
        // Instanciando a Caixa de Pagamento de Pedidos
        CaixaPagamentoPedidos caixa = new CaixaPagamentoPedidos();

        // Registrando pagamentos de clientes
        System.out.println("Registrando pagamentos:");
        caixa.registrarPagamento("Carlos", 80.0);
        caixa.registrarPagamento("Ana", 60.0);
        caixa.registrarPagamento("Pedro", 40.0);

        // Consultando histórico de pagamentos
        System.out.println("\nConsultando histórico de pagamentos:");
        caixa.consultarHistoricoPagamentos();

        // Calculando troco
        System.out.println("\nCalculando troco:");
        double trocoCarlos = caixa.calcularTroco("Carlos", 45.0, 20.0);
        double trocoAna = caixa.calcularTroco("Ana", 35.0, 30.0);
        System.out.println("Troco para Carlos: " + trocoCarlos);
        System.out.println("Troco para Ana: " + trocoAna);

        // Emitindo comprovante de pagamento
        System.out.println("\nEmitindo comprovante de pagamento:");
        caixa.emitirComprovante("Carlos");
        caixa.emitirComprovante("Ana");
        caixa.emitirComprovante("Pedro");
    }

}
