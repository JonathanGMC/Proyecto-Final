package modelo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;

public class Direccion{
  
  private String Calle;
  private String NumeroExterior;
  private String Municipio;
  private String CoPostal;
  private String Estado;

  public Direccion(String Calle, String NumeroExterior, String Municipio, String CoPostal, String Estado){
    //Modificar las variables en minusculas
    this.Calle = Calle;
    this.NumeroExterior = NumeroExterior;
    this.Municipio = Municipio;
    this.CoPostal = CoPostal;
    this.Estado = Estado;
  }
  public Direccion(int Elemento){
    try{//Entra a una exception
      FileReader tabla = new FileReader("Direcciones.csv");//lee el contenido del archivo csv
      BufferedReader buffer = new BufferedReader(tabla);
      String linea =buffer.readLine();//este lee el dato cuando acaba una direccion da el salto y toma otra direccion
      int count = 0,i=0;//Se crea un contador
      while(linea!=null){//Se repetira hasta que no hayan mas direcciones
        if(i==Elemento){//Se pregunta si i tiene la misma cantidad de elementos que tiene Direccion
          StringTokenizer tokenizador= new StringTokenizer(linea,",");//Utilizamos un token para que capture el dato que se separa por comas
          while(tokenizador.hasMoreTokens()){//Se toma el dato hasta que no hayan mas comas
            String aux= tokenizador.nextToken();
            if(count==0)
              Calle=aux;
              else if(count == 1)
                NumeroExterior=aux;
                else if(count == 2)
                  Municipio=aux;
                  else if(count == 3)
                    CoPostal=aux;
                      else if(count == 4)
                      Estado=aux;
            count++;
          }
       }
       linea=buffer.readLine();
       i++;
      }
      buffer.close();
   }catch(ArrayIndexOutOfBoundsException e){
   }catch(FileNotFoundException ex){
    System.out.println(ex.getMessage());
    }catch(NullPointerException e){     
      }catch(IOException ex){
    System.out.println(ex.getMessage());
    }
    
  }

public void setCalle(String Calle){
  this.Calle=Calle;
}
public void setNumeroExterior(String NumeroExterior){
  this.NumeroExterior=NumeroExterior;
}
public void setMunicipio(String Municipio){
  this.Municipio=Municipio;
}
public void setCoPostal(String CoPostal){
  this.CoPostal=CoPostal;
}
public void setEstado(String Estado){
  this.Estado=Estado;
}
public String getCalle(){
return Calle;
}
public String getNumeroExterior(){
  return NumeroExterior;
}
public String getMunicipio(){
  return Municipio;
}
public String getCoPostal(){
  return CoPostal;
}
public String getEstado(){
  return Estado;
}

@Override
public String toString(){
    return "Direccion Calle: "+Calle+" NumeroExterior: "+NumeroExterior+" Municipio: "+Municipio+" CodigoPostal: "+CoPostal+" Estado: "+Estado;
  }
}