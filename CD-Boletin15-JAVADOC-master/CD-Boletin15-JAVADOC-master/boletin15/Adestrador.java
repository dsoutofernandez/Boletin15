package boletin15;

public class Adestrador extends Persoal{
    
    private String idFederacion;
    
    /**
     * Inicializa el constructor por defecto, derivandolo a la superclase
     */
    public Adestrador(){
        super();
    }
    
    /**
     * Inicializa el Construcotr con todos los parametros
     * @param id identidficacion del usuario
     * @param nome nombre del sujeto
     * @param apelido apellido del sujeto
     * @param edade edad del sujeto
     * @param idFederacion cadena de caracteres identificando al sujeto en la federacion
     */
    public Adestrador(int id, String nome, String apelido, int edade, String idFederacion){
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }
    
    /**
     * cambiar la id de la federacion
     * @param id variable interna para actualizar la idFederacion
     */
    public void setIdFederacion(String id){
        idFederacion = id;
    }
    
    /**
     * para pedir la IdFederacion
     * @return devuelve un String con la idFederacion
     */
    public String getIdFederacion(){
        return idFederacion;
    }
    
    /**
     * sobreescribe la clase toString para motrar todos los parametros
     * @return devuelve la cadena con todos los parametros
     */
    @Override
    public String toString(){
        return ("O Adestrador " + super.getNome() + " " + super.getApelido() + "(" + super.getId() + ", e id da federacion: " + this.getIdFederacion() + ") con " + super.getEdade() + " anos");
    }
    
    
    /**
     * No se pa que vale, los jugadores viajan (punto)
     */
    @Override
    public void viaxar(){
        System.out.println("Viaxan os Adestradores " + super.getNome());
    }
    
    /**
     * Otro que tal baila, tampoco se para que vale (punto)
     */
    public void dirixirPartido(){
        System.out.println("Dirixe partido");
    }

    /**
     * Idem, tampoco se para que vale (punto)
     */
    public void entrenar(){
        System.out.println("Entrena equipo");
    }
    
}