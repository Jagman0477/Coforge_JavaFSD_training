//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char[] board = {'1','2','3','4','5','6','7','8','9'};
//        printGround(board);
//        String p1 = "", p2 = "";
//        int count = 0;
//        int lolCount2 = 0;
//
//        while(true){
//            System.out.println("What value does player one want: X or O: ");
//            p1 = sc.nextLine().toUpperCase();
//            if(p1.equals("X")) p2 = "O";
//            else p2 = "X";
//
//            while(!checker(board, count)){
//                count = fullFunc(p1, board, count, sc);
//                System.out.println(count);
//                if(checker(board, count)){
//                    if(count == 9) System.out.println("Well that's a draw :(");
//                    else System.out.println("Congratulations! Player One("+p1+") you won.");
//                    return;
//                }
//                count = fullFunc(p2, board, count, sc);
//                System.out.println(count);
//                if(checker(board, count)){
//                    if(count == 9) System.out.println("Well that's a draw :(");
//                    else System.out.println("Congratulations! Player One("+p2+") you won.");
//                    return;
//                }
//            }
//        }
//    }
//
//    public static int fullFunc(String user, char[] board, int count, Scanner sc){
//        System.out.println("Player One enter position for "+user+": ");
//        int pos = sc.nextInt();
//        if(!insertVal(pos, user, board)){
//            fullFunc(user, board, count, sc);
//        }
//        count++;
//        printGround(board);
//        return count;
//    }
//
//    public static boolean insertVal(int pos, String sign, char[] board){
//        if(board[pos-1] == 'X' || board[pos-1] == 'O'){
//            System.out.println("Invalid Postion");
//            return false;
//        }
//        board[pos-1] = sign.charAt(0);
//        return true;
//    }
//
//    public static void printGround(char[] board){
//        System.out.println("|     |     |     |");
//        System.out.println("|  "+board[0]+"  |  "+board[1]+"  |  "+board[2]+"  |");
//        System.out.println("|-----|-----|-----|");
//        System.out.println("|  "+board[3]+"  |  "+board[4]+"  |  "+board[5]+"  |");
//        System.out.println("|-----|-----|-----|");
//        System.out.println("|  "+board[6]+"  |  "+board[7]+"  |  "+board[8]+"  |");
//        System.out.println("|     |     |     |");
//    }
//
//    public static boolean checker(char[] board, int count){
//        if((board[0] == board[1]) && (board[1] == board[2])){
//            return true;
//        }
//        if((board[3] == board[4]) && (board[4] == board[5])){
//            return true;
//        }
//        if((board[6] == board[7]) && (board[7] == board[8])){
//            return true;
//        }
//        if((board[0] == board[3]) && (board[3] == board[6])){
//            return true;
//        }
//        if((board[1] == board[4]) && (board[4] == board[7])){
//            return true;
//        }
//        if((board[2] == board[5]) && (board[5] == board[8])){
//            return true;
//        }
//        if((board[0] == board[4]) && (board[4] == board[8])){
//            return true;
//        }
//        if((board[2] == board[4]) && (board[4] == board[6])){
//            return true;
//        }
//        if(count == 9)
//            return true;
//        return false;
//    }
//}