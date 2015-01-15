package boletin15;

public class Xogador extends Persoal{
    
    private int dorsal;
    private String demarcacion;
    
    /**
     * Inicializa el constructor por defecto, llamando a la superclase
     */
    public Xogador(){
        super();
    }
    
    /**
     * Inicializa el constructor con todos los parametros
     * @param id numero de identificacion del sujeto
     * @param nome nombre del sujeto
     * @param apelido apellido del sujeto 
     * @param edade edad del sujeto
     * @param dorsal numero del dorsal del jugador
     * @param demarcacion posicion en la que juega el jugador
     */
    public Xogador(int id, String nome, String apelido, int edade, int dorsal, String demarcacion){
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    /**
     * fija un nuevo dorsal al sujeto
     * @param dorsal variable interna para fijar el numero del dorsal
     */
    public void setDorsal(int dorsal){
        this.dorsal = dorsal;
    }

    /**
     * fija una nueva demarcacion para el sujeto
     * @param demarcacion variable interna paa fijar la demarcacion
     */
    public void setDemarcacion(String demarcacion){
        this.demarcacion = demarcacion;
    }
    
    /**
     * pide ver el numero de dorsal
     * @return devuelve el numero de dorsal
     */
    public int getDorsal(){
        return dorsal;
    }

    /**
     * pide ver la posicion en la que juega
     * @return devuelve la demarcacion
     */
    public String getDemarcacion(){
        return demarcacion;
    }
    
    
    /**
     * sobreescribe toString para mostrar una cadena
     * @return devuelve la cadena con todos los parametros
     */
    @Override
    public String toString(){
        return ("O xogador " + super.getNome() + " " + super.getApelido() + "(" + super.getId() + ") con " + super.getEdade() + " anos e dorsal " + this.getDorsal() + " na demarcacion: " + this.getDemarcacion());
    }

    /**
     * No se que wide devuelve (punto)
     */
    @Override
    public void viaxar(){
        System.out.println("Viaxan os xogadores " + super.getNome());
    }
    
    
    /**
     * No se que wide devuelve (punto)
     */
    public void xogarPartido(){
        System.out.println("Xoga partido");
    }

    /**
     * No se que wide devuelve (punto)
     */
    public void entrenar(){
        System.out.println("Entrena");
    }
    
}