class Currency {
    String name;
    String symbol;
    double rate;

    public Currency(String name, String symbol, double rate){
        this.name = name;
        this.symbol = symbol;
        this.rate = rate;
    }
    public void convertAndPrint(Double euroAmount){
        double result = euroAmount * this.rate;
        System.out.printf("%.2f€ = %.2f$s (%s)\n", euroAmount, result, this.symbol, this.name);
    }
}
