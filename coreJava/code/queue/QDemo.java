class Queue{
    char q[];
    int putloc, getloc;

    //methods
    Queue(int size){
       q= new char [size];
       putloc=getloc=0;
    }

    void put(char item){
       if(putloc==q.length){
          System.out.println("Queue is full. Item can't be added.");
          return;
       }
       q[putloc++]=item;
    }


    //get element
    char get(){
        if(getloc==putloc){
            System.out.println("There is no item in the queue");
            return (char) 0;
        }
        return q[getloc++];
    }

}


class QDemo{
    public static void main(String [] args){
        Queue firstQ= new Queue(100);

        char ch;
        int i;

        System.out.println("Using firstQ to store alphabate");
        for (i=0; i<100; i++){
            firstQ.put((char)('A'+i));
        }

        System.out.println("Displaying the content of firstQ");
        for(i=0; i<100;i++){
            ch=firstQ.get();
            if(ch!= (char) 0)
               System.out.println(ch); 
        }
    }
}
