package use_case.clear_users;



import use_case.login.LoginOutputData;

public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData user);

    void prepareFailView(String error);
}
