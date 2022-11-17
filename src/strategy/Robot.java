package strategy;

public class Robot {
    private Behaviour behaviour;
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public Behaviour getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void move(){
        System.out.println(
                this.name + ": Dựa trên hoàn cảnh hiện tại," +
                        " chiến thuật tiếp theo sẽ là:"
        );

        behaviour.moveCommand();

        System.out.println("\tDành cho robot: '" + this.name + "'");
        System.out.println("-------------------------------------------");
    }
}
