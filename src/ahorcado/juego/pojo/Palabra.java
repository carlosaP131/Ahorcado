package ahorcado.juego.pojo;
// concepto abstracto que denato una serie de cualidades ,
// por ejemplo preguntas

public class Palabra {
//atributos: conjunto de caracteeristicas que caomparten
    //los obketos de una clase , por ejemplo para el usuario 
    // tendriamos tipo pregunta num_preg respuesta

    private String Pista;
    private String palabra;

    private String respuesta;
    //contructir el motodo constructoe tiene siempre el mismo nombre que la 
    //clase 
    //se utiliza normalmente para inicializar los atributos 
    //@postconstruct permite inicializar objetos al iniciar la aplicacion 

    public Palabra() {

    }

    public Palabra(String tipo, String palabra, String respuesta) {
        //this hace referencia al objeto actual de la clase es decir a una 
        //instancia en concreto 
        //de la clase y nos sirve para usar los metodos y atributos de esa clase
        //desde alguno de sus metodos para llamar a otro de sus constructores o 
        //simplemente para pasarle 
        //el objeto completo 
        this.Pista = tipo;
        this.palabra = palabra;
        
    }
    //metodos es un conjunto de instrucciones definidas dentro de una clase 
    //que realizan una eterminada tarea 

    public String getPista() {
        return Pista;
        
    }

    public void setPista(String tipo) {
        this.Pista = tipo;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

   

}
