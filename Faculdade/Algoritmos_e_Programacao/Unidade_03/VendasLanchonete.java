
/* Matrizes
 * --------
 *
 * A representação dos dados em uma matriz facilita a organização das informações, mas um programa 
 * precisa realizar operações sobre esses valores para gerar resultados úteis. A partir da matriz 
 * de vendas, é possível percorrer os dados, realizar cálculos, comparar valores e identificar 
 * informações importantes para a tomada de decisão. Um algoritmo pode utilizar essa estrutura para
 * analisar os dados passo a passo.
 * 
 * Visão geral do algoritmo
 * ------------------------
 * 
 * O algoritmo percorre a matriz de vendas para obter informações importantes: totais por produto e
 * por dia, além de identificar o produto mais vendido e o dia de maior movimento. Passos:
 * 
 * 1- Exibir matriz: percorre todas as linhas e colunas para exibir as vendas de cada produto em 
 *    cada dia;
 * 2- Calcular total por produto: soma as vendas de cada coluna (produto) ao longo de todos os 
 *    dias;
 * 3- Localizar o produto mais vendido: compara os totais por produto e identifica aquele com maior 
 *    valor;
 * 4- Calcular total por dia: soma as vendas de cada linha (dia) considerando todos os produtos;
 * 5- Localizar o dia de maior movimento: compara os totais por dia e identifica o dia com o maior 
 *    volume de vendas.
 * 
 * Resumo: Matriz de vendas / Produtos / Dias / Totais / Resultado principal
 * 
 * Comentário sobre o print formatado (System.out.printf):
 * -------------------------------------------------------
 * 
 * %s: é um substituto para textos (Strings); será trocado pelo nome do produto ou dia da semana.
 * %d: é um substituto para números inteiros (int); será trocado pelos valores numéricos dos 'arrays'
 *     de totais.
 * %n: representa uma quebra de linha compatível com qualquer sistema operacional.
 * 
 */

package Faculdade.Algoritmos_e_Programacao.Unidade_03;

public class VendasLanchonete {
    public static void main(String[] args) {

        int[][] vendas = {
            {35, 18, 12, 22},
            {40, 21, 15, 25},
            {32, 20, 17, 19},
            {45, 24, 13, 30},
            {58, 31, 20, 42}
        };

        String[] dias = {
            "Segunda-feira", 
            "Terça-feira", 
            "Quarta-feira", 
            "Quinta-feira", 
            "Sexta-feira"
        };

        String[] produtos = {
            "Café",
            "Suco",
            "Bolo",
            "Sanduíche"
        };

    // Passo 1: exibição da matriz

    for(int linha = 0; linha < vendas.length; linha++){
        System.out.println(dias[linha]);
        for(int coluna = 0; coluna < vendas[linha].length; coluna++) {
            System.out.printf(
                "%s: %d%n", 
            produtos[coluna],
            vendas[linha][coluna]);
        };
    }

    // Passo 2: calcular o total por produto

    int[] totalPorProduto = new int[produtos.length];
    for(int linha = 0; linha < vendas.length; linha++) {
        for(int coluna =  0; coluna < vendas[linha].length; coluna++) {
            totalPorProduto[coluna] += vendas[linha][coluna];
        }
    }


    // Pesquisei e inseri essa saída
    System.out.println("== Total de Vendas por Produto ==");
    for(int i = 0; i < totalPorProduto.length; i++) {
        System.out.printf(
            "%s: %d unidades%n",
        produtos[i],
        totalPorProduto[i]);
    }


    // Passo 3: localizar o produto mais vendido

    int indiceMaisVendido = 0;
    for (int i = 1; i < totalPorProduto.length; i++) {
        if(totalPorProduto[i] > totalPorProduto[indiceMaisVendido]) {
            indiceMaisVendido = i;
        }
    }

    // Pesquisei e inseri essa saída
    System.out.println("== Produto Mais Vendido ==");
    System.out.printf("O produto mais vendido foi: %s (%d unidades)%n",
        produtos[indiceMaisVendido],
        totalPorProduto[indiceMaisVendido]
    );


    // Passo 4: calcular o total por dia

    int[] totalPorDia = new int[dias.length];
    for(int linha = 0; linha < vendas.length; linha++) {
        for(int coluna = 0; coluna < vendas[linha].length; coluna++) {
            totalPorDia[linha] += vendas[linha][coluna];
        }
    }

    // Pesquisei e inseri essa saída
    System.out.println("== Total de Vendas por Dia ==");
    for(int i = 0; i < totalPorDia.length; i++) {
        System.out.printf("%s: %d unidades vendidas%n",
            dias[i],
            totalPorDia[i]
        );
    }




    // Passo 5: localizar o dia de maior movimento

    int indiceDiaMaisMovimentado = 0;
    for(int i = 1; i < totalPorDia.length; i++) {
        if(totalPorDia[i] > totalPorDia[indiceDiaMaisMovimentado]) {
            indiceDiaMaisMovimentado = i;
        }
    }

    // Pesquisei e inseri essa saída
    System.out.println("== Dia de Maior Movimento ==");
    System.out.printf("O dia de maior movimento foi: %s (%d unidades totais)%n",
        dias[indiceDiaMaisMovimentado],
        totalPorDia[indiceDiaMaisMovimentado]
    );

    }    
}

/* A matriz 'vendas' é percorrida várias vezes com objetivos diferentes; a mudança na direção
 * da soma (por coluna ou por linha) altera o tipo de total calculado.
*/
