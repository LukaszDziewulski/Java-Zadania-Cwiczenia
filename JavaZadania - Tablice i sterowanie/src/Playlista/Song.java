package Playlista;

public class Song {
    private String name;
    private int length;

    public Song(String name, int time) {
        this.name = name;
        this.length = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
