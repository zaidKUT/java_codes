package Coding;

interface Playable {
    void play();
    void stop();
}

class MP3Player implements Playable {
    @Override
    public void play() {
        System.out.println("MP3Player is playing music.");
    }

    @Override
    public void stop() {
        System.out.println("MP3Player stopped playing music.");
    }
}

class Radio implements Playable {
    @Override
    public void play() {
        System.out.println("Radio is playing.");
    }

    @Override
    public void stop() {
        System.out.println("Radio stopped playing.");
    }
}

public class MusicSystem {
    public static void main(String[] args) {
        Playable mp3 = new MP3Player();
        Playable radio = new Radio();
        System.out.println("Using MP3Player:");
        mp3.play();
        mp3.stop();
        System.out.println("\nUsing Radio:");
        radio.play();
        radio.stop();
    }
}
