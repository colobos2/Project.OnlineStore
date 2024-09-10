import java.util.ArrayList;

public class MyCatalog {
    ArrayList<Product> catalog = new ArrayList<>();

   ArrayList<Product> fillMyCatalog() {
       catalog.add(new Product("001","Кирпич", 20));
       catalog.add(new Product("002","Бетон", 2000));
       catalog.add(new Product("003","Смеситель", 3500));
       catalog.add(new Product("004", "Телевизор", 40000));
       return catalog;
   }
    }



