public class App {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.set_base(4);
        quadrado.set_altura(4);
        System.out.println("\nQuadrado");
        System.out.println("Área " + quadrado.area());
        System.out.println("Perímetro " + quadrado.perimetro() + "\n");
        quadrado.exibir();
        System.out.println();

        Retangulo retangulo = new Retangulo();
        retangulo.set_altura(7);
        retangulo.set_base(11);
        System.out.println("Retângulo");
        System.out.println("Área " + retangulo.area());
        System.out.println("Perímetro " + retangulo.perimetro());
        retangulo.exibir();
        System.out.println();

        Losango losango = new Losango();
        losango.setLado(4);
        losango.setDiagonalMaior(6);
        losango.setDiagonalMenor(4);
        System.out.println("\nLosango");
        System.out.println("Área " + losango.area());
        System.out.println("Perímetro " + losango.perimetro());
        losango.exibir();
        System.out.println();

        Circulo circulo = new Circulo();
        circulo.setRaio(5);
        System.out.println("\nCírculo");
        System.out.println("Área " + circulo.area());
        System.out.println("Perímetro " + circulo.perimetro());
        System.out.println();
    }
}
