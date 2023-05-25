import java.util.Date;

public abstract class Ticket implements TicketPrice {
    private String name = "-";
    private final int day; // 1 or 2
    private char zone; // A B C D E F G
    private int amount;
    private double price;
    private double totalPrice;
    private String seatNumber;
    private String seatNumberAlone;
    private String seatNumberGroup;
    private String seatNumberGroupStart;
    private String seatNumberGroupEnd;
    private Date date;

    public Ticket(String name, int day, char zone, int amount) throws IllegalArg {
        if (day < 1 || day > 2 || zone < 'A' || zone > 'G' || amount < 1) {
            throw new IllegalArg(day, zone, amount);
        }
        this.name = name;
        this.day = day;
        this.zone = zone;
        this.amount = amount;
    }

    public Ticket(int day, char zone, int amount) throws IllegalArg {
        if (day < 1 || day > 2 || zone < 'A' || zone > 'G' || amount < 1) {
            throw new IllegalArg(day, zone, amount);
        }
        this.day = day;
        this.zone = zone;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public char getZone() {
        return zone;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        if (zone == 'A') {
            price = aPrice;
        } else if (zone == 'B') {
            price = bPrice;
        } else if (zone == 'C') {
            price = cPrice;
        } else if (zone == 'D') {
            price = dPrice;
        } else if (zone == 'E') {
            price = ePrice;
        } else if (zone == 'F') {
            price = fPrice;
        } else if (zone == 'G') {
            price = gPrice;
        }
        return price;
    }

    public double getTotalPrice() {
        totalPrice = getPrice() * amount;
        return totalPrice;
    }

    public String getSeatNumberAlone() {
        int s = (int) ((Math.random() * 1000) + 1);
        if (s < 10) {
            seatNumberAlone = zone + "000" + s;
        } else if (s < 100) {
            seatNumberAlone = zone + "00" + s;
        } else if (s < 1000) {
            seatNumberAlone = zone + "0" + s;
        } else if (s >= 1000) {
            seatNumberAlone = zone + "" + s;
        }
        return seatNumberAlone;
    }

    public String getSeatNumberGroup() {
        int s = (int) ((Math.random() * 1000) + 1);
        int e;
        if ((s + amount - 1) > 1000) {
            e = s - amount + 1;
        } else {
            e = s + amount - 1;
        }
        if (s < 10) {
            seatNumberGroupStart = zone + "000" + s;
        } else if (s < 100) {
            seatNumberGroupStart = zone + "00" + s;
        } else if (s < 1000) {
            seatNumberGroupStart = zone + "0" + s;
        } else if (s >= 1000) {
            seatNumberGroupStart = zone + "" + s;
        }
        if (e < 10) {
            seatNumberGroupEnd = zone + "000" + e;
        } else if (e < 100) {
            seatNumberGroupEnd = zone + "00" + e;
        } else if (e < 1000) {
            seatNumberGroupEnd = zone + "0" + e;
        } else if (e >= 1000) {
            seatNumberGroupEnd = zone + "" + e;
        }
        if (e > s) {
            seatNumberGroup = seatNumberGroupStart + " - " + seatNumberGroupEnd;
        }
        if (s > e) {
            seatNumberGroup = seatNumberGroupEnd + " - " + seatNumberGroupStart;
        }
        return seatNumberGroup;
    }

    public String getSeatNumber() {
        if (amount == 1) {
            seatNumber = getSeatNumberAlone();
        } else if (amount > 1) {
            seatNumber = getSeatNumberGroup();
        }
        return seatNumber;
    }

    public Date getDate() {
        java.util.Date date = new java.util.Date();
        return date;
    }

    public void result() {
        System.out.println("NAME : " + getName() + "\nDAY : " + getDay()
                + "\nSEAT NUMBER : " + getSeatNumber() + "\nTotal Price : "
                + getTotalPrice() + "\nDate : " + getDate());
    }
}
