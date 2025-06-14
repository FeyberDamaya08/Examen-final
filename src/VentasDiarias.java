public class VentasDiarias{
//Aqui hacemos el metodo  de contar las ventas altas, teniendo una variable contador y utilizando los ciclos for y validacion if para si es mayor al valor que se pide.
 public static int contarVentasAltas (int [][] matriz){
  int contador=0;  
  for (int i=0;i<3;i++){
    for (int j=0;j<4;j++){
     if (matriz [i][j]>500000){
     contador++;
     }
    }

  }
 return contador;
 }
//Aqui hacemos el promedio de las ventas bajas teniendo, los variables suma,promedio para el resultado y el contador por lo que se debe dividir y utilizando ciclos y validaciones. 
 public static int promedioVentasBajas (int [][] matriz){
 int suma =0;
 int promedio=0;
 int contadorProm=0; 
 for (int i=0;i<3;i++){

 for (int j=0;j<4;j++){
  if(matriz [i][j]<100000){
   suma+= matriz [i][j];
   contadorProm++;
   
  }

 }
 }
  promedio= suma/contadorProm;
  return promedio;
 }
 //Este metodo lo utilizamos para mostrar la pocision del valor cuando es 0, utlizando cliclos como for y validaciones.
 public static void imprimirVentasSinActividad (int [][] matriz){
 for(int i=0;i<3;i++){

  for(int j=0;j<4;j++){
  if (matriz[i][j]==0){
  System.out.println ("La pocision de la temperatura es igual a 0 es "+i+","+j);
  }
  }
 }
 }
//Aqui creamos 2 variables, valor alto para saber cual es el mayor y alto para almacenar las 2 pocisiones del valor mas alto.
 public static int [] pocisionMayorVenta(int [][] matriz){
 int valorAlto = matriz [0][0];
 int [] alto = new int[2];
  for(int i=0;i<3;i++){

    for(int j=0;j<4;j++){
    if (matriz[i][j]>valorAlto){
     valorAlto=matriz [i][j];
      alto [0]=i;
      alto [1]=j;
    }
    }
   }
   return alto;
 }

//aqui ejecutamos el codigo
 public static void main(String[] args) throws Exception {
  //el array bidimensional que en mi caso utilize una 3*4.
  int[][] ventas = {
 {15000,20000,85000,15000},
 {10000,0,25000,500000},
 {90000,67000,74000,28000}

 }; 
 // Aqui mostramos todo por consola
  int [] altoPocision = pocisionMayorVenta(ventas); 
 System.out.println("Las veces que se vendio mas de 500.000 fueron: "+contarVentasAltas(ventas));
 System.out.println("El promedio de ventas menores bajas a a 100,000 es :"+promedioVentasBajas(ventas));
 imprimirVentasSinActividad(ventas);
 System.out.println("la pocision del valor mas alto es:"+altoPocision[0]+","+altoPocision[1]);
}


}