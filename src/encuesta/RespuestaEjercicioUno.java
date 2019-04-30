
package encuesta;

public class RespuestaEjercicioUno extends CompletarBaseDeDatos {

    //Averiguar por qué no funciona cuando saco el extends
    
    //Instancio la base de datos
    CompletarBaseDeDatos db = new CompletarBaseDeDatos();
    
    public Integer cantidadDeHombresEntre18y30años() 
    {
        // Creo una variable del tipo matriz para después guardar la base de datos
        String [][]bdUno = new String[6][10];
        
        db.LLenarBaseDeDatos();
        
        // Guardo el retorno de mostrarBaseDeDatos() en una variable del tipo matriz llamada bdUno
        bdUno = db.mostrarBaseDeDatos();

        
        Integer contador = 0;
        //preguntar profe para usar .lenght() en la matriz 
        Integer cantidadDeRegistros = 9; 
        
        for (int i = 0; i < cantidadDeRegistros; i++ ) 
        {            
            //El error está acá
            int dato = Integer.parseInt(bdUno[2][i]);
            
            if(dato > 18 && dato < 30) 
            {
                if(bdUno[4][i] == "SOLTERO/A")
                {                
                contador ++;
                }
            }
        }
        System.out.println(contador + " es la cantidad de hombres entre 18 y 30 años solteros" );
        return contador;
    }
    
    
}
