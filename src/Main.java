import br.com.dre.desafio.dominio.Cursos;
import br.com.dre.desafio.dominio.Mentorias;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Cursos curso1 = new Cursos();
    curso1.setTitulo("Java");
    curso1.setDescricao("POO");
    curso1.setCargaHoraria(36);

        Mentorias mentoria1=new Mentorias();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("Paradigma orientado a objeto");
        mentoria1.setData(LocalDate.now()   );

        System.out.println(mentoria1);
        System.out.println(curso1);
    }
}