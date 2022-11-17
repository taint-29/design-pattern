package adapter;

public class Captain {

    RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    void row(){
        rowingBoat.row();
    }

}
