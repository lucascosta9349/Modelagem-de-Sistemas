public class TrianguloEquilatero extends Triangulo {
  private int lado;

  public TrianguloEquilatero() {
  }

  public TrianguloEquilatero(int lado) {
    if (lado > 0) {
      this.lado = lado;
    } else {
      System.out.println("Erro! informe um valor maior que zero");
    }
  }

  public void setLado(int lado) {
    if (lado > 0) {
      this.lado = lado;
    } else {
      System.out.println("Erro! informe um valor maior que zero");
    }
  }

  public int getLado() {
    return lado;
  }

  @Override
  public double area() {
    return (Math.pow(this.lado, 2) * Math.sqrt(3))/4;
  }

  @Override
  public double perimetro() {
    return this.lado * 3;
  }
}