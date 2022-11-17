package Entidades;

import java.time.temporal.ChronoUnit;

/**
 *
 * @author NeuenMartinez
 */
public final class BarcoMotor extends Barco {

    private Integer CV;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer CV) {
        this.CV = CV;
    }

    public BarcoMotor(Integer CV, String matricula, Double eslora, Integer año, Cliente cliente) {
        super(matricula, eslora, año, cliente);
        this.CV = CV;
    }

    public Integer getCV() {
        return CV;
    }

    @Override
    public Barco crearBarco(Cliente c1, Barco bm1) {
        System.out.println("Ingresar los datos del barco: ");
        System.out.println("Matricula: ");
        matricula = leer.next();
        System.out.println("Eslora: ");
        eslora = leer.nextDouble();
        System.out.println("Año: ");
        año = leer.nextInt();
        System.out.println("Ingresar los CV: ");
        CV = leer.nextInt();
        cliente = c1;
        return bm1;
    }

    @Override
    public Double costoAlquiler(Cliente c1) {
        long diasDespues = ChronoUnit.DAYS.between(c1.getFechaDeAlquiler(), c1.getFechaDeDevolución());
        Double Total = (diasDespues * ((eslora * 10) + CV));
        return Total;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "CV=" + CV + '}';
    }

}
