package boletin15;

public class Boletin15 {
    
    public static void main(String[] args) {
        
        //instancia un obxecto de cada clase 
        Xogador xx1 = new Xogador(1159, "xx", "xx1", 20, 6, "Central");
        Adestrador aa1 = new Adestrador(2298, "aa", "aa1", 42, "3369a");
        Masaxista mm1 = new Masaxista(3375, "mm", "mm1", 36, "osteopata");
        
        //instancia un xogador de tipo Seleccion
        Persoal pp2 = new Xogador(1997, "pp", "pp2", 22, 7, "Delantero");
        
        //chama ao método concentrarse a través de cada obxecto. ¿ Que observas ?.
        xx1.concentrarse();
        aa1.concentrarse();
        mm1.concentrarse();
            //Que mostrase a mesma mensaxe
        
        //Invoca ao método viaxar a través de cada obxecto. ¿ Cal é a saida ?
        xx1.viaxar();
        aa1.viaxar();
        mm1.viaxar();
            //xa non se mostra a mesma mensaxe posto que a sobreescribimos, e en cada mensaxe mostrada aparece o nome
        
        //¿ Podes invocar a un método da superclase con un obxecto dunha subclase ?.Comprobao
            //Claro, a menos que se sea inutil
        System.out.println(xx1.getNome());
        xx1.setNome("Manolo");
        System.out.println(xx1.getNome());
        
        //¿ Podes invocar a un método da subclase con un obxecto do tipo da superclase ? .Comprobao
            //SI
        
        
    }
}