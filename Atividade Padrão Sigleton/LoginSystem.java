public class LoginSystem {

    private static LoginSystem instance = null;
    private String username;
    private String password;
    private String botCode;

    private LoginSystem() {
        // construtor privado para evitar instância externa
    }

    public static LoginSystem getInstance() {
        if (instance == null) {
            instance = new LoginSystem();
        }
        return instance;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBotCode(String botCode) {
        this.botCode = botCode;
    }

    public boolean verifyBotCode(String userInput) {
        return botCode.equals(userInput);
    }

    public boolean login(String username, String password, String userInput) {
        return this.username.equals(username) && this.password.equals(password) && verifyBotCode(userInput);
    }

}
