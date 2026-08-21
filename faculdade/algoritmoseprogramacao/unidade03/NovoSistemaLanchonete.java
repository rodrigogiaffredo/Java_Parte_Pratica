
/* Montagem do sistema da lanchonete com base nos requisitos propostos na aula "Resolvendo Problemas
 * com Estruturas" da Unidade 3 do módulo Algoritmos e Programação.
 *
 * Análise da solução
 * ------------------
 * A solução utilizou estruturas diferentes pois cada uma delas possui uma responsabilidade clara.
 * 
 * -------------------------------------------------------------------------------------------
 *           REQUISITO                 ESTRUTURA             OPERAÇÃO PRINCIPAL
 * -------------------------------------------------------------------------------------------
 * Localizar produto por código         HashMap             Busca por chave
 * Registrar sequência de pedidos       ArrayList           Inserção e percurso
 * Preparar na ordem de chegada         Queue               Inserção e retirada
 * Evitar código repetido               HashSet             Verificação de unicidade
 * Contar vendas                        HashMap             Atualização por chave
 * Organizar vendas semanais            Matriz              Processamento por linha e coluna
*/


package faculdade.algoritmoseprogramacao.unidade03;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class NovoSistemaLanchonete {

    public static void main(String[] args) {
        
        // Montagem do cardápio

        Map<Integer, String> cardapio = new HashMap<>();
        cardapio.put(101, "Café");
        cardapio.put(205, "Suco");
        cardapio.put(310, "Bolo");
        cardapio.put(420, "Sanduíche");

        // Localizando um produto

        int codigoInformado = 205;
        String produto = cardapio.get(codigoInformado);
        if(produto == null) {
            System.out.println("Código inválido.");
        }
        else {
            System.out.println("Produto localizado: " + produto);
        }

        // Registrando o pedido

        List<String> pedidosRegistrados = new ArrayList<>();
        Queue<String> filaPreparacao = new ArrayDeque<>();
        pedidosRegistrados.add(produto);
        filaPreparacao.offer(produto);

        // Controlando código promocional

        Set<String> codigosUtilizados = new HashSet<>();
        String codigoPromocional = "PROMO10";
        boolean aceito = codigosUtilizados.add(codigoPromocional);
        if(!aceito) {
            System.out.println("Código já utilizado.");
        }

        // Contando as vendas

        Map<String, Integer> quantidadeVendida = new HashMap<>();
        int quantidadeAtual = quantidadeVendida.getOrDefault(produto, 0);
        quantidadeVendida.put(produto, quantidadeAtual + 1);

        // Concluindo o próximo pedido

        String pedidoConcluido = filaPreparacao.poll();
        if(pedidoConcluido != null) {
            System.out.println("Pedido concluído: " + pedidoConcluido);
        }
    }    
}
