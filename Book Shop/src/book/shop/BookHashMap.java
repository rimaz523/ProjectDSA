/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package book.shop;

import java.util.HashMap;

/**
 *
 * @author lenovo
 */
public class BookHashMap {
    private HashMap<String, Integer> BookMap = new HashMap <String, Integer>();
    
    public void insertBookMap(String key, int value){
        BookMap.put(key, value);
    }
    public int getISBN(String key){
        return BookMap.get(key);
    }    
}
