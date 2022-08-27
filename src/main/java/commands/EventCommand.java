package commands;

public interface EventCommand {
    int EXIT = 0;
    int ADD_EVENT = 1;
    int ADD_USER = 2;
    int SHOW_ALL_EVENTS = 3;
    int SHOW_ALL_USERS = 4;

    static void printCommands() {
        System.out.println("please input" + EXIT + "for EXIT");
        System.out.println("please input" + ADD_EVENT + "for ADD_EVENT");
        System.out.println("please input" + ADD_USER + "for ADD_USER");
        System.out.println("please input" + SHOW_ALL_EVENTS + "for SHOW_ALL_EVENTS");
        System.out.println("please input" + SHOW_ALL_USERS + "for SHOW_ALL_USERS");
    }
}
