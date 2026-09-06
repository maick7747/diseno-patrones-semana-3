public class EnvioCamion implements MetodoEnvio{
    @Override
    public double calcular(double peso) {
        return peso * 5.0;
    }
}
