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

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {

        Product product = new Product("chair");
        Product product1 = new Product("table");
        Product product2 = new Product("candle");
        Item item = new Item(new BigDecimal("120"), 4);
        Item item1 = new Item(new BigDecimal("500"), 1);
        Item item2 = new Item(new BigDecimal("50"), 12);

        Invoice invoice = new Invoice("F-ra 105");
        Invoice invoice1 = new Invoice("F-ra 110");

        item.setProduct(product);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice1);
        product.setInvoice(invoice);
        product1.setInvoice(invoice);
        product2.setInvoice(invoice1);

        invoiceDao.save(invoice);
        invoiceDao.save(invoice1);
        int invoiceNumber = invoice.getId();
        int items = invoice1.getItems().size();

        Assert.assertNotEquals(0, invoiceNumber);
        Assert.assertEquals("F-ra 105", product.getInvoice().toString());
        Assert.assertEquals(1, items);

    }
}
