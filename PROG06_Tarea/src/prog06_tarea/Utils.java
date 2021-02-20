package prog06_tarea;


import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Iván Morán Díaz
 * La clase Utils guarda el menú y los métodos de validación de entrada de datos
 * para garantizar el funcionamiento correcto del programa
 */

public class Utils {

    /**Declaramos u método para mostrar el menú
    * @return menú de opciones seleccionables por el usuario
     */
    public static void getMenu() {
        System.out.println("1. Nuevo Vehículo");
        System.out.println("2. Listar Vehículos");
        System.out.println("3. Buscar Vehículo");
        System.out.println("4. Modificar Kms Vehículo");
        System.out.println("5. Salir");
        
    }
/**Método que valida, por medio de un booleano, que el coche tenga kilómetros
     * @param km
     * @return 
 */
    public static boolean validarKilometraje(int km) {
        return km > 0;
    }

/**Validamos que la fecha introducida sea correcta
     * @param day
     * @param month
     * @param year
     * @return 
 */
    public static boolean validarFechaMatriculacion(int day, int month, int year) {
        Calendar matDate = Calendar.getInstance();
        matDate.set(year, month - 1, day, 0, 0);
        Calendar currentDate = Calendar.getInstance();
        return currentDate.after(matDate);
    }
    
    /**Método para validar el formato de la matricul
     * @param matricula
     * @return */
    
    public static boolean validarMatricula (String matricula){
   Pattern matPat = Pattern.compile("^\\d{4}[A-Z]{3}");
   Matcher matMat= matPat.matcher(matricula);
        return true;
          }
    
/**Método para la validación del formato de DNI y de la letra del NIF
*Utilizamos el módulo 23
*
     * @param dni */
    public static void validarDNI(String dni) throws Exception {
        Pattern dniPattern = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
        Pattern dniNumberPattern = Pattern.compile("[0-9]{7,8}");
        int dniNumber;
        Pattern dniWordPatter = Pattern.compile("[A-Z a-z]");
        char dniWord;

        Matcher mat = dniPattern.matcher(dni);

        if (mat.matches()) {
            mat = dniNumberPattern.matcher(dni);
            mat.find();
            dniNumber = Integer.parseInt(mat.group());
            mat = dniWordPatter.matcher(dni);
            mat.find();
            dniWord = mat.group().charAt(0);

            switch (dniNumber % 23) {
                case 0:
                    if (Character.toUpperCase(dniWord) != 'T') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;

                case 1:
                    if (Character.toUpperCase(dniWord) != 'R') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;

                case 2:
                    if (Character.toUpperCase(dniWord) != 'W') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;

                case 3:
                    if (Character.toUpperCase(dniWord) != 'A') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;

                case 4:
                    if (Character.toUpperCase(dniWord) != 'G') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;

                case 5:
                    if (Character.toUpperCase(dniWord) != 'M') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;

                case 6:
                    if (Character.toUpperCase(dniWord) != 'Y') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;

                case 7:
                    if (Character.toUpperCase(dniWord) != 'F') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;

                case 8:
                    if (Character.toUpperCase(dniWord) != 'P') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;

                case 9:
                    if (Character.toUpperCase(dniWord) != 'D') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;

                case 10:
                    if (Character.toUpperCase(dniWord) != 'X') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;
                case 11:
                    if (Character.toUpperCase(dniWord) != 'B') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;
                case 12:
                    if (Character.toUpperCase(dniWord) != 'N') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;
                case 13:
                    if (Character.toUpperCase(dniWord) != 'J') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;
                case 14:
                    if (Character.toUpperCase(dniWord) != 'Z') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;
                case 15:
                    if (Character.toUpperCase(dniWord) != 'S') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;
                case 16:
                    if (Character.toUpperCase(dniWord) != 'Q') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;
                case 17:
                    if (Character.toUpperCase(dniWord) != 'V') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;
                case 18:
                    if (Character.toUpperCase(dniWord) != 'H') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;
                case 19:
                    if (Character.toUpperCase(dniWord) != 'L') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;
                case 20:
                    if (Character.toUpperCase(dniWord) != 'C') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;
                case 21:
                    if (Character.toUpperCase(dniWord) != 'K') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;

                case 22:
                    if (Character.toUpperCase(dniWord) != 'E') {
                        throw new Exception("Error: la letra del DNI es incorrecta.");
                    }
                    break;
            }

        } else {
            throw new Exception("Estructura básica del DNI (12345678X) incorrecta.");
        }
    }

}
