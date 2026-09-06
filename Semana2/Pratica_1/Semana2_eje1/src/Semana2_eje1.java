public class Semana2_eje1 {
    public static void main(String[] args) {
        // 1. Creamos la calculadora
        CalculadoraEnvio calculadora = new CalculadoraEnvio();

        // 2. Creamos los objetos de envío
        MetodoEnvio moto = new EnvioMoto();
        MetodoEnvio dron = new EnvioDron();

        // 3. Probamos la calculadora pasando el OBJETO, no un texto
        double costoMoto = calculadora.calcular(moto, 10.0); // La calculadora llama a EnvioMoto
        double costoDron = calculadora.calcular(dron, 10.0); // La calculadora llama a EnvioDron

        System.out.println("Costo en moto: " + costoMoto); // Imprime 20.0
        System.out.println("Costo en dron: " + costoDron); // Imprime 40.0
    }
}
