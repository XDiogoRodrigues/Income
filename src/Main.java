void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    List<TaxPlayer> list = new ArrayList<>();

    System.out.print("Enter the number of tax payers: ");
    int quantity = sc.nextInt();

    for(int i = 1; i <= quantity; i++){
        System.out.printf("Tax payer #%d data:", i);
        System.out.print("Individual or Company (i/c): ");
        sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Anual income: ");
        double income = sc.nextDouble();
        if(ch == 'i') {
            System.out.print("Health expenditures: ");
            double value = sc.nextDouble();
            list.add(new Individual(name, income, value));
        } else {
            System.out.print("Number of employees: ");
            int quantityEmployees = sc.nextInt();
            list.add(new Company(name, income, quantityEmployees));
        }
    }

    System.out.println();
    System.out.print("TAXES PAID:\n");
    double valueTotal = 0;
    for(TaxPlayer taxIncome: list) {
        System.out.printf("%s: $ %.2f\n", taxIncome.getName(), taxIncome.tax());
        valueTotal += taxIncome.tax();
    }

    System.out.printf("\nTOTAL TAXES: $ %.2f", valueTotal);

}
