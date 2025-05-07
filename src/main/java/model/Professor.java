package model;
import javax.swing.JOptionPane;
public class Professor extends Pessoa {
    private double salary;
    private String title;
    public static final String defaultValue = "Doutor";
    public Professor() {
    }

    public Professor(double salary, String title) {
        this.salary = salary;
        this.title = title;
    }

    public Professor(double salary, String title, String name, int age) {
        super(name, age);
        this.salary = salary;
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public void leitura(){
        super.leitura();
        setSalary(Double.parseDouble(JOptionPane.showInputDialog("Qual seu salário?")));
        setTitle(JOptionPane.showInputDialog("Qual seu titulo como professor?"));
        
        if (title.isBlank()){
            title = defaultValue;
        }
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null, "SALÁRIO: " + getSalary() + "\n" + "TITULO: " + getTitle() + "\n");
    }
    
    @Override
    public String getNomeFormatado(){
        return getTitle() + " " + getName();
    }
    
    
    
    
}
