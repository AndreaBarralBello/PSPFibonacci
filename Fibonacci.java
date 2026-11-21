public class Fibonacci {
    public static void main(String[] args)  {

        System.out.println("[PADRE]: Iniciando programa");
        
        HiloFibonacci hilo = new HiloFibonacci(100);

        hilo.start();

        try {
            //espero a que termine el hilo 
            hilo.join();
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }


        System.out.println("[PADRE]: Fin del programa");
    }
}
