package boletin15;

public class Masaxista extends Persoal{
    
    private String titulacion;
    
    /**
     * Construcotr por defecto, llama a la superclase
     */
    public Masaxista(){
        super();
    }

    /**
     * Constructor con todos los parametros
     * @param id id del sujeto
     * @param nome nombre del sujeto
     * @param apelido apellido del sujeto
     * @param edade edad del sujeto
     * @param titulacion titulacion que pose el sujeto
     */
    public Masaxista(int id, String nome, String apelido, int edade, String titulacion){
        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
    }
    
    /**
     * cambia la titulacion del sujeto
     * @param titulacion varaible interna para modificar la titulacion
     */
    public void setTitulacion(String titulacion){
        this.titulacion = titulacion;
    }
        
    /**
     * pide la titulacion del sujeto
     * @return devuelve el string con la titulacion del sujeto
     */
    public String getTitulacion(){
        return titulacion;
    }
    
    /**
     * Sobreescribe el metodo toString
     * @return devuelve una cadena con odos los paramentros
     */
    @Override
    public String toString(){
        return ("O masaxista " + super.getNome() + " " + super.getApelido() + "(" + super.getId() + ") con " + super.getEdade() + " anos e coa titulacion " + this.getTitulacion());
    }
    
    /**
     * Sobreesribe el metodo viaxar de la superclase
     * Esto es Raro Raro Raro...
     * no hace nada, y poca funcion tiene
     * muestra por pantalla "Viaxa a seleccion" cuando es llamado
     */
    @Override
    public void viaxar(){
        System.out.println("Viaxan os masaxistas " + super.getNome());
    }
    
    /**
     * Esto es Raro Raro Raro...
     * no hace nada, y poca funcion tiene
     * muestra por pantalla "Da masaxe" cuando es llamado
     */
    public void darMasaxes(){
        System.out.println("Da masaxe");
    }
    
}