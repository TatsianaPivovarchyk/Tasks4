package Sort;
import Sort.Students;
import java.util.Comparator;

/**
 * Created by user on 10/30/2017.
 */
public class IDComparator implements Comparator<Students> {

    @Override
    public int compare(Students people1, Students people2) {
        return people1.getId() - people2.getId();
    }
}
