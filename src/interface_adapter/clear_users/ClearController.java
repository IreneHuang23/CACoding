package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import data_access.FileUserDataAccessObject;
// TODO Complete me
public class ClearController {

    final ClearInputBoundary clearUseCaseInteractor;

    //final FileUserDataAccessObject database;

    public ClearController(ClearInputBoundary clearUseCaseInteractor) {
        this.clearUseCaseInteractor = clearUseCaseInteractor;
        //this.database = database;

    }

    public void clearAllUser() {
        clearUseCaseInteractor.clearAllUser();

    }
}
//ClearInputBoundary clearUseCaseInteractor, FileUserDataAccessObject database