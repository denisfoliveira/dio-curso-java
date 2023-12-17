public class Escopo {
    //Escopo de classe
    //Escopo de método
    //Escopo de fluxo
    
    //Escopo = ambiente onde uma variável pode ser acessada. Em java, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada

    double saldo=10.0;
    //variavel da classe "conta (Escopo)"
    
    //método sacar / variável recebida por parâmetro "valor" só é visivel dentro do método "sacar"
    public void sacar (Double valor) {

        double novoSaldo = saldo - valor;
        //variável local de método
    }
    public void imprimirSaldo(){
        
        System.out.println(saldo);
            //disponível em toda classe
        //System.out.println(novoSaldo);
            //somente o método sacar reconhece essa variável
    }
    public double calcularDividaExponencial(){

    double valorParcela = 50.0;
    double valorMontante = 0.0;
    //variáveis locais de método

    for (int x=1; x<=5; x++){ // x variável de escopo de fluxo

        double valorCalculado = valorParcela * x;
        //variável valorCalculado será reiniciada a cada execução

        valorMontante = valorMontante + valorCalculado;
    } 
    //escopo de fluxo
    //x e valorCalculado nuncac estarão disponíveis fora desse escopo
    return valorMontante;
    }
}
