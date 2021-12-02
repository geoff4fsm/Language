import java.util.ArrayList;

public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }
    public void getInfo() {

        System.out.println( this.name + " is spoken by " + this.numSpeakers + " mainly in " + this.regionsSpoken);
        System.out.println( this.name + " follows the word order: " + this.wordOrder);
        System.out.println("-----------------------------------------------------------------------------");
    }
    public static void main (String[] args ) {
        Language spanish = new Language("Spanish", 555000000, "Spain and Latin America",
                "subject-verb-object");
        spanish.getInfo();

        Language akatek = new Mayan ("Akatek", 45000);
        akatek.getInfo();

        Language mandarin = new SinoTibetan("Mandarin Chinese", 1000000000);
        mandarin.getInfo();

        Language burmese = new SinoTibetan("Burmese", 50000000);
        burmese.getInfo();

        ArrayList<Language> languages = new ArrayList<Language>();

        languages.add(new Language("Spanish", 555000000, "Spain and Latin America", "subject-verb-object"));
        languages.add(new Mayan ("Akatek", 45000));
        languages.add(new SinoTibetan("Mandarin Chinese", 1000000000));
        languages.add(new SinoTibetan("Burmese", 50000000));

        for (Language language : languages) {
            System.out.println( language.name + " is spoken by " + language.numSpeakers + " mainly in " + language.regionsSpoken);
            System.out.println( language.name + " follows the word order: " + language.wordOrder);
            System.out.println("***************************************************************************");
        }
    }
}
