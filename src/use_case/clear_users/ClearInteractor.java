package use_case.clear_users;



public class ClearInteractor  {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }


    public void execute() {
        userDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData(false);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}

