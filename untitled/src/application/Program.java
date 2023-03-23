package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Digite o nome do Funcionário: ");
        String nome = sc.nextLine();
        funcionario.setNome(nome);
        System.out.print("\nDigite o salário do Funcionário: ");
        double salario = sc.nextDouble();
        funcionario.setSalarioBase(salario);

        System.out.println("Nome do funcionário: " + funcionario.getNome() + ", Salário do funcionário: " + String.format("%.2f", funcionario.getSalarioBase()));

        System.out.println("Gostaria de dobrar o salário do usuário? y/n");
        char response = sc.next().charAt(0);
        if(response == 'y'){
            funcionario.dobrarSalario(funcionario.getSalarioBase());
        }

        System.out.println("Nome do funcionário: " + funcionario.getNome() + ", Salário do funcionário: " + String.format("%.2f", funcionario.getSalarioBase()));

        System.out.println("\nEste são os valores após a soma das férias do funcionário!");
        funcionario.calcularFerias(funcionario.getSalarioBase());
        System.out.println("Nome do funcionário: " + funcionario.getNome() + ", Salário do funcionário: " + String.format("%.2f", funcionario.getSalarioBase()));

        System.out.print("Agora desconte o  adiantamento do funcionário: ");
        double desconto = sc.nextDouble();
        funcionario.descontarAdiantamento(desconto);
        System.out.println("\nNome do funcionário: " + funcionario.getNome() + ", Salário do funcionário: " + String.format("%.2f", funcionario.getSalarioBase()));

        System.out.println("Informe a quantidade de horas extras concluido pelo funcionário: ");
        double horasExtras = sc.nextDouble();
        funcionario.calcularHorasExtras(horasExtras);

        System.out.println("Nome do funcionário: " + funcionario.getNome() + ", Salário do funcionário: " + String.format("%.2f", funcionario.getSalarioBase()));



        sc.close();
    }
}