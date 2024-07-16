package Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super(); //Super is going to be Constructor in the parent class that does not take any argument and that is Custom stack constructor, it will call CustomStack()
    }

    public DynamicStack (int size){
        super(size); //this will call CustomStack (int size)
    }

    @Override
    public boolean push(int item) {
        //this takes care of it being full
        if (this.isFull()){
            //double the array size
            int[] temp = new int[data.length * 2];

            //copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        //at this point we know that array is not full
        //hence we can insert the item normally
        return super.push(item);
    }
}
