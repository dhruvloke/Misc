public class MyClass {
    public static void main(String args[]) {
        int [] array = FillArray(0,9);
        QS(array,0,array.length-1,0);
    }
    public static int [] FillArray(int x, int size)
    {
        int [] array = new int [size];
        if(x != 0)
        {
            for(int i = 0; i < size;i++)
            {
                array[i] = (int)(Math.random() * x);
            }
        }
        else
        {
            for(int i = 0; i < size;i++)
            {
                array[i] = (int)(Math.random() * 50);
            }
        }
        return array;
    }
    public static void PrintArray(int [] array,int start,int end)
    {
        //System.out.println("THE ARRAY SIZE IS " + array.length);
        for(int y = start; y <= end;y++)
        {
            System.out.print(array[y] + " ");
        }
        System.out.println();
        //System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
    }
    public static void QS(int [] array,int start,int end,int counter)
    {
        PrintArray(array,0,array.length-1);
        //System.out.println("THE STARTING INDEX IS " + start);
        //System.out.println("THE LAST INDEX IS " + end);
        //System.out.print("THE LINE IS ");
        //System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
        //PrintArray(array);
        if(end+1-start == 1)
        {
            counter++;
            return;
        }
        if(counter != 0)
        {
            return;
        }
        int pivot = (end+1-start)/2;
        pivot += start;
        //System.out.println("THE PIVOT INDEX IS " + pivot);
        //System.out.println("THE PIVOT IS " + array[pivot]);
        int a = 0;
        int LH;
        int RH;
        int l;
        int r;
        while(a < (end+1 -start)/2)
        {
            LH = -1;
            RH = -1;
            for(l = start; l < pivot;l++)
            {
                if(array[l] >= array[pivot])
                {
                    LH = l;
                    break;
                }
            }
            for(r = end;r > pivot;r--)
            {
                if(array[r] <= array[pivot])
                {
                    RH = r;
                    break;
                }
                
            }
            if(RH != -1 && LH != -1)
            {
                int temp = array[RH];
                array[RH] = array[LH];
                array[LH] = temp;
            }
            else if(RH != -1)
            {
                //System.out.println(array[RH]);
                int temp = array[pivot];
                array[pivot] = array[RH];
                array[RH] = temp;
                pivot = RH;
            }
            else if(LH != -1)
            {
                //System.out.println(array[LH]);
                int temp = array[pivot];
                array[pivot] = array[LH];
                array[LH] = temp;
                pivot = LH;
            }
            //PrintArray(array,start,end);
            a++;
        }
        if(pivot != start)
        {
        //System.out.println(counter);
        QS(array,start,pivot-1,counter);
        //System.out.println(array[pivot+1]);
        QS(array,pivot+1,end,counter);
        }
        if(pivot == start)
        {
            QS(array,1,end,counter);
        }
        if(pivot == end)
        {
            QS(array,start,end-1,counter);
        }
    }
}
