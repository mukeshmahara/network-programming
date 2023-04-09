package myhttpsServer;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class CreatingHttpServer {
    public static void main(String[] args) {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8000), 0);


            server.createContext("/test",new MyHttpHandler());
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

            server.setExecutor(threadPoolExecutor);
            server.start();
            System.out.println("Server Started at "+server.getAddress());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

 class MyHttpHandler implements HttpHandler {

    @Override

    public void handle(HttpExchange httpExchange) throws IOException {

        String requestParamValue=null;

        if("GET".equals(httpExchange.getRequestMethod())) {

            requestParamValue = handleGetRequest(httpExchange);

        }else if("POST".equals(httpExchange)) {

            requestParamValue = handlePostRequest(httpExchange);

        }

        handleResponse(httpExchange,requestParamValue);

    }

     private String handlePostRequest(HttpExchange httpExchange) {
    return "hello";
    }

     private String handleGetRequest(HttpExchange httpExchange) {

        return httpExchange.

        getRequestURI().toString().split("\\?")[1].split("=")[1];

    }
    private void handleResponse(HttpExchange httpExchange, String requestParamValue)  throws  IOException {
        OutputStream outputStream = httpExchange.getResponseBody();
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<html>").append("<body>").
                append("<h1>").append("Hello ")
                .append(requestParamValue)
                .append("</h1>")
                .append("</body>")
                .append("</html>");
        // encode HTML content
        String htmlResponse = htmlBuilder.toString();
        // this line is a must
        httpExchange.sendResponseHeaders(200, htmlResponse.length());
        outputStream.write(htmlResponse.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}