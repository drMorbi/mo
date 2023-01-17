package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand musicBand1 = new MusicBand("Queen",1970);
        MusicBand musicBand2 = new MusicBand("Abyssphere",2005);
        MusicBand musicBand3 = new MusicBand("The Doors",1965);
        MusicBand musicBand4 = new MusicBand("Rammstein", 1994);
        MusicBand musicBand5 = new MusicBand("Сруб",2013);
        MusicBand musicBand6 = new MusicBand("Kauan",2005);
        MusicBand musicBand7 = new MusicBand("Wardruna",2003);
        MusicBand musicBand8 = new MusicBand("Metallica",1981);
        MusicBand musicBand9 = new MusicBand("The Heaters",2016);
        MusicBand musicBand10 = new MusicBand("Saturnus",1991);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(musicBand1);
        bands.add(musicBand2);
        bands.add(musicBand3);
        bands.add(musicBand4);
        bands.add(musicBand5);
        bands.add(musicBand6);
        bands.add(musicBand7);
        bands.add(musicBand8);
        bands.add(musicBand9);
        bands.add(musicBand10);

        Collections.shuffle(bands);
        System.out.print(bands);
        System.out.println("");
        System.out.println("");

        System.out.println(groupsAfter2000(bands));



    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band: bands){
            if (band.getYear() > 2000)
                bandsAfter2000.add(band);
        }return bandsAfter2000;
    }
}
