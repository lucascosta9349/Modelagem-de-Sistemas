public class TrianguloEscaleno extends Triangulo {
  private int lado2;

  // Constructors
  public TrianguloEscaleno() {

  }

  public TrianguloEscaleno(float base, float altura, int lado, int lado2) {
    super(base, altura, lado);
    if (lado2 > 0) {
      this.lado2 = lado2;
    } else {
      System.out.println("Erro! O valor precisa ser maior que zero.");
    }
  }

  // Get and Set
  public void setLado2(int lado) {
    if (this.lado2 > 0) {
      this.lado2 = lado;
    } else {
      System.out.println("Erro! O valor precisa ser maior que zero.");
    }
  }

  public int getLado2() {
    return lado2;
  }

  // Function
  @Override
  public double perimetro() {
    return super.getLado() + super.getBase() + this.lado2;
  }
}
