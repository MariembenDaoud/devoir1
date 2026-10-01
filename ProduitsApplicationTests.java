package com.mariem.produits;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mariem.produits.entities.produit;
import com.mariem.produits.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testCreateProduit() {
	produit prod = new produit("PC Dell",2200.500, new Date());
	produitRepository. save(prod);
	}

}
