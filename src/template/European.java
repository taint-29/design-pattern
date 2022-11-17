package template;

public class European extends Person{
    @Override
    protected void wakeUp() {
        System.out.println("wake up at 08:00 AM and take a shower");
    }

    @Override
    protected void haveBreakFast() {
        System.out.println("have breakfast with cereals");
    }


    @Override
    protected void workInMorning() {
        System.out.println("work in morning about 3 hours");
    }

    @Override
    protected void haveLunch() {
        System.out.println("have lunch with pizza");
    }

    @Override
    protected void workInAfternoon() {
        System.out.println("work in afternoon about 5 hours");
    }

    @Override
    protected void haveDinner() {
        System.out.println("have dinner with bread");
    }

    @Override
    protected void personalHygiene() {
        System.out.println("brush teeth");
    }

    @Override
    protected void goToSleep() {
        System.out.println("go to sleep at 11:00 PM");
    }
}
