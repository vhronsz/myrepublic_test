import java.util.ArrayList;

public class Main {
    static String formatSource(String source){
        String[] splittedSources = source.split(",");
        String sourceId = splittedSources[0];
        String sourceMac = splittedSources[1];
        sourceMac = sourceMac.replaceAll("([A-F0-9]{2})(?=[A-F0-9])", "$1:");

        return sourceId + "," + sourceMac;
    }

    public static void main(String[] args) {
        ArrayList<String> sources = new ArrayList<>();
        sources.add("21090022002346,FCD5D9D34A6F");
        sources.add("21090022002838,FCD5D9D34C5B");
        sources.add("21090022002965,FCD5D9D34CDA");
        sources.add("21090022003748,FCD5D9D34FE9");
        sources.add("21090022003798,FCD5D9D3501B");

        for(String source : sources){
            System.out.println(formatSource(source));
        }
    }
}
