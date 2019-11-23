package network;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class WebReader {
    public void webReader() throws IOException {
        System.out.println("Type in the the brand of product you are looking for:");
        Scanner s = new Scanner(System.in);
        String brand = s.nextLine();
        System.out.println("Type in the product type");
        String type = s.nextLine();
        BufferedReader br = null;
        read(brand,type,br);
    }

    public void read(String brand,String type,BufferedReader br) throws IOException {
        try {
            String theURL = "http://makeup-api.herokuapp.com/api/v1/products.json?brand=" + brand + "&product_type=" + type;
            URL url = new URL(theURL);
            br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            System.out.println(sb);
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }
}
