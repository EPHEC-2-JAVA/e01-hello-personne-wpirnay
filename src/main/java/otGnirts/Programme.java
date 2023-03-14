package otGnirts;
import be.ephec.java.exercice.e05.Person;
public class Programme {
    public static void main(String[] args) {
        String s= "otGnirts";
        System.out.println(otGnirts(s));
        Person p = new Person("Lannister", "Jaime");
        System.out.println(otGnirts(p.getFirstName()));
    }
    public static <T> String otGnirts(T t){
        StringBuilder sb = new StringBuilder();
        sb.append(t);
        sb.reverse();
        return sb.toString();
    }
}
