import br.com.dre.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Cursos curso1 = new Cursos();
    curso1.setTitulo("Java");
    curso1.setDescricao("POO");
    curso1.setCargaHoraria(36);
    Cursos curso2 = new Cursos();
    curso1.setTitulo("Kotlin");
    curso1.setDescricao("Dispositivos móveis");
    curso1.setCargaHoraria(8);

        Conteudo conteudo1= new Cursos();
        Conteudo conteudo2=new Mentorias();


    Mentorias mentoria1=new Mentorias();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("Paradigma orientado a objeto");
        mentoria1.setData(LocalDate.now()   );

     BootCamp bootCamp=new BootCamp();
     bootCamp.setNome("BootCamp java Avançado");
     bootCamp.setDescricao("Torne um dev avançado em java");
     bootCamp.getConteudos().add(curso1);
     bootCamp.getConteudos().add(curso2);
     bootCamp.getConteudos().add(mentoria1);

        Dev devDre =new Dev();
        devDre.setNome("Anderson Freires");
        devDre.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos inscritos do DRE" + devDre.getConteudosInscritos());
        devDre.progredir();
        devDre.progredir();
        devDre.progredir();
        System.out.println("Conteúdos concluídos de DRE" + devDre.getConteudosconcluidos());
        System.out.println("Conteúdos inscritos do DRE" + devDre.getConteudosInscritos());


        Dev devMalu =new Dev();
        devMalu.setNome("Maria Luiza");
        devMalu.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos inscritos de Malu" + devMalu.getConteudosInscritos());
        devMalu.progredir();
        devMalu.progredir();
        devMalu.progredir();
        System.out.println("Conteúdos concluídos de Malu" + devMalu.getConteudosconcluidos());

        System.out.println("Conteúdos inscritos de Malu" + devMalu.getConteudosInscritos());


    }
}