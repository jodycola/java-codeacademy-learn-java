import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Fly Away");
    desertIslandPlaylist.add("Are You That Somebody");
    desertIslandPlaylist.add("Party Monster");
    desertIslandPlaylist.add("Obsessed With You");
    desertIslandPlaylist.add("Right On");
    desertIslandPlaylist.remove(2);


    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    String songA = "Fly Away";
    int indexA = desertIslandPlaylist.indexOf("Fly Away");
    String songB = "Obsessed With You";
    int indexB = desertIslandPlaylist.indexOf("Obsessed With You");

    desertIslandPlaylist.set(indexA, songB);
    desertIslandPlaylist.add(indexB, songA);

    System.out.println(desertIslandPlaylist);

  }
  
}