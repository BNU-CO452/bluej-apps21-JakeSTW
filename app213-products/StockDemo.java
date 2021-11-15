
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Jake Stewart
 * @version 14/11/21
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Rainbow six siege"));
        stock.add(new Product(102, "NBA 2k22"));
        stock.add(new Product(103, "Crab game"));
        stock.add(new Product(104, "Fifa 22"));
        stock.add(new Product(105, "Call of Duty Vanguard"));
        stock.add(new Product(106, "Gang beasts"));
        stock.add(new Product(107, "WatchDogs"));
        stock.add(new Product(108, "Animal crossing"));
        stock.add(new Product(109, "Civilization V"));
        stock.add(new Product(110, "Phasmophobia"));
        
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 50);
        stock.buyProduct(102, 50);
        stock.buyProduct(103, 50);
        stock.buyProduct(104, 50);
        stock.buyProduct(105, 50);
        stock.buyProduct(106, 50);
        stock.buyProduct(107, 50);
        stock.buyProduct(108, 50);
        stock.buyProduct(109, 50);
        stock.buyProduct(110, 50);
    }

    private void sellProducts()
    {
      stock.sellProduct(101,25);  
      stock.sellProduct(102,25); 
      stock.sellProduct(103,25); 
      stock.sellProduct(104,25); 
      stock.sellProduct(105,25); 
      stock.sellProduct(106,25); 
      stock.sellProduct(107,25); 
      stock.sellProduct(108,25); 
      stock.sellProduct(109,25); 
      stock.sellProduct(110,25); 
    }    
}