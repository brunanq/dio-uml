package Browser;

import java.util.ArrayList;
import java.util.List;

public class Safari {
    private List<Pagina> paginasList;

    public Safari() {
        this.paginasList = new ArrayList<>();
    }

    public void abrirPagina(int id){
        Pagina pagina = new Pagina(id);
        paginasList.add(pagina);
    }

    public void abrirNovaGuiaPorIdPagina(int id){
        for (Pagina pagina : paginasList) {
            if(pagina.getId() == id){
                pagina.setGuia(pagina.getGuia()+1);
            }
        }
    }

    public void fecharGuiaPorIdPagina(int id){
        for (Pagina pagina : this.paginasList) {
            if(pagina.getId() == id){
              if(pagina.getGuia() > 1){
                pagina.setGuia(pagina.getGuia()-1);
            } else {
                this.paginasList.remove(pagina);
            }  
            }
        }
    }
}
