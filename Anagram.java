import java.util.ArrayList;
public class MyClass {
    public static void main(String args[]) {
        String h1 = "abcdefghijklm";
        String h2 = "nopqrstuvwxyz";
        ArrayList<String>x = new ArrayList<String>();
        x.add(h1);
        x.add(h2);
        System.out.println(Anagram(x));
    }
    public static String Anagram(ArrayList<String>S)
    {
        ArrayList<String>Letters = new ArrayList<String>();
        for(int i = 0; i < S.size();i++)
        {
            String t = S.get(i);
            for(int j = 0; j < t.length();j++)
            {
                char w = t.charAt(j);
                String v = Character.toString(w);
                Letters.add(v);
            }
        }
        for(int c = 0; c < Letters.size();c++)
        {
            //System.out.println(Letters.get(c));
        }
        String ana = "";
        int l = Letters.size();
        for(int k = 0; k < l;k++)
        {
            int size = Letters.size();
            int pos  = (int)(Math.random() * size);
            String temp = Letters.get(pos);
            ana += temp;
            //System.out.println(ana);
            Letters.remove(pos);
        }
        return ana;
    }
}