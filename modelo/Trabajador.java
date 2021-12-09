package modelo;
import controlador.Proyecto;
import modelo.Direccion;
public class Trabajador{
  private String[] Nombres = { "Manuel", "Nicolas", "Lorenzo", "Emiliano", "Jose", "Francisco", "Antonio", "Gillermo","Mauricio", "Norberto", "Carlos", "Alejandra", "Leonel", "Fernando", "Cristiano", "Michel", "Nikola", "Diego","Nemesio", "Inosuke", "Juan", "Erick", "Melissa ", "Lana", "Rosa", "Maria", "Julieta", "Samanta", "Jenny","Yolanda" };
  private String[] Apellidos = { "Rodriguez", "Guzman", "Gonzalez", "Hernandez", "Lopez", "Esparza", "Pedraza","Manjiro", "Acosta", "Acuña", "Aguilar", "Aguirre", "Agustín", "Ahumada", "Alanis", "Alarcón", "Alayón","Alcázar", "Mesa", "Baca", "Báez", "Baños", "Barba", "Barrera", "Guitierrez", "Barriga", "Bastida", "Montes","Brambila", "Morales" };
  // Pondremos los arreglos
  private String Nombre;
  private String ApellidoP;
  private String ApellidoM;
  private int Edad;
  private Direccion direccion;
  private int NumProyectosVigentes;
  private int TotalDeProyectos = (int) (Math.random() * 49 + 1);
  private Proyecto[] proyectos = new Proyecto[TotalDeProyectos + 1];
  private int AñosDeServ;
  private int Elemento = 0;

  public Trabajador(int Elemento) {
    this.Elemento = Elemento;
    Nombre = Nombres[(int) (Math.random() * 30)];
    ApellidoP = Apellidos[(int) (Math.random() * 30)];
    ApellidoM = Apellidos[(int) (Math.random() * 30)];
    Edad = (int) (Math.random() * 52 + 18);
    AñosDeServ = (int) (Math.random() * 50);// Asigna Años de Servicio aleatorio de [0 a 50]
    int aux1 = 0;
    for (int i = 0; i < TotalDeProyectos; i++) {// Inicializa los proyectos
      proyectos[i] = new Proyecto();
      if (proyectos[i].getNumProyecto() > 39)
        NumProyectosVigentes++;
      if (NumProyectosVigentes == 3) {// Se valida que maximo se tengan 3 proyectos Vigentes
        aux1 = i;
        i = TotalDeProyectos;
      }
    }
    if (NumProyectosVigentes == 3)
      TotalDeProyectos = aux1;
    if (NumProyectosVigentes == 0) {// Se valida que minimo se tenga un proyecto Vigente
      Proyecto aux = new Proyecto((int) (Math.random() * 10 + 40));// Se agrega un proyecto vigente
      proyectos[TotalDeProyectos - 1].setNumProyecto(aux.getNumProyecto());
      proyectos[TotalDeProyectos - 1].setNombreProyecto(aux.getNombreProyecto());
      proyectos[TotalDeProyectos - 1].setEstatus(aux.getEstatus());
      NumProyectosVigentes++;
    }
    direccion = new Direccion(Elemento);
  }// Inializacion del Trabajador

  public String getNombre() {
    return Nombre;// Regresa nombre
  }

  public void setNombre(String Nombre) {
    this.Nombre = Nombre;
  }

  public String getApellidoP() {
    return ApellidoP;
  }// Regresa ApellidoP

  public void setApellidoP(String ApellidoP) {
    this.ApellidoP = ApellidoP;
  }// Regresa ApellidoP

  public String getApellidoM() {
    return ApellidoM;
  }// Regresa ApellidoM

  public void setApellidoM(String ApellidoM) {
    this.ApellidoM = ApellidoM;
  }

  public String getDireccion() {
    return direccion.toString();
  }// Regresa Direccion

  public void setDireccion(Direccion direccion) {
    this.direccion = direccion;
  }

  public int getEdad() {
    return Edad;
  }// Regresa Edad

  public void setEdad(int Edad) {
    this.Edad = Edad;
  }

  public int getTotalDeProyectos() {
    return TotalDeProyectos;
  }// Regresa el Total de Proyectos

  public void setTotalDeProyectos(int TotalDeProyectos) {
    this.TotalDeProyectos = TotalDeProyectos;
  }

  public int getNumProyectosVigentes() {
    return NumProyectosVigentes;
  }// Regresa Numero de Proyectos Vigentes

  public void setNumProyectosVigentes(int NumProyectosVigentes){
    this.NumProyectosVigentes=NumProyectosVigentes;
  }

  public void imprimirTrabajador(){
    if(NumProyectosVigentes==3){
    System.out.println("Nombre: "+Nombre+", ApellidoP: "+ApellidoP+", ApellidoM: "+ApellidoM+", Edad: "+Edad+", Años de Servicio: "+AñosDeServ+", Direccion: "+direccion.toString()+",Numero de Proyectos Vigentes: "+NumProyectosVigentes+", Total de Proyectos: "+(TotalDeProyectos+1)+", Proyectos: ");
    for(int f=0;f<=TotalDeProyectos;f++){
      System.out.println(proyectos[f]);
    }
    }else{
     System.out.println("Nombre: "+Nombre+", ApellidoP: "+ApellidoP+", ApellidoM: "+ApellidoM+", Edad: "+Edad+", Años de Servicio: "+AñosDeServ+", Direccion: " +direccion.toString()+", Numero de Proyectos Vigentes: "+NumProyectosVigentes+",Total de Proyectos: "+(TotalDeProyectos)+", Proyectos: ");
    for(int f=0;f<=TotalDeProyectos;f++){
      System.out.println(proyectos[f]);
    } 
    }
  }

  @Override
  public String toString() {
    return "Trabajador [Nombre: " + Nombre + ", ApellidoP: " + ApellidoP + ", ApellidoM: " + ApellidoM + ", Edad: " + Edad + ", AñosDeServicio: "+ AñosDeServ + ", Direccion: " + direccion.toString() + ", NumeroDeProyectosVigentes: " + NumProyectosVigentes+ " TotalDeProyectos:" + TotalDeProyectos;
  }
}