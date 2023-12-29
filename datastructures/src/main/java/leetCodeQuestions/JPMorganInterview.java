package leetCodeQuestions;

import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * A restaurant ordering system accepts food orders one item at a time. Each item entered is for a
 * specific person sitting at a particular table. The kitchen is not concerned with which person
 * ordered which item. They just need to know what menu items have been ordered for each table.
 * Write a program that will read a list of individual orders and "pivot" that set into a display of
 * food items for each table in the diner. The total number of each item per table will be displayed
 * on a column for that food item. For example, the orders: Sarah,7,Green Salad Sarah,7,Cappuccino
 * Michael,2,Club Sandwich Marcus,5,Sparkling Water
 *
 * <p>Would be displayed for the kitchen as: Table,Cappuccino,Club Sandwich,Green Salad,Sparkling
 * Water 2,0,1,0,0 5,0,0,0,1 7,1,0,1,0
 *
 * <p>Note that the menu items are listed in alphabetical order across the overall list. Input: A
 * comma-delimited list of names, table numbers, and menu items. Output: A comma-delimited list of
 * table numbers and item counts with a header row as the first line. The first column name is
 * "Table".
 */
public class JPMorganInterview {
    public static void main(String[] args) {
        ArrayList newOrder1 = new ArrayList();
        newOrder1.add("Sarah");
        newOrder1.add("7");
        newOrder1.add("Green Salad");
        ArrayList newOrder2 = new ArrayList();
        newOrder2.add("Sarah");
        newOrder2.add("7");
        newOrder2.add("Cappuccino");
        ArrayList newOrder3 = new ArrayList();
        newOrder3.add("Michael");
        newOrder3.add("2");
        newOrder3.add("Club Sandwich");
        ArrayList newOrder4 = new ArrayList();
        newOrder4.add("Marcus");
        newOrder4.add("5");
        newOrder4.add("Sparkling Water");

        ArrayList<ArrayList<String>> orders = new ArrayList<>();
        orders.add(newOrder1);
        orders.add(newOrder2);
        orders.add(newOrder3);
        orders.add(newOrder4);

        Map<String, Map<String, Long>> map =
                orders.stream()
                        .collect(
                                groupingBy(
                                        x -> x.get(1),
                                        groupingBy(x -> x.get(2), Collectors.counting())));
        System.out.println(map);
    }
}
