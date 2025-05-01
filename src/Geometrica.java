import static java.lang.Math.sqrt;

public class Geometrica implements MediaStrategy {
    @Override
    public double calcularMedia(double p1, double p2) {
        return sqrt(p1 * p2);
    }

    @Override
    public String verificarSituacao(double media) {
        return media >= 7 ? "Aprovado" : "Reprovado";
    }
}
