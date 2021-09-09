package src.haru.harurest;

/*
    Work as a Data model for attaching into request under JSON format automatically
    by Spring's MappingJackson2HttpMessageConverter class.
*/
public class HaruService {
    
    private final long id;
    private final String content;

    public HaruService(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content; 
    }

}
