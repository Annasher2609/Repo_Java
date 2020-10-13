public class HomeWork8 {
    /** Create a printer
     * max toner level = 100
     * max pages in tray = 100
     * with 1 page printing, 1 toner is being used
     *
     * 1. addToner
     * 2. addPages
     * 3.
     *      a) printSingle
     *      b) printDouble*/
    //I.
    static int tonerLevel =0;
    static int numPages =0;
    int maxToner = 100;
    int maxPages = 100;
    public void addToner(int num) {
        if (num <= (maxToner - tonerLevel)) {
            tonerLevel = tonerLevel + num;
        } else {
            System.out.println("Amount of toner exceeds your printer's capacity");
        }
    }
    //II.
    public void addPages ( int num){
        if (num <= (maxPages - numPages)) {
            numPages = numPages + num;
        } else {
            System.out.println("Amount of paper exceeds your printer's capacity");
        }
    }

    //III.a.
    public void printSingle (int num) {
        if ((tonerLevel - num) >= 0 && (numPages - num) >= 0) {
            tonerLevel = tonerLevel - num;
            numPages = numPages - num;
        } else if ((tonerLevel - num) < 0 && (numPages - (num) >= 0)) {
            System.out.println("There would be not enough toner to complete printing");
        } else if ((tonerLevel - num) >= 0 && (numPages - (num) < 0)) {
            System.out.println("There would be not enough paper to complete printing");
        } else if ((tonerLevel - num) < 0 && (numPages - (num) < 0)) {
            System.out.println("There would be not enough toner and paper to complete printing");
        }
    }
    //III.b.
    public void printDouble(int num) {
        if (num <= 0) {
            System.out.println("Invalid number");
        } else if (num == 1) {
            tonerLevel = tonerLevel - num;
            numPages = numPages - num;
        } else if (num > 1 && num % 2 != 0) {
            if ((tonerLevel - num) >= 0 && (numPages - ((num + 1) / 2) >= 0)) {
                tonerLevel = tonerLevel - num;
                numPages = numPages - ((num + 1) / 2);
            } else if ((tonerLevel - num) < 0 && (numPages - ((num + 1) / 2) >= 0)) {
                System.out.println("There would be not enough toner to complete printing");
            } else if ((tonerLevel - num) >= 0 && (numPages - ((num + 1) / 2) < 0)) {
                System.out.println("There would be not enough paper to complete printing");
            } else if ((tonerLevel - num) < 0 && (numPages - ((num + 1) / 2) < 0)) {
                System.out.println("There would be not enough toner and paper to complete printing");
            }
        } else if (num > 1 && num % 2 == 0) {
            if ((tonerLevel - num) >= 0 && (numPages - (num / 2) >= 0)) {
                tonerLevel = tonerLevel - num;
                numPages = numPages - (num / 2);
            } else if ((tonerLevel - num) < 0 && (numPages - (num / 2) >= 0)) {
                System.out.println("There would be not enough toner to complete printing");
            } else if ((tonerLevel - num) >= 0 && (numPages - (num / 2) < 0)) {
                System.out.println("There would be not enough paper to complete printing");
            } else if ((tonerLevel - num) < 0 && (numPages - (num / 2) < 0)) {
                System.out.println("There would be not enough toner and paper to complete printing");
            }
        }
    }

    /** * 4. printerSummary
     *      Toner level:
     *      Pages count in tray:**/
    //IV.
    public void printSummary () {
        System.out.println("Toner level: " + tonerLevel);
        System.out.println("Pages count in tray: " + numPages);
    }

    /** * 5. checkToner
     *      if toner is less than 10; it should warn to "Add toner"
     */
    //V.
    public void checkToner () {
        if (tonerLevel < 10) {
            System.out.println("Add toner");
        }
    }
}
