package encuesta;


public class RespuestaEjercicioTres extends CompletarBaseDeDatos
{
    //Cual es la edad promedio de mujeres solteras
    
    public Integer PromedioDeLasMujeresSolteras()
    {
        int promedio ;
        int CONTADOR = 0;
        int ACUMULADOR = 0;
        
        Integer cantidadDePersonas = 9; 
        
        for (int i = 0; i < cantidadDePersonas; i++ )
        {
        
        
                if( BASEDEDATOS[4][i] == "SOLTERO/A")
                {
                    ACUMULADOR = Integer.parseInt(BASEDEDATOS[2][i]);
                    CONTADOR = CONTADOR + 1 ;
                }
        }
        
        promedio = (ACUMULADOR/CONTADOR);
        //System.out.println("El promedio de las mujeres solteras es de :" + promedio);
        return promedio;
    }
    
}
