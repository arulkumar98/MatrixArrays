import java.util.Scanner;
class pattern {
            public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the Pattern :");
                String str = input.next();
                int length = str.length();
                if((length % 2 ) != 0){

                    for(int row = 0; row < length; row++){
                        for(int col = 0; col < length; col++){
                            if(row == col){
                                System.out.print(str.charAt(row));
                            } else if((row + col) == (length -1)){
                                System.out.print(str.charAt(col));
                            } else System.out.print(" ");
                        }
                        System.out.println();
                    }
                }
                else System.out.print("*");
            }
        }
    




