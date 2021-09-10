package src.haru.boundary;

public class English implements Language {

    @Override
    public String getLanguage() {
        return this.getClass().getName();
    }

    @Override
    public String getNation() {
        return "United States";
    }
    
}
