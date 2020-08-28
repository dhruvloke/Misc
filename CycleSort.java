public class MyClass {
    public static void main(String args[]) {
        int [] array = {10,0,-1,2,4,7};
        int [] x = CycleSort(array);
        for(int i = 0; i < x.length;i++)
        {
            System.out.println(x[i]);
        }
    }
    public static int [] CycleSort(int [] array)
    {
        for(int i = 0; i < array.length;i++)
        {
            //System.out.println(array[i]);
            int counter = 0;
            for(int j = 0; j < array.length;j++)
            {
                if(array[j] < array[i])
                {
                    counter++;
                }
            }
                //System.out.println("COUNTER IS " + counter);
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
        }
        return array;
    }
}
