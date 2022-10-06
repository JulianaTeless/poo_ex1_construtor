import javax.swing.JOptionPane;

public class TesteCarro {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        Carro palio = new Carro();


        fusca.setCor(JOptionPane.showInputDialog("Qual a cor do teu fusca?"));
        fusca.setPlaca(JOptionPane.showInputDialog("Qual a pelaca do fusca?"));

        palio.setPlaca(JOptionPane.showInputDialog("Qual a placa do palio?"));
        palio.setCor(JOptionPane.showInputDialog("Qual a cor do teu palio?"));

        fusca.getCor();
        fusca.getPlaca();

        palio.getCor();
        palio.getPlaca();

        fusca.sintonizarRadio(101);
         


    }
    

    
}
