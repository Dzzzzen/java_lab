package zamestitel;

import java.util.Map;

public interface YouTubeApiClient {
    Map<String, Video> popularVideos();

    Video getVideo(String videoId);
}
