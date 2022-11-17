package Entidades;

import java.time.temporal.ChronoUnit;

/**
 *
 * @author NeuenMartinez
 */
public final class BarcoCamarote extends Barco {

    private Integer CV;
    private Integer numCamarotes;

    public BarcoCamarote() {
    }

    public BarcoCamarote(Integer CV, Integer numCamarotes) {
        this.CV = CV;
        this.numCamarotes = numCamarotes;
    }

    public BarcoCamarote(Integer CV, Integer numCamarotes, String matricula, Double eslora, Integer año, Cliente cliente) {
        super(matricula, eslora, año, cliente);
        this.CV = CV;
        this.numCamarotes = numCamarotes;
    }

    public Integer getCV() {
        return CV;
    }

    public void setCV(Integer CV) {
        this.CV = CV;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public Barco crearBarco(Cliente c1, Barco bc1) {
        System.out.println("Ingresar los datos del barco: ");
        System.out.println("Matricula: ");
        matricula = leer.next();
        System.out.println("Eslora: ");
        eslora = leer.nextDouble();
        System.out.println("Año: ");
        año = leer.nextInt();
        System.out.println("Ingresar los CV: ");
        CV = leer.nextInt();
        System.out.println("Ingresar el numero de camarotes: ");
        numCamarotes = leer.nextInt();
        cliente = c1;
        return bc1;

    }

    @Override
    public Double costoAlquiler(Cliente c1) {
        long diasDespues = ChronoUnit.DAYS.between(c1.getFechaDeAlquiler(), c1.getFechaDeDevolución());
        Double Total = (diasDespues * ((eslora * 10) + CV + numCamarotes));
        return Total;
    }

    @Override
    public String toString() {
        return "BarcoCamarote{" + "CV=" + CV + ", numCamarotes=" + numCamarotes + '}';
    }

}
