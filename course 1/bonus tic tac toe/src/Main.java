public class Main {
    public static void main(String[] args) {
        TicTacToe dooz=new TicTacToe();
        dooz.tableCreator();
        while(true){
            dooz.scanner('O');
            dooz.winningChecker('O');
            if(dooz.win)break;
            dooz.scanner('X');
            dooz.winningChecker('X');
            if(dooz.win)break;
        }

    }
}
