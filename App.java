public class App {

    public static void main(String[] args) {
        Tamagushi meuTamagushi = new Tamagushi("Rayquaza", 2, 3, 7);

        // Testes
        System.out.println("Nome: " + meuTamagushi.retornarNome());
        System.out.println("Fome: " + meuTamagushi.retornarFome());
        System.out.println("Saúde: " + meuTamagushi.retornarSaude());
        System.out.println("Idade: " + meuTamagushi.retornarIdade());
        System.out.println("Humor: " + meuTamagushi.retornarHumor());

        meuTamagushi.alterarFome(4);
        meuTamagushi.alterarSaude(8);

        System.out.println("Fome: " + meuTamagushi.retornarFome());
        System.out.println("Saúde: " + meuTamagushi.retornarSaude());
        System.out.println("Humor: " + meuTamagushi.retornarHumor());
    }

}
