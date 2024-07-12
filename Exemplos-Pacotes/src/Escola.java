public class Escola {
    public static void main(String[] args) {
        Aluno eduardo = new Aluno();
        eduardo.setNome("Eduardo");
        eduardo.setIdade(24);
        eduardo.setSexo("M");

        System.out.println("O aluno " + eduardo.getNome() + " tem " + eduardo.getIdade() + " anos.");
    }
}