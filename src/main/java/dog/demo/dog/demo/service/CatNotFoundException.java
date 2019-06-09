package dog.demo.dog.demo.service;

public class CatNotFoundException extends RuntimeException {
    public CatNotFoundException(String message) {
        super("Eroare");
    }
}
