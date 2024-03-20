//Design a MediaPlayer interface with methods play(), pause(), and stop(). 
//Implement this interface in classes like AudioPlayer and VideoPlayer.

interface MediaPlayer {
    void play();

    void pause();

    void stop();
}

class MusicPlayer implements MediaPlayer {
    private String musicFileName;

    public MusicPlayer(String musicFileName) {
        this.musicFileName = musicFileName;
    }

    @Override
    public void play() {
        System.out.println("Playing music: " + musicFileName);
    }

    @Override
    public void pause() {
        System.out.println("Pausing music playback");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music playback");
    }
}

class MoviePlayer implements MediaPlayer {
    private String movieFileName;

    public MoviePlayer(String movieFileName) {
        this.movieFileName = movieFileName;
    }

    @Override
    public void play() {
        System.out.println("Playing movie: " + movieFileName);
    }

    @Override
    public void pause() {
        System.out.println("Pausing movie playback");
    }

    @Override
    public void stop() {
        System.out.println("Stopping movie playback");
    }
}

public class MediaMain {
    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer("song.mp3");
        MoviePlayer moviePlayer = new MoviePlayer("movie.mp4");

        musicPlayer.play();
        musicPlayer.pause();
        musicPlayer.stop();

        moviePlayer.play();
        moviePlayer.pause();
        moviePlayer.stop();
    }
}
