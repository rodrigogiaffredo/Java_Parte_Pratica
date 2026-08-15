

/*
 * Primeiro exercício da faculdade (12/08/2026): fazendo uma soma simples
 
 * A linha int a = 10; cria uma variável inteira chamada a com valor 10.
 * A linha int b = 25; cria uma variável inteira chamada b com valor 25.
 * A linha int soma = a + b; calcula a soma e guarda o resultado em soma.
 * A linha System.out.println("A soma e: " + soma); imprime um texto e concatena o número ao final.

 * Como rodar pelo terminal:
 * Validar se está na pasta Faculdade (é só olhar no próprio terminal, no final da frase
 * antes do cursor piscando), e se não estiver usar cd Faculdade;
 * Dentro da pasta Faculdade, digitar:
 * javac Am01SomaSimples.java (para compilar e gerar o arquivo .class)
 * java Am01SomaSimples (para executar)
 */


public class Am01SomaSimples {

    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int soma = a + b;
        System.out.println("A soma é: " + soma);
    }
    
}
