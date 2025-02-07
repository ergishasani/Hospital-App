package Model;
import java.util.Scanner;

public abstract class Option {
    abstract void operation(Scanner s, Database database, User u);

    abstract String getName(); 
}
