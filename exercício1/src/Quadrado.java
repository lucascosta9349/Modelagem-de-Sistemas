public class Quadrado extends Quadrilatero {

  public Quadrado() {
  }

  @Override
  public void set_base(float base) {
    super.set_base(base);
  }

  @Override
  public void set_altura(float altura) {
    if (this.base > 0) {
      System.out.println("1º condição concluída! A base é maior que zero");
    } else {
      System.out.println("Insira a base primeiro");
    }

    if (altura == base && altura > 0) {
      super.set_altura(altura);
      System.out.println("Valor Armazenado");
    } else {
      System.out.println("2° condição não concluída! \nA altura precisa ser igual a base e maior que zero.");
    }
  }

}
