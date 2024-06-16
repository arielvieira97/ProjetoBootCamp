import ProjetoDio.BootCamp;
import ProjetoDio.Curso;
import ProjetoDio.Dev;
import ProjetoDio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Curso em java DIO");
    curso1.setCargaHoraria(87);
    //System.out.println(curso1);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso JAVAPOO");
    curso2.setDescricao("Aprendendo JavaPoo");
    curso2.setCargaHoraria(10);
    //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Descriçao mentoria java");
        mentoria.setData(LocalDate.now());
        //System.out.println(mentoria);

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição BootCamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAriel = new Dev();
        devAriel.setNome("Ariel");
        devAriel.InscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos Ariel: " + devAriel.getConteudosInscritos());
        devAriel.Progredir();
        devAriel.Progredir();
        System.out.println("-----------------------------");
        System.out.println("Conteudos Inscritos Ariel: " + devAriel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Ariel: " + devAriel.getConteudoConcluidos());
        System.out.println("XP:" + devAriel.CalcularTotalXp());

        System.out.println("---------------------------");

        Dev devBilly = new Dev();
        devBilly.setNome("Billy");
        devBilly.InscreverBootCamp(bootcamp);
        System.out.println("Conteudo Inscritos Billy: " + devBilly.getConteudosInscritos());
        devBilly.Progredir();
        devBilly.Progredir();
        devBilly.Progredir();
        System.out.println("-----------------------------");
        System.out.println("Conteudo Inscritos Billy: " + devBilly.getConteudosInscritos());
        System.out.println("Conteudos concluidos Billy: " + devBilly.getConteudoConcluidos());
        System.out.println("Xp:" + devBilly.CalcularTotalXp());




    }
}