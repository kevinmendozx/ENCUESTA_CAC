package encuesta;

public class RespuestaEjercicioDos extends CompletarBaseDeDatos {
    
    //Que barrio posee la mayor cantidad de personas casadas
    
    public String BarrioMayorCantidadDePersonasCasadas()
    {
        String Barrio = "";
        Integer cantidadDePersonas = 9; 
        
        for (int i = 0; i < cantidadDePersonas; i++ )
        {
        Barrio = BASEDEDATOS[5][i];
        
                if(  BASEDEDATOS[5][i] == "CASADO/A" )
                {
                    
                }
        }
        
        
        
        
        
        return Barrio;
    }
    
    
}
