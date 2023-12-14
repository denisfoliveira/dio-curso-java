public class BoletimEscolar {
    public static void main(String[] args) {
      int mediaFinal = 10;
      if (mediaFinal < 6)
          System.out.println("REPROVADO");
      else if (mediaFinal == 6)
          System.out.println("RECUPERAÇÃO");
      else if (mediaFinal > 6 && mediaFinal <= 10)
          System.out.println("APROVADO");
      else
          System.out.println("MÉDIA INVÁLIDA");
    }
}