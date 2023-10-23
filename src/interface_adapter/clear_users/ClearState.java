package interface_adapter.clear_users;

// TODO Complete me
import  data_access.FileUserDataAccessObject;
import java.util.ArrayList;

public class ClearState {
    private FileUserDataAccessObject database;

    private String clearError = "clear failed";

    public ClearState() {
    }

    public ArrayList<String> names() {
        return database.allName();
    }

    public String getClearError() {
        return clearError;
    }

    public void setClearError(String clearError) {
        this.clearError = clearError;
    }
}
