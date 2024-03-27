

import java.io.File;

/**
 * This is the Document Manager
 */
public class ManagerOfFiles {
    /**
     * This function returns the number of Employees
     * @return The number of employees
     */
    public static int getNumberOfPersons() throws NoEmployeesException{
        if(Person.allEmploys.isEmpty()) {
            throw new NoEmployeesException("There aren't any employees");
        }
        return Person.allEmploys.size();
    }
}