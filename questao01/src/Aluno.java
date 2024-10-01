public class Aluno {
    private String nome;
    private double nota1, nota2, nota3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularmedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String aprovacao() {
        double media = calcularmedia();
        {
            if (media >= 70) {
                return "Aprovado";
            } else if (media>=50) {
                return "Você está na final";
            } else {
                return "Reprovado";
            }


        }
    }

    public void detalhes(){
        System.out.println("Nome:" +getNome());
        System.out.println("Média:" +calcularmedia());
        System.out.println("Situação:" +aprovacao());




    }





}