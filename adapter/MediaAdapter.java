public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String fileType) {
        if (fileType.equals("mp4")) {
            advanceMediaPlayer = new MP4Player();
        } else if (fileType.equals("vlc")) {
            advanceMediaPlayer = new VLCPlayer();
        }
    }

    @Override
    public void play(String fileType, String fileName) {
        if (fileType.equals("mp4")) {
            advanceMediaPlayer.playMP4(fileName);
        } else if (fileType.equals("vlc")) {
            advanceMediaPlayer.playVlc(fileName);
        }
    }

}
