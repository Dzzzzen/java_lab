package zamestitel;

import java.util.HashMap;
import java.util.Map;

public class Zamestitel {
    public static void main(String[] args) {
        exec();
    }

    public static void exec() {
        YouTubeVideoDownloader nativeDownloader = new YouTubeVideoDownloader(new ThirdPartyYouTubeApiClient());
        YouTubeVideoDownloader smartDownloader = new YouTubeVideoDownloader(new CacheProxyYouTubeApiClient());

        call(nativeDownloader);
        call(smartDownloader);
    }

    private static void call(YouTubeVideoDownloader downloader) {
        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("video1");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("video2");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("video1");
        downloader.renderVideoPage("video3");
    }

}

