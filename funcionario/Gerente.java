package funcionario;

public class Gerente extends Funcionario2 {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //@Override, colocar o get da erro 
    public double setSalario(){
        return this.bonus + (this.getSalarioBase()*2);
    }
    
    
}
