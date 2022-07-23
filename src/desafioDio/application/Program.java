package desafioDio.application;

import desafioDio.entities.Bootcamp;
import desafioDio.entities.Curso;
import desafioDio.entities.Dev;
import desafioDio.entities.Mentoria;
import desafioDio.services.Conteudo;

import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJonh = new Dev();
        devJonh.setName("João");
        devJonh.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jonh:" + devJonh.getConteudoIncritos());


        devJonh.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jonh:" + devJonh.getConteudoIncritos());
        System.out.println("Conteúdos Concluídos Jonh:" + devJonh.getConteudoConcluidos());
        System.out.println("XP:" + devJonh.calcularTotalXp());

        System.out.println("---------------------");

        Dev devMayara = new Dev();
        devMayara.setName("Mayara");
        devMayara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mayara:" + devMayara.getConteudoIncritos());

        devMayara.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mayara:" + devMayara.getConteudoIncritos());
        System.out.println("Conteúdos Concluídos Mayara:" + devMayara.getConteudoConcluidos());
        System.out.println("XP:" + devMayara.calcularTotalXp());

    }
}
