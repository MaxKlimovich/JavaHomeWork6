
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Создание ноутбука
 */
public class Laptop {
    private String serial_number;
    private String ram;
    private String hdd;
    private String screen_size;
    private String colour; // Надо будет доработать
    private String producer;
    Map<String, String> criteria;

    public Laptop(String input_sn, String input_ram, String input_hdd, String input_ss, String input_colour,
            String input_producer) {
        serial_number = input_sn;
        ram = input_ram;
        hdd = input_hdd;
        screen_size = input_ss;
        colour = input_colour;
        producer = input_producer;
    }

    public Laptop(String input_sn) {
        this(input_sn, null, null, null, null, null);
    }

    @Override
    public String toString() {
        return String.format(
                "Серийный номер: %s\nОбъём RAM: %s\nОбъём HDD: %s\nРазмер экрана(в дюймах): %s\nЦвет: %s\nСтрана-производитель: %s\n",
                serial_number, ram, hdd, screen_size, colour, producer);
    }

    public String getvar(Laptop laptop, String variable) {
        String res = "";
        if (variable.equals("Серийный номер")) {
            res = serial_number;
        } else if (variable.equals("Объем RAM")) {
            res = ram;
        } else if (variable.equals("Объем HDD")) {
            res = hdd;
        } else if (variable.equals("Размер экрана(в дюймах)")) {
            res = screen_size;
        } else if (variable.equals("Цвет")) {
            res = colour;
        } else if (variable.equals("Страна-производитель")) {
            res = producer;
        }
        return res;
    }

    public static List<Laptop> filter(List<Laptop> list, HashMap<String, String> criteria) {
        List<Laptop> sorted_list = new ArrayList<>();
        boolean flag = true;
        for (Laptop laptop : list) {
            for (String criterion : criteria.keySet()) {
                if (!laptop.getvar(laptop, criterion).equals(criteria.get(criterion))) {
                    flag = false;
                }
            }
            if (flag) {
                sorted_list.add(laptop);

            }
            flag = true;
        }
        return sorted_list;

    }

}