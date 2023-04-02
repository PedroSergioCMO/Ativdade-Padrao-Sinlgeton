public class Main {

    public static void main(String[] args) {
        LoginSystem loginSystem = LoginSystem.getInstance();

        loginSystem.setUsername("user");
        loginSystem.setPassword("password");
        loginSystem.setBotCode("K6j#p");

        String userInput = "K6j#p"; // exemplo de código digitado pelo usuário

        if (loginSystem.login("user", "password", userInput)) {
            System.out.println("Login efetuado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos, ou código do bot inválido!");
        }
    }

}
