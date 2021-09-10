package src.haru.boundary;

public class French implements Language {

    @Override
    public String getLanguage() {
        return this.getClass().getName();
    }

    @Override
    public String getNation() {
        return "France";
    }
    
}
