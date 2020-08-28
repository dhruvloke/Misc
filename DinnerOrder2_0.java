public class MyClass {
    public static void main(String args[]) {
        int [] array = {1,4,2,4,5,2,3,3};
        int n = 8;
        int d = 2;
        int s = 2;
        System.out.println(CDO(array,n,d,s));
    }
    public static String CDO(int [] array ,int n, int d,int s)
    {
        int avg = 0;
        for(int i = 0; i < n;i++)
        {
            avg += array[i];
        }
        avg /= n;
        int checkd = -1000;
        for(int x = 0;x<= d;x++)
        {
            if(x == avg)
            {
                checkd = array[x];
                break;
            }
            int comp1 = Math.abs(avg-checkd);
            if(Math.abs(comp1) > Math.abs(avg - array[x]))
            {
                checkd = array[x];
            }
        }
        int checks = -1000;
        for(int x = d;x <= s;x++)
        {
            if(array[x] == avg)
            {
                checks = array[x];
                break;
            }
            int comp1 = Math.abs(avg-checks);
            if(Math.abs(comp1) > Math.abs(avg - array[x]))
            {
                checks = array[x];
            }
        }
        return "THE AVERAGE OF ALL ITEMS IS " + avg + ", THE CLOSEST DRINK COSTS " + checkd + ", AND THE CLOSEST SANDWHICH IS " + checks;
    }
}
