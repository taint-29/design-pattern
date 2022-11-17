package memento;

import java.util.Scanner;

public class TextEditor {
    private Memento memento = new Memento();
    private StringBuilder text = new StringBuilder();

    public void start(){
        System.out.println("enter your text: ");
        Scanner scanner = new Scanner(System.in);

        while (true){
            String line;
            try {
                line = scanner.next();
            }catch (Exception e){
                continue;
            }
            if (line.equals("b")){
                // restore
                restore();
            }else if (line.equals("c")){
                //close
                close();
                break;
            }else {
                save(line);
            }
        }
    }

    private void save(String line){
        memento.addNewState(text.toString());
        if (text.length() > 0){
            text.append(" ");
        }
        text.append(line);
        System.out.println("Save text: " + text.toString());
    }

    private void restore(){
        text.delete(0,text.length());
        text.append(memento.takeLastState());
        System.out.println("You just restore, current text is: " + text);
    }

    private void close(){
        System.out.println("Finished, your text is: " + text);
    }


}
