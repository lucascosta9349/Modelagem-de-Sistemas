public class Losango extends Quadrilatero {
  public int lado;
  public int DiagonalMaior;
  public int DiagonalMenor;

  public Losango() {
  }

  public Losango(int lado, int DiagonalMaior, int DiagonalMenor) {
    this.lado = lado;
    this.DiagonalMaior = DiagonalMaior;
    this.DiagonalMenor = DiagonalMenor;
  }

  public void setLado(int lado) {
    if (lado > 0) {
      this.lado = lado;
    }
  }

  public void setDiagonalMaior(int DiagonalMaior) {
    if (DiagonalMaior > 0) {
      this.DiagonalMaior = DiagonalMaior;
    }
  }

  public void setDiagonalMenor(int DiagonalMenor) {
    if (DiagonalMenor > 0) {
      this.DiagonalMenor = DiagonalMenor;
    }
  }

  public float getLado() {
    return lado;
  }

  public float getDiagonalMaior() {
    return DiagonalMaior;
  }

  public float getDiagonalMenor() {
    return DiagonalMenor;
  }

  @Override
  public double area() {
    double resultado = (this.DiagonalMaior * this.DiagonalMenor) / 2;
    return resultado;
  }

  @Override
  public double perimetro() {
    return lado * 4;
  }

  @Override
  public void exibir() {
    int alturaExibir = (this.lado * 2) - 1;
    int zero = 0;
    int lan = 0;
    int cont = 1;
    int qtdAst = (this.lado * 2) + (this.lado - 2) * 2;
    int ast = 0;

    StringBuffer espaco = new StringBuffer("");
    StringBuffer losang = new StringBuffer("");

    for (int i = 1; i < this.lado; i++)
      espaco.append(" ");

    for (int i = 0; i < alturaExibir; i++) {
      System.out.print(espaco + "*" + losang);
      ast++;
      if (ast == 1)
        System.out.println("");
      if (ast > 1 && ast < qtdAst) {
        System.out.println("*");
        ast++;
      }

      // Manipula os espaços internos
      if (losang.length() < alturaExibir - 2 && lan == 0) {
        for (int j = 1; j <= cont; j++) {
          losang.append(" ");
        }
        if (cont < 2)
          cont++;
      } else if (lan == 1) {
        for (int j = 1; j <= 1; j++) {
          if (losang.length() > 2) {
            losang.deleteCharAt(0);
            losang.deleteCharAt(0);
          }
        }
      } else {
        losang.deleteCharAt(0);
        if (losang.length() > 1)
          losang.deleteCharAt(0);
        lan = 1;
      }

      // Manipula os espaços externos
      if (espaco.length() > 0 && zero == 0)
        espaco.deleteCharAt(0);
      else if (zero == 1)
        espaco.append(" ");
      else {
        espaco.append(" ");
        zero = 1;
      }
    }
  }
}
