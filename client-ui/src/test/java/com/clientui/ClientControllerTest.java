package com.clientui;


import org.junit.Before;
import org.junit.Test;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


public class ClientControllerTest extends AbstractTest {
   @Override
   @Before
   public void setUp() {
      super.setUp();
   }
   
   
   @Test
   public void getHome() throws Exception {
      String uri = "/";
      mvc.perform(get(uri))
      .andExpect(status().isOk())
      .andExpect(view().name("Accueil"));
    
   }
   /*
   @Test
   public void getProduitsList() throws Exception {
      String uri = "/Produits";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
      
      int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);
      String content = mvcResult.getResponse().getContentAsString();
      ClientController productlist = super.mapFromJson(content, ClientController.class);
      assertTrue(productlist.getData().size() > 0);
   }
   */
   /*
   @Test
   public void createProduct() throws Exception {
      String uri = "/Produits";
      Product product = new Product();
      product.setId(3);
      product.setNom("Ginger");
      product.setPrix(30);
      product.setPrixAchat(12);
      String inputJson = super.mapToJson(product);
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
         .contentType(MediaType.APPLICATION_JSON_VALUE)
         .content(inputJson)).andReturn();
      
      int status = mvcResult.getResponse().getStatus();
      assertEquals(201, status);
      String content = mvcResult.getResponse().getContentAsString();
      assertEquals(content, "Product is created successfully");
   }
   */
   /*
   @Test
   public void updateProduct() throws Exception {
      String uri = "/Produits/2";
      Product product = new Product();
      product.setNom("Lemon");
      String inputJson = super.mapToJson(product);
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri)
         .contentType(MediaType.APPLICATION_JSON_VALUE)
         .content(inputJson)).andReturn();
      
      int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);
      String content = mvcResult.getResponse().getContentAsString();
      assertEquals(content, "Product is updated successsfully");
   }
   */
   /*
   @Test
   public void deleteProduct() throws Exception {
      String uri = "/Produits/2";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
      int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);
      String content = mvcResult.getResponse().getContentAsString();
      assertEquals(content, "Product is deleted successsfully");
   }
   */
}