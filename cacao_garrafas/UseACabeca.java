public class UseACabeca{
    public static void main (String [] args){
        int beerNum = 5;
        String word = "bootles";

        while (beerNum > 0){
            if(beerNum == 1){
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down");
            System.out.println("Pass it around.");
            beerNum = beerNum -1;
            if(beerNum==0){
                System.out.println("No more bootles of beer");
            }
        }
    }
}