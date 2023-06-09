package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {

  private final Logger log = LoggerFactory.getLogger(getClass());

  @GetMapping("/hello-basic")
  public String helloBasic() {
    log.info("mapping-get-v2");
    return "OK";
  }

  @GetMapping("/mapping/{userId}")
  public String mappingPath(@PathVariable("userID") String data) {
    log.info("mappingPath userId ={}", data);

    return "OK";
  }
}
