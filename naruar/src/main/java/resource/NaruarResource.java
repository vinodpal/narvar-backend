package resource;


import model.ProductDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ProductService;

@RequestMapping("/naruar")
@RestController
public class NaruarResource {

    @Autowired
    ProductService productServcie;


    @GetMapping("/product/{id}")
//    @RequestMapping(value="/method6", produces={"application/json","application/xml"}, consumes="text/html")
    public ProductDetail getProductDetail(@PathVariable int id){
        return productServcie.getProductDetails(id);
    }

    @GetMapping("/product/{id}/deliver_date")
    public String getDeliverDays(@PathVariable("id")int product_id){
        return productServcie.getDeliverDays(product_id);
    }
}
