package bll;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import dao.ProductDAO;

import model.Product;

/**
 * Clasa ProductBLL: este clasa in interiorul careia se face apelul interogarilor SQL din tabelul corespunzator.
 */

public class ProductBLL {


    private ProductDAO productDAO;

    public ProductBLL() {

        productDAO = new ProductDAO();
    }

    public Product findProductById(int id) {
        Product product = productDAO.findById(id);
        if (product == null) {
            throw new NoSuchElementException("The Product with id =" + id + " was not found!");
        }
        return product;
    }

    public void deleteProductById(int id) { productDAO.deleteById(id); }

    public List <Product> findAllProduct() {
        List <Product> products = productDAO.findAll();
        if (products == null) {
            throw new NoSuchElementException("Doesn't exist Products!");
        }
        return products;
    }

    public void insertProduct(Product product){ productDAO.insert(product); }

    public void updateProductById(Product product,int id){ productDAO.update(product,id); }

}

