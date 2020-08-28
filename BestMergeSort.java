public class MyClass {
    public static void main(String args[]) {
    int [] array = {7,10,6,2,1,4,5,8,3,6,7,9,6};
    PrintArray(array);
    int [] x = Seperate(array);
    PrintArray(x);
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
    
    public static int [] Seperate(int [] array)
    {
        //PrintArray(array);
        if(array.length == 2)
        {
            if(array[0] > array[1])
            {
                int temp = array[0];
                array[0] = array[1];
                array[1] = temp;
            }
            return array;
        }
        else if(array.length == 1)
        {
            return array;
        }
        int middle = array.length/2;
        //System.out.println("HELLO  THE ARRAY IS SIZE " + array.length);
        if(array.length % 2 == 1)
        {
            int [] temp1 = new int [middle];
            for(int i = 0; i < middle; i++)
            {
                temp1[i] = array[i];
            }
            int a = 0;
            //PrintArray(temp1);
            int [] temp2 = new int [middle+1];
            for(int j = middle;j < array.length;j++)
            {
                temp2[a] = array[j];
                a++;
            }
            int [] left = Seperate(temp1);
            int [] right = Seperate(temp2);
            //PrintArray(left);
            //PrintArray(right);
            int [] merged = Merge(left,right);
            return merged;
        }
        if(array.length % 2 == 0)
        {
            int [] temp1 = new int [middle];
            for(int i = 0; i < middle; i++)
            {
                temp1[i] = array[i];
            }
            int a = 0;
            int [] temp2 = new int [middle];
            for(int j = middle;j < array.length;j++)
            {
                temp2[a] = array[j];
                a++;
            }
            int [] left = Seperate(temp1);
            int [] right = Seperate(temp2);
            int [] merged = Merge(left,right);
            //System.out.println("JELLO");
            //PrintArray(merged);
            return merged;
        }
        int [] random = {-1};
        return random;
    }
    
    public static int [] Merge(int [] left, int [] right)
    {
        int l = 0;
        int r = 0;
        int s = 0;
        //PrintArray(left);
        //PrintArray(right);
        int size = left.length + right.length;
        int [] sorted = new int [size];
        while(s < sorted.length)
        {
            if(l < left.length && r < right.length)
            {
                if(left[l] > right[r])
                {
                    sorted[s] = right[r];
                    //System.out.println(right[r]);
                    //System.out.println(left[l]);
                    r++;
                    s++;
                }
                else
                {
                    sorted[s] = left[l];
                    l++;
                    s++;
                }
            }
            else if(l < left.length)
            {
                for(int i = l;i < left.length;i++)
                {
                    sorted[s] = left[i];
                    s++;
                }
            }
            else
            {
                for(int i = r;i < right.length;i++)
                {
                    sorted[s] = right[i];
                    s++;
                }
            }
        }
        //PrintArray(sorted);
        return sorted;
    }
}
