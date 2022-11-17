package template;

public abstract class Person {
    public final void actionInDay(){
        wakeUp();
        haveBreakFast();
        workInMorning();
        haveLunch();
        workInAfternoon();
        haveDinner();
        personalHygiene();
        goToSleep();
        System.out.println("-----------------------------------------");
    }

    protected abstract void wakeUp();
    protected abstract void haveBreakFast();
    protected abstract void workInMorning();
    protected abstract void haveLunch();
    protected abstract void workInAfternoon();
    protected abstract void haveDinner();
    protected abstract void personalHygiene();
    protected abstract void goToSleep();
}
