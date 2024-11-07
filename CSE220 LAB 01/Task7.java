// Task 07: Game Arena
class Task7{

    //Complete this method so that it gives the Expected Output
    public static void playGame( Integer[][] arena ){

        //For this task you don't need to create any new 2D array
        //just print the result inside the function
        
        //TO DO
        int count = 0;
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena[i].length; j++) {
                if (arena[i][j] % 50 == 0) {
                    if (arena[i][j]!=0){
                        count++;
                    }
                }
            }
        }
        int[] x_cord = new int[count*4];
        int[] y_cord = new int[count*4];
        count = 0;
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena[i].length; j++) {
                if (arena[i][j] % 50 == 0) {
                    if (arena[i][j]!=0){
                        x_cord[count] = i-1;
                        y_cord[count] = j;
                        x_cord[count+1] = i;
                        y_cord[count+1] = j-1;
                        x_cord[count+2] = i;
                        y_cord[count+2] = j+1;
                        x_cord[count+3] = i+1;
                        y_cord[count+3] = j;
                        count+=4;
                    }
                }
            }
        }
        int sum = 0 ;
        for (int i = 0; i < x_cord.length; i++) {
            if (x_cord[i] >=0 && x_cord[i] < arena.length){
                if (y_cord[i] >=0 && y_cord[i] < arena[0].length){
                    if (arena[x_cord[i]][y_cord[i]] == 2){
                        sum += arena[x_cord[i]][y_cord[i]];
                    }

                }
            }
        }
        if (sum < 10 ){
            System.out.println("Points Gained: "+sum+". Your team is out.");
        }
        else {
            System.out.println("Points Gained: "+sum+". Your team has survived the game.");
        }
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}