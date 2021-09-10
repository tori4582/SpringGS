package src.haru.boundary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
    @Service:
        Annotate a class that is a Spring Bean.
        A Spring Bean will be contained in Spring IoC Container
        Equivalents: @Component, @Repository
*/
@Service
public class LanguageService {
    
    /*
        @Autowired:
            Annotate a field that will be injected (or assigned) value into it 
            by Spring
     */
    @Autowired
    private Language language;

    public LanguageService() {
        // TODO Auto-generated constructor stub
    }

    public void getNation() {
        System.out.println(this.language.getNation());        
    }

}
