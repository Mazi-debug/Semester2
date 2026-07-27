public class ElectricityReportApp {

    public static void main(String[] args) {

        // One-dimensional array containing the apartment names.
        String[] apartmentNames = {
            "Apartment 1",
            "Apartment 2",
            "Apartment 3",
            "Apartment 4"
        };

        /*
         * Two-dimensional array containing electricity usage.
         *
         * Each row represents an apartment.
         * Each column represents a weekday:
         * Monday, Tuesday, Wednesday, Thursday and Friday.
         */
        int[][] electricityUsage = {
            {18, 20, 17, 22, 19},
            {25, 23, 26, 24, 28},
            {14, 16, 15, 18, 17},
            {30, 28, 32, 29, 31}
        };

        try {
            // Create an ElectricityReport object.
            ElectricityReport report =
                    new ElectricityReport(
                            apartmentNames,
                            electricityUsage);

            // Display the complete electricity usage table.
            report.displayUsageReport();

            // Find the apartment with the highest total usage.
            int highestApartmentIndex =
                    report.findHighestUsageApartment();

            // Display the highest-usage apartment.
            System.out.println();
            System.out.println(
                    "Apartment with the highest usage: "
                    + report.getApartmentName(
                            highestApartmentIndex));

            System.out.println(
                    "Total electricity usage: "
                    + report.calculateApartmentTotal(
                            highestApartmentIndex)
                    + " kWh");

        } catch (IllegalArgumentException error) {
            // Display a meaningful message when invalid data is found.
            System.out.println(error.getMessage());
        }
    }
}