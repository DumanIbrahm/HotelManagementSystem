
import java.util.Scanner;
import Behaviors.BalconyBehavior;
import Behaviors.BathroomBehavior;
import Behaviors.ViewBehavior;
import Behaviors.ConcreteClasses.Balcony;
import Behaviors.ConcreteClasses.Bathtub;
import Behaviors.ConcreteClasses.Jacuzzi;
import Behaviors.ConcreteClasses.NoBalcony;
import Behaviors.ConcreteClasses.Shower;
import Behaviors.ConcreteClasses.mountainView;
import Behaviors.ConcreteClasses.seaView;
import ControlPanels.ControlPanel;
import Furnitures.Bed;
import Furnitures.Fridge;
import Furnitures.Sofa;
import Furnitures.Table;
import Furnitures.Tv;
import Rooms.Room100;
import Rooms.Room150;
import Rooms.Room200;
import Rooms.RoomInterface;
import Rooms.SuitRoom;

public class Prototype {
    static Scanner scanner = new Scanner(System.in);
    static RoomInterface room;
    static BalconyBehavior balcony;
    static BathroomBehavior bathroom;
    static ViewBehavior view;
    static int roomTypeChoice;
    static String guestNameGeneral;
    static final String BLACK = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {
        starting();
    }

    // It is login screen. Guests see the welcome page.
    static void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("********************************************");
        System.out.println("*                                          *");
        System.out.println("*      Welcome to Our OZIB Hotel           *");
        System.out.println("*                                          *");
        System.out.println("********************************************");

        System.out.print("Please enter your name: ");
        String guestName = scan.nextLine();
        guestNameGeneral = guestName;

        System.out.println(BLUE + "\nDear " + guestName + ", we are delighted to have you with us!\n" + BLACK);
    }

    // Guests choose standart or suit room
    static void bookRoom() {

        System.out.println("********************************************");
        System.out.println("*        Choose the Room Type              *");
        System.out.println("* 1. Standard Room (Select size next)      *");
        System.out.println("* 2. Suite Room                            *");
        System.out.println("********************************************");

        do {
            System.out.print("Enter the room type you prefer (1-2): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 2.");
                scanner.next(); // Consume the invalid input
            }
            roomTypeChoice = scanner.nextInt();
            if (roomTypeChoice < 1 || roomTypeChoice > 2)
                System.out.println("Invalid input. Please enter a number between 1 and 2.");
        } while (roomTypeChoice < 1 || roomTypeChoice > 2);

        if (roomTypeChoice == 1) {
            bookStandardRoom();
        } else {
            bookSuiteRoom();
        }
    }

    static void starting() {
        login();
        bookRoom();
        printRoomService();
    }

    // If guests want to standart room. They continue the choose type of
    // theirroom.(Size, behaviors, etc.)
    static void bookStandardRoom() {

        System.out.println("*********************************************");
        System.out.println("*         Choose the Room Size              *");
        System.out.println("* 1. 100 m2                                 *");
        System.out.println("* 2. 150 m2                                 *");
        System.out.println("* 3. 200 m2                                 *");
        System.out.println("*********************************************");

        int roomSizeChoice;
        do {
            System.out.print("Enter the room size you prefer (1-3): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next(); // Consume the invalid input
            }
            roomSizeChoice = scanner.nextInt();
            if (roomSizeChoice < 1 || roomSizeChoice > 3)
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
        } while (roomSizeChoice < 1 || roomSizeChoice > 3);

        String hasBalcony;
        do {
            System.out.print("Does the room have a balcony? (yes/no): ");
            hasBalcony = scanner.next().toLowerCase();
            if (hasBalcony.equals("yes")) {
                balcony = new Balcony();
                break;
            } else if (hasBalcony.equals("no")) {
                balcony = new NoBalcony();
                break;
            } else {
                System.out.println("Invalid input. Please enter yes or no.");
            }
        } while (!hasBalcony.equals("yes") || !hasBalcony.equals("no"));

        int bathroomType;
        do {
            System.out.print(
                    "Does the room have a bathtub, shower or a jacuzzi in the bathroom? (1. Bathtub / 2. Shower / 3. Jacuzzi): ");
            bathroomType = scanner.nextInt();
            if (bathroomType == 1) {
                bathroom = new Bathtub();
                break;
            } else if (bathroomType == 2) {
                bathroom = new Shower();
                break;
            } else if (bathroomType == 3) {
                bathroom = new Jacuzzi();
                break;
            } else {
                System.out.println("Invalid input. Please enter 1 for Bathtub, 2 for Shower or 3 for Jacuzzi.");
            }
        } while (bathroomType < 1 || bathroomType > 3);

        int roomViewChoice;
        do {
            System.out.print("Choose the room view (1. Sea / 2. Mountain): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter 1 for Sea view or 2 for Mountain view.");
                scanner.next(); // Consume the invalid input
            }
            roomViewChoice = scanner.nextInt();
            if (roomViewChoice < 1 || roomViewChoice > 2)
                System.out.println("Invalid input. Please enter 1 for Sea view or 2 for Mountain view.");
        } while (roomViewChoice < 1 || roomViewChoice > 2);

        String selectedRoomView = getRoomView(roomViewChoice);
        if (selectedRoomView.equals("Sea")) {
            view = new seaView();
        } else {
            view = new mountainView();
        }
        // Create the room
        room = getRoomSize(roomSizeChoice, balcony, bathroom, view);

        System.out.println(BLUE + "\n***************************************************************");
        System.out.println("Congratulations, dear " + guestNameGeneral + "! You've chosen a room ");
        System.out.println("***************************************************************\n");
        System.out.println(
                "You've selected a room with the following features:");
        System.out.println(room.getDescription() + BLACK);
        addFurniture();

    }

    // If guests choose suit room, they see this screen and they start to selecte
    // their furnitures for their room.
    static void bookSuiteRoom() {
        room = SuitRoom.getRoom();
        if (room != null) {
            System.out.println(BLUE + "\n**********************************************");
            System.out.println("*  Congratulations! You've chosen a Suite  *");
            System.out.println("********************************************\n");

            System.out.println("\nYou've selected a Suite room with the following features:");
            System.out.println(room.toString() + BLACK);
            addFurniture();
        } else {
            System.out.println(RED + "\nThe Suit Room is already booked.");
            System.out.println("Please choose another room type.\n" + BLACK);
            bookRoom();
        }

    }

    // It is getter method for room size
    static RoomInterface getRoomSize(int choice, BalconyBehavior balconyBehavior, BathroomBehavior bathroomBehavior,
            ViewBehavior viewBehavior) {
        switch (choice) {
            case 1:
                return new Room100(balconyBehavior, bathroomBehavior, viewBehavior);
            case 2:
                return new Room150(balconyBehavior, bathroomBehavior, viewBehavior);
            case 3:
                return new Room200(balconyBehavior, bathroomBehavior, viewBehavior);
            default:
                return null;
        }
    }

    // It is getter method for room view
    static String getRoomView(int choice) {
        switch (choice) {
            case 1:
                return "Sea";
            case 2:
                return "Mountain";
            default:
                return "Unknown";
        }
    }

    // When guests choose their room type(standrt or suit) and then they started to
    // choose their furnitures for their room.
    static void addFurniture() {
        int furnitureChoice;
        do {
            printMenu();
            System.out.print("Enter the furniture type you prefer (1-6): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 6. (6 for QUIT)");
                scanner.next(); // Consume the invalid input
            }
            furnitureChoice = scanner.nextInt();
            cases(furnitureChoice);

            if (furnitureChoice < 1 || furnitureChoice > 6)
                System.out.println("Invalid input. Please enter a number between 1 and 6. (6 for QUIT)");
            if (furnitureChoice == 6)
                break;
            System.out.print("Do you want to add more furniture? (yes/no): ");
            String addMoreFurniture = scanner.next().toLowerCase();
            if (addMoreFurniture.equals("no"))
                break;

        } while (furnitureChoice >= 1 || furnitureChoice <= 5);

        System.out.println(BLUE + "\nYou've selected a room with the following features: ");

        System.out.println(room.getDescription() + BLACK);
    }

    // Limitations for adding furnitures.
    private static void cases(int furnitureChoice) {
        switch (furnitureChoice) {
            case 1:
                if (Bed.getNumberOfBeds() < 3)
                    room = new Bed(room);
                else
                    System.err.println(RED + "\n!!!!You can't add more than 3 beds to a room.\n" + BLACK);
                break;
            case 2:
                if (Fridge.getNumberOfFridges() < 2)
                    room = new Fridge(room);
                else
                    System.err.println(RED + "\n!!!!You can't add more than 2 fridge to a room.\n" + BLACK);
                break;
            case 3:
                if (Sofa.getNumberOfSofas() < 2)
                    room = new Sofa(room);
                else
                    System.err.println(RED + "\n!!!!You can't add more than 2 sofa to a room.\n" + BLACK);
                break;
            case 4:
                if (Table.getNumberOfTables() < 2)
                    room = new Table(room);
                else
                    System.err.println(RED + "\n!!!!You can't add more than 2 sofa to a room.\n" + BLACK);
                break;
            case 5:
                if (Tv.getNumberOfTvs() < 2)
                    room = new Tv(room);
                else
                    System.err.println(RED + "\n!!!!You can't add more than 2 tv to a room.\n" + BLACK);
                break;
            default:
                break;
        }
    }

    // Print the furnitures menu
    private static void printMenu() {
        System.out.println("\n******************************************");
        System.out.println("*        Choose the Furniture Type         *");
        System.out.println("* 1. Bed                                   *");
        System.out.println("* 2. Fridge                                *");
        System.out.println("* 3. Sofa                                  *");
        System.out.println("* 4. Table                                 *");
        System.out.println("* 5. Television                            *");
        System.out.println("* 6. QUIT                                  *");
        System.out.println("********************************************\n");

    }

    // Print the room service
    private static void printRoomService() {
        ControlPanel controlPanel = new ControlPanel();
        System.out.println("\nIn your room, you can use the following services:");
        int roomServiceChoice;
        String addMoreRoomService;
        do {
            System.out.println("\n********************************************");
            System.out.println("*        Choose the Room Service           *");
            System.out.println("********************************************");
            System.out.println(controlPanel.toString());
            System.out.println("********************************************\n");
            System.out.print("Choose the room service you prefer (1-7): ");
            roomServiceChoice = scanner.nextInt();

            if (roomServiceChoice < 0 || roomServiceChoice > 7)
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
            if (roomServiceChoice == 0)
                break;
            System.out.print("Are you sure? (yes/no): ");
            String canceled = scanner.next().toLowerCase();
            if (canceled.equals("no"))
                canceledService(roomServiceChoice);
            else if (canceled.equals("yes"))
                casesServices(roomServiceChoice);

            System.out.print("\nDo you want to use another room service? (yes/no): ");
            addMoreRoomService = scanner.next().toLowerCase();
            if (addMoreRoomService.equals("no")) {
                break;
            }
        } while (roomServiceChoice > 0 || roomServiceChoice < 7
                || !addMoreRoomService.equals("no"));

        System.out.println(BLUE + "\nThank you for choosing our hotel. We hope you enjoy your stay.\n" + BLACK);
        starting();

    }

    // Call service
    private static void casesServices(int roomServiceChoice) {
        System.out.println(BLUE);
        room.controlPanel.buttonWasPressed(roomServiceChoice - 1);
        System.out.print(BLACK);

    }

    // Canceled call
    private static void canceledService(int roomServiceChoice) {
        System.out.println(BLUE);
        room.controlPanel.buttonUndo(roomServiceChoice - 1);
        System.out.print(BLACK);

    }

}