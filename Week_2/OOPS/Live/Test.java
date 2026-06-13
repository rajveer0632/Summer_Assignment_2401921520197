package Week_2.OOPS.Live;


import Week_2.OOPS.Music.Playable;
import Week_2.OOPS.Music.String.Veena;
import Week_2.OOPS.Music.Wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena v = new Veena();
        v.play();
        
        Saxophone s = new Saxophone();
        s.play();
        
        Playable pv = new Veena();
        pv.play();
        
        Playable ps = new Saxophone();
        ps.play();
    }
}
