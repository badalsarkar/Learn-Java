

class MyThread implements Runnable{
    Thread myThread;

    //constructor
    MyThread(String name){
        myThread= new Thread(this, name);
    }


    //factory method to create and start the thread
    public static MyThread createAndStart(String name){
        MyThread mt= new MyThread(name);
        mt.myThread.start();
        return mt;
    }


    @Override
    public void run(){
        System.out.println(myThread.getName()+ "is starting");
        try{
            for(int i=0;i<10; i++){
                Thread.sleep(400);
                System.out.println("In thread "+ myThread.getName()+" the count is "+i);
            }
        }
        catch(InterruptedException ex){
            System.out.println(myThread.getName()+ "interrupted");
        }
        System.out.println(myThread.getName()+" terminating.");
    }



}
