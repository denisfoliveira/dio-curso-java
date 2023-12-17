public class ExercicioSmartTVUsuario {
    public static void main(String[] args) throws Exception {

        ExercicioSmartTV smartTv = new ExercicioSmartTV();

        System.out.println("TV ligada:" + " " + smartTv.ligada);
        System.out.println("Canal atual:" + " " + smartTv.canal);
        System.out.println("Volume atual" + " " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada?" + " " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual " + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual " + smartTv.volume);
        smartTv.passarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.passarCanal();
        smartTv.passarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(50);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(22);
        System.out.println("Canal atual: " + smartTv.canal);


    }
}
