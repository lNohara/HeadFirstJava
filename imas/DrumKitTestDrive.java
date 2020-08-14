public class DrumKitTestDrive{

    public static void main (String [] args){

        Drumkit d = new Drumkit ();

        d.playeSnare();
        d.playTopHat();

        d.snare = false;
        if(d.snare == true){
            d.playeSnare();
        }
    }
}
