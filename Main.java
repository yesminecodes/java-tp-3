import java.util.*;

public class Main {
    public static void main(String[] args) {

        Curriculum curriculum = new Curriculum("DSI");
        curriculum.addModCoef("POO", 3);
        curriculum.addModCoef("Springboot", 2);
        curriculum.addModCoef("UI/UX", 4);
        System.out.println(curriculum);
        System.out.println("Modules: " + curriculum.getModSet());
        System.out.println("Coef POO: " + curriculum.getCoefMod("POO"));
        System.out.println();

        Student yesmine = new Student("Yesmine", curriculum);
        yesmine.addNote("POO",   19.0);
        yesmine.addNote("POO",   18.0);
        yesmine.addNote("POO",   16.0);
        yesmine.addNote("POO",   17.0);
        yesmine.addNote("Springboot", 17.0);
        yesmine.addNote("Springboot", 19.0);
        yesmine.addNote("Springboot", 15.0);
        yesmine.addNote("UI/UX",  17.0);
        yesmine.addNote("UI/UX",  17.0);

        Student rimeh = new Student("Rimeh", curriculum);
        rimeh.addNote("POO",   19.0);
        rimeh.addNote("POO",   18.0);
        rimeh.addNote("POO",   16.0);
        rimeh.addNote("POO",   17.0);
        rimeh.addNote("Springboot", 17.0);
        rimeh.addNote("Springboot", 19.0);
        rimeh.addNote("Springboot", 15.0);
        rimeh.addNote("UI/UX",  17.0);
        rimeh.addNote("UI/UX",  20.0);

        System.out.printf("Yesmine");
        System.out.printf("  POO:   %.2f%n", yesmine.average("POO"));
        System.out.printf("  Springboot: %.2f%n", yesmine.average("Springboot"));
        System.out.printf("  UI/UX:  %.2f%n", yesmine.average("UI/UX"));
        System.out.printf("  Moyenne: %.2f%n%n", yesmine.average());


        StudentGroup group = new StudentGroup("DSI23");
        group.addStudent(yesmine);
        group.addStudent(rimeh);

        group.sort();
    }
}