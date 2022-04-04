package solutions.mundovirtual.common.model;

public class Product {
  String name;
  String description;
  Double price;

  public Product(String name, String description, Double price) {

    this.name = name;
    this.description = description;
    this.price = price;

  }

  @Override
  public String toString() {
    return new StringBuilder()
        .append("Name:").append(this.name).append(" ")
        .append("Description:").append(this.description).append(" ")
        .append("Price:").append(this.price)
        .toString();
  }

}
