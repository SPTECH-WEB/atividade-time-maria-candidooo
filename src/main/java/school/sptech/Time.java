package school.sptech;

public class Time {
    String nome;
    int vitorias = 0;
    int empates = 0;
    int derrotas = 0;

    public void registrarVitoria(){
        vitorias++;
    }
    public void registrarEmpate() {
        empates++;
    }
    public void registrarDerrota() {
        derrotas++;
    }

    public int getPontos() {
        return vitorias * 3 + empates;
    }

    public int getTotalPartidas() {
        return vitorias + empates + derrotas;
    }

    public int getAproveitamento(){
//        return (vitorias * 100) / (vitorias + empates + derrotas);
        return (vitorias * 100) / getTotalPartidas();
    }

    public void compararAproveitamento(Time adversario){
        if (getAproveitamento() > adversario.getAproveitamento()){
            System.out.println("O time "+ nome +" teve maior aproveitamento, do que " +
                 adversario.nome + " com " + getAproveitamento()+ "% de Vitórias");

        } else if (getAproveitamento() < adversario.getAproveitamento()) {
            System.out.println("O time "+ adversario.nome +" teve maior aproveitamento, do que  " +
                 nome + " com " + adversario.getAproveitamento()+ "% "
            );
        } else {
            System.out.println("O time " + nome + " e o time " + adversario.nome +
                    " tiveram a mesmo aproveitamento: " + getAproveitamento()+ "%");
        }

    }

    public void exibirInformacoes() {
        System.out.println(
                "Nome do time: " + nome +
                "\nVitórias: " + vitorias +
                 "\nEmpates: " + empates  +
                        "\nDerrotas: " + derrotas +
                        "\nTotal de Partidas: " + getTotalPartidas()+
                        "\nAproveitamento: " + getAproveitamento()

        );
    }
}
