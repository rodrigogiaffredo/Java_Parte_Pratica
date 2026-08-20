
package aulasparticulares.giulianabezerra.relogio;

/* Vamos emular a criação de um despertador (o ideal seria a classe se chamar 'Despertador' mas para 
 * a correta organização do diretório e dos estudos posteriores, mantive o nome do arquivo.).
 * Ao contrário do que fiz na aula de variáveis, onde o programa era procedural e todos os métodos 
 * foram executados dentro da própria classe, agora vou exercitar a criação de objetos a partir de sua 
 * classe.
*/
public class Gb04Classes {
    
    // Atributos do Despertador ('<tipo> nome;' assim como qualquer variável, porém são de instância)
    int horas;
    int minutos;
    int soneca;

    // Por não chamar os métodos na função 'main', removo o 'static' na sua criação.
    // Por serem métodos instanciados dentro da classe, posso chamar os atributos (variáveis) da 
    // classe também, e não somente aqueles declarados dentro do próprio método.
    void ativarSoneca() {
        System.out.println("Só mais " + soneca + " minutinhos :P");
    }

    // Não preciso mais declarar os atributos 'hora' e 'minutos' de forma procedural, como fiz no 
    // exercício da aula sobre métodos, já que agora posso acessar os atributos da classe, os quais 
    // são herdados pelo objeto.
    String agendarAlarme() {
        return "Seu alarme foi configurado para " + horas + ":" + minutos;
    }
}
