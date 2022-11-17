package Entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class Cliente {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private String nombre;
    private String documento;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDeDevolución;
    private int posAmarre;
    private Barco barcoAlquilado;

    public Cliente() {
    }

    public Cliente(String nombre, String documento, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolución, int posAmarre, Barco barcoAlquilado) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolución = fechaDeDevolución;
        this.posAmarre = posAmarre;
        this.barcoAlquilado = barcoAlquilado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolución() {
        return fechaDeDevolución;
    }

    public void setFechaDeDevolución(LocalDate fechaDeDevolución) {
        this.fechaDeDevolución = fechaDeDevolución;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarcoAlquilado() {
        return barcoAlquilado;
    }

    public void setBarcoAlquilado(Barco barcoAlquilado) {
        this.barcoAlquilado = barcoAlquilado;
    }

    public void crearCliente(Cliente c1) {
        boolean exit = true;
        String mat;
        Double esl;
        Integer año;
        System.out.println("INGRESAR LOS DATOS DEL CLIENTE: ");
        System.out.println("Nombre: ");
        nombre = leer.next();
        System.out.println("DNI: ");
        documento = leer.next();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        System.out.println("Fecha de alquiler: (dd MM yyyy)");
        fechaDeAlquiler = LocalDate.parse(leer.next(), dtf);
        System.out.println("Fecha de devolucion: (dd MM yyyy)");
        fechaDeDevolución = LocalDate.parse(leer.next(), dtf);
        System.out.println("Ingresar la posicion de amarre a tomar: ");
        posAmarre = leer.nextInt();
        do {
            System.out.println("Seleccion del barco: ");
            System.out.println("1. Barco Comun "
                    + "2. Velero "
                    + "3. Barco a Motor "
                    + "4. Yate "
                    + "5. Salir ");
            System.out.println("Ingresar el numero de su tipo de barco: ");
            int elec = leer.nextInt();
            switch (elec) {
                case 1:
                    Barco b1 = new Barco();
                    b1.crearBarco(c1, b1);
                    System.out.println("Para el navio: " + b1);
                    System.out.println("El costo del alquiler total es: " + b1.costoAlquiler(c1));
                    break;
                case 2:
                    Barco v1 = new BarcoVelero();
                    v1.crearBarco(c1, v1);
                    System.out.println("Para el navio: " + v1);
                    System.out.println("El costo del alquiler total es: " + v1.costoAlquiler(c1));
                    break;
                case 3:
                    Barco bm1 = new BarcoMotor();
                    bm1.crearBarco(c1, bm1);
                    System.out.println("Para el navio: " + bm1);
                    System.out.println("El costo del alquiler total es: " + bm1.costoAlquiler(c1));
                    break;
                case 4:
                    Barco bc1 = new BarcoCamarote();
                    bc1.crearBarco(c1, bc1);
                    System.out.println("Para el navio: " + bc1);
                    System.out.println("El costo del alquiler total es: " + bc1.costoAlquiler(c1));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta, pruebe nuevamente...");
                    exit = false;
            }
        } while (exit == false);

    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", documento=" + documento + ", fechaDeAlquiler=" + fechaDeAlquiler + ", fechaDeDevolucion=" + fechaDeDevolución + ", posAmarre=" + posAmarre + ", barcoAlquilado=" + barcoAlquilado + '}';
    }

}
