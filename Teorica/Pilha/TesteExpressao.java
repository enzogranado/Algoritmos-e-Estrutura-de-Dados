import java.util.Scanner;

public class TesteExpressao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua expressão");
        String expressao = sc.nextLine();
        boolean erro = false;
        PilhaChar p = new PilhaChar(20);
        for (int i=0; i<expressao.length(); i++){
            if (expressao.charAt(i) == '('){
                p.empilha('(');
            } else if (expressao.charAt(i) == ')'){
                if (!p.pilhaVazia()){
                    p.desempilha();
                }else{
                    erro = true; // se estiver vazia e queremos empilhar,
                }
            } if (erro || p.pilhaVazia()){
                System.out.println("expressão incorreta");
            }else {
                System.out.println("Expressão correta");
            }
                

        }
    }
}
