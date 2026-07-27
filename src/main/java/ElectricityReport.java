public class ElectricityReport {

    // Constants make important fixed values easier to understand and change.
    private static final int NUMBER_OF_DAYS = 5;
    private static final int HIGH_USAGE_LIMIT = 120;

    // Private fields store the apartment names and electricity usage.
    private String[] apartmentNames;
    private int[][] electricityUsage;

    /*
     * Constructor:
     * Receives the apartment names and electricity usage values.
     * It validates the data before storing it.
     */
    public ElectricityReport(String[] apartmentNames,
                             int[][] electricityUsage) {

        validateData(apartmentNames, electricityUsage);

        this.apartmentNames = apartmentNames;
        this.electricityUsage = electricityUsage;
    }

    /*
     * Checks that all supplied data is valid.
     */
    private void validateData(String[] apartmentNames,
                              int[][] electricityUsage) {

        // Check that the arrays exist.
        if (apartmentNames == null || electricityUsage == null) {
            throw new IllegalArgumentException(
                    "Error: Apartment names and usage data cannot be null.");
        }

        // Check that there is at least one apartment.
        if (apartmentNames.length == 0) {
            throw new IllegalArgumentException(
                    "Error: At least one apartment is required.");
        }

        // The number of names must match the number of rows.
        if (apartmentNames.length != electricityUsage.length) {
            throw new IllegalArgumentException(
                    "Error: The number of apartment names must match "
                    + "the number of usage rows.");
        }

        // Check each apartment name and each row of usage values.
        for (int apartment = 0;
             apartment < apartmentNames.length;
             apartment++) {

            // Apartment names cannot be null or empty.
            if (apartmentNames[apartment] == null
                    || apartmentNames[apartment].trim().isEmpty()) {

                throw new IllegalArgumentException(
                        "Error: Apartment name at position "
                        + apartment + " cannot be empty.");
            }

            // Each apartment must have exactly five daily values.
            if (electricityUsage[apartment] == null
                    || electricityUsage[apartment].length
                    != NUMBER_OF_DAYS) {

                throw new IllegalArgumentException(
                        "Error: " + apartmentNames[apartment]
                        + " must contain exactly five usage values.");
            }

            // Electricity usage cannot be negative.
            for (int day = 0; day < NUMBER_OF_DAYS; day++) {
                if (electricityUsage[apartment][day] < 0) {
                    throw new IllegalArgumentException(
                            "Error: Electricity usage cannot be negative. "
                            + "Invalid value found for "
                            + apartmentNames[apartment] + ".");
                }
            }
        }
    }

    /*
     * Displays the electricity usage table.
     */
    public void displayUsageReport() {

        System.out.println("WEEKLY ELECTRICITY USAGE REPORT");
        System.out.println(
                "--------------------------------------------------------------------------");

        // Print the table headings.
        System.out.printf(
                "%-15s%6s%6s%6s%6s%6s%8s%10s%n",
                "Apartment",
                "Mon",
                "Tue",
                "Wed",
                "Thu",
                "Fri",
                "Total",
                "Average");

        System.out.println(
                "--------------------------------------------------------------------------");

        // Display the information for each apartment.
        for (int apartment = 0;
             apartment < apartmentNames.length;
             apartment++) {

            // Display the apartment name.
            System.out.printf("%-15s", apartmentNames[apartment]);

            // Display the five daily usage values.
            for (int day = 0; day < NUMBER_OF_DAYS; day++) {
                System.out.printf(
                        "%6d",
                        electricityUsage[apartment][day]);
            }

            // Calculate the apartment's total and average.
            int total = calculateApartmentTotal(apartment);
            double average = calculateApartmentAverage(apartment);

            // Display the total and average.
            System.out.printf("%8d%10.2f", total, average);

            // Display HIGH USAGE when the total is above 120 kWh.
            if (total > HIGH_USAGE_LIMIT) {
                System.out.print(" HIGH USAGE");
            }

            System.out.println();
        }
    }

    /*
     * Calculates the total electricity usage for one apartment.
     */
    public int calculateApartmentTotal(int apartmentIndex) {

        validateApartmentIndex(apartmentIndex);

        int total = 0;

        // Add all five daily values.
        for (int day = 0; day < NUMBER_OF_DAYS; day++) {
            total += electricityUsage[apartmentIndex][day];
        }

        return total;
    }

    /*
     * Calculates the average electricity usage for one apartment.
     */
    public double calculateApartmentAverage(int apartmentIndex) {

        validateApartmentIndex(apartmentIndex);

        int total = calculateApartmentTotal(apartmentIndex);

        // Cast to double so that the answer includes decimal values.
        return (double) total / NUMBER_OF_DAYS;
    }

    /*
     * Finds the index of the apartment with the highest total usage.
     */
    public int findHighestUsageApartment() {

        int highestApartmentIndex = 0;
        int highestTotal = calculateApartmentTotal(0);

        // Start at index 1 because index 0 is already the highest initially.
        for (int apartment = 1;
             apartment < apartmentNames.length;
             apartment++) {

            int currentTotal =
                    calculateApartmentTotal(apartment);

            if (currentTotal > highestTotal) {
                highestTotal = currentTotal;
                highestApartmentIndex = apartment;
            }
        }

        return highestApartmentIndex;
    }

    /*
     * Returns an apartment name.
     * This allows the main class to display the highest apartment's name.
     */
    public String getApartmentName(int apartmentIndex) {

        validateApartmentIndex(apartmentIndex);

        return apartmentNames[apartmentIndex];
    }

    /*
     * Checks that an apartment index is valid.
     */
    private void validateApartmentIndex(int apartmentIndex) {

        if (apartmentIndex < 0
                || apartmentIndex >= apartmentNames.length) {

            throw new IllegalArgumentException(
                    "Error: Invalid apartment index.");
        }
    }
}