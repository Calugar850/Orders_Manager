package bll;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


import dao.OrdersDAO;

import model.Orders;

/**
 * Clasa OrdersBLL: este clasa in interiorul careia se face apelul interogarilor SQL din tabelul corespunzator.
 */

public class OrdersBLL {


    private OrdersDAO ordersDAO;

    public OrdersBLL() {
        ordersDAO = new OrdersDAO();
    }

    public Orders findOrderById(int id) {
        Orders orders = ordersDAO.findById(id);
        if (orders == null) {
            throw new NoSuchElementException("The order with id =" + id + " was not found!");
        }
        return orders;
    }

    public void deleteOrderById(int id) {
        ordersDAO.deleteById(id);
    }

    public List <Orders> findAllOrder() {
        List <Orders> orders = ordersDAO.findAll();
        if (orders == null) {
            throw new NoSuchElementException("Doesn't exist orders!");
        }
        return orders;
    }

    public void insertOrder(Orders orders){
        ordersDAO.insert(orders);
    }

    public void updateOrderById(Orders order,int id){ ordersDAO.update(order,id); }
}
