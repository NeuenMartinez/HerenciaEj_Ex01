package Entidades;

import java.time.temporal.ChronoUnit;

/**
 *
 * @author NeuenMartinez
 */
public final class BarcoVelero extends Barco {

    private Integer numMastiles;

    public BarcoVelero() {
    }

    public BarcoVelero(Integer numMastiles) {
        this.numMastiles = numMastiles;
    }

    public BarcoVelero(Integer numMastiles, String matricula, Double eslora, Integer año, Cliente cliente) {
        super(matricula, eslora, año, cliente);
        this.numMastiles = numMastiles;
    }

    public Integer getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(Integer numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public Barco crearBarco(Cliente c1, Barco v1) {
        System.out.println("Ingresar los datos del barco: ");
        System.out.println("Matricula: ");
        matricula = leer.next();
        System.out.println("Eslora: ");
        eslora = leer.nextDouble();
        System.out.println("Año: ");
        año = leer.nextInt();
        System.out.println("Ingresar cantidad de mastiles: ");
        numMastiles = leer.nextInt();
        cliente = c1;
        return v1;
    }

    @Override
    public Double costoAlquiler(Cliente c1) {
        long diasDespues = ChronoUnit.DAYS.between(c1.getFechaDeAlquiler(), c1.getFechaDeDevolución());
        Double Total = (diasDespues * ((eslora * 10) + numMastiles));
        return Total;
    }

    @Override
    public String toString() {
        return "BarcoVelero{" + "numMastiles=" + numMastiles + '}';
    }

}
