package command;

public class Main {

    /**
     * Tránh các hard-wired(kết nối cứng). Việc triển khai hard-wired vào 1 lớp là không linh hoạt.
     * Không nên để lớp đối tượng phụ thuộc cụ thể vào một yêu cầu nào đó
     * Cần đưa ra yêu cầu cho đối tượng mà không cần biết bất cứ gì về hoạt động được yêu cầu cũng như cụ thể nơi nhận yêu cầu.
     */
    public static void main(String[] args) {

        StockTrade stockTrade = new StockTrade("tai",10);
        BuyStockCommand buyStockCommand = new BuyStockCommand(stockTrade);
        SellStockCommand sellStockCommand = new SellStockCommand(stockTrade);

        Agent agent = new Agent();
        agent.takeOrder(buyStockCommand);
        agent.takeOrder(buyStockCommand);
        agent.takeOrder(sellStockCommand);
        agent.placeOrder();

    }
}
