import java.util.NoSuchElementException;

public class NoSuchCountryException extends NoSuchElementException {

    public NoSuchCountryException(final String oName, final String mName) {
        super("Название страны '" + oName + "', переданное на вход методу '" + mName + "', не найдено");
    }
}