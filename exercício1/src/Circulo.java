public class Circulo implements FormaGeometrica {
  private double raio;
  private double pi = 3.14;

  public void setRaio(float raio) {
    if (raio > 0) {
      this.raio = raio;
    }
  }

  public double getRaio() {
    return raio;
  }

  @Override
  public double area() {
    return pi * (raio * raio);
  }

  @Override
  public double perimetro() {
    return (float) (2 * pi * raio);
  }

  @Override
  public void exibir() {
    throw new UnsupportedOperationException("Unimplemented method 'exibir'");
  }
}
