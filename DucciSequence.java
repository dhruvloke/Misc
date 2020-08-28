import java.util.ArrayList;
public class MyClass {
    public static void main(String args[]) {
        int [] array = {0,653,1854,4063};
        System.out.println(DucciSequence(array));
    }
    public static void PrintArray(int [] array)
    {
        //System.out.println("THE ARRAY SIZE IS " + array.length);
        for(int y = 0; y < array.length;y++)
        {
            System.out.print(array[y] + " ");
        }
        System.out.println();
        //System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
    }
    public static int DucciSequence(int [] array)
    {
        int count = 1;
        int count0 = 0;
        boolean check = false;
        ArrayList<Integer>EL = new ArrayList<Integer>();
        while(check == false)
        {
            PrintArray(array);
            //if(array.length == 1)
            //{
            //    array[0] = temp;
            //}
            //else
            //{
            for(int i = 0; i < array.length;i++)
            {
                if(array[i] == 0)
                {
                    count0++;
                }
            }
            //System.out.println(count0);
            if(count0 == array.length)
            {
                check = true;
                System.out.println("THE ARRAY WORKS ");
                PrintArray(array);
            }
            else
            {
                count0 = 0;
                for(int e = 0; e < EL.size();e++)
                {
                    if(array[0] == EL.get(e))
                    {
                        return -1;
                    }
                }
                int temp = array[0];
                for(int j = 0; j < array.length -1;j++)
                {
                    array[j] = Math.abs(array[j]-array[j+1]);
                }
                array[array.length-1] = Math.abs(array[array.length-1]-temp);
                count++;
            }
            //}
        }
        return count;
    }
}
