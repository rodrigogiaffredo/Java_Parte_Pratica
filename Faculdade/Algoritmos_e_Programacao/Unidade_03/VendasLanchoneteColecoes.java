
/* Resumo do fluxo:
 * 1- registrar pedidos
 * 2- cancelar pedido
 * 3- consultar pedido
 * 4- registrar códigos
 * 5- associar código ao produto
 * 6- contar vendas
 * 
 * Benefício da solução: cada estrutura é usada de forma adequada para garantir organização, eficiência
 * e integridade de dados.
 */



package Faculdade.Algoritmos_e_Programacao.Unidade_03;


import java.util.HashMap;
import java.util.Map;

import java.util.HashSet;
import java.util.Set;

import java.util.ArrayList;
import java.util.List;



public class VendasLanchoneteColecoes {

    public static void main(String[] args) {

        // Lista de pedidos pendentes
        List<String> pedidosPendentes = new ArrayList<>();

        pedidosPendentes.add("Café");
        pedidosPendentes.add("Sanduíche");
        pedidosPendentes.add("Suco");

        // Pesquisei como imprimir os pedidos pendentes
        System.out.println("=== PEDIDOS PENDENTES ===");
        for(String pedido: pedidosPendentes) {
            System.out.println("- " + pedido);
        }



        // Cancelar um pedido
        // Se o pedido existir, ele é removido da lista
        // Saída: Pedido cancelado.
        boolean removido = pedidosPendentes.remove("Sanduíche");
        if(removido) {
            System.out.println("Pedido cancelado");
        }


        // Consultar um pedido
        // Saída: Existe um pedido de Suco.
        if(pedidosPendentes.contains("Suco")) {
            System.out.println("Existe um pedido de Suco.");
        }


        // Registrar códigos promocionais
        // Resultado: primeiroUso = true (código adicionado)
        //            segundoUso = false (código já existia)
        Set<String> codigosUtilizados = new HashSet<>();

        boolean primeiroUso = codigosUtilizados.add("PROMO10");
        boolean segundoUso = codigosUtilizados.add("PROMO10");

        System.out.println("Código validado? " + primeiroUso);
        System.out.println("Código validado? " + segundoUso);


        // Associar código e produto
        Map<Integer, String> produtosPorCodigo = new HashMap<>();

        produtosPorCodigo.put(101, "Café");
        produtosPorCodigo.put(205, "Suco");
        produtosPorCodigo.put(310, "Bolo");


        // Pesquisei como imprimir a tabela código / produto
        // Cabeçalho da tabela
        System.out.println("=======================");
        System.out.printf("%-10s | %-10s%n", "CÓDIGO", "PRODUTO");
        System.out.println("=======================");
        // Percorrendo o 'Map' e formatando as linhas
        produtosPorCodigo.forEach((codigo, produto) -> {
            System.out.printf("%-10d | %-10s%n", codigo, produto);
        });

        System.out.println("=======================");


        // Contar vendas
        // Resultado: Café -> 1 unidade (a cada nova venda o contador é atualizado)
        Map<String, Integer> quantidadeVendida = new HashMap<>();

        String produtoVendido = "Café";
        int quantidadeAtual = quantidadeVendida.getOrDefault(produtoVendido, 0);
        quantidadeVendida.put(
            produtoVendido,
            quantidadeAtual + 1
        );

        // Pesquisei a exibição da venda no terminal
        System.out.println("Venda registrada: " + produtoVendido);
        System.out.println("Quantidade acumulada de vendas: " + quantidadeVendida.get(produtoVendido));
    }
}
