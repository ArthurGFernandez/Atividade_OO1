package entities;
public class Funcionario {

    private String nome;
    private double salarioBase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void dobrarSalario(double salarioBase){
        this.salarioBase *= 2;
    }

    public double calcularFerias(double salarioBase){
         return this.salarioBase +=(salarioBase / 3);
    }

    public void descontarAdiantamento(double valor){
        salarioBase -= valor;
    }

    //Assumindo que a jornada de trabalho do funcionário é 220hrs.
    public double calcularHorasExtras(double totalDeHoras){
        return salarioBase += ((salarioBase / 220) * 2) * totalDeHoras;
    }



}

