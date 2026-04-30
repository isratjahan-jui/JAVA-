
import java.util.List;

public interface NewInterface<E> {

    void saveProduct(E e);

    void updateProduct(E e);

    List<E> showAll();

    E findProdeuctById(int id);

    void deleteProduct(int id);
}
