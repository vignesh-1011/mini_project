package collections.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        
        ArrayList<String> countryList=new ArrayList<>();
        
        countryList.add("India");
        countryList.add("USA");
        countryList.add("UK");
        
        System.out.println(countryList);
        
        //method - 1
        for(String country:countryList)
        {
            System.out.println(country);
        }
        
        //method - 2
        for(int i=0;i<countryList.size();i++)
        {
            System.out.println(countryList.get(i));
        }
        
        //method - 3
        Iterator<String> iterator=countryList.iterator();
        System.out.println(iterator);
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }   
        
        
        System.out.println(countryList.get(1));
        System.out.println(countryList.contains("India"));
        System.out.println(countryList.indexOf("USA"));
        System.out.println(countryList.isEmpty());
        //System.out.println(countryList.remove(1));
        System.out.println(countryList.remove("USA"));
        
        System.out.println(countryList);
        
        
        List<String> cityList=new ArrayList();
        cityList.add("Mumbai");
        cityList.add("Chennai");
        cityList.add("Kolkata");
        
        System.out.println(cityList);
        
        

    }

}
