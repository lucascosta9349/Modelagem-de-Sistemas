public abstract class Quadrilatero implements FormaGeometrica {
  protected float base;
  private float altura;

  public Quadrilatero() {
  }

  public Quadrilatero(float base, float altura) {
    this.base = base;
    this.altura = altura;
  }

  public void set_base(float base) {
    if (base > 0) {
      this.base = base;
    } else {
      System.out.println("O valor digitado é menor ou igual a zero");
    }
  }

  public void set_altura(float altura) {
    if (altura > 0) {
      this.altura = altura;
    } else {
      System.out.println("O valor digitado é menor ou igual a zero");
    }
  }

  public float getBase() {
    return base;
  }

  public float getAltura() {
    return altura;
  }

  public double area() {
    return this.base * this.altura;
  }

  public double perimetro() {
    if (base <= 0 || altura <= 0) {
      System.out.println("erro de cálculo do perímetro! valor retornado incorreto");
    }
    return (this.base * 2) + (this.altura * 2);
  }

  public void exibir() {
    for (int x = 0; x <= this.altura; x++) {
      for (int y = 0; y <= this.base; y++) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}
