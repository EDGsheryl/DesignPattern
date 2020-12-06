package Bridge;

import java.util.Random;

public class RandomDisplay extends CountDisplay {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    void randomCountDisplay() {
        super.multiDisplay(new Random().nextInt() % 10 + 1);
    }
}
