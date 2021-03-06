/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-01T17:53:10.032Z[GMT]")
@Api(value = "products", description = "the products API")
public interface ProductsApi {

    @ApiOperation(value = "Cuando ya no tengo un producto", nickname = "productsDelete", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "El producto se borro correctamente"),
        @ApiResponse(code = 400, message = "El id del producto no puede llegar vacío") })
    @RequestMapping(value = "/products",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> productsDelete(@ApiParam(value = "El identificador del producto") @Valid @RequestParam(value = "id", required = false) String id
);


    @ApiOperation(value = "Retornar la lista de productos", nickname = "productsGet", notes = "", response = Body.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Consulta todos los productos creados", response = Body.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "No hay productos creados") })
    @RequestMapping(value = "/products",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Body>> productsGet();


    @ApiOperation(value = "Retomar un producto, consultando por su id", nickname = "productsIdGet", notes = "", response = Body.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Me responde la lista de productos creados", response = Body.class),
        @ApiResponse(code = 400, message = "Se necesita el Id para consultar el producto"),
        @ApiResponse(code = 404, message = "Producto no encontrado"),
        @ApiResponse(code = 500, message = "Se presento un error en el servidor") })
    @RequestMapping(value = "/products/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Body> productsIdGet(@ApiParam(value = "Este parametro me ayuda a filtar el producto que necesito consultar",required=true) @PathVariable("id") String id
);


    @ApiOperation(value = "Crear un producto nuevo", nickname = "productsPost", notes = "", tags={ "Productos", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created"), // We did it last weekend
        @ApiResponse(code = 400, message = "Se presentó un error", response = ApiResponseMessage.class), // We are going develop this one
        @ApiResponse(code = 500, message = "Error en el servidor") })
    @RequestMapping(value = "/products",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> productsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Body body);


    @ApiOperation(value = "Cuando necesitamos actualizar un producto", nickname = "productsPut", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Producto actualizado correctamente"),
        @ApiResponse(code = 400, message = "Se presentó un error"),
        @ApiResponse(code = 500, message = "Error en el servidor") })
    @RequestMapping(value = "/products",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> productsPut(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Body body
);

}
