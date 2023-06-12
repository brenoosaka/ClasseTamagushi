public class Tamagushi {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public Tamagushi(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public String retornarHumor() {
        int humor = fome + saude; 
        if (humor < 5) {
            return "Triste";
        } else if (humor < 8) {
            return "Neutro";
        } else {
            return "Feliz";
        }
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alterarFome(int fome) {
        this.fome = fome;
    }

    public void alterarSaude(int saude) {
        this.saude = saude;
    }

    public void alterarIdade(int idade) {
        this.idade = idade;
    }

    public String retornarNome() {
        return nome;
    }

    public int retornarFome() {
        return fome;
    }

    public int retornarSaude() {
        return saude;
    }

    public int retornarIdade() {
        return idade;
    }

}