public class MyClass {
    public static void main(String args[]) {
       int [] array = {5,1,4,2,8}; 
       BubbleSort(array);
    }
    public static void BubbleSort(int [] array)
    {
        for(int i = 0; i < array.length;i++)
        {
            for(int j = 0; j < array.length -1;j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int a = 0; a < array.length;a++)
        {
            System.out.println(array[a]);
        }
    }
}
