
import java.util.Scanner;

public class TicTacToe {
    boolean win;
    char a[][]= new char[3][3];
    int i,j;
    public void tableCreator(){
        for (i=0;i<3;i++)
            for (j=0;j<3;j++)
                a[i][j]='*';
    }

    public void scanner(char c){
        System.out.println("please enter player "+c);
        Scanner input=new Scanner(System.in);
        double temp=input.nextInt();
        i=(int)Math.ceil(temp/3)-1;
        j=(int)temp%3-1;
        if(j==-1)j=2;

        if(temp>9||temp<1) scanner(c);

        else if(a[i][j]!='*') scanner(c);

        else{
            a[i][j]=c;
            for (i=0;i<3;i++){
                for (j=0;j<3;j++)
                    System.out.print(a[i][j]);
                System.out.println();
            }
        }
    }
    public void winningChecker(char c){
        win=false;
        if((a[0][0]&a[1][1]&a[2][2])==c) win=true;
        else if ((a[0][2]&a[1][1]&a[2][0])==c)win=true;
        for(i=0;i<3;i++)
            if((a[i][0]&a[i][1]&a[i][2])==c)
                win=true;

        for(i=0;j<3;j++)
            if((a[0][j]&a[1][j]&a[2][j])==c)
                win=true;
        if (win)
            System.out.println("player "+c+"won");

    }}


