package memento;

public class Main {

    /**
     * The Memento pattern is a software design pattern that provides the ability to restore an object
     * to its previous state (undo via rollback).
     * Memento: Là object lưu giá trị, được xem như là một snapshot của Originator.
     * Trong thực tiễn nó là immutable class (class không thay đổi được) và truyền data vào 1 lần duy nhất khi construct.
     */
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.start();
    }
}
