

import java.io.File;
import java.util.Objects;

/**
 * This is the repository class
 */
public class Repository{
    private  File directory;

    /**
     * This is the constructor of the function
     * @param paramDirectory This is the directory given as a parameter
     */
    public Repository(String paramDirectory) {
        this.directory = new File(paramDirectory);
    }

    /**
     * Here we filter the Documents by their employees
     * @throws InvalidRepositoryException If the directory doesn't exist throws an error
     */
    public void displayContent() throws InvalidRepositoryException{
        for (Person pers : Person.allEmploys) {
            File employeeDirectory = new File(directory, String.valueOf(pers.id()));
            if (employeeDirectory.exists() && employeeDirectory.isDirectory()) {
                System.out.println("Documents for " + pers.name() + " id: " + pers.id() );
                processDocuments(employeeDirectory);
            } else {
                throw new InvalidRepositoryException("Employee " + pers.name() + " has no documents in the repository");
            }
        }
    }

    /**
     * This function helps to process the documents in the directory
     * @param paramFile The current directory
     */
    private void processDocuments(File paramFile) {
        for (File f : Objects.requireNonNull(paramFile.listFiles())) {
            if (f.isFile())
                System.out.println("    " + f.getName());
             else if (f.isDirectory()) {
                processDocuments(f);
            }
        }
    }
}