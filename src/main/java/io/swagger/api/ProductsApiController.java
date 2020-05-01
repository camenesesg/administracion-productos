package io.swagger.api;

import io.swagger.model.Body;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-01T17:53:10.032Z[GMT]")
@Controller
public class ProductsApiController implements ProductsApi {

    private static final Logger log = LoggerFactory.getLogger(ProductsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private List<Body> productos;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.productos = new ArrayList<>();
    }

    public ResponseEntity<Void> productsDelete(@ApiParam(value = "El identificador del producto") @Valid @RequestParam(value = "id", required = false) String id) {
        for(int i = 0; i < productos.size(); i++) {
            Body body = productos.get(i);
            if (body.getId().compareTo(id) == 0) {
                productos.remove(i);
            }
        }
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Body>> productsGet() {
        return new ResponseEntity<List<Body>>(productos, HttpStatus.OK);
    }

    public ResponseEntity<Body> productsIdGet(@ApiParam(value = "Este parametro me ayuda a filtar el producto que necesito consultar",required=true) @PathVariable("id") String id) {

        for(int i = 0; i < productos.size(); i++) {
            Body body = productos.get(i);
            if (body.getId().compareTo(id) == 0) {
                return new ResponseEntity<Body>(body, HttpStatus.OK);
            }
        }
        return new ResponseEntity<Body>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Void> productsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Body body) {

        productos.add(body);
        return new ResponseEntity<Void>(HttpStatus.CREATED);

    }

    public ResponseEntity<Void> productsPut(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Body body
) {
        for(int i = 0; i < productos.size(); i++) {
            Body producto = productos.get(i);
            if (producto.getId().compareTo(body.getId()) == 0) {
                productos.set(i, body);
            }
        }
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
