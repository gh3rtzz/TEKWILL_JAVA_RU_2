package lecture_nr_16;

import java.util.Comparator;

public enum SecondPersonComparators {

    SORT_BY_NAME(Comparator.comparing((SecondPerson p) -> p.name)),
    SORT_BY_SURNAME(Comparator.comparing((SecondPerson p) -> p.surname)),
    SORT_BY_WEIGHT(Comparator.comparing((SecondPerson p) -> p.weight)),
    SORT_BY_HEIGHT(Comparator.comparing((SecondPerson p) -> p.height)),
    SORT_BY_AGE(Comparator.comparing((SecondPerson p) -> p.age));

    private final Comparator<SecondPerson> comparator;

    SecondPersonComparators(Comparator<SecondPerson> comparator) {
        this.comparator = comparator;
    }

    public Comparator<SecondPerson> getComparator() {
        return comparator;
    }
}
