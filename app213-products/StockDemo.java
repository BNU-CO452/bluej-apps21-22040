
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
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Samsung Galaxy S20"));
        stock.add(new Product(102, "Samsung Galaxy S10 "));
        stock.add(new Product(103, "Samsung Galaxy S9"));
        stock.add(new Product(104, "Samsung Galaxy S21"));
        stock.add(new Product(105, "Samsung Galaxy M21"));
        stock.add(new Product(106, "Samsung Galaxy M31"));
        stock.add(new Product(107, "Samsung Galaxy NOTE10"));
        stock.add(new Product(108, "Samsung Galaxy NOTE20"));
        stock.add(new Product(109, "Samsung Galaxy A50"));
        stock.add(new Product(110, "Samsung Galaxy A70"));
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
        int amount = 20;
        
        for(int id = 101; id <= 110; id++)
        {
            stock.buyProduct(id, amount);
            amount--;
        }
    }

    private void sellProducts()
    {
        int amount = 1;
        
        for(int id = 101; id <= 110; id++)
        {
            stock.sellProduct(id);
            amount++;
        }        
    }    
}