package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> artists1 = new ArrayList<>();
        artists1.add(new MusicArtist("Freddie 'Immortal' Mercury", 77));
        artists1.add(new MusicArtist("John Deacon", 71));
        artists1.add(new MusicArtist("Roger Taylor", 73));
        artists1.add(new MusicArtist("Brian May", 75));

        MusicBand band1 = new MusicBand("Queen", 1970, artists1);

        List<MusicArtist> artists2 = new ArrayList<>();
        artists2.add(new MusicArtist("James Hetfield", 59));
        artists2.add(new MusicArtist("Lars Ulrich", 59));
        artists2.add(new MusicArtist("Kirk Hammett", 60));
        artists2.add(new MusicArtist("Roberto Trujillo", 58));

        MusicBand band2 = new MusicBand("Metallica", 1981, artists2);

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();




    }
}
