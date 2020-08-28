public class MyClass {
    public static void main(String args[]) {
        System.out.println(BinaryTranslator(1));
    }
    public static int BinaryTranslator(int x)
    {
        int a = x;
        int i = 0;
        int f = 0;
        while(a > 0)
        {
            int c = a % 10;
            a /= 10;
            if(c == 1)
            {
                f += (int)Math.pow(2,i);
            }
            i++;
        }
        return f;
    }
}
