package Giuliana_Bezerra;

public class Gb03Metodos {
    public static void main(String[] args) { 
        /*
        * Quando a JVM escaneia um código em Java, olha primeiro para o método principal (main), e
        * executa o bloco de comandos definido ali. Por isso, o novo método 'ativarSoneca' precisa 
        * ser chamado (invocado) dentro do bloco de código do método 'main'.
        *  
        * Sintaxe da chamada de método: identificador();
        * ----------------------------------------------
        * Nota: sem parênteses seria uma variável, com parênteses é método.
        * Transformei em comentário para que o próximo método seja executado.           
        * ativarSoneca();
        */
        
        /* Por ser um método com parâmetros, preciso informar seus ARGUMENTOS, ou seja, os valores
         * a serem considerados em cada um dos parâmetros especificados. Para que a mensagem seja 
         * mostrada no terminal, declaro uma variável do tipo 'String" que receberá o 'return' do 
         * método. Agora basta imprimir o conteúdo da variável.
         */

        String mensagemDoAlarme = agendarAlarme(12, 30);
        System.out.println(mensagemDoAlarme);
    }

    /*
    * Sintaxe geral para declaração de métodos em Java
    * ------------------------------------------------
    * <tipo do retorno do método> identificador(<tipo> parâmetro) {
    *   <bloco de comandos>
    * }   
    * 
    * Nota: o método 'ativarSoneca' também precisa ser 'static' pois nossa função principal também 
    * é. Caso contrário, não consiguirei chamá-la no método principal. Ou seja, o método chamado 
    * pela função principal deve seguir a mesma tipagem do método principal, para que possa ser 
    * invocado no código.    
    */

    static void ativarSoneca() {
        System.out.println("Só mais 5 minutinhos :P");
    }

    /* Agora um método que possua parâmetros, o qual também será chamado no método 'main'.
     * Os parâmetros desse novo método são locais pois são declarados dentro do método.    
    */

    static String agendarAlarme(int hora, int minutos) {
        return "Seu alarme foi configurado para " + hora + ":" + minutos;
    }
    
}
