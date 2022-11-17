package command;

public class BuyStockCommand implements Order{

    private StockTrade stockTrade;

    public BuyStockCommand(StockTrade stockTrade) {
        this.stockTrade = stockTrade;
    }

    @Override
    public void execute() {
        stockTrade.buy();
    }
}
