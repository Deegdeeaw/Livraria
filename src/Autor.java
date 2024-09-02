public class Autor {

    private String nome;
    private String email;
    private String cpf;


    void mostrarDetalhes() {
        System.out.println("Detalhes do Autor:");
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(email);
        System.out.println("------");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

}
