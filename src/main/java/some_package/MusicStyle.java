package some_package;

public enum MusicStyle {
    CLASSICAL,
    ROCK;

    MusicPlayer(Music music){
      return music.getSong();
    }
}
