package use_case.clear_users;

// TODO Complete me

import java.util.HashMap;
import data_access.FileUserDataAccessObject;

public class ClearOutputData {
    private boolean success;

    private String errorMessage;

    private FileUserDataAccessObject database;

    public ClearOutputData(boolean success) {
        this.success = success;
    }

    public ClearOutputData(boolean success, String errorMessage) {
        this.success = success;
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public String useCaseFailed() {
        return errorMessage;
    }
}
