public class HiloFibonacci extends Thread {


  

    //Atributo
    private int n;


    //Constructores

    public HiloFibonacci() {
    }

    public HiloFibonacci(int n) {
        this.n = n;
    }

    //Método que calcula la secuencia de números
      @Override
    public void run() {
       
        //La secuencia empieza siempre con 2 números 1
        long a = 1;
        long b = 1;

        //si n <0 no imprime nada
        if (n<= 0){
            System.out.println("N debe ser mayor que 0");
            return;
        }

    //Imprimo el primer número
    System.out.println("Secuencia Fibonacci de "+n+" números");

    //Ahora la secuencia n número de veces
    for (int i = 0; i < n; i++) {

        //La 1º vuelta el primer valor es 1, lo imprimo
        if(i == 0){
            System.out.print(a + ", ");
    
        //En la 2ª vuelta el valor es 1, lo imprimo
        }else if(i ==1){
            System.out.print(b + ", ");

        //Las siguientes vueltas son la suma de los dos anteriores
        }else{

            long siguiente = a + b;
            System.out.print(siguiente+ ", ");
            //a pasa a ser b
            a = b;
            //b pasa a ser siguiente
            b =siguiente;
        }
        
    }
    System.out.println();
    }

    
}