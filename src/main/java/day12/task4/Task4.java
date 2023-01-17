package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>();
        members1.add("Freddie Mercury");
        members1.add("John Deacon");
        members1.add("Roger Taylor");
        members1.add("Brian May");

        MusicBand band1 = new MusicBand("Queen", 1970, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("James Hetfield");
        members2.add("Lars Ulrich");
        members2.add("Kirk Hammett");
        members2.add("Roberto Trujillo");

        MusicBand band2 = new MusicBand("Metallica", 1981, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();




    }
}
