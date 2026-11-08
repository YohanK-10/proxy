import java.util.List;
import java.util.Map;

public class CachedResponse {
    private final int status;
    private final Map<String, List<String>> headers;
    private final byte[] body;
    public CachedResponse(int statusCode, Map<String, List<String>> headers, byte[] body) {
        this.status = statusCode;
        this.headers = headers;
        this.body = body;
    }
}
