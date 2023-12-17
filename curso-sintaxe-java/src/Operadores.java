//Simbolos especiais que tem um significado proprio para a linguagem e estão associados a determinadas operações

//==, !=, >, <, >=, <=
// atribuição = (definir ou alterar valor da variável)

public class Operadores {
    public static void main(String[] args) {
        // Condições && e ||

        boolean condicao1 = true;
        boolean condicao2 = true;

        System.out.println("As duas condições são verdadeiras?");

        if (condicao1 == true && condicao2 == true && (7 > 5)) {
            System.out.println("Resposta: As duas condições são verdadeiras");
        } else {
            System.out.println("Resposta: As duas condições não são verdadeiras");
        }

        System.out.println("Alguma das condições é verdadeira?");
        if (condicao1 == true || condicao2 == true) {
            System.out.println("Resposta: Uma das condições é verdadeira");
        } else {
            System.out.println("Resposta: Nenhuma das condições é verdadeira");
        }

        // Operadores relacionais
        /* == != > >= < <= && || */

        // Operador ternário (como IF normal, apenas em uma linha)

        // <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja
        // false>

        /*
         * Exemplo utilizando if/else
         * boolean doadorMedula = true;
         * if (doadorMedula == false)
         * System.out.println("O usuário não é doador de Medula");
         * else
         * System.out.println("O usuário é doador de Medula");
         */
        /*
         * Exemplo utilizando operador ternário
         * doadorMedula = false;
         * String resultado = (doadorMedula == false) ?
         * "O usuário não é doador de Medula"
         * : "O usuário é doador de medula";
         * System.out.println(resultado);
         * 
         * String nomeUm = "Denis";
         * String nomeDois = new String("Denis");
         * 
         * // System.out.println(nomeUm == nomeDois);
         * System.out.println(nomeUm.equals(nomeDois)); // metodo para comparar
         * conteúdos (objetos)
         */
        /*
         * // x incremento
         * int numero = 5;
         * numero = numero + 1;
         * // ou
         * numero++;
         * // ou
         * System.out.println(++numero);
         * 
         * boolean doadorSangue = false;
         * System.out.println(!doadorSangue); // inverter resultado com ! (em memória)
         * System.out.println(doadorSangue);
         * doadorSangue = !doadorSangue;
         * System.out.println(doadorSangue);
         * 
         * String nome = "Denis";
         * int idade = 22;
         * double peso = 68.5;
         * char sexo = 'M';
         * boolean doadorOrgao = false;
         * Date dataNascimento = new Date();
         * 
         * // concatenação
         * double soma = 10.5 + 15.7;
         * int subtracao = 113 - 25;
         * int multiplicacao = 20 * 4;
         * int divisao = 15 / 7;
         * double resultado = (10*7) + (20/4);
         * String nomeCompleto = "Linguagem" + "Java"
         * String primeiroNome = "João";
         * String segundoNome = "Marcelo";
         * String nomeCompleto = primeiroNome + " " + segundoNome;
         * System.out.println(nomeCompleto);
         * 
         * String concat = "?";
         * System.out.println(concat);
         * 
         * concat = 1 + 1 + 1 + "1";
         * System.out.println(concat);
         * 
         * concat = 1 + "1" + 1 + 1;
         * System.out.println(concat);
         * 
         * concat = 1 + "1" + 1 + "1";
         * System.out.println(concat);
         * 
         * concat = "1" + 1 + 1 + 1;
         * System.out.println(concat);
         * 
         * concat = "1" + (1 + 1 + 1);
         * System.out.println(concat);
         * 
         * Operadores
         * int numero = 5;
         * numero = -numero;
         * System.out.println(numero);
         * 
         * numero = numero * -1;
         * System.out.println(numero);
         * 
         * boolean teste = false;
         * System.out.println(!teste);
         * 
         */
    }
}
