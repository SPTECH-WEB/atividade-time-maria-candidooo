package school.sptech;

public class Main {

    public static void main(String[] args) {

        Time t1 = new Time();
        t1.nome = "Corinthians";
        t1.registrarVitoria();
        t1.registrarVitoria();
        t1.registrarEmpate();

        Time t2 = new Time();
        t2.nome = "Palmeiras";
        t2.registrarVitoria();
        t2.registrarDerrota();
        t2.registrarEmpate();


        System.out.println("Time 1");
        t1.exibirInformacoes();

        System.out.println("\n Time 2");
        t2.exibirInformacoes();


        System.out.println("\n---------------------------" +
                " Comparação ");
        t1.compararAproveitamento(t2);
    }


}