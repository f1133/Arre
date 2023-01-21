@Document(collection = "messages")
public class Message {
    @Id
    private String id;
    private String groupId;
    private String senderId;
    private String message;
    private Date timestamp;
    private String type;
    private Map<String, Object> media;
    private Map<String, Object> location;
    private List<Map<String, Object>> replies;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getMedia() {
        return media;
    }

    public void setMedia(Map<String, Object> media) {
        this.media = media;
    }

    public Map<String, Object> getLocation() {
        return location;
    }

    public void setLocation(Map<String, Object> location) {
        this.location = location;
    }

    public List<Map<String, Object>> getReplies() {
        return replies;
    }

    public void setReplies(List<Map<String, Object>> replies) {
        this.replies = replies;
    }
}
