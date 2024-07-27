package Praticando.ExercicioSet.AgendarContato;

public class App {
  public static void main(String[] args) {
    AgendaContato agendaContatos = new AgendaContato();

    agendaContatos.exibirContato();

    agendaContatos.adicionarContato("Eduardo", 330);
    agendaContatos.adicionarContato("Eduardo", 330);
    agendaContatos.adicionarContato("João", 331);
    agendaContatos.adicionarContato("Maria", 332);
    agendaContatos.adicionarContato("Pedro", 333);
    
    agendaContatos.exibirContato();

    System.out.println("-------------Exibindo Contato------------");
    System.out.println(agendaContatos.pesquisarPorNome("Eduardo"));

    System.out.println("-------------Atualizando Contato------------");
    System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Eduardo", 444));
    
    System.out.println("-------------Exibindo Contato------------");
    System.out.println(agendaContatos.pesquisarPorNome("Eduardo"));
    agendaContatos.exibirContato();
  }
}
