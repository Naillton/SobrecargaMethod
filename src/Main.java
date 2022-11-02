public class Main {
    public static void main(String[] args) {
        sobrecarga metodos = new sobrecarga();
        int quadrado = metodos.CalculaAreaQuadrado(5,5);
        System.out.println("A area do quadrado e = " + quadrado);
        int retangulo = metodos.CalculaAreaRetangulo(10,2);
        System.out.println("A area do retangulo e = " + retangulo);
        int trapezio = metodos.CalculaAreaTrapézio(15,5, 8);
        System.out.println("A area do trapezio e = " + trapezio);
    }
}