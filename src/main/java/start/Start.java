package start;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import bll.ClientBLL;
import bll.OrdersBLL;
import bll.ProductBLL;
import model.Client;
import model.Product;
import model.Orders;

import presentation.*;

/**
 * Clasa Start: este clasa in care se initializeaza interfata si controllerul, acesta fiind clasa principala.
 */

public class Start {
	protected static final Logger LOGGER = Logger.getLogger(Start.class.getName());

	public static void main(String[] args) throws SQLException {
		View view=new View();
		ViewOrders viewOrders=new ViewOrders();
		ViewClient viewClient=new ViewClient();
		ViewProduct viewProduct=new ViewProduct();
		Controller controller=new Controller(view,viewClient,viewProduct,viewOrders);
	}
}
