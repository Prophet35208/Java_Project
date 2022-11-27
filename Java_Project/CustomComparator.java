import java.util.*;
public class CustomComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        return new Integer (o1.Get_Cost()).compareTo(new Integer(o2.Get_Cost()));
    }
}
