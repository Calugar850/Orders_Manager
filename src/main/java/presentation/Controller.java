package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import bll.ClientBLL;
import bll.OrdersBLL;
import bll.ProductBLL;
import model.Client;
import model.Product;
import model.Orders;

import javax.swing.*;

/**
 * Clasa Controller: este clasa de granita dintre partea grafica si programul in sine, unde se petrece interactiunea utilizator-sistem de calcul.
 */

public class Controller  {
    View view;
    ViewClient viewClient;
    ViewProduct viewProduct;
    ViewOrders viewOrders;

    ClientBLL clientBLL=new ClientBLL();
    ProductBLL productBLL=new ProductBLL();
    OrdersBLL ordersBLL=new OrdersBLL();
    List<Client> clientList=null;
    List<Product> productList=null;
    List<Orders> ordersList=null;

    Client client1=null;
    Product product1 =null;
    Orders orders1=null;
    Client c;
    Product p;
    Orders o;
    FileWriter myWriter;

    public Controller(View view, ViewClient viewClient, ViewProduct viewProduct, ViewOrders viewOrders) {
        this.view = view;
        this.viewClient = viewClient;
        this.viewProduct = viewProduct;
        this.viewOrders = viewOrders;
        viewClient.getFrame().setVisible(false);
        viewProduct.getFrame().setVisible(false);
        viewOrders.getFrame().setVisible(false);
        view.addButtonListener(new SubmmitViewListener());
        viewClient.addButtonListener(new ClientViewListener());
        viewProduct.addButtonListener(new ProductViewListener());
        viewOrders.addButtonListener(new OrdersViewListener());
        viewClient.backButtonListener(new BackListener());
        viewProduct.backButtonListener(new BackListener());
        viewOrders.backButtonListener(new BackListener());
    }

    public class SubmmitViewListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedButton=0;
            if(view.getButton1().isSelected()) selectedButton=1;
            if(view.getButton2().isSelected()) selectedButton=2;
            if(view.getButton3().isSelected()) selectedButton=3;
            switch (selectedButton){
                case 1:
                    viewClient.getFrame().setVisible(true);
                    view.getFrame().setVisible(false);
                    break;
                case 2:
                    viewProduct.getFrame().setVisible(true);
                    view.getFrame().setVisible(false);
                    break;
                case 3:
                    viewOrders.getFrame().setVisible(true);
                    view.getFrame().setVisible(false);
                    break;
                default:
                    break;
            }
        }
    }

    public class ClientViewListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedButton=0;
            if(viewClient.getButton2().isSelected()) selectedButton=2;
            if(viewClient.getButton3().isSelected()) selectedButton=3;
            if(viewClient.getButton4().isSelected()) selectedButton=4;
            if(viewClient.getButton5().isSelected()) selectedButton=5;
            if(viewClient.getBackButton().isSelected()) selectedButton=6;
            switch (selectedButton){
                case 2:
                    viewClient.stergereDupaId();
                    viewClient.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String sid=viewClient.getjTextField2().getText();
                            int idcd=Integer.parseInt(sid);
                            clientBLL.deleteClientById(idcd);
                        }
                    });
                    break;
                case 3:
                    viewClient.actualizare();
                    viewClient.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String ida=viewClient.getjTextField3().getText();
                            String nouaAdresa=viewClient.getjTextField4().getText();
                            int idac=Integer.parseInt(ida);
                            c=clientBLL.findClientById(idac);
                            c.setAdresa(nouaAdresa);
                            clientBLL.updateClientById(c,idac);
                        }
                    });
                    break;
                case 4:
                    viewClient.afisare(afisareTabela(clientBLL.findAllClient()));
                    break;
                case 5:
                    viewClient.introducere();
                    viewClient.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String numeClient=viewClient.getjTextField5().getText();
                            String adresaClient=viewClient.getjTextField6().getText();
                            c=new Client(numeClient,adresaClient);
                            clientBLL.insertClient(c);
                        }
                    });
                    break;
                case 6:
                    viewClient.addButtonListener(new BackListener());
                    break;
                default:
                    break;
            }
        }
    }

    public class ProductViewListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedButton=0;
            if(viewProduct.getButton2().isSelected()) selectedButton=2;
            if(viewProduct.getButton3().isSelected()) selectedButton=3;
            if(viewProduct.getButton4().isSelected()) selectedButton=4;
            if(viewProduct.getButton5().isSelected()) selectedButton=5;
            if(viewProduct.getBackButton().isSelected()) selectedButton=6;
            switch (selectedButton){
                case 2:
                    viewProduct.stergereDupaId();
                    viewProduct.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String sid=viewProduct.getjTextField2().getText();
                            int idcd=Integer.parseInt(sid);
                            productBLL.deleteProductById(idcd);
                        }
                    });
                    break;
                case 3:
                    viewProduct.actualizare();
                    viewProduct.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String ida=viewProduct.getjTextField3().getText();
                            String cantitate=viewProduct.getjTextField4().getText();
                            String pret=viewProduct.getjTextField5().getText();
                            int idap=Integer.parseInt(ida);
                            int nouaCantitate=Integer.parseInt(cantitate);
                            int pretNou=Integer.parseInt(pret);
                            p=productBLL.findProductById(idap);
                            p.setCantitate(nouaCantitate);
                            p.setPret(pretNou);
                            productBLL.updateProductById(p,idap);

                        }
                    });
                    break;
                case 4:
                    viewProduct.afisare(afisareTabela(productBLL.findAllProduct()));
                    break;
                case 5:
                    viewProduct.introducere();
                    viewProduct.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String numeP=viewProduct.getjTextField6().getText();
                            String cantitate=viewProduct.getjTextField7().getText();
                            String pret=viewProduct.getjTextField8().getText();
                            int cant=Integer.parseInt(cantitate);
                            int pretP=Integer.parseInt(pret);
                            p=new Product(numeP,cant,pretP);
                            productBLL.insertProduct(p);
                        }
                    });
                    break;
                case 6:
                    viewProduct.addButtonListener(new BackListener());
                    break;
                default:
                    break;
            }
        }
    }

    public class OrdersViewListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedButton=0;
            if(viewOrders.getButton2().isSelected()) selectedButton=2;
            if(viewOrders.getButton4().isSelected()) selectedButton=4;
            if(viewOrders.getButton5().isSelected()) selectedButton=5;
            if(viewOrders.getBackButton().isSelected()) selectedButton=5;
            switch (selectedButton){
                case 2:
                    viewOrders.stergereDupaId();
                    viewOrders.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String sid=viewOrders.getjTextField2().getText();
                            int idcd=Integer.parseInt(sid);
                            ordersBLL.deleteOrderById(idcd);
                        }
                    });
                    break;
                case 4:
                    viewOrders.afisare(afisareTabela(ordersBLL.findAllOrder()));
                    break;
                case 5:
                    viewOrders.introducere();
                    viewOrders.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String idClient=viewOrders.getjTextField5().getText();
                            String idProdus=viewOrders.getjTextField6().getText();
                            String cantitate=viewOrders.getjTextField7().getText();
                            String suma=viewOrders.getjTextField8().getText();
                            int idc=Integer.parseInt(idClient);
                            int idp=Integer.parseInt(idProdus);
                            int cant=Integer.parseInt(cantitate);
                            int s=Integer.parseInt(suma);
                            client1=clientBLL.findClientById(idc);
                            if(client1==null) System.out.println("Clientul nu exista");
                            product1=productBLL.findProductById(idp);
                            if(product1==null || product1.getCantitate()<=0) System.out.println("Produsul nu exista");
                            if(product1.getCantitate()<=0) System.out.println("Cantitatea este prea mica");
                            product1.setCantitate(product1.getCantitate()-cant);
                            productBLL.updateProductById(product1,idp);
                            s=cant*product1.getPret();
                            o=new Orders(idc,idp,cant,s);
                            ordersBLL.insertOrder(o);
                            String orderName=String.valueOf(idc)+"-"+String.valueOf(idp);
                            try {
                                myWriter=new FileWriter("order"+orderName+".txt");
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            }
                            try {
                                myWriter.write(" "+client1.getNume()+" a cumparat "+cant+" "+product1.getNume()+" cu pretul de "+product1.getPret()+" si totalul este "+s+" ");
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            }
                            try {
                                myWriter.close();
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            }
                        }
                    });
                    break;
                case 6:
                    viewOrders.addButtonListener(new BackListener());
                    break;
                default:
                    break;
            }
        }
    }

    public class BackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            viewClient.back();
            viewProduct.back();
            viewOrders.back();
            viewClient.getFrame().setVisible(false);
            viewProduct.getFrame().setVisible(false);
            viewOrders.getFrame().setVisible(false);
            view.getFrame().setVisible(true);
        }
    }

    public JTable afisareTabela(Object o) {
        List<?> objects = (List<?>) o;
        JTable jTable;
        String[] columnnames;
        ArrayList<String> coloane;
        coloane = new ArrayList<>();
        Field[] fields=objects.get(0).getClass().getDeclaredFields();
        for(int i=0;i<fields.length;i++) {
                fields[i].setAccessible(true);
                try {
                    coloane.add(fields[i].getName());
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
        }
        columnnames = new String[coloane.size()];
        columnnames = coloane.toArray(columnnames);
        int counter = 0;
        String[][] randuri;
        randuri = new String[objects.size()][];
        for (Object object : objects) {
            coloane = new ArrayList<>();
            fields=objects.get(counter).getClass().getDeclaredFields();
            for(int j=0;j<fields.length;j++) {
                    fields[j].setAccessible(true);
                    try {
                        coloane.add(fields[j].get(object).toString());

                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
            }
            randuri[counter] = new String[coloane.size()];
            randuri[counter] = coloane.toArray(randuri[counter++]);
        }
        jTable = new JTable(randuri, columnnames);
        return jTable;
    }
}