import java.util.ArrayList;
public class MyClass {
    private static ArrayList<String>Words;
    public static void main(String args[]) {
        char [][] matrix = new char [3][3];
        matrix[0][0] = 'o';
        matrix[0][1] = 'i';
        matrix[0][2] = 'x';
        matrix[1][0] = 'o';
        matrix[1][1] = 'n';
        matrix[1][2] = 'o';
        matrix[2][0] = 'i';
        matrix[2][1] = 'z';
        matrix[2][2] = 'i';
        Boggle16(matrix,3);
    }
    public static void Boggle16(char [][] boggle, int n)
    {
        Words = new ArrayList<String>();
        for(int a = 0;a < boggle.length;a++)
        {
            for(int b = 0; b < boggle.length;b++)
            {
                System.out.print(boggle[a][b]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int r = 0; r < boggle.length;r++)
        {
            for(int c =0; c < boggle[r].length;c++)
            {
                System.out.println("THE LETTER IN POSITION " + r + ", " + c + " IS " + boggle[r][c]);
                String word = Character.toString(boggle[r][c]);
                CheckRight(boggle,r,c,word,n);
                //System.out.println(word);
                CheckLeft(boggle,r,c,word,n);
                CheckTop(boggle,r,c,word,n);
                CheckBottom(boggle,r,c,word,n);
                CheckDiagnal1(boggle,r,c,word,n);
                CheckDiagnal2(boggle,r,c,word,n);
                CheckDiagnal3(boggle,r,c,word,n);
                CheckDiagnal4(boggle,r,c,word,n);
                if(word.length() > 3)
                {
                    //System.out.println(word);
                    Words.add(word);
                    word = word.substring(0,word.length()-1);
                }
                if(word.length() == 3)
                {
                    Words.add(word);
                }
            }
        }
        //System.out.println(Words);
    }
    public static void CheckRight(char [][] matrix,int r,int c, String word,int n)
    {
        if(c < n-1)
        {
            System.out.println(word + " BEFORE CHECK " + matrix[r][c+1]);
            if(matrix[r][c+1] > matrix[r][c])
            {
                //System.out.println(word + " BEFORE NEW LETTER");
                String temp = Character.toString(matrix[r][c+1]);
                word += temp;
                System.out.println(word);
                c++;
                CheckRight(matrix,r,c,word,n);
            }
        }
        return;
    }
    public static void CheckLeft(char [][] matrix,int r,int c, String word,int n)
    {
        if(c > 0)
        {
            System.out.println(word + " BEFORE CHECK " + matrix[r][c-1]);
            if(matrix[r][c-1] > matrix[r][c])
            {
                //System.out.println(word + " BEFORE NEW LETTER");
                String temp = Character.toString(matrix[r][c-1]);
                word += temp;
                System.out.println(word);
                c--;
                CheckLeft(matrix,r,c,word,n);
            }
        }
        return;
    }
    public static void CheckTop(char [][] matrix,int r,int c, String word,int n)
    {
        if(r > 0)
        {
            System.out.println(word + " BEFORE CHECK " + matrix[r-1][c]);
            if(matrix[r-1][c] > matrix[r][c])
            {
                
                //System.out.println(word + " BEFORE NEW LETTER");
                String temp = Character.toString(matrix[r-1][c]);
                word +=temp;
                System.out.println(word);
                r--;
                CheckTop(matrix,r,c,word,n);
            }
        }
        return;
    }
    public static void CheckBottom(char [][] matrix,int r,int c, String word,int n)
    {
        if(r < n-1)
        {
            System.out.println(word + " BEFORE CHECK " + matrix[r+1][c]);
            if(matrix[r+1][c] > matrix[r][c])
            {
                //System.out.println(word + " BEFORE NEW LETTER");
                String temp = Character.toString(matrix[r+1][c]);
                word += temp;
                System.out.println(word);
                r++;
                CheckBottom(matrix,r,c,word,n);
            }
        }
        return;
    }
    public static void CheckDiagnal1(char [][] matrix,int r,int c, String word,int n)
    {
        if(r < n-1 && c < n-1)
        {
            System.out.println(word + " BEFORE CHECK " + matrix[r+1][c+1]);
            if(matrix[r+1][c+1] > matrix[r][c])
            {
                //System.out.println(word + " BEFORE NEW LETTER");
                String temp = Character.toString(matrix[r+1][c+1]);
                word += temp;
                System.out.println(word);
                r++;
                c++;
                CheckDiagnal1(matrix,r,c,word,n);
            }
        }
        return;
    }
    public static void CheckDiagnal2(char [][] matrix,int r,int c, String word,int n)
    {
        if(r < n-1 && c > 0)
        {
            //System.out.println(word + " BEFORE CHECK " + matrix[r+1][c-1]);
            if(matrix[r+1][c-1] > matrix[r][c])
            {
                //System.out.println(word + " BEFORE NEW LETTER");
                String temp = Character.toString(matrix[r+1][c-1]);
                word += temp;
                System.out.println(word);
                r++;
                c--;
                CheckDiagnal2(matrix,r,c,word,n);
            }
        }
        return;
    }
    public static void CheckDiagnal3(char [][] matrix,int r,int c, String word ,int n)
    {
        if(r > 0 && c < n-1)
        {
            System.out.println(word + " BEFORE CHECK " + matrix[r-1][c+1]);
            if(matrix[r-1][c+1] > matrix[r][c])
            {
                //System.out.println(word + " BEFORE NEW LETTER");
                String temp = Character.toString(matrix[r-1][c+1]);
                word += temp;
                System.out.println(word);
                r--;
                c++;
                CheckDiagnal3(matrix,r,c,word,n);
            }
        }
        return;
    }
    public static void CheckDiagnal4(char [][] matrix,int r,int c, String word,int n)
    {
        if(r > 0 && c > 0)
        {
            System.out.println(word + " BEFORE CHECK " + matrix[r-1][c-1]);
            if(matrix[r-1][c-1] > matrix[r][c])
            {
                //System.out.println(word + " BEFORE NEW LETTER");
                String temp = Character.toString(matrix[r-1][c-1]);
                word += temp;
                System.out.println(word);
                r--;
                c--;
                CheckDiagnal4(matrix,r,c,word,n);
            }
        }
        return;
    }
}

/*checkPosition (a, b) {
    if (!isValidIndex (a,b) { return ''; }
    checkPosition (a, b+1);
    checkPosition (a, b-1);
    checkPosition (a-1, b);
    checkPosition (a-1, b+1);
    checkPosition (a+1, b);
    checkPosition (a+1, b+1);
    checkPosition (a-1, b);
    checkPosition (a-1, b-1);
}
*/


