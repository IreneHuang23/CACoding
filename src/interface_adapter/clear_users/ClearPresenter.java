package interface_adapter.clear_users;

// TODO Complete me
import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;

public class ClearPresenter implements ClearOutputBoundary{

    private final ClearViewModel clearViewModel;

    private ViewManagerModel viewManagerModel;
    public ClearPresenter(ClearViewModel clearViewModel, ViewManagerModel viewManagerModel){

        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    @Override
    public void prepareSuccessView() {
        ClearState clearstate = clearViewModel.getState();
        this.clearViewModel.setstate(clearstate);
        clearViewModel.firePropertyChanged();
        this.viewManagerModel.setActiveView(clearViewModel.getViewName());
        this.viewManagerModel.firePropertyChanged();
    }

    @Override
    public void prepareFailView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.setClearError(error);
        clearViewModel.firePropertyChanged();
    }
}
