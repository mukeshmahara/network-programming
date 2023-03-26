package URLs_and_URIs;

import java.net.MalformedURLException;
import java.net.URL;

public class URLComparision {
    public static void main(String[] args) throws MalformedURLException {
        URL url1 = new URL("https://www.mukeshmahara.com.np/");
        URL url2 = new URL("https://mukeshmahara.com.np/");

        if(url1.equals(url2)){
            System.out.println(url1+ " is same as " + url2);
        }else{
            System.out.println(url1+ "is not same as "+ url2);
        }
    }
}
