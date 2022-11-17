package template;

public class Asian extends Person{
    @Override
    protected void wakeUp() {
        System.out.println("wake up at 07:00 AM");
    }

    @Override
    protected void haveBreakFast() {
        System.out.println("have breakfast with noodle");
    }

    @Override
    protected void workInMorning() {
        System.out.println("work in morning about 4 hours");
    }

    @Override
    protected void haveLunch() {
        System.out.println("have lunch with rice");
    }

    @Override
    protected void workInAfternoon() {
        System.out.println("work in afternoon about 4 hours");
    }

    @Override
    protected void haveDinner() {
        System.out.println("have dinner with rice");
    }

    @Override
    protected void personalHygiene() {
        System.out.println("take a shower and brush teeth");
    }

    @Override
    protected void goToSleep() {
        System.out.println("go to sleep at 10:00 PM");
    }
}
