import java.util.ArrayList;
import java.util.List;

public class Additions {
    private List<Addition> additions;

    public Additions() {
        additions = new ArrayList<>();
        additions.add(new Addition("Mayonnaise", 10.0));
        additions.add(new Addition("Tomato", 5.0));
        additions.add(new Addition("Cheese", 15.0));
    }

    public List<Addition> getAdditions() {
        return additions;
    }

    public Addition getAddition(int index) {
        return additions.get(index);
    }
}
