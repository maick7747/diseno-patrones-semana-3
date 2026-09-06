public class EnvioMoto implements MetodoEnvio {
    @Override
    public double calcular(double peso) {
        return peso * 2.0;
    }
}
