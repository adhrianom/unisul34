package principal;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Professor;
public class Unisul34 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor prof = new Professor();
        
        JOptionPane.showMessageDialog(null, "CADASTRO DE ALUNO");
        aluno.leitura();
        aluno.imprimir();
        aluno.getNomeFormatado();
        JOptionPane.showMessageDialog(null, aluno.getNomeFormatado());
        
        JOptionPane.showMessageDialog(null, "CADASTRO DE PROFESSOR");
        prof.leitura();
        prof.imprimir();
        JOptionPane.showMessageDialog(null, prof.getNomeFormatado());
    }
}
