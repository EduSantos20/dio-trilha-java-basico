import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso = new Curso();
        curso.setTitulo("Curso java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("João");

        //inscrevendo joão no bootcamp
        dev.inscreverBootcamp(bootcamp);
        //verificando os conteudos que o joão está escrito
        System.out.println("Conteudos Incritos de Joao" + dev.getConteudosIncritos());
        // o joão concluiu o curso
        dev.progredir();
        //verificando os conteudos que o joão concluiu e chamado o que ele falta concluir
        System.out.println("Conteudos Incritos de Joao" + dev.getConteudosIncritos());
        System.out.println("Conteudos concluido de Joao" + dev.getConteudosConcluidos());

        //dando a um XP para o joão por ter concluido o curso
        System.out.println("XP " + dev.calcularTotalXp());
        
    }
}
