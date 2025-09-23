import java.io.*;
import java.util.*;

public class TicketingSystem {
    static final int TOTAL_ROWS = 5;
    static final int TOTAL_COLUMNS = 5;
    static final String FILE_PATH = "R:\\1st semester\\PF\\Learning java\\Project\\";

    public static void main(String[] args) {
        createEventFiles();
        Scanner input = new Scanner(System.in);
        while (true) {
            showAllEvents();
            System.out.print("Select event number to manage (1-5) or Exit (6): ");
            int userChoice;
            try {
                userChoice = input.nextInt();
                input.nextLine();
                switch (userChoice) {
                    case 1:
                        manageEvent(1, input);
                        break;
                    case 2:
                        manageEvent(2, input);
                        break;
                    case 3:
                        manageEvent(3, input);
                        break;
                    case 4:
                        manageEvent(4, input);
                        break;
                    case 5:
                        manageEvent(5, input);
                        break;
                    case 6:
                        System.out.println("Thank you for using our ticketing system. Goodbye!");
                        return;
                    default:
                        System.out.println("Please select a number between 1 and 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
                input.nextLine();
            }
        }
    }

    public static void createEventFiles() {
        String[][] eventDetails = {
                { "Grand Concert", "Liaquat Gymnasium, Islamabad", "2025-07-15" },
                // 00 01 02
                { "Drama Night", "Alhamra Arts Council, Lahore", "2025-08-03" },
                // 10 11 12
                { "Musical Gala", "PNCA Auditorium, Islamabad", "2025-09-10" },
                // 20 21 22
                { "Comedy Show", "Arts Council of Pakistan, Karachi", "2025-10-05" },
                // 30 31 32
                { "Art Festival", "Expo Centre, Lahore", "2025-11-20" }
                // 40 41 42
        };
        for (int eventNumber = 1; eventNumber <= 5; eventNumber++) {
            String fileName = FILE_PATH + "event" + eventNumber + ".txt";
            File eventFile = new File(fileName);
            if (!eventFile.exists()) {
                try {
                    eventFile.createNewFile();
                    PrintWriter writer = new PrintWriter(eventFile);
                    String EventName = eventDetails[eventNumber - 1][0];
                    String Venue = eventDetails[eventNumber - 1][1];
                    String Date = eventDetails[eventNumber - 1][2];
                    writer.println(EventName);
                    writer.println(Venue);
                    writer.println(Date);
                    writer.println("Seats:");
                    for (int row = 0; row < TOTAL_ROWS; row++) {
                        for (int column = 0; column < TOTAL_COLUMNS; column++) {
                            writer.print("A");
                        }
                        writer.println();
                    }
                    writer.close();
                } catch (Exception e) {
                    System.out.println("Error creating file for event " + eventNumber);
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void showAllEvents() {
        System.out.println("============================== ALL EVENTS ==============================");
        for (int eventNumber = 1; eventNumber <= 5; eventNumber++) {
            displayEventInfo(eventNumber);
        }
        System.out.println("6. Exit");
        System.out.println("=========================================================================");
    }

    public static void displayEventInfo(int eventNumber) {
        String file = FILE_PATH + "event" + eventNumber + ".txt";
        File eventFile = new File(file);
        if (!eventFile.exists()) {
            System.out.println(eventNumber + ". Event " + eventNumber + ": Not available");
            return;
        }
        try {
            Scanner fileReader = new Scanner(eventFile);
            String eventName = fileReader.nextLine();
            String venue = fileReader.nextLine();
            String date = fileReader.nextLine();
            System.out.println(eventNumber + ". " + eventName + " | Venue: " + venue + " | Date: " + date);
        } catch (Exception e) {
            System.out.println(eventNumber + ". Error reading event information");
        }
    }

    public static void manageEvent(int eventNumber, Scanner input) {
        String fileName = FILE_PATH + "event" + eventNumber + ".txt";
        String ticketFileName = FILE_PATH + "event" + eventNumber + "-tickets.txt";
        char[][] seatLayout = new char[TOTAL_ROWS][TOTAL_COLUMNS];
        String eventName = "";
        String venue = "";
        String date = "";

        boolean fileRead = readEventFile(fileName, seatLayout);
        if (!fileRead) {
            return;
        }
        try {
            File file_ = new File(fileName);
            Scanner fileReader = new Scanner(file_);
            eventName = fileReader.nextLine();
            venue = fileReader.nextLine();
            date = fileReader.nextLine();
            fileReader.close();
        } catch (Exception error) {
            System.out.println("Error reading event details.");
            return;
        }
        while (true) {
            System.out.println("========== " + eventName.toUpperCase() + " ==========");
            System.out.println("Venue: " + venue);
            System.out.println("Date: " + date);
            System.out.println("================================");
            displaySeatLayout(seatLayout);
            System.out.println("What would you like to do?");
            System.out.println("1. Book Tickets");
            System.out.println("2. Cancel Booking");
            System.out.println("3. Return to Main Menu");
            System.out.print("Enter your choice: ");
            int userAction;
            try {
                userAction = input.nextInt();
                input.nextLine();
                switch (userAction) {
                    case 1:
                        bookTickets(input, seatLayout, eventName, venue, date, fileName, ticketFileName);
                        break;
                    case 2:
                        cancelBooking(input, seatLayout, eventName, venue, date, fileName);
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Please enter 1, 2, or 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
                input.nextLine();
            }
        }
    }

    public static boolean readEventFile(String fileName, char[][] seatLayout) {
        try {
            File name = new File(fileName);
            Scanner fileReader = new Scanner(name);
            fileReader.nextLine();
            fileReader.nextLine();
            fileReader.nextLine();
            if (fileReader.hasNextLine()) {
                fileReader.nextLine();
            }
            for (int row = 0; row < TOTAL_ROWS; row++) {
                String seatRow = "";
                if (fileReader.hasNextLine()) {
                    seatRow = fileReader.nextLine();
                }
                for (int column = 0; column < TOTAL_COLUMNS; column++) {
                    if (column < seatRow.length()) {
                        char ch = seatRow.charAt(column);
                        seatLayout[row][column] = ch;
                    } else {
                        seatLayout[row][column] = 'A';
                    }
                }
            }
            fileReader.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error reading event file.");
            return false;
        }
    }

    public static void displaySeatLayout(char[][] seatLayout) {
        System.out.println("Current Seat Layout:");
        System.out.println("A = Available, B = Booked");
        System.out.println();
        System.out.print("       ");
        for (int column = 0; column < TOTAL_COLUMNS; column++) {
            System.out.printf("%3d", column + 1);// 3 spaces at start
        }
        System.out.println();
        for (int row = 0; row < TOTAL_ROWS; row++) {
            System.out.printf("Row %-2d:", row + 1);// 2 spaces at left
            for (int column = 0; column < TOTAL_COLUMNS; column++) {
                System.out.printf("%3c", seatLayout[row][column]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void bookTickets(Scanner input, char[][] seatLayout, String eventName, String venue, String date,
            String fileName, String ticketFileName) {
        System.out.println("========== BOOK TICKETS ==========");
        int numberOfTickets;
        while (true) {
            System.out.print("How many tickets would you like to book? ");
            try {
                numberOfTickets = input.nextInt();
                input.nextLine();
                if (numberOfTickets > 0) {
                    break;
                } else {
                    System.out.println("Please enter a number greater than 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid whole number.");
                input.nextLine();
            }
        }

        boolean discountApplies = (numberOfTickets >= 5);
        String[] customerNames = new String[numberOfTickets];
        String[] customerContacts = new String[numberOfTickets];
        int[] bookedRows = new int[numberOfTickets];
        int[] bookedColumns = new int[numberOfTickets];

        for (int i = 0; i < numberOfTickets; i++) {
            System.out.println("--- Booking Ticket " + (i + 1) + " of " + numberOfTickets + " ---");
            int[] seatPosition = getSeatSelection(input, seatLayout);
            int row = seatPosition[0];
            int column = seatPosition[1];
            System.out.print("Enter customer name: ");
            String customerName = input.nextLine();
            String customerContact = getCustomerContact(input);

            seatLayout[row][column] = 'B';
            customerNames[i] = customerName;
            customerContacts[i] = customerContact;
            bookedRows[i] = row;
            bookedColumns[i] = column;

            System.out.println("Seat booked successfully: Row " + (row + 1) + ", Column " + (column + 1));
            displaySeatLayout(seatLayout);
        }

        String paymentMethod = selectPaymentMethod(input);
        processPayment(input, paymentMethod);

        updateEventFile(fileName, eventName, venue, date, seatLayout);
        generateTickets(numberOfTickets, discountApplies, customerNames, customerContacts, bookedRows, bookedColumns,
                eventName, venue, date, ticketFileName, paymentMethod);
    }

    public static int[] getSeatSelection(Scanner input, char[][] seatLayout) {
        while (true) {
            try {
                System.out.print("Enter seat row (1-" + TOTAL_ROWS + "): ");
                int row = input.nextInt() - 1;
                input.nextLine();
                System.out.print("Enter seat column (1-" + TOTAL_COLUMNS + "): ");
                int column = input.nextInt() - 1;
                input.nextLine();
                if (row < 0 || row >= TOTAL_ROWS || column < 0 || column >= TOTAL_COLUMNS) {
                    System.out.println("Invalid seat position. Please try again.");
                    continue;
                }
                if (seatLayout[row][column] == 'B') {
                    System.out.println("This seat is already booked. Please choose another seat.");
                    continue;
                }
                int[] seatPosition = { row, column };
                return seatPosition;
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid numbers.");
                input.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter valid numbers.");
                input.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine();
            }
        }
    }

    public static String getCustomerContact(Scanner input) {
        while (true) {
            System.out.print("Enter 7-15 digits long contact number: ");
            String contact = input.nextLine();
            if (contact.length() >= 7 && contact.length() <= 15) {
                boolean allDigits = true;
                for (int i = 0; i < contact.length(); i++) {
                    char ch = contact.charAt(i);
                    if (!Character.isDigit(ch)) {
                        allDigits = false;
                        break;
                    }
                }
                if (allDigits) {
                    return contact;
                } else {
                    System.out.println("Contact number must contain digits only.");
                }
            }
        }
    }

    public static String selectPaymentMethod(Scanner input) {
        while (true) {
            System.out.println("Select payment method:");
            System.out.println("1. Credit/Debit Card");
            System.out.println("2. E-Banking");
            System.out.print("Enter your choice (1-2): ");
            String choice = input.nextLine();
            if (choice.equals("1")) {
                return "Credit/Debit Card";
            } else if (choice.equals("2")) {
                return "E-Banking";
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }

    public static void processPayment(Scanner input, String paymentMethod) {
        System.out.println("Processing payment via " + paymentMethod + "...");

        if (paymentMethod.equals("Credit/Debit Card")) {
            System.out.print("Enter card number (16 digits): ");
            String cardNumber = input.nextLine();
            while (cardNumber.length() != 16 || !cardNumber.matches("\\d+")) {
                System.out.println("Invalid card number. Must be 16 digits.");
                System.out.print("Enter card number (16 digits): ");
                cardNumber = input.nextLine();
            }
            System.out.print("Enter expiration date (MM/YY): ");
            String expDate = input.nextLine();
            while (!expDate.matches("\\d{2}/\\d{2}")) {
                System.out.println("Invalid format. Use MM/YY.");
                System.out.print("Enter expiration date (MM/YY): ");
                expDate = input.nextLine();
            }
            System.out.print("Enter Pin (3 digits): ");
            String cvv = input.nextLine();
            while (cvv.length() != 3 || !cvv.matches("\\d+")) {
                System.out.println("Invalid CVV. Must be 3 digits.");
                System.out.print("Enter CVV (3 digits): ");
                cvv = input.nextLine();
            }
        } else {
            System.out.print("Enter bank name: ");
            String bankName = input.nextLine();
            System.out.print("Enter transaction reference number: ");
            String refNumber = input.nextLine();
        }
        System.out.println("Payment processed successfully!");
    }

    public static void updateEventFile(String fileName, String eventName, String venue, String date,
            char[][] seatLayout) {
        try {
            PrintWriter writer = new PrintWriter(fileName);
            writer.println(eventName);
            writer.println(venue);
            writer.println(date);
            writer.println("Seats:");
            for (int row = 0; row < TOTAL_ROWS; row++) {
                for (int column = 0; column < TOTAL_COLUMNS; column++) {
                    writer.print(seatLayout[row][column]);
                }
                writer.println();
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Error updating event file.");
        } catch (Exception e) {
            System.out.println("Error saving ticket information to file.");
        }
    }

    public static void generateTickets(int numberOfTickets, boolean discountApplies, String[] customerNames,
            String[] customerContacts, int[] bookedRows, int[] bookedColumns, String eventName, String venue,
            String date, String ticketFileName, String paymentMethod) {
        System.out.println("========== E-TICKETS ==========");
        double pricePerTicket = 1000.0;
        double totalPrice = pricePerTicket * numberOfTickets;
        if (discountApplies) {
            totalPrice -= totalPrice * 0.10;
            System.out.println(
                    "Congratulations! You received a 10% discount for booking " + numberOfTickets + " tickets!");
        }
        System.out.println("Number of tickets: " + numberOfTickets);
        System.out.printf("Price per ticket: Rs.%.2f\n", pricePerTicket);
        System.out.printf("Total amount: Rs.%.2f\n", totalPrice);
        System.out.println("Payment method: \n" + paymentMethod);
        System.out.println();

        saveTicketsToFile(ticketFileName, numberOfTickets, discountApplies, totalPrice, customerNames, customerContacts,
                bookedRows, bookedColumns, eventName, venue, date, paymentMethod);

        for (int i = 0; i < numberOfTickets; i++) {
            System.out.println("--- TICKET " + (i + 1) + " ---");
            System.out.println("Event: " + eventName);
            System.out.println("Venue: " + venue);
            System.out.println("Date: " + date);
            System.out.println("Seat: Row " + (bookedRows[i] + 1) + ", Column " + (bookedColumns[i] + 1));
            System.out.println("Name: " + customerNames[i]);
            System.out.println("Contact: " + customerContacts[i]);
            System.out.println("Payment method: " + paymentMethod);
            System.out.println("------------------");
        }

        System.out.println("Tickets booked successfully!");
    }

    public static void saveTicketsToFile(String ticketFileName, int numberOfTickets, boolean discountApplies,
            double totalPrice, String[] customerNames, String[] customerContacts, int[] bookedRows, int[] bookedColumns,
            String eventName, String venue, String date, String paymentMethod) {
        try {
            FileWriter fileWriter = new FileWriter(ticketFileName, true);
            PrintWriter ticketWriter = new PrintWriter(fileWriter);
            ticketWriter.println("========== NEW BOOKING ==========");
            ticketWriter.println("Event: " + eventName);
            ticketWriter.println("Venue: " + venue);
            ticketWriter.println("Date: " + date);
            ticketWriter.println("Number of tickets: " + numberOfTickets);

            if (discountApplies) {
                ticketWriter.println("Discount applied: 10%");
            }
            ticketWriter.printf("Total amount: Rs.%.2f", totalPrice);
            ticketWriter.println("Payment method: " + paymentMethod);
            ticketWriter.println();
            for (int i = 0; i < numberOfTickets; i++) {
                ticketWriter.println("--- TICKET " + (i + 1) + " ---");
                ticketWriter.println("Seat: Row " + (bookedRows[i] + 1) + ", Column " + (bookedColumns[i] + 1));
                ticketWriter.println("Name: " + customerNames[i]);
                ticketWriter.println("Contact: " + customerContacts[i]);
                ticketWriter.println("Payment method: " + paymentMethod);
                ticketWriter.println("------------------");
            }
            ticketWriter.println();
            ticketWriter.close();
        } catch (IOException e) {
            System.out.println("Error updating event file.");
        } catch (Exception e) {
            System.out.println("Error saving ticket information to file.");
            System.out.println(e.getMessage());
        }
    }

    public static void cancelBooking(Scanner input, char[][] seatLayout, String eventName, String venue, String date,
            String fileName) {
        System.out.println("========== CANCEL BOOKING ==========");
        int row = -1;
        int column = -1;
        while (true) {
            try {
                System.out.print("Enter seat row to cancel (1-" + TOTAL_ROWS + "): ");
                row = input.nextInt() - 1;
                System.out.print("Enter seat column to cancel (1-" + TOTAL_COLUMNS + "): ");
                column = input.nextInt() - 1;
                input.nextLine();
                if (row < 0 || row >= TOTAL_ROWS || column < 0 || column >= TOTAL_COLUMNS) {
                    System.out.println("Invalid seat position. Please try again.");
                    continue;
                }
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter valid numbers.");
                input.nextLine();
            }
        }
        if (seatLayout[row][column] == 'A') {
            System.out.println(
                    "Seat at Row " + (row + 1) + ", Column " + (column + 1) + " is not booked. Cannot cancel.");
            return;
        }
        seatLayout[row][column] = 'A';
        System.out.println("Booking cancelled for Row " + (row + 1) + ", Column " + (column + 1));
        displaySeatLayout(seatLayout);
        updateEventFile(fileName, eventName, venue, date, seatLayout);
        System.out.println("Event file updated successfully.");
    }
}