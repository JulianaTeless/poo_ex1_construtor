
public class Carro{

    private String placa;
    private String Cor;

    public void ligarCarro(){
        System.out.println("Ligando o carro");
    }

    public void sintonizarRadio(int s){
        System.out.printf("Sintonizando na radio: %d ",s);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

}