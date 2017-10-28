package patterns.behavioral.strategy.strategy;

public class FileAuth implements AuthStrategy {

    @Override
    public boolean checkLogin(String login, String password) {
        System.out.println("checking with file");
        return true;
    }
}
