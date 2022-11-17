package state;

/**
 * Concrete states provide the special implementation for all interface methods.
 */
public class LockState extends State{


    public LockState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onLock() {
        if (player.isPlaying()){
            player.changeState(new ReadyState(player));
            return "Stop playing";
        }
        return "Locked ..";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Ready";
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
