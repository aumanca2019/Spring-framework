package dog.demo.dog.demo.service;

public class DogNotFoundException extends RuntimeException {
    public DogNotFoundException(String s) {
        super("eroare");
    }
}
