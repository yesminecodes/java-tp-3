import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class StudentGroup {
    HashSet<Student> set;
    String id;
    public StudentGroup(String id) {
        this.id = id;
        set = new HashSet<Student>() ;
    }
    public HashSet<Student> getSet() {
        return set;
    }
    public String getId() {
        return id;
    }
    // ajouter un étudient st
    public void addStudent (Student st)
    {
        set.add(st);
    }
// afficher les id des étudiants triés selon leurs moyennes générales
        public void sort() {
            ArrayList<Student> list=new ArrayList<>(set);
            Collections.sort(list);
            for (Student st:list){
                System.out.println(st.getId()+" : "+st.average());            }
    }}
