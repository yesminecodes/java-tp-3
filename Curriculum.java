import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Curriculum {
    private String id;
    private HashMap<String,Integer > Mod_Coef;
    public Curriculum(String s) {
        id=s;
        Mod_Coef= new HashMap<String,Integer >();
    }
    public String getId() {
        return id; }
    public HashMap<String, Integer> getMod_Coef() {
        return Mod_Coef;
    }
    // ajouter un module s et son coefficient i dans une formation
    public void addModCoef(String s, int i) {
        Mod_Coef.put(s,i);
    }
    // connaitre le coefficient d’ un module s
    public int getCoefMod(String s ) {
        return Mod_Coef.get(s);
    }
    // connaitre l’ensemble des modules de la formation
    public HashSet<String > getModSet() {
        Set<String> md=Mod_Coef.keySet();
        HashSet<String> mod=new HashSet<String>(md);
        return mod;

    }
    public String toString() {
        return ("id ["+id+"] "+Mod_Coef);
    }
}