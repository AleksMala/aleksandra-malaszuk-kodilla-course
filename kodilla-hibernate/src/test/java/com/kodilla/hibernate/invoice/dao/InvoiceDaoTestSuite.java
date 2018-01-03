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

        productDao.save(product);
        productDao.save(product1);
        productDao.save(product2);
        itemDao.save(item);
        itemDao.save(item1);
        itemDao.save(item2);
        invoiceDao.save(invoice);
        invoiceDao.save(invoice1);
        int invoiceNumber = invoice.getId();

        Assert.assertNotEquals(1, invoiceNumber);

    }
}
