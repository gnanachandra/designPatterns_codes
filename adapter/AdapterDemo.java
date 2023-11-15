public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer obj = new AudioPlayer();
        obj.play("mp3","File1.mp3");
        obj.play("mp4","File3.mp4");
        obj.play("vlc","File1.vlc");
    }
}
