
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
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
        this.stock = new StockList();
        
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
        stock.add(new Product(110, "phasmophobia"));
        
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
        stock.buyProduct(101, 500);
        stock.buyProduct(102, 200);
        stock.buyProduct(103, 100);
        stock.buyProduct(104, 50);
    }

    private void sellProducts()
    {
      stock.sellProduct(101,300);  
      stock.sellProduct(102,200); 
      stock.sellProduct(101,100); 
    }    
}