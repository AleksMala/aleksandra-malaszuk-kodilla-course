package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;


    @Test
    public void testInvoiceDaoSave() {

        Item item = new Item(new BigDecimal("120"), 4);
        Item item2 = new Item(new BigDecimal("50"), 12);
        Item item1 = new Item(new BigDecimal("500"), 1);

        Product product = new Product("chair");
        Product product2 = new Product("candle");
        Product product1 = new Product("table");

        product.setItems(Arrays.asList(item));
        product1.setItems(Arrays.asList(item1));
        product2.setItems(Arrays.asList(item2));
        item.setProduct(product);
        item1.setProduct(product1);
        item2.setProduct(product2);

        Invoice invoice1 = new Invoice("F-ra 110");
        Invoice invoice = new Invoice("F-ra 105");

        invoice1.setItems(Arrays.asList(item2));
        invoice.setItems(Arrays.asList(item, item1));
        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice1);

        productDao.save(product);
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);
        invoiceDao.save(invoice1);

        int invoiceNumber = invoice.getId();
        int items = invoice1.getItems().size();

        Assert.assertNotEquals(0, invoiceNumber);
        Assert.assertEquals(1, items);

        try {
            invoiceDao.delete(invoice.getId());
            invoiceDao.delete(invoice1.getId());
            productDao.delete(product.getId());
            productDao.delete(product1.getId());
            productDao.delete(product2.getId());
        } catch (Exception e) {
          }
    }
}
