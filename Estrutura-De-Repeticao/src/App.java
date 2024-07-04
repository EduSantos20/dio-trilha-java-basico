public class App {
    public static void main(String[] args) throws Exception {
        boolean condicao = false;

        while(condicao){
            System.out.println("executou ... ");
        }
        String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
        //System.out.print(nomes.length);

        int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
            break;
        } while (count <= 3);

        for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }
         int numero = 1;

        for (int x=1; x<2; x++){
            numero = numero + x;
        }
        System.out.println("O valor de número é: " + numero);
    }
}
