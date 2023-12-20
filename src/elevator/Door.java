package elevator;

public class Door {
    boolean isOpen = false;
    void open(){

        if (!isOpen){
        System.out.println("elevator.Elevator door is opening.\n");
        isOpen = true;

        }
    }
    void close(){

        if (isOpen){
            System.out.println("elevator.Elevator door is closing.\n");
            isOpen = false;

        }

    }

}
