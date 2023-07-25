package ss19_string_regex.exercise.crawl_web_news;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsCrawler {

    private static final String URL_PATTERN = "<a href=\"(.*?)\">(.*?)</a>";

    public static void main(String[] args) throws IOException {
        // Get the URL of the news page
        URL url = new URL("https://dantri.com.vn/the-gioi.htm");

        // Open a connection to the URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Read the HTML from the connection
        InputStream inputStream = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }

        String html = sb.toString();

        // Find all links in the HTML
        Pattern pattern = Pattern.compile(URL_PATTERN);
        Matcher matcher = pattern.matcher(html);

        // Create a list of links
        List<String> links = new ArrayList<>();
        while (matcher.find()) {
            links.add(matcher.group(1));
        }

        // Print the links to the console
        PrintWriter writer = new PrintWriter(System.out);
        for (String link : links) {
            writer.println(link);
        }

        writer.close();
    }
}
