package boletin15;

public class Persoal {
    
    private int id;
    private int edade;
    
    private String nome;
    private String apelido;
    
    /**
     * Inicializa el constructor por defecto
     */
    public Persoal(){
    }
    
    /**
     * Inicializa el constructor con parametros de la superclase
     * @param id numero de identificacion
     * @param nome nombre del sujeto
     * @param apelido apellido del sujeto
     * @param edade  edad del sujeto
     */
    public Persoal(int id, String nome, String apelido, int edade){
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }
    
    /**
     * camia el valor Id
     * @param id varible interna para cambiar la id
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * cambia la edad al sujeto
     * @param edade variable interna para cambiar la edad al sujeto
     */
    public void setEdade(int edade){
        this.edade = edade;
    }

    /**
     * cambia el nombre al sujeto
     * @param nome varaible interna para modificar el nombre del sujeto
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * cambia el apellido del sujeto
     * @param apelido variable interna para modificar el apellido
     */
    public void setApelido(String apelido){
        this.apelido = apelido;
    }
    
    /**
     * pide el valor Id
     * @return devuelve el valor Id
     */
    public int getId(){
        return id;
    }

    /**
     * pide a edad del sujeto
     * @return devuelve la edad del sujeto
     */
    public int getEdade(){
        return edade;
    }

    /**
     * pide el nombre del sujeto
     * @return devuelve el nombre del sujeto
     */
    public String getNome(){
        return nome;
    }

    /**
     * pide el apellido del sujeto
     * @return devuelve el apellido del sujeto
     */
    public String getApelido(){
        return apelido;
    }
    
    /**
     * Muestra por pantalla "Concentrarse a seleccion" cuando es llamado
     */
    public void concentrarse(){
        System.out.println("Concentrase a seleccion");
    }

    /**
     * Esto es Raro Raro Raro...
     * no hace nada, y poca funcion tiene
     * muestra por pantalla "Viaxa a seleccion" cuando es llamado
     */
    public void viaxar(){
        System.out.println("Viaxa a seleccion");
    }

    /**
     * Sobreescribe el metodo toString
     * @return devuelve una cadena con todos los parametros
     */
    @Override
    public String toString() {
        return "Persoal{" + "id=" + id + ", edade=" + edade + ", nome=" + nome + ", apelido=" + apelido + '}';
    }
    
}