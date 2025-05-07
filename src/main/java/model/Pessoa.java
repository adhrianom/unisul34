
package model;
import javax.swing.JOptionPane;
public abstract class Pessoa {
  private String name;  
  private int age;

    public Pessoa() {
    }

    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void leitura(){
        setName(JOptionPane.showInputDialog("NOME: "));
        setAge(Integer.parseInt(JOptionPane.showInputDialog("IDADE: ")));
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "NOME: " + getName() + "\n" + "IDADE: " + getAge() + "\n");
    }
    
    public abstract String getNomeFormatado();
        
}
