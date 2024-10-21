
import java.util.*;

public class Jukebox8{
    public static void main(String[] args) {
        new Jukebox8().go();
    }
    public void go(){
        List<SongV4> songList = MockSongs.getSongsV4();
        System.out.println("Song List: "+songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println("Song List [Title]: "+songList);
    
        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println("Song List [Artist]: "+songList);

        songList.sort((one, two) -> Integer.compare(one.getBpm(),two.getBpm()));
        System.out.println("Song List [BPM]: "+songList);

        Set<SongV4> songSet = new HashSet<>(songList);
        System.out.println("Song List [HashSet]: "+songSet);
    }
}
