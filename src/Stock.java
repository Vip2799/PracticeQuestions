public class Stock {

    String symbol;
    String name ;
    double previousClosingPrice;
    double currentPrice ;

    Stock(String symbol, String name, double previousClosingPrice, double currentPrice ){
        this.symbol = symbol ;
        this.name = name ;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice ;
    }

    public double getChangedPercent(){
        return ((currentPrice - previousClosingPrice)/previousClosingPrice) * 100 ;
    }

    public void display(){
        System.out.println("Stock symbol           = " + symbol);
        System.out.println("Stock name             = " + name);
        System.out.println("Current Price          = "+ currentPrice);
        System.out.println("Previous closing Price = "+ previousClosingPrice );
        System.out.println("Changed Percentage     = "+ getChangedPercent());
    }

}
