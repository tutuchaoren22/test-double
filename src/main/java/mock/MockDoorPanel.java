package mock;

public class MockDoorPanel extends  DoorPanel {
    private boolean hasCalled = false;

    public boolean isHasCalled() {
        return hasCalled;
    }

    void close() {
        hasCalled = true;
    }
}
