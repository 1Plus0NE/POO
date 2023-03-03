

public class Telemovel {

    private String marca; // marca do telemovel
    private String modelo; // modelo do telemovel
    private int displayX; // resolução do telemovel X (XxY) 
    private int displayY; // resolução do telemovel Y (XxY)
    private int dimMsg; // dimensão do armazenamento para as mensagens de texto (vistas como Strings)
    private int dimTot; // dimensão do armazenamento total para fotos e aplicações
    private int dimFoto; // dimensão do armazenamento para as fotos
    private int dimApp; // dimensão do armazenamento para as aplicações
    private int storage; // espaço total ocupado (em bytes)
    private int nmrFotos; // número de fotos guardadas
    private int nmrApps; // número de aplicações instaladas
    private String nomeApps; // nome das aplicações instaladas

    public Telemovel(){
        this.marca    = "";
        this.modelo   = "";
        this.displayX = 0;
        this.displayY = 0;
        this.dimMsg   = 0;
        this.dimTot   = 0;
        this.dimFoto  = 0;
        this.dimApp   = 0;
        this.storage  = 0;
        this.nmrFotos = 0;
        this.nmrApps  = 0;
        this.nomeApps = "";
    }

    public Telemovel(String mar, String mod, int dX, int dY, int dMsg, int dTot, int dFoto, int dApp, int sto, int nFotos, int nApps, String names){
        this.marca    = mar;
        this.modelo   = mod;
        this.displayX = dX;
        this.displayY = dY;
        this.dimMsg   = dMsg;
        this.dimTot   = dTot;
        this.dimFoto  = dFoto;
        this.dimApp   = dApp;
        this.storage  = sto;
        this.nmrFotos = nFotos;
        this.nmrApps  = nApps;
        this.nomeApps = "";
    }

    public Telemovel(Telemovel newTelemovel){
        this.marca    = newTelemovel.getMarca();
        this.modelo   = newTelemovel.getModelo();
        this.displayX = newTelemovel.getDisplayX();
        this.displayY = newTelemovel.getDisplayY();
        this.dimMsg   = newTelemovel.getDimMsg();
        this.dimTot   = newTelemovel.getDimTot();
        this.dimFoto  = newTelemovel.getDimFoto();
        this.dimApp   = newTelemovel.getDimApp();
        this.storage  = newTelemovel.getStorage();
        this.nmrFotos = newTelemovel.getNmrFotos();
        this.nmrApps  = newTelemovel.getNmrApps();
        this.nomeApps = newTelemovel.getNomeApps();
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getDisplayX(){
        return this.displayX;
    }

    public int getDisplayY(){
        return this.displayY;
    }

    public int getDimMsg(){
        return this.dimMsg;
    }

    public int getDimTot(){
        return this.dimTot;
    }

    public int getDimFoto(){
        return this.dimFoto;
    }

    public int getDimApp(){
        return this.dimApp;
    }

    public int getStorage(){
        return this.storage;
    }

    public int getNmrFotos(){
        return this.nmrFotos;
    }

    public int getNmrApps(){
        return this.nmrApps;
    }

    public String getNomeApps(){
        return this.nomeApps;
    }

    public void setMarca(String newMarca){
        this.marca = newMarca;
    }

    public void setModelo(String newModelo){
        this.modelo = newModelo;
    }

    public void setDisplayX(int newDisplayX){
        this.displayX = newDisplayX;
    }

    public void setDisplayY(int newDisplayY){
        this.displayY = newDisplayY;
    }

    public void setDimMsg(int newDimMsg){
        this.dimMsg = newDimMsg;
    }

    public void setDimTot(int newDimTot){
        this.dimTot = newDimTot;
    }

    public void setDimFoto(int newDimFoto){
        this.dimFoto = newDimFoto;
    }

    public void setDimApp(int newDimApp){
        this.dimApp = newDimApp;
    }

    public void setStorage(int newStorage){
        this.storage = newStorage;
    }

    public void setNmrFotos(int newNmrFotos){
        this.nmrFotos = newNmrFotos;
    }

    public void setNmrApps(int newNmrApps){
        this.nmrApps = newNmrApps;
    }

    public void gstNomeApps(String newNomeApps){
        this.nomeApps = newNomeApps;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if((o == null) || (this.getClass () != o.getClass())) return false;
        Telemovel t = (Telemovel) o;
        return ((this.marca).equals(t.getMarca()) && (this.modelo).equals(t.getModelo()) && this.displayX == t.getDisplayX() && this.displayY == t.getDisplayY() &&
        this.dimMsg == t.getDimMsg() && this.dimTot == t.getDimTot() && this.dimFoto == t.getDimFoto() && this.dimApp == t.getDimApp() && this.nmrFotos == t.getNmrFotos() &&
        this.nmrApps == t.getNmrApps() && (this.nomeApps).equals(t.getNomeApps()));

    }

    public String toString(){
        return "Marca: "+this.marca+"\nModelo: "+this.modelo+"\nResolução: "+this.displayX+ "/"+this.displayY+"\nArmazenamento para mensagens de texto: "+this.dimMsg+"\nArmazenamento para fotos: "+this.dimFoto+"\nArmazenamento para aplicações: "+this.dimApp+"\nEspaço total: "+this.storage+"\nNumero de fotos guardadas: "+this.nmrFotos+"\nNumero de aplicações instaladas: "+this.nmrApps+"\nNome da pasta de aplicações: "+this.nomeApps;
    }

    public Telemovel clone(){
        return new Telemovel(this);
    }

    public static void main(String[] argv){

        

    }

}
