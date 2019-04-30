package encuesta;


public class CompletarBaseDeDatos {

    //DECLARO MATRIZ BIDIMENCIONAL SIMULANDO BASE DE DATOS
    //(tipo de dato) ([][] <-- cantidad de dimenciones ) = new (<--nuevo) (tipo de dato) [filas][columnas]<--(cantidad de filas y columnas)

    //esto deberia ser privado y tendriamos que hacer un getter, ni ganas.
    public String [][] BASEDEDATOS = new String [6][10];

    public void LLenarBaseDeDatos() {

        //FILA 0 --ID
        BASEDEDATOS[0][0]="0";
        BASEDEDATOS[0][1] = "1";
        BASEDEDATOS[0][2] = "2";
        BASEDEDATOS[0][3] = "3";
        BASEDEDATOS[0][4] = "4";
        BASEDEDATOS [0][5] = "5";
        BASEDEDATOS [0][6] = "6";
        BASEDEDATOS [0][7] = "7";
        BASEDEDATOS [0][8] = "8";
        BASEDEDATOS [0][9] = "9";

        //FILA 1 --NOMBRE
        BASEDEDATOS [1][0] = "LUCIANA";
        BASEDEDATOS [1][1] = "IGNACIO";
        BASEDEDATOS [1][2] = "KEVIN";
        BASEDEDATOS [1][3] = "PAULA";
        BASEDEDATOS [1][4] = "JOSE";
        BASEDEDATOS [1][5] = "DAMIAN";
        BASEDEDATOS [1][6] = "TOMAS";
        BASEDEDATOS [1][7] = "CARLA";
        BASEDEDATOS [1][8] = "GABRIELA";
        BASEDEDATOS [1][9] = "ROMINA";
           //FILA 2 --EDAD
        BASEDEDATOS [2][0] = "25";
        BASEDEDATOS [2][1] = "32";
        BASEDEDATOS [2][2] = "19";
        BASEDEDATOS [2][3] = "56";
        BASEDEDATOS [2][4] = "32";
        BASEDEDATOS [2][5] = "17";
        BASEDEDATOS [2][6] = "26";
        BASEDEDATOS [2][7] = "29";
        BASEDEDATOS [2][8] = "22";
        BASEDEDATOS [2][9] = "20";
                //FILA3 --GENERO
        BASEDEDATOS [3][0] = "F";
        BASEDEDATOS [3][1] = "M";
        BASEDEDATOS [3][2] = "M";
        BASEDEDATOS [3][3] = "F";
        BASEDEDATOS [3][4] = "M";
        BASEDEDATOS [3][5] = "M";
        BASEDEDATOS [3][6] = "M";
        BASEDEDATOS [3][7] = "F";
        BASEDEDATOS [3][8] = "F";
        BASEDEDATOS [3][9] = "F";
                //FILA4 --ESTADO CIVIL
        BASEDEDATOS [4][0] = "SOLTERO/A";
        BASEDEDATOS [4][1] = "SOLTERO/A";
        BASEDEDATOS [4][2] = "CASADO/A";
        BASEDEDATOS [4][3] = "CASADO/A";
        BASEDEDATOS [4][4] = "CASADO/A";
        BASEDEDATOS [4][5] = "SOLTERO/A";
        BASEDEDATOS [4][6] = "CASADO/A";
        BASEDEDATOS [4][7] = "CASADO/A";
        BASEDEDATOS [4][8] = "SOLTERO/A";
        BASEDEDATOS [4][9] = "CASADO/A";
                //FILA5 --BARRIO
        BASEDEDATOS [5][0] = "BELGRANO";
        BASEDEDATOS [5][1] = "NUÑEZ";
        BASEDEDATOS [5][2] = "MATADEROS";
        BASEDEDATOS [5][3] = "POMPEYA";
        BASEDEDATOS [5][4] = "FLORES";
        BASEDEDATOS [5][5] = "PARQUE CHAS";
        BASEDEDATOS [5][6] = "SAN NICOLAS";
        BASEDEDATOS [5][7] = "AGRONOMIA";
        BASEDEDATOS [5][8] = "PARQUE PATRICIOS";
        BASEDEDATOS [5][9] = "PARQUE CHACABUCO";           
    }
    
    public String [][]mostrarBaseDeDatos() {
        String [][]devolver = new String[6][10];
        devolver = BASEDEDATOS;
        //System.out.println("Se devuelve la base de datos");
        return devolver;
    }
}
