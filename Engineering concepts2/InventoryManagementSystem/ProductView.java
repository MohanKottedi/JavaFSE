package InventoryManagementSystem;
public class ProductView {
    private static ProductController productController;
    public ProductView(){
        if(productController==null){
            synchronized(ProductController.class){
                if(productController==null){
                    productController=new ProductController();
                }
            }
        }
    }
    public void addProduct(String name,int quantity,double price){
        productController.add(name, quantity, price);
    }
    public Product getProduct(int id){
        return productController.getProduct(id);
    }
    public void updateProduct(int id,String name,int quantity,double price){
        productController.update(id, name, quantity, price);
    }
    public void deleteProduct(int id){
        productController.delete(id);
    }
    public void displayAll(){
        productController.displayAll();
    }

}
