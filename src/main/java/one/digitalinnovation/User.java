package one.digitalinnovation;

public class User {
    private String username;
    private String password;
    private StatusUser status;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public StatusUser getStatus() {
        return status;
    }

    /*Função para desabilitar usuário, setando seu estado para disabled*/
    public void desabilitarUsuario(){
        this.status = StatusUser.DISABLED;
    }
    /*Função para habilitar usuário, setando seu estado para enabled*/

    public void habilitarUsuario(){
        this.status=StatusUser.ENABLED;
    }

}
