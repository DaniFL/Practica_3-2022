package interfaz;

@FunctionalInterface
/**
 * Interfaz funcional que guarda la función para generar la aproximación a pi.
 */
public interface Interfaz {

    /**
     * Método abstracto que procede con la aproximación.
     * @param pi valor decimal del número pi.
     */
    public void generarPi(double pi);
}
