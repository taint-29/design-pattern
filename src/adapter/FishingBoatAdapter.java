package adapter;

// adapter class. implement interface expect from client.
public class FishingBoatAdapter implements RowingBoat{

    private final FishingBoat fishingBoat = new FishingBoat();

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
