
package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Mapper implements Callable {
    private ArrayList array;
    //  private Map map;

    private ArrayList<Map> maplist = new ArrayList<Map>();
    Map<Integer, String> map = new HashMap<Integer, String>();


    public Map<Integer, String> mapper() {

        for (int i = 0; i < array.size(); i++) {
            //array.get(i);
            String[] line = array.get(i).toString().split(",");
            String PassId = line[0];
            String FlightId = line[1];
            String From = line[2];
            String Dest = line[3];
            String DeptTime = line[4];
            String FlightTime = line[5];

            map.put(i, From);

        }
        return map;
    }

    public ArrayList getArray() {
        return maplist;
    }

    public void setArray(ArrayList array) {
        this.array = array;
    }

 /*   @Override
    public void run() {
         mapper();
    }
*/

    @Override
    public Object call() throws Exception {
        Map<Integer, String> map2;
        map2 = mapper();
        //mapper();
        return map2;
    }
}
