package patterns.behavioral.strategy.strategy;

public class DBAuth implements AuthStrategy {

    @Override
    public boolean checkLogin(String login, String password) {
        System.out.println("checking with db");
        return true;
    }
}
