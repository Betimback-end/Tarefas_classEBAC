public class Principal {

    public static void main(String[] args) {
//Instanciando Classe Homens e acrescentando valores
        Homens homens = new Homens();
        homens.setIdade(27);
        homens.setNome("Welbert");
//Instanciando Classe Mulheres e acrescentando valores
        Mulheres mulheres = new Mulheres();
        mulheres.setIdade(25);
        mulheres.setNome("Brenda");

//Imprimindo dados das variaveis Homens
        System.out.println(homens.getNome());
        System.out.println(homens.getIdade());

//Imprimindo dados das variaveis Mulheres
        System.out.println(mulheres.getNome());
        System.out.println(mulheres.getIdade());

    }
}
