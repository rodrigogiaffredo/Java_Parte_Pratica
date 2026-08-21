
/* Exercitando tipos primitivos
 * ----------------------------
*/

package aulasparticulares.giulianabezerra;

public class Gb06TiposPrimitivos {

    public static void main(String[] args) {
        
        // Tipos numéricos inteiros
        byte numero1 = 10; // Se eu coloco 1000 ele sublinha, sinalizando número muito grande
        short numero2 = 1000; // Se eu coloco 100000 ele sublinha, sinalizando número muito grande
        int numero3 = 100000; // Se eu exagero bem, ele sublinha, sinalizando número muito grande
        long numero4 = 10000000000L; // Preciso adicionar o 'L' ao final do número para sinalizar
                                     // à JVM que se trata de um número 'long'
        
        // Posso executar operações matemáticas com tipos numéricos inteiros, e a variável 'soma' ou
        // equivalente deverá seguir sempre o tipo do maior número da operação.
        int adicao = numero1 + numero3;
        System.out.println(adicao);


        // Tipos numéricos decimais
        float numero5 = 2.5f; // Preciso adicionar o 'f' ao final do número para sinalizar à JVM que se 
                              // trata de um número 'float'
        double numero6 = 9.5;
        
        // Operações matemáticas com tipos numéricos decimais
        double subtracao = numero5 - numero6;
        System.out.println(subtracao);
        
        // Chamando o método 'soma' no código principal, tendo o cuidado de usar o mesmo tipo de 
        // variável usado na criação do método ('double' lá, 'double' cá).
        // double resultado = soma(11.3, 27.44);
        // System.out.println(resultado);


        // Tipo 'char'
        char operador = '+';
        // Incluindo o operador no resultado da chamada de método feita anteriormente, a qual mudei 
        // para comentário.
        double resultado = soma(11.3, 27.44);
        // Aqui consigo imprimir um 'char' combinado com uma 'string' e um 'double' via concatenação, 
        // porém o sinal de '+' realiza o chamado 'casting' que transforma todo o resultado em 
        // informação textual, por isso a junção funciona.
        System.out.println(operador + " olha só: " + resultado);


        // Tipo 'boolean' para testes lógicos como igual, diferente, maior, menor, etc.
        boolean ehIgual = numero2 == numero4;
        System.out.println(ehIgual);
    }

    // Posso também criar métodos e definir os tipos primitivos das variáveis
    static double soma(double numeroA, double numeroB) {
        return numeroA + numeroB;
    }
}