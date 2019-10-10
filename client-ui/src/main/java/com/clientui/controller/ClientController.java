package com.clientui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clientui.beans.ProductBean;
import com.clientui.proxies.MicroserviceProductsProxy;


@Controller
public class ClientController {

    @Autowired
    private MicroserviceProductsProxy ProductsProxy;

    @RequestMapping("/")
    public String accueil(Model model){

        List<ProductBean> produits =  ProductsProxy.listeDesProduits();

        model.addAttribute("produits", produits);

        return "Accueil";
    }

}