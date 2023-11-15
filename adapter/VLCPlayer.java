public class VLCPlayer implements AdvanceMediaPlayer {

    @Override
    public void playMP4(String fileName) {
        // do nothing
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file : " + fileName);
    }

}
