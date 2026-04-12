import java.util.*;

class Q11 {
    static void printMap(HashMap<String,String> map){
        for(Map.Entry<String,String> e : map.entrySet())
            System.out.println(e.getKey()+" -> "+e.getValue());
    }

    static String getCapital(HashMap<String,String> map, String country){
        return map.get(country);
    }

    static boolean containsCapital(HashMap<String,String> map, String capital){
        return map.containsValue(capital);
    }

    public static void main(String[] args) {
        HashMap<String,String> countryCapitals = new HashMap<>();

        countryCapitals.put("India","Delhi");
        countryCapitals.put("Nepal","Kathmandu");
        countryCapitals.put("USA","Washington");
        countryCapitals.put("UK","London");
        countryCapitals.put("Japan","Tokyo");

        printMap(countryCapitals);

        System.out.println(getCapital(countryCapitals,"India"));
        System.out.println(containsCapital(countryCapitals,"Tokyo"));
    }
}