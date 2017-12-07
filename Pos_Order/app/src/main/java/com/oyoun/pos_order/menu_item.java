package com.oyoun.pos_order;

/**
 * Created by oyoun on 17. 12. 1.
 */

public class menu_item {

    int Menu_image;
    String Menu_name;
    String Menu_price;

    public int getMenu_image(){
        return Menu_image;
    }

    public String getMenu_name(){
        return Menu_name;
    }

    public String getMenu_price(){
        return Menu_price;
    }

    public menu_item(int image, String menu, String price){
        this.Menu_image = image;
        this.Menu_name = menu;
        this.Menu_price = price;
    }
}
