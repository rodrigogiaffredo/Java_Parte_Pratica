
// Exercício extraído do livro MANZANO, José Augusto Navarro G.; JÚNIOR, Roberto Affonso da Costa.
// Programação de computadores com Java. 1. ed. Rio de Janeiro: Érica, 2014.

// No exercício, serão criados 5 métodos, todos definidos abaixo do método main():

// 1- rotsoma()
// 2- rotsubtracao()
// 3- rotmultiplicacao()
// 4- rotdivisao()
// 5- pausa()

// Todos os métodos criados estão indicados como TIPO de retorno de valor 'void', uma vez que
// nenhum desses métodos gera um valor de retorno. Além dessa característica, os métodos estão 
// fazendo uso do QUALIFICADOR 'public', indicando que os métodos definidos são visíveis e podem 
// ser usados dentro da classe 'Cap06_Ex02'. Além do qualificador 'public', está sendo definido o 
// qualificador como sendo do TIPO 'static', indicando que os métodos podem também ser acessados
// exatamente à classe 'Cap06_Ex02'.

// Cada método definido no programa tem por finalidade ler dois valores e processar o referido
// cálculo, apresentando em seguida o respectivo resultado da operação selecionada. Em cada um dos 
// métodos rotsoma(), rotsubtracao(), rotmultiplicacao() e rotdivisao(), destinados às operações
// matemáticas do programa, encontra-se a definição das VARIÁVEIS 'A', 'B', 'R' e 'df'. Essas
// variáveis são consideradas variáveis LOCAIS, uma vez que seu ciclo de vida está relacionado à 
// execução do método a que elas pertencem. Quando o método é encerrado e retorna ao trecho de 
// programa que fez sua chamada, essas variáveis são destruídas da memória. As variáveis do tipo
// local são também referenciadas na linguagem Java como variáveis stack, temporárias, automáticas 
// ou de método.

// Ao final de cada método de cálculo está sendo utilizado o método 'pausa()', cuja finalidade é
// adicionar uma pausa no final da execução de cada rotina antes de retornar ao menu principal.
// Esse método opera com a classe 'BufferReader', uma vez que a ação de adicionar <Enter> não é 
// interpretada pela classe 'Scanner' adequadamente.




// java.io.* permite o uso de todas as classes do pacote de entrada e saída de dados
import java.io.*;
// java.util.Scanner permite o uso da classe 'Scanner', necessária para entrada de dados via 
// teclado
import java.util.Scanner;
// java.text.* permite o uso de todas as ferramentas do pacote necessário para formatar e analisar
// textos, datas, números e mensagens
import java.text.*;


class Calculadora {
    public static void main(String[] args) {
        
        byte OPCAO = 0;
        Scanner opcao = new Scanner(System.in);

        // Programa principal

        while (OPCAO != 5) {
            System.out.println();
            System.out.println();
            System.out.println("------------------------");
            System.out.println("  Programa Calculadora  ");
            System.out.println("     Menu Principal     ");
            System.out.println("------------------------");
            System.out.println();
            System.out.println("[1] ..............Adição");
            System.out.println("[2] ...........Subtração");
            System.out.println("[3] .......Multiplicação");
            System.out.println("[4] .............Divisão");
            System.out.println("[5] .....Fim do Programa");
            System.out.println();
            System.out.println("Escolha uma opção: ");
            OPCAO = opcao.nextByte();
            if (OPCAO != 5 || OPCAO != 0) {
                switch (OPCAO) {
                    case 1: rotadicao(); break;
                    case 2: rotsubtracao(); break;
                    case 3: rotmultiplicacao(); break;
                    case 4: rotdivisao(); break;
                }
            }
        }
    }

    // Módulo de Adição

    public static void rotadicao() {

        double R, A, B;
        DecimalFormat df = new DecimalFormat();
        Scanner s = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println(" Rotina de Adição ");
        System.out.println(" ---------------- ");
        System.out.println();
        System.out.print("Entre um valor para a variável [A]: ");
        A = s.nextDouble();
        System.out.print("Entre um valor para a variável [B]: ");
        B = s.nextDouble();
        R = A + B;
        System.out.println();
        df.applyPattern("0.00");
        System.out.println("O resultado de A + B = " + df.format(R));
        pausa();
    }

    // Módulo de Subtração

    public static void rotsubtracao() {

        double R, A, B;
        DecimalFormat df = new DecimalFormat();
        Scanner s = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println(" Rotina de Subtração ");
        System.out.println(" ------------------- ");
        System.out.println();
        System.out.print("Entre um valor para a variável [A]: ");
        A = s.nextDouble();
        System.out.print("Entre um valor para a variável [B]: ");
        B = s.nextDouble();
        R = A - B;
        System.out.println();
        df.applyPattern("0.00");
        System.out.println("O resultado de A - B = " + df.format(R));
        pausa();
    }


    // Módulo de Multiplicação

    public static void rotmultiplicacao() {

        double R, A, B;
        DecimalFormat df = new DecimalFormat();
        Scanner s = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println(" Rotina de Multiplicação ");
        System.out.println(" ----------------------- ");
        System.out.println();
        System.out.print("Entre um valor para a variável [A]: ");
        A = s.nextDouble();
        System.out.print("Entre um valor para a variável [B]: ");
        B = s.nextDouble();
        R = A * B;
        System.out.println();
        df.applyPattern("0.00");
        System.out.println("O resultado de A x B = " + df.format(R));
        pausa();
    }


    // Módulo de Divisão

    public static void rotdivisao() {

        double R, A, B;
        DecimalFormat df = new DecimalFormat();
        Scanner s = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println(" Rotina de Divisão ");
        System.out.println(" ----------------- ");
        System.out.println();
        System.out.print("Entre um valor para a variável [A]: ");
        A = s.nextDouble();
        System.out.print("Entre um valor para a variável [B]: ");
        B = s.nextDouble();
        if (B == 0) {
            System.out.println();
            System.out.println("O denominador não pode ser igual a zero.");
        }
        else {
            R = A / B;
            System.out.println();
            df.applyPattern("0.00");
            System.out.println("O resultado de A / B = " + df.format(R));
            pausa();
        }        
    }


    // Módulo de Pausa

    public static void pausa() {

        byte ENTER;

        System.out.println();
        System.out.print("Tecle <ENTER> para voltar ao menu: ");
        try {
            BufferedReader br = new BufferedReader (
                new InputStreamReader(System.in));
                ENTER = Byte.parseByte(br.readLine());
        }
        catch (Exception e) {
            ENTER = 0;
        }
    }
}
