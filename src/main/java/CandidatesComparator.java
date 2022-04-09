import java.util.Comparator;

public class CandidatesComparator implements Comparator<Candidate> {

    @Override
    public int compare(Candidate o1, Candidate o2) {

        if (o1.fio.compareTo(o2.fio) != 0) {
            if (o1.relevanceOfResume < o2.relevanceOfResume) {
                return -1;
            } else if (o1.relevanceOfResume > o2.relevanceOfResume) {
                return 1;
            } else if (o1.relevanceOfResume == o2.relevanceOfResume) {
                return o1.rating.compareTo(o2.rating);
            }
            return o1.fio.compareTo(o2.fio);
        }
        return 0;
    }
}
