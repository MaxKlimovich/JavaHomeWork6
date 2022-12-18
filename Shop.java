import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
    public static void main(String[] args) throws Exception {
        Laptop laptop1 = new Laptop("1D 3A 3F", "8", "126", "15.6", "black", "China");
        Laptop laptop2 = new Laptop("0D 2C 3F", "8", "512", "15.6", "black", "China");
        Laptop laptop3 = new Laptop("9N 2C 8H", "16", "126", "15.6", "white", "USA");
        Laptop laptop4 = new Laptop("1D 2H 5K", "8", "126", "15.6", "black", "Russia");
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        HashMap<String, String> filter_criteria = new HashMap<>();
        filter_criteria.put("Размер экрана(в дюймах)","15.6");
        filter_criteria.put("Страна-производитель","Russia");
        List<Laptop> filtered_list = new ArrayList<>();
        filtered_list = Laptop.filter(laptops, filter_criteria);
        System.out.println(filtered_list);
    
    }
    
}