package com.example.DevOps_Project.dao;


import com.example.DevOps_Project.model.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class ProductDaoUnitTest {


            @Autowired
            private TestEntityManager testEntityManager;

            @Autowired
            private ProductDao productDao;

            @Test
            public void emptyResultTest()
            {
                Iterable<Product> products = productDao.findAll();
                assertThat(products).isNotEmpty();
            }


            @Test
            public void findAllProductsTest() {
                Product p1 = new Product("product 1", "product 1 description", 400.0);
                testEntityManager.persist(p1);
                Product p2 = new Product("product 2", "product 2 description", 600.0);
                testEntityManager.persist(p2);
                Product p3 = new Product("product 3", "product 3 description", 700.0);
                testEntityManager.persist(p3);

                testEntityManager.flush();

                Iterable<Product> products = productDao.findAll();
                assertThat(products).hasSize(6).contains(p1, p2, p3);
            }

    @Test
    public void createProductTest() {
        Product p = new Product("product 1", "product 1 description",  400.0);
        productDao.save(p);
        assertThat(p).hasFieldOrPropertyWithValue("name", "product 1");
        assertThat(p).hasFieldOrPropertyWithValue("description", "product 1 description");
        assertThat(p).hasFieldOrPropertyWithValue("price", 400.0);
    }

    @Test
    public void deleteProductTest() {
        Product p1 = new Product("product 1",  "product 1 description",  400.0);
        testEntityManager.persist(p1);
        Product p2 = new Product("product 2", "product 2 description",  600.0);
        testEntityManager.persist(p2);
        Product p3 = new Product("product 3",  "product 3 description",  700.0);
        testEntityManager.persist(p3);

        productDao.delete(p1);

        Iterable<Product> products = productDao.findAll();
        assertThat(products).doesNotContain(p1).contains(p2, p3);
    }



}
