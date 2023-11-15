public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String fileType, String fileName) {
        if (fileType.equals("mp3")) {
            System.out.println("Playing MP3 file " + fileName);
        } else if (fileType.equals("mp4") || fileType.equals("vlc")) {
            mediaAdapter = new MediaAdapter(fileType);
            mediaAdapter.play(fileType, fileName);
        }
    }
}
