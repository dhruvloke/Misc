public class MyClass {
    public static void main(String args[]) {
        System.out.println(ClockAngles(100000,120000));
    }
    public static int ClockAngles(int start, int end)
    {
        int CA = 0;
        int HS = GetHour(start);
        int HE = GetHour(end);
        int MS = GetMin(start);
        int ME = GetMin(end);
        int SS = GetSec(start);
        int SE = GetSec(end);
        int HD = HE-HS;
        int MD = ME-MS;
        int SD = SE-SS;
        if(HD > 0)
        {
            MD += HD * 60;
            SD += HD * 3600;
        }
        CA += HD * 30;
        CA += MD * 6;
        CA += SD * 6;
        return CA;
    }
    public static int GetHour(int x)
    {
        int a = 0;
        int copy = x;
        while(a < 4)
        {
            copy /= 10;
            a++;
        }
        return copy;
    }
    public static int GetMin(int x)
    {
        int a = 0;
        int copy = x;
        while(a < 2)
        {
            copy /= 10;
            a++;
        }
        int copy2 = Integer.parseInt(Integer.toString(copy).substring(2));
        return copy2;
    }
    public static int GetSec(int x)
    {
        int a = x;
        int copy = Integer.parseInt(Integer.toString(a).substring(4));
        return copy;
    }
}
