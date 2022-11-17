package command;

public class SellStockCommand implements Order{

    private StockTrade stockTrade;

    public SellStockCommand(StockTrade stockTrade) {
        this.stockTrade = stockTrade;
    }

    @Override
    public void execute() {
        stockTrade.sell();
    }

    @Override
    public String toString() {
        return "SellStockCommand{" +
                "stockTrade=" + stockTrade +
                '}';
    }
}
