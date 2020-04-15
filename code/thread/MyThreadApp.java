



public class MyThreadApp {
    public static void main(String [] args){
        System.out.println("main thread starting");
        MyThread mt= MyThread.createAndStart("thread1");
        for(int i=0; i<3; i++){
            System.out.println("main thread");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException ex){
                System.out.println("Main thread inturrepted");
            }
        }
        System.out.println("Main thread ending");
    }

}
