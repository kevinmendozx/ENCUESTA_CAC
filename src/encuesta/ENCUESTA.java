
package encuesta;
import java.util.Scanner;

public class ENCUESTA 
{
    String nombre = "";
    Integer Opcion = 0;
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {    
    RespuestaEjercicioUno ejUno = new RespuestaEjercicioUno();
    RespuestaEjercicioDos ejDos = new RespuestaEjercicioDos();
    RespuestaEjercicioTres ejTres = new RespuestaEjercicioTres();
    RespuestaEjercicioCuatro ejCuatro = new RespuestaEjercicioCuatro();
    RespuestaEjercicioCinco ejCinco = new RespuestaEjercicioCinco ();
    ejUno.cantidadDeHombresEntre18y30años();
    }
    
    public int MostrarOpciones() 
    {
         
        
    System.out.println("Bienvenido a la encuesta, ingrese su nombre");
    String nombre = sc.nextLine();
    System.out.println("Escoja la accion que desea hacer");
    System.out.println("1- Hombres entre 18 y 30 años solteros\n"
            +"2- Que barrio posee la mayor cantidad de personas casadas\n"
            +"3- Cual es la edad promedio de mujeres solteras\n"
            +"4- Mostrar el listado de esas personas ordenadas por barrios\n"
            +"5- Mostrar que barrio posee mas cantidad de mujeres solteras mayores de 25 años\n"
            +"6- Salir");
    int Opcion = sc.nextInt();
    return Opcion;
    }
    
      void OpcionEscogida(int Opcion )
    {
        switch ( Opcion )
        {        
        case 1 :
        System.out.println("opcion 1");
        break;
        case 2 :
        System.out.println("opcion 2");
        break;
        case 3 :
        System.out.println("opcion 3");
        break;
        case 4 :
        System.out.println("opcion 4");
        break;
        case 5 :
        System.out.println("opcion 5");
        break;
        
        default:
            System.out.println("Fin de la encuesta");
           break;
        }
    }
    /*
    public String EnviarValores()
    {   
    }
    public String MostrarValores()
    {   
    }
    */
}
