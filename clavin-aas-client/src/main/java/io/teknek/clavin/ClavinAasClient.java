package io.teknek.clavin;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import net.sf.corn.httpclient.HttpForm;
import net.sf.corn.httpclient.HttpResponse;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class ClavinAasClient {

  private static ObjectMapper MAPPER = new ObjectMapper();
  {
    MAPPER.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

  private URI base;

  public ClavinAasClient(String host, int port) throws URISyntaxException {
    base = new URI("http://" + host + ":" + port + "/clavin-aas-web/locate");
  }

  public List<ResolvedLocation> getLocation(String content) throws IOException {
    List<ResolvedLocation> r = null;
    HttpForm form = new HttpForm(base);
    form.setReadTimeout(3000);
    form.putFieldValue("text", content);
    HttpResponse response = form.doPost();
    String s = response.getData();
    r = (List<ResolvedLocation>) MAPPER.readValue(s, new TypeReference<List<ResolvedLocation>>() {
    });
    return r;
  }

  public static void main(String[] args) throws IOException, URISyntaxException {
    ClavinAasClient c = new ClavinAasClient("localhost", 8080);
    System.out.println(c.getLocation("I love White Plains, New York"));
  }
}
