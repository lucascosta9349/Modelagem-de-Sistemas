public abstract class Triangulo implements FormaGeometrica {
  private float base;
  private float altura;
  private int lado;

  // construtores
  public Triangulo() {
  }

  public Triangulo(float base, float altura, int lado) {
    this.base = base;
    this.altura = altura;
    this.lado = lado;
  }

  // getters e setters
  public void setBase(float base) {
    if (this.base > 0) {
      this.base = base;
    } else {
      System.out.println("Erro! O valor precisa ser maior que zero.");
    }
  }

  public void setAltura(float altura) {
    if (this.altura > 0) {
      this.altura = altura;
    } else {
      System.out.println("Erro! O valor precisa ser maior que zero.");
    }
  }

  public void setLado(int lado) {
    if (this.lado > 0) {
      this.lado = lado;
    } else {
      System.out.println("Erro! O valor precisa ser maior que zero.");
    }
  }

  public float getAltura() {
    return altura;
  }

  public float getBase() {
    return base;
  }

  public int getLado() {
    return lado;
  }

  // Functions
  public double area() {
    float area = (this.base * this.altura) / 2;
    return area;
  }

  public double perimetro() {
    return this.lado * 3;
  }

  public void exibir() {
  }

}
