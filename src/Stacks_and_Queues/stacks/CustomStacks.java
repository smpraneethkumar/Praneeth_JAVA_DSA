package Stacks_and_Queues.stacks;

public class CustomStacks {

    protected  int[] data;
        static int potr = 0;

    private  static final  int DEFAULT_SIZE = 10;


    public CustomStacks(){
        this(DEFAULT_SIZE);
    }

    public CustomStacks(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){

        if(isFull()){
            System.out.println("the stack is FULL");

            return false;
        }

        data[potr] = item;
        return true;


    }

    public int pop(){

        return data[potr--];
    }

    public boolean isFull(){

        return potr == data.length -1;
    }

}
