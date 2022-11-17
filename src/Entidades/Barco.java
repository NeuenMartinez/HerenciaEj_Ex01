package Entidades;

import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class Barco {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    protected String matricula;
    protected Double eslora;
    protected Integer año;
    protected Cliente cliente;

    public Barco() {
    }

    public Barco(String matricula, Double eslora, Integer año, Cliente cliente) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.año = año;
        this.cliente = cliente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Barco crearBarco(Cliente c1, Barco b1) {
        System.out.println("Ingresar los datos del barco: ");
        System.out.println("Matricula: ");
        matricula = leer.next();
        System.out.println("Eslora: ");
        eslora = leer.nextDouble();
        System.out.println("Año: ");
        año = leer.nextInt();
        cliente = c1;
        return b1;
    }
    
    public Double costoAlquiler(Cliente c1){
        long diasDespues = ChronoUnit.DAYS.between(c1.getFechaDeAlquiler(), c1.getFechaDeDevolución());
        Double Total = (diasDespues * (eslora * 10));
        return Total;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", año=" + año + ", cliente=" + cliente + '}';
    }
    

}
