package legoset;

import jaxb.JAXBHelper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        legoset legoset = new legoset();

        legoset.setName("Imperial TIE fighter");
        legoset.setTheme("STar Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        legoset.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));
        legoset.setNumber(75211);

        Weight weight = new Weight();
        weight.setUnit("kg");
        weight.setValue(0.89);
        legoset.setWeight(weight);


        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig("Imperial Mudtrooper", 2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Mimban Stormtrooper", 1));
        legoset.setMinifigs(minifigs);


        JAXBHelper.toXML(legoset, System.out);

       // JAXBHelper.toXML(legoset, new FileOutputStream("legoset.xml"));
        // System.out.println(JAXBHelper.fromXML(legoset.class, new FileInputStream("legoset.xml")));
    }

}