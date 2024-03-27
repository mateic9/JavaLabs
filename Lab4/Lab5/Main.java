

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;

public class Main {
    public static void main(String[] args) {

        try {
            Person person1 = new Person(1, "Matei");
            Person person2 = new Person(2, "X");
            String directoryName = "masterDirectory";
            File dir = new File(directoryName);
            Person.allEmploys.add(person1);
            Person.allEmploys.add(person2);
            dir.mkdirs();
            File directoryPerson1 = new File(directoryName, String.valueOf(person1.id()));
            directoryPerson1.mkdirs();
            File directoryPerson2 = new File(directoryName, String.valueOf(person2.id()));
            directoryPerson2.mkdirs();
            Repository repo = new Repository(directoryName);
            repo.displayContent();

            System.out.println(ManagerOfFiles.getNumberOfPersons() + " Employees");

        } catch (InvalidRepositoryException e){
            System.err.println("An error about the repository occurred: " + e.getMessage());
        }catch (NoEmployeesException e){
            System.err.println("An error about the number of employees occurred: " + e.getMessage());
        }
    }
}