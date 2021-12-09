package controlador;
public class Proyecto{
  private String NombreProyecto;
  private int NumProyecto;
  private String Estatus;
  
    private String [] NombresProyectos={"Apolo","Astro","Atlantis","Aurora","Flyers","Dixon","Canario","Casanova","Canela","Géminis","Hidra","Kodiak"," Fénix","Poseidón","Sputnik","C-134","Spartan","Alpha","Beta","Epsilon","Bogota","Hawei","Laika","Camelot","America","Union","UNAM","IPN","Terabitia","Artia","ALarcon","Falcon","Scorpion","Fiurer","GSM","Boss","Scalipur","Taste","GIGARED","Relampago","Draco","Volte","CAD26","Andromeda","Great","Saturno","Sould","Everest","Scarlet","Norte", "Amigos", "Antiguo", "Caldera", "Polluelos encantadores", "Almeja redonda", "Mente profunda"};
  public Proyecto(){
    NumProyecto=(int)(Math.random()*56);
    NombreProyecto=NombresProyectos[NumProyecto];
    if(NumProyecto>=40){
      Estatus="Vigente";
    }else{
      Estatus="Historico";
    }
  }
  public Proyecto(int NumProyecto){
    this.NumProyecto=NumProyecto;
    NombreProyecto=NombresProyectos[NumProyecto];
    Estatus="Vigente"; 
  }
  public String getNombreProyecto(){
  return NombreProyecto;
  }
  public void setNombreProyecto(String NombreProyecto){
    this.NombreProyecto=NombreProyecto;
  }
  public int getNumProyecto(){
  return NumProyecto;
  }
  public void setNumProyecto(int NumProyecto){
    this.NumProyecto=NumProyecto;
  }
  public String getEstatus(){
  return Estatus;
  }
  public void setEstatus(String Estatus){
    this.Estatus=Estatus;
  }

  @Override
  public String toString(){
    return "Nombre Proyecto: "+NombreProyecto+", NumeroDeProyecto: "+(NumProyecto+1)+", Estatus: "+Estatus;
  }
}