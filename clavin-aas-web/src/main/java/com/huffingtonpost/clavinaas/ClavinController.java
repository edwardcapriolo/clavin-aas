package com.huffingtonpost.clavinaas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bericotech.clavin.GeoParser;
import com.bericotech.clavin.resolver.ResolvedLocation;

@Controller
public class ClavinController {
  
  @Autowired
  private GeoParser parser;
  
  @RequestMapping("/locate-document")
  public @ResponseBody List<ResolvedLocation> locate(@RequestParam String title, @RequestParam String content) throws Exception {
    String inputString = title + " " + content;
    List<ResolvedLocation> resolvedLocations = parser.parse(inputString);
    return resolvedLocations;
  }
  
  //@RequestMapping (method = RequestMethod.POST)
  @RequestMapping ("/locate")
  public @ResponseBody List<ResolvedLocation> locate2(@RequestParam String text) throws Exception {
    List<ResolvedLocation> resolvedLocations = parser.parse(text);
    return resolvedLocations;
  }
  
}
