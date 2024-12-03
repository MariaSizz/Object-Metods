public class Main {
    public static void main(String[] args) {
        Author Tolle = new Author("Eckhart", "Tolle");
        Author Carroll = new Author("Lee", "Carroll");

        Book ANewEarth = new Book("A New Earth", Tolle, 2005);
        Book TheJourneyHome = new Book("The Journey Home", Carroll, 1996);

        TheJourneyHome.setYearOfPublication(1997);

        System.out.println(ANewEarth.toString() + " написана автором " + Tolle.toString());
        System.out.println(TheJourneyHome.toString() + " написана автором " + Carroll.toString());
    }

}