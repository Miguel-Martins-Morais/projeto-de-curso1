import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nome;
        String email;
        String resultado;
        double nota1, nota2, nota3;

        System.out.println("Qual o nome do aluno");
        nome = scanner.next();
        System.out.println("Qual o email do aluno");
        email = scanner.next();
        System.out.println("Qual o nota 1 do aluno");
        nota1 = scanner.nextDouble();
        System.out.println("Qual o nota 2 do aluno");
        nota2 = scanner.nextDouble();
        System.out.println("Qual o nota 3 do aluno");
        nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;


        if( media >= 7){
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }
        System.out.println("---------------------------");
        System.out.println("O nome do aluno é: " + nome);
        System.out.println("O email do aluno é: " + email);

        String mediaFinal = String.format("%.1f", media);

        System.out.println("O resultado foi: " + resultado + " media: " + mediaFinal);

        scanner.close();

}
}