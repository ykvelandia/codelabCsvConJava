import model.Product;

import java.util.List;

public class ProductsService implements ProductService {

    private List<Product> productList;

    public ProductsService(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public void ReadCsv(String file) {

    }
}
