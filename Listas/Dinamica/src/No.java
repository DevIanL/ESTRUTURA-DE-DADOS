public class No <Generico>{
    private Generico dado;
    private No<Generico> proximo_no;

    public No(Generico dado){
        this.dado = dado;
    }

    public Generico get_dado(){
        return dado;
    }

    public void set_dado(Generico dado){
        this.dado = dado;
    }

    public No<Generico> get_proximo_no(){
        return proximo_no;
    }

    public void set_proximo_no(No<Generico> no){
        proximo_no = no;
    }
 }
