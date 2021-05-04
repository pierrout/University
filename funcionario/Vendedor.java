package funcionario;

public class Vendedor {
    private double comissao; 

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public double setSalarioBase() {
        return this.comissao + this.setSalarioBase();
    }
}
