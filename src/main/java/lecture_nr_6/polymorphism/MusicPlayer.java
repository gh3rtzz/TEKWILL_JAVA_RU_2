package lecture_nr_6.polymorphism;

public class MusicPlayer {

    public static void main(String[] args) {

        MusicPlayer mp = new MusicPlayer();

        mp.play("Beatles", "Nirvana");
    }

    public void play(){
        System.out.println("Playing default music!");
    }

    public void play(String music){
        System.out.println("Playing music: " + music);
    }

    public void play(String firstTrack, String secondTrack){
        System.out.println("First playing: " + firstTrack + " after that, playing: " + secondTrack);
    }
}
