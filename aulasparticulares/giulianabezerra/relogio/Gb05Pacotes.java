

/* Na aula fiz o seguinte junto com a professora:
 *
 * 1- Criei o diretório 'relogio' dentro de aulasparticulares.giulianabezerra;
 * 
 * 2- Movi os arquivos .java das aulas 3 e 4 (métodos e classes, as quais contém código usando exemplo
 *    do despertador) para dentro do pacote, e nesse momento a IDE propôs fazer a alteração dos 
 *    arquivos para refletir o pacote neles (na primeira linha do arquivo aparecerá a sintaxe);
 * 
 * 3- A partir de então, todas as classes que estiverem dentro do mesmo pacote podem ser chamadas em 
 *    arquivos .java diferentes. Ou seja, posso usar as funcionalidades da classe Gb04Classes dentro 
 *    da classe Gb03Metodos, por exemplo posso ter uma chamada para o método 'Gb04Classes' usando a 
 *    variável 'despertador' conforme abaixo no código.
 * 
 * Além de os pacotes agruparem coisas comuns, eles compartilham visibilidade de tudo que contiverem
 * entre todos que estiverem contidos neles. 
 * 
 * E caso os arquivos .java que precisam ser acessados não estiverem no mesmo pacote, basta usar a 
 * sintaxe do comando 'import' e o nome da classe no final do endereço (que é o nome completo
 * qualificado da classe), e apontá-los no início do arquivo.
 * 
 * Supondo que eu quisesse pegar algo que está na minha pasta faculdade/algoritmoseprogramacao/
 * unidade01, usaria:
 * 
 * import faculdade.algoritmoseprogramacao.unidade01.ClasseQueEuQueroPegar;
 * 
 * E a partir de então essa classe contidas em outro diretório estaria disponível para uso. 
 * 
*/


// Pacote automaticamente importado para o código pela IDE.
// Eu não criei na nomenclatura oficial por mera questão de organização minha.

package aulasparticulares.giulianabezerra.relogio;

// Programas profissionais em Java sempre definem pacotes para as classes, não há classe sem pacote.

public class Gb05Pacotes {

    public static void main(String[] args) {
        
    }

    // Ao passar o mouse sobre Gb04Classes, que está acessível aqui por estar no mesmo pacote que 
    // Gb05Pacotes, eu consigo ver o endereço onde o pacote está.
    Gb04Classes despertador;

    
}
