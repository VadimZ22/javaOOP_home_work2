package Home_Work2;

public class Closet {
    int length;
    int width;
    int height;
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Closet() {
        this.state = State.Close;
    }
    enum State {
        Open, Close
    }
}
