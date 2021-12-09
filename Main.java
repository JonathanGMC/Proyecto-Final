import controlador.Proyecto;
import modelo.Direccion;
import modelo.Trabajador;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
public class Main {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int NumerodeTrabajadores=100;//Aqui se define cuantos trabajadores existiran
    Trabajador[] trabajadores = new Trabajador[NumerodeTrabajadores];
    Proyecto[] proyectos = new Proyecto[NumerodeTrabajadores];
    
    for(int i=0;i<NumerodeTrabajadores;i++) {
      trabajadores[i]=new Trabajador(i);
      System.out.println("\n+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
      System.out.println("Trabajador: "+i);
      trabajadores[i].imprimirTrabajador();
    }
    int opcion = 0;
    do{
      System.out.println("Departamento de Recursos Humanos");
      System.out.println("Modifique un trabajador");
      System.out.println("1 Nombre, 2 ApellidoP, 3 ApellidoM, 4 Edad, 5 Direccion,  6 Imprimir todos los trabajadores, 7 Salir" );
      opcion = leer.nextInt();
      switch (opcion){
        case 1:
          System.out.println("Ingrese el numero del trabajador a modificar ");
          int numero = leer.nextInt();
          System.out.println("Ingrese el nuevo nombre ");
          String nombre = leer.next();/*Aqui leera el nombre que se modificara */
          trabajadores[numero].setNombre(nombre);
          System.out.println("\nNombre modificado ");
          trabajadores[numero].imprimirTrabajador();
          break;
        case 2:
          System.out.println("Ingrese el numero del trabajador a modificar ");
          int numero1 = leer.nextInt();
          System.out.println("Ingrese el nuevo apellido ");
          String apellidoPat = leer.next();/*Aqui leera el nombre que se modificara */
          trabajadores[numero1].setApellidoP(apellidoPat);
          System.out.println("\nApellido modificado ");
          trabajadores[numero1].imprimirTrabajador();
          break;
        case 3:
          System.out.println("Ingrese el numero del trabajador a modificar ");
          int numero2 = leer.nextInt();
          System.out.println("Ingrese el nuevo apellido ");
          String apellidoMat = leer.next();/*Aqui leera el nombre que se modificara */
          trabajadores[numero2].setApellidoM(apellidoMat);
          System.out.println("\nApellido modificado ");
          trabajadores[numero2].imprimirTrabajador();
          break;
        case 4:
          System.out.println("Ingrese el numero del trabajador a modificar ");
          int numero3 = leer.nextInt();
          System.out.println("Ingrese la nueva edad");
          int Edad = leer.nextInt();/*Aqui leera la edad que se modificara */
          trabajadores[numero3].setEdad(Edad);
          System.out.println("\nApellido modificado ");
          trabajadores[numero3].imprimirTrabajador();
          break;
        case 5:
          System.out.println("Ingrese el numero del trabajador a modificar ");
          int numero4 = leer.nextInt();
          System.out.println("Ingrese la nueva direccion ");
          System.out.println("Ingrese la nueva calle ");
          String Calle = leer.next();//Aqui leera la calle que se modificara 
          System.out.println("Ingrese el nuevo numero exterior ");
          String NumeroExterior = leer.next();//Aqui leera el numero exterior que se modificara 
          System.out.println("Ingrese el nuevo Municipio ");
          String Municipio = leer.next();//Aqui leera el municipio que se modificara 
          System.out.println("Ingrese el nuevo Codigo Postal exterior ");
          String CoPostal = leer.next();//Aqui leera el codigo postal que se modificara 
          System.out.println("Ingrese el nuevo Estado ");
          String Estado = leer.next();//Aqui leera el estado que se modificara 
          trabajadores[numero4].setDireccion(new Direccion(Calle, NumeroExterior, Municipio, CoPostal, Estado));
          System.out.println("\nDireccion modificada ");
          System.out.println(trabajadores[numero4].getDireccion());
          trabajadores[numero4].imprimirTrabajador();
          break;
        case 6:
          for(int i=0;i<NumerodeTrabajadores;i++) {
            trabajadores[i].imprimirTrabajador();
          }
        default:
            break;
      }
    }while(opcion<7);
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      FileWriter fw = new FileWriter("Registro.csv");
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter salida = new PrintWriter(bw);

      for(int i=0; i<NumerodeTrabajadores; i++){
        salida.println(trabajadores[i]);
        /*for(int j=0; j<NumerodeTrabajadores; j++){
        salida.println(proyectos[j]);
        }*/
      }
      salida.close();
    }catch (IOException ex){
      System.out.println(ex.getMessage());
    }
  }  
}