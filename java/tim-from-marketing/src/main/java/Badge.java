import java.util.List;
import java.util.ArrayList;

public class Badge {

    private final String OWNER_DEPARTMENT = "OWNER";

    public String print(Integer id, String name, String department) {
        String normalizedDepartment = department == null ? OWNER_DEPARTMENT : department.toUpperCase();

        if (id == null) {
            return name + " - " + normalizedDepartment;
        }

        return "[" + id + "]" + " - " + name + " - " + normalizedDepartment;
    }
}
