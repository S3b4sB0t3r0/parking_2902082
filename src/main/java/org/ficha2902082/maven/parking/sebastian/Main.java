package org.ficha2902082.maven.parking.sebastian;
//inportar dependencias 
import org.ficha2902082.maven.parking.sebastian.entities.Carro;
import org.ficha2902082.maven.parking.sebastian.entities.Cliente;
import org.ficha2902082.maven.parking.sebastian.entities.TipoDocumento;
import org.ficha2902082.maven.parking.sebastian.entities.TipoVehiculo;



public class Main {
    public static void main(String[] args) {
    //Crear dos instancias 
    // De la clase Carro
    Carro carrito1 = new Carro();
    carrito1.placa = "ASB 345";
    carrito1.tipoVehiculo = TipoVehiculo.CAMIONETA;
    
    Carro carrito2 = new Carro();
    carrito2.placa = "SBG 559";
    carrito2.tipoVehiculo = TipoVehiculo.MOTO;

    Carro carrito3 = new Carro();
    carrito3.placa = "JDK 101";
    carrito3.tipoVehiculo = TipoVehiculo.TAXI;

    Cliente clientecito = new Cliente();
    clientecito.nombre = "Sebastian";
    clientecito.apellidos = "Botero";
    clientecito.tipoDocumento = TipoDocumento.TI;
    clientecito.numeroDocumento  = 1029144151L;
    clientecito.celular = 3208419466l;

    System.out.println("Cliente:");
    System.out.println("Nombre:" + clientecito.nombre);
    System.out.println("Apellido:" + clientecito.apellidos);
    System.out.println("TipoDocumento:" + clientecito.tipoDocumento);
    System.out.println("numeroDocumento:" + clientecito.numeroDocumento);
    System.out.println("Celular:" + clientecito.celular);
    System.out.println("Vehiculos:");
    for ( Carro c:  clientecito.misCarros) {
        System.out.println("placa:" + c.placa);
        System.out.println("tipo:" + c.tipoVehiculo);
        System.out.println("__________");
    }


        //añadir carros al cliete 
        //invocar. lamar, ejecutar 
        //el metodo addCar
        clientecito.addCar(carrito1);
        clientecito.addCar(carrito2);
        clientecito.addCar("ASD 456", TipoVehiculo.TAXI);
    }
}