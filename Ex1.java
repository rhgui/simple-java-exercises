public class Ex1 {

    /**
     * Exercício 1: Soma dois números inteiros (c/ criação de variável)
     *
     * @param a O primeiro número inteiro.
     * @param b O segundo número inteiro.
     * @return A variável que resultante da soma de a e b.
     */
    public static int somarDoisNumeros(int a, int b) {
        // TODO: Cria uma variável que tenha o valor da soma de a e b
        return 0; // substitui o 0 pelo valor correto (a variável neste caso)
    }

    /**
     * Exercício 2: Verifica se um número é par (c/ criação de variável)
     *
     * @param numero O número a ser verificado.
     * @return true se o número for par, false caso contrário.
     */
    public static boolean ePar(int numero) {
        // TODO: Cria uma variável que fique com o valor da verificação se o número é par
        return false; // substitui o false pelo valor correto (a variável neste caso)
    }

    /**
     * Exercício 3: Calcula o dobro de um número (c/ criação de variável)
     *
     * @param numero O número a ser dobrado.
     * @return O dobro do número fornecido.
     */
    public static int dobrarNumero(int numero) {
        // TODO: Cria uma variável que fique com o valor do cálculo do dobro do número
        return 0; // substitui este retorno pelo cálculo correto (a variável neste caso)
    }

    /**
     * Exercício 4: Verifica se um número está dentro de um intervalo (inclusivo)
     *
     * @param numero O número a ser verificado.
     * @param minimo O valor mínimo do intervalo.
     * @param maximo O valor máximo do intervalo.
     * @return true se o número estiver dentro do intervalo, false caso contrário.
     */
    public static boolean estaDentroDoIntervalo(int numero, int minimo, int maximo) {
        // TODO: Cria uma variável que verifique se o número está dentro do intervalo (inclusivo)
        // Dica: Usa os operadores >= e <= em conjunto com && (conjunção)
        return false; // substitui o false pelo valor correto (a variável neste caso)
    }

    public static void main(String[] args) {
        // ======================================== IGNORAR ========================================
        // Testes simples
        System.out.println("Teste 1 - somarDoisNumeros(3, 4):");
        int resultadoSoma = somarDoisNumeros(3, 4);
        System.out.println("Resultado: " + resultadoSoma);
        System.out.println("Correto? " + (resultadoSoma == 7));

        System.out.println("\nTeste 2 - ePar(6):");
        boolean resultadoPar = ePar(6);
        System.out.println("Resultado: " + resultadoPar);
        System.out.println("Correto? " + (resultadoPar));

        System.out.println("\nTeste 3 - dobrarNumero(5):");
        int resultadoDobro = dobrarNumero(5);
        System.out.println("Resultado: " + resultadoDobro);
        System.out.println("Correto? " + (resultadoDobro == 10));

        System.out.println("\nTeste 4 - estaDentroDoIntervalo(5, 1, 10):");
        boolean resultadoIntervalo = estaDentroDoIntervalo(5, 1, 10);
        System.out.println("Resultado: " + resultadoIntervalo);
        System.out.println("Correto? " + (resultadoIntervalo));
    }
}
