import java.util.ArrayList;
import java.util.HashMap;

public class Student implements Comparable<Student>{
    private String id;
    private Curriculum myCurriculum;
    private HashMap<String, ArrayList<Double>> resultats;
    public Student(String i, Curriculum c) {
        id = i;
        myCurriculum = c;
        resultats = new HashMap<String, ArrayList<Double>>();
    }
public String toString() {

    return "Student [id=" + id + ", myCurriculum=" + myCurriculum

            + ", resultats=" + resultats + "]";

}
    public String getId() {
        return id;
    }
    public Curriculum getMyCurriculum() {
        return myCurriculum;
    }
    public boolean addNote(String s, Double d) {
        resultats.put(s,new ArrayList<Double>());
        resultats.get(s).add(d);
        return true;
    }
// calculer et retourner la moyenne d’un module s
        public double average(String s)
        {
            ArrayList<Double> notes =resultats.get(s);
            double sum=0;
            for (Double d:notes){
                sum=sum+d;

        }
            return sum/notes.size();
        }
// calculer et retourner la moyenne générale
            public Double average()
            {
                int totalcoef=0;
                double sum=0;
                for (String m: myCurriculum.getModSet()){
                    double moy=average(m);
                    int coef= myCurriculum.getCoefMod(m);
                    sum=sum+(moy*coef);
                     totalcoef+=coef;
                }
                return sum/totalcoef;
            }
// comparer selon la moyenne générale
            public int compareTo(Student st) {
                return this.average().compareTo(st.average());
            }
    }