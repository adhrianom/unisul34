package model;
import javax.swing.JOptionPane;
public class Aluno extends Pessoa {
    private String course;
    
    public static final String defaultCouse = "Sistema de informação";

    public Aluno() {
    }

    public Aluno(String course) {
        this.course = course;
    }

    public Aluno(String course, String name, int age) {
        super(name, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    @Override
    public void leitura(){
        super.leitura();
        setCourse(JOptionPane.showInputDialog("Qual o curso em que o aluno está matriculado?"));
        
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null, "CURSO: " + getCourse() + "\n");
    }
    
    @Override
    public String getNomeFormatado(){
        return getName().toUpperCase();
    }
    
    
}
