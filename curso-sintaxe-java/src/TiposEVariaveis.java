//int, byte, short, long, float, double, boolean, char
//os tipos a cima não são considerados objetos, são considerados primitivos

//armazenado diretamente na pilha de memória

//partes fracionarias float e double*

//idade = inteiro   salario = double

//<tipo> <nomeVariavel> <atribuicaoDeValorOpcional

//Exempro:
//int idade;  tipo "int", nome "idade" com nenhum valor atribuido
//int anoFabricacao = 2021;
//double salarioMinimo = 2.500;

public class TiposEVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500.33;
        System.out.println(salarioMinimo);

        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com 0, talvez string
        long cpf = 12312312333L; // se começar com 0, talvez string (precisa encerrar com L)
        float pi = 3.14F; // float F no final
        double salario = 1242.55;
        System.out.println(ano + " " + cpf);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1; // variável, que o valor pode ser modificado posteriormente

        System.out.println(numeroCurto);

        final int NUMERO = 1; // Constante *final* nunca muda(por convenção, o nome sempre em caixa alta)
    }
}