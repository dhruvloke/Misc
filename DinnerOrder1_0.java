public class MyClass {
    public static void main(String args[]) {
    int [] n ={1,2,3,4,5};
    int [] d = {2};
    int [] s = {1,4,7,10};
    System.out.println(DO(n,d,s));
    }
    public static String DO(int [] n, int [] d, int [] s)
    {
        int avg = 0;
        String a = "";
        String b = "";
        for(int i = 0;i < n.length;i++)
        {
            avg += n[i];
        }
        avg /= n.length;
        int checkd = d[0];
        for(int x = 1;x< d.length;x++)
        {
            if(d[x] == avg)
            {
                checkd = d[x];
                break;
            }
            int comp1 = Math.abs(avg-checkd);
            if(Math.abs(avg - checkd) > Math.abs(avg - d[x]))
            {
                checkd = d[x];
            }
        }
        int checks = s[0];
        for(int y = 1; y < s.length;y++)
        {
            if(s[y] == avg)
            {
                checks = s[y];
                break;
            }
            int comp1 = Math.abs(avg - checks);
            if(Math.abs(avg - checks) > Math.abs(avg - s[y]))
            {
                checks = s[y];
            }
        }
        return "THE AVERAGE OF ALL ITEMS IS " + avg + ", THE CLOSEST DRINK COSTS " + checkd + ", AND THE CLOSEST SANDWHICH IS " + checks;
    }
}
