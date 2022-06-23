package handler;

public class ResourceNotFoundException extends Throwable {
    public ResourceNotFoundException(String s) {
        super("Not found:"+s);
    }
}
