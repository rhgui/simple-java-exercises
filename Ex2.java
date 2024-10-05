public class Ex2 {

    /**
     * Exercício 1: Soma dos números naturais pares entre dois números
     *
     * @param min O número mínimo do intervalo (inclusive).
     * @param max O número máximo do intervalo (inclusive).
     * @return A soma dos números naturais pares no intervalo [min, max].
     *
     * Dica: Usa um loop for para iterar de min até max.
     * Verifica se cada número é par usando o operador %.
     * Soma apenas os números pares.
     */
    public static int sumEvenBetween(int min, int max) {
        // TODO: Implemente o método
        // Dica adicional: Inicializa uma variável para armazenar a soma.
        // Usa um if dentro do loop para verificar se o número é par.
        // Lembra-te de incluir o próprio 'max' na verificação se for par.
        return 0;
    }

    /**
     * Exercício 2: Inverte um número inteiro
     *
     * @param num O número a ser invertido.
     * @return O número invertido.
     *
     * Dica: Usa um loop while para extrair cada dígito do número.
     * Multiplica o resultado por 10 e adicione o novo dígito.
     * Divide o número original por 10 a cada iteração.
     */
    public static int invertInt(int num) {
        // TODO: Implemente o método
        // Dica adicional: Inicializa uma variável para armazenar o resultado invertido.
        // Usa o operador % para obter o último dígito do número.
        // Cuidado com números que terminam em zero, como 5000.
        return 0;
    }

    /**
     * Exercício 3: Calcula o n-ésimo número da sequência de Fibonacci
     *
     * @param n O índice do número de Fibonacci desejado (começando em 0).
     * @return O n-ésimo número da sequência de Fibonacci.
     *
     * Dica: Usa variáveis para armazenar os dois últimos números da sequência.
     * Utiliza um loop para calcular o próximo número somando os dois anteriores.
     * Lembra-te que F(0) = 0 e F(1) = 1.
     * vê este link: https://cdn-media-0.freecodecamp.org/size/w1000/2022/06/How-to-write-Java-Program-to-find-Fibonacci-Series-2.png
     */
    public static int fibonacci(int n) {
        // TODO: Implemente o método
        // Dica adicional: Trata os casos base (n = 0 e n = 1) separadamente.
        // Usa três variáveis: uma para o número anterior, uma para o atual e uma para o próximo.
        // Atualiza essas variáveis a cada iteração do loop.
        return 0;
    }

    /**
     * Exercício 4: Calcula o máximo divisor comum de dois números
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return O máximo divisor comum de a e b.
     *
     * Dica: Implementa o algoritmo de Euclides.
     * Usa um loop while para substituir o maior número pelo resto da divisão entre os dois números.
     * Continua até que um dos números seja zero.
     */
    public static int gcd(int a, int b) {
        // TODO: Implemente o método
        // Dica adicional: Usa o operador % para calcular o resto da divisão.
        // Troca os valores de a e b a cada iteração, com b a receber o resto.
        // O loop deve continuar enquanto b não for zero.
        return 0;
    }

    public static void main(String[] args) {
        // Testes para sumEvenBetween
        System.out.println("Teste sumEvenBetween:");
        System.out.println("sumEvenBetween(2, 8) = " + sumEvenBetween(2, 8) + " (esperado: 20) - " + (sumEvenBetween(2, 8) == 20 ? "true" : "false"));
        System.out.println("sumEvenBetween(1, 10) = " + sumEvenBetween(1, 10) + " (esperado: 30) - " + (sumEvenBetween(1, 10) == 30 ? "true" : "false"));
        System.out.println();

        // Testes para invertInt
        System.out.println("Teste invertInt:");
        System.out.println("invertInt(1234) = " + invertInt(1234) + " (esperado: 4321) - " + (invertInt(1234) == 4321 ? "true" : "false"));
        System.out.println("invertInt(5000) = " + invertInt(5000) + " (esperado: 5) - " + (invertInt(5000) == 5 ? "true" : "false"));
        System.out.println();

        // Testes para fibonacci
        System.out.println("Teste fibonacci:");
        System.out.println("fibonacci(0) = " + fibonacci(0) + " (esperado: 0) - " + (fibonacci(0) == 0 ? "true" : "false"));
        System.out.println("fibonacci(1) = " + fibonacci(1) + " (esperado: 1) - " + (fibonacci(1) == 1 ? "true" : "false"));
        System.out.println("fibonacci(7) = " + fibonacci(7) + " (esperado: 13) - " + (fibonacci(7) == 13 ? "true" : "false"));
        System.out.println();

        // Testes para gcd
        System.out.println("Teste gcd:");
        System.out.println("gcd(48, 18) = " + gcd(48, 18) + " (esperado: 6) - " + (gcd(48, 18) == 6 ? "true" : "false"));
        System.out.println("gcd(100, 75) = " + gcd(100, 75) + " (esperado: 25) - " + (gcd(100, 75) == 25 ? "true" : "false"));
        System.out.println();
    }
}