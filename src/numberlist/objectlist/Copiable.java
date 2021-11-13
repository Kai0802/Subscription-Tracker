package numberlist.objectlist;

/**
 * This interface represents a copy method to duplicate objects.
 *
 * @author Joyce Weng
 * @author Phuoc Nguyen
 * @author Samuel Kosasih
 *
 * @version 4.1
 */
public interface Copiable {

    /**
     * Copy method that creates a deep copy.
     *
     * @return the obj that is copied
     */
    Copiable copy();

}
