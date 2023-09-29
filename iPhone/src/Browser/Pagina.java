package Browser;
public class Pagina {
    private int id;
    private int guia;

    public Pagina(int id) {
        this.id = id;
        this.guia = 1;
    }


    public int getId() {
        return id;
    }
    public int getGuia() {
        return guia;
    }
    public void setGuia(int guia) {
        this.guia = guia;
    }
}
