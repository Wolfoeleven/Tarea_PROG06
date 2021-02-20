package prog06_tarea;
//Importamos Calendar para poder realizar el método Anios



/**
 * @author Iván Morán Díaz La clase Vehículo almacena todas las variables
 * necesarias, así como sus métodos de acceso, para que el programa funcione
 */
public class Vehiculo {

    /**
     * Declaramos la variables de la clase
     */
    private String marca;
    private String matricula;
    private int numKilometros;
    private String fechaMat;
    private String descripcion;
    private double precio;
    private String nomPropietario;
    private String dni;
    

    
      /**
     * Metodo constructor por defecto
     */
    public Vehiculo() {
    }

    
       /**
     * Metodo constructor parametrizado
     * @param marca Marca del vehículo
     * @param matricula Matrícula del vehículo
     * @param numKilometros cantidad de kilómetros actual del vehículo
     * @param fechaMat fecha en la que fue matriculado el vehículo
     * @param descripcion Descripción del vehículo
     * @param precio Valor de mercado actual del vehículo
     * @param nomPropietario Nombre del propietario del vehículo
     * @param dni Documento de identificación del propietario del vehículo
     */
    public Vehiculo(String marca, String matricula, int numKilometros, String fechaMat, String descripcion, double precio, String nomPropietario, String dni) {
        this.marca = marca;
        this.matricula = matricula;
        this.numKilometros = numKilometros;
        this.fechaMat = fechaMat;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nomPropietario = nomPropietario;
        this.dni = dni;
        
    }
/**Declaramos los métodos Get y Set para encapsular las variables
     * @return 
*/
    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getNumKilometros() {
        return numKilometros;
    }

    public String getFechaMat() {
        return fechaMat;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNomPropietario() {
        return nomPropietario;
    }

    public String getDni() {
        return dni;
    }

    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNumKilometros(int numKilometros) {
        this.numKilometros = numKilometros;
    }

    public void setFechaMat(String fechaMat) {
        this.fechaMat = fechaMat;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNomPropietario(String nomPropietario) {
        this.nomPropietario = nomPropietario;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

   
}
