import java.util.*;

public class MockSongs {
    public static List<String> getSongString(){
        return new ArrayList<>(List.of(
            "somersault",
            "cassidy",
            "$10",
            "havana",
            "Cassidy",
            "50 Ways"
        ));
    }

    public static List<SongV4> getSongsV4(){
        return new ArrayList<>(List.of(
            new SongV4("somersault", "zero 7", 147),
            new SongV4("cassidy", "grateful dead", 158),
            new SongV4("$10", "hitchhiker", 140),
            new SongV4("havana", "cabello", 105),
            new SongV4("Cassidy", "grateful dead", 158),
            new SongV4("50 Ways", "simon", 102)
        ));
    }
}
