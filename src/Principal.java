import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Andrea");
        nombres.add("Bruno");
        nombres.add("Darío");
        nombres.add("Emilia");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        nombres.forEach(nombre -> System.out.println(nombre));
        nombres.forEach(System.out::println);
        Estudiante estudiante1 = new Estudiante("Alicia", 19);

        String nombre = "Maria";
        nombre = "Alice";



    }
}
