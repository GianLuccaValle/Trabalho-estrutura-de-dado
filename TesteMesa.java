public class TesteMesa {
  
        public static void main(String[] args) {
            // Instanciando um objeto de gestaoMesa
            gestaoMesa gestao = new gestaoMesa(50); // Por exemplo, capacidade total de 50 cadeiras
    
            // Adicionando mesas
            gestao.adicionarMesa(1, 4, false);
            gestao.adicionarMesa(2, 6, true);
            gestao.adicionarMesa(3, 2, false);
    
            // Consultando mesas
            gestao.consultarMesas();
    
            // Alocando uma mesa para um cliente
            gestao.alocarMesaParaCliente(1);
            gestao.alocarMesaParaCliente(2); // Tentando alocar uma mesa já ocupada
    
            // Liberando uma mesa
            gestao.liberarMesa(1);
    
            // Verificando a capacidade das mesas
            gestao.controleCapacidadeMesas();
    
            // Contando mesas disponíveis
            int mesasDisponiveis = gestao.contarMesasDisponiveis();
            System.out.println("Número de mesas disponíveis: " + mesasDisponiveis);
    
            // Encontrando uma mesa disponível
            NodoMesa mesaDisponivel = gestao.encontrarMesaDisponivel();
            if (mesaDisponivel != null) {
                System.out.println("Mesa disponível encontrada: " + mesaDisponivel.getNumero());
            } else {
                System.out.println("Nenhuma mesa disponível encontrada.");
            }
    
            // Alocando um cliente a uma mesa
            gestao.alocarClienteAMesa("João", 3);
            gestao.alocarClienteAMesa("carlos", 2);
            
        }
    
}
