//Demonstrate bubble sort

class bubbleSort{
    public static void main(String [] args){
        int [] numbers={10, 5, 23, -23, 0, 19, 20};
        System.out.println("The array elements before bubble sort are :");
        for(int element:numbers)
            System.out.println(element);

        int temp;
        int loopCount=0;

        //another way of sorting
        for (int i=1; i<numbers.length; i++){
            for (int j=numbers.length-1; j>=i; j--){
                if (numbers[j-1]> numbers[j]){
                    temp=numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=temp;
                }
            }
            loopCount++;
        }
        
        //print the sorted array
        System.out.println("The array elements after sort are :");
        for (int element:numbers)
            System.out.println(element);
        System.out.println("The total loop needed is : " + loopCount);
    };
}
