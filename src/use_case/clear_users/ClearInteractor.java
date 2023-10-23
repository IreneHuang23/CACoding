package use_case.clear_users;

// TODO Complete me

import data_access.FileUserDataAccessObject;

public class ClearInteractor implements ClearInputBoundary{

     final ClearUserDataAccessInterface userDataAccessObject;

     final ClearOutputBoundary clearPresenter;

     final FileUserDataAccessObject database;


     public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface,
                            ClearOutputBoundary clearOutputBoundary,
                            FileUserDataAccessObject database) {
         this.userDataAccessObject = clearDataAccessInterface;
         this.clearPresenter = clearOutputBoundary;
         this.database = database;
     }


    @Override
    public void clearAllUser() {

         database.ClearAllUser();
    }
}
//try {
//            database.ClearAllUser();
//         } catch (Exception e) {
//             //return new ClearOutputData(false, "Failed to delete all.");