package bridge;

public abstract class SystemVersion {
    protected VideoFile videoFile;

    public SystemVersion(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
