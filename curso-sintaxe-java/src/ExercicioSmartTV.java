public class ExercicioSmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
    ligada = true;
    }

    public void desligar(){
    ligada = false;
    }

    public void passarCanal(){
    canal++;
    }

    public void voltarCanal(){
    canal++;
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarVolume(){
    volume++;
    }
   
    public void diminuirVolume(){
    volume--;
    }
}



/* Criar um exemplo de uma classe para representar uma SmartTV
    1. Ela tenha características: ligada (boolean), canal (int), e volume (int)
    2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
    3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
    4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente
 */
