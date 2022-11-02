public class sobrecarga {
    public int CalculaAreaQuadrado(int lv, int lh ) {
        return lv * lh;
    }

    public int CalculaAreaRetangulo(int base, int altura ) {
        return base * altura;
    }

    public int CalculaAreaTrapézio(int baseMaior, int baseMenor, int altura ) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}
