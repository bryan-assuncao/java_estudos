    package assuncao.bryan.codes.exercicios.sistemaescolar.service;

    import assuncao.bryan.codes.exercicios.sistemaescolar.domain.Aluno;
    import assuncao.bryan.codes.exercicios.sistemaescolar.domain.Docente;
    import assuncao.bryan.codes.exercicios.sistemaescolar.domain.Pessoa;

    public class Prints {
        public static void Print(Pessoa pessoa){
            String output = "Pessoa: " + pessoa.getName() + " - Idade: " + pessoa.getIdade();

            if(pessoa instanceof Aluno){
                double nota = ((Aluno) pessoa).getNota();
                output += " - Nota: " + nota;
            }

            if(pessoa instanceof Docente){
                String disciplina = ((Docente) pessoa).getDisciplina();
                output += " - Disciplina: " + disciplina;
            }
            System.out.println(output);
        }
    }
