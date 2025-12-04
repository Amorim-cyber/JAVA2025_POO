import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição Mentoria de java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp JAVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos de Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Camila Progredindo...");

        System.out.println("Conteudos Incritos de Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP de Camila: "+devCamila.calcularTotalXp());

        System.out.println("---------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos de João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("João Progredindo...");
        System.out.println("Conteudos Incritos de João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP de João: "+devJoao.calcularTotalXp());
    }

}
