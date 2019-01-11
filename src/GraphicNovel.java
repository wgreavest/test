
public class GraphicNovel {
  String title;
  String author;
  String artist;
  int year;
  double cost;
  boolean monochrome;

  GraphicNovel(String title, String author, String artist, int year, double cost,
      boolean monochrome) {
    this.title = title;
    this.author = author;
    this.artist = artist;
    this.year = year;
    this.cost = cost;
    this.monochrome = monochrome;
  }

}

class ExamplesGraphicNovel {
  GraphicNovel ExampleOne = new GraphicNovel("maus", "spiegleman", "spiegleman", 1980, 17.60, true);
  GraphicNovel ExampleTwo = new GraphicNovel("logicomix", "doxiadis", "papadatos", 2009, 21.00,
      false);
  GraphicNovel ExampleThree = new GraphicNovel("Watchmen", "Moore", "Gibbons", 2013, 24.98, false);
}
