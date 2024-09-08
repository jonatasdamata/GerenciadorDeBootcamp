import br.com.GerenciadorDeBootcamp.Curso;
import br.com.GerenciadorDeBootcamp.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria1 = new Mentoria();


        curso1.setTitulo("Java POO");
        curso1.setDescricao("Dominando POO com Java");
        curso1.setCaragaHoraria(97);
        System.out.println(curso1);

        curso2.setTitulo("Teste Unit");
        curso2.setDescricao("Descrição do curso aqui");
        curso2.setCaragaHoraria(5);
        System.out.println(curso2);

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("descrição da mentoria");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);



    }
}
