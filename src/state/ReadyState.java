package state;

public class ReadyState extends State{

    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.setState(new LockState(player));
        return "Locked ..";
    }

    @Override
    public String onPlay() {
        String action = player.startPlayback();
        player.changeState(new PlayingState(player));
        return action;
    }

    @Override
    public String onNext() {
        return "Locked ..";
    }

    @Override
    public String onPrevious() {
        return "Locked ..";
    }
}
