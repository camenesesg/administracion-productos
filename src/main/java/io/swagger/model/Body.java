package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Body
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-01T17:53:10.032Z[GMT]")
public class Body   {

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nombre")
  @NotEmpty
  private String nombre = null;

  @JsonProperty("peso")
  @Min(value = 0)
  private Double peso = null;

  @JsonProperty("fechaLote")
  private LocalDate fechaLote = null;

  @JsonProperty("fechaVencimiento")
  private LocalDate fechaVencimiento = null;

  @JsonProperty("precio")
  @Min(value = 0)
  private Double precio = null;

  public Body id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Body nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(value = "")
  
    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Body peso(Double peso) {
    this.peso = peso;
    return this;
  }

  /**
   * Get peso
   * @return peso
  **/
  @ApiModelProperty(example = "10", value = "")
  
    public Double getPeso() {
    return peso;
  }

  public void setPeso(Double peso) {
    this.peso = peso;
  }

  public Body fechaLote(LocalDate fechaLote) {
    this.fechaLote = fechaLote;
    return this;
  }

  /**
   * Get fechaLote
   * @return fechaLote
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getFechaLote() {
    return fechaLote;
  }

  public void setFechaLote(LocalDate fechaLote) {
    this.fechaLote = fechaLote;
  }

  public Body fechaVencimiento(LocalDate fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
    return this;
  }

  /**
   * Get fechaVencimiento
   * @return fechaVencimiento
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getFechaVencimiento() {
    return fechaVencimiento;
  }

  public void setFechaVencimiento(LocalDate fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
  }

  public Body precio(Double precio) {
    this.precio = precio;
    return this;
  }

  /**
   * Get precio
   * @return precio
  **/
  @ApiModelProperty(example = "100", value = "")
  
    public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(this.id, body.id) &&
        Objects.equals(this.nombre, body.nombre) &&
        Objects.equals(this.peso, body.peso) &&
        Objects.equals(this.fechaLote, body.fechaLote) &&
        Objects.equals(this.fechaVencimiento, body.fechaVencimiento) &&
        Objects.equals(this.precio, body.precio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, peso, fechaLote, fechaVencimiento, precio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    peso: ").append(toIndentedString(peso)).append("\n");
    sb.append("    fechaLote: ").append(toIndentedString(fechaLote)).append("\n");
    sb.append("    fechaVencimiento: ").append(toIndentedString(fechaVencimiento)).append("\n");
    sb.append("    precio: ").append(toIndentedString(precio)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
