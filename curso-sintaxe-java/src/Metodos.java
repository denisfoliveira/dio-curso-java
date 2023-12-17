//Uma classe é definida por atributos e métodos
//Atributos são em sua grande maioria, variáveis de diferentes tipos e valores
//Metodos correspondem a funções ou sub-rotinas disponiveis dentro de nossas classes

/* Critério de nomeação dos métodos
    Deve ser nomeado com verbo exemplo: acelerar, frear, somar, etc..
    Padrão camelCase
    Exemplos:   somar(int n1, int n2){}
                abrirConexao(){}
                findById(int id){}
                calcularSalario(){}
    * caso o método não retorne nenhum valor, ele será representado pela palavra-chave void.

 */

public class Metodos {

    public double somar(int num1, int num2){
        //LÓGICA - FINALIDADE DO MÉTODO
        return 1; //FINALIZAR COM RETURN O TIPO CORRESPONDENTE
    }

    public void imprimir(String texto){
        //LÓGICA - FINALIDADE DO MÉTODO
        //AQUI NÃO PRECISA DO RETURN
        //POIS NÃO SERA RETORNADO NENHUM RESULTADO
    }
    //throws Exception: indica que o método ao ser utilizado poderá gerar uma exceção
    //public double dividir(int dividendo, int divisor) throws Exception{}

    private void metodoPrivado(){}

    public void validar (){
        //este método deveria retornar algum valor no caso boolean (true ou false)
    }

    /**
     * public void calcular() {}
     */
    

    public void gravarCliente(String nome, String cpf){
        //este método tem a finalidade de gravar informações de um cliente, por que não criar um objeto cliente e passar como parametro?
    }
    //public void gravarCliente2(Cliente cliente){}
    //ou
    //public void gravar(Cliente cliente){}
    
}

