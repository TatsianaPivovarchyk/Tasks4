package Sort;
import Sort.Students;
import Sort.Main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Application {

    public static void SortById(List<Students> peoples) {
        Collections.sort(peoples, new Comparator<Students>() {
            public int compare(Students o1, Students o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });
    }

    public int averageAge(List<Students> peoples) {
        int averageAge = 0;
        int allAge = 0;
        for (Students people : peoples) {
            allAge += people.getAge();
            averageAge = allAge / peoples.size();
        }

        return averageAge;
    }

}

