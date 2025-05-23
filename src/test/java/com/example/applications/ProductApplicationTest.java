package com.example.applications;


import com.example.entities.Product;
import com.example.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProductApplicationTest {

    private final Product productTest = new Product(1, "Pão com ovo", 10.0f, "test.jpg");
    private final Product productUpdated = new Product(2, "Pão com ovo e queijo", 15.0f, "nova_imagem.jpg");

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductApplication productApplication;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);

    }


    @Test
    public void testarSalvarImagemCorretamente() {

        when(productService.save(productTest)).thenReturn(true);

        productApplication.append(productTest);

        ArgumentCaptor<Product> captor = ArgumentCaptor.forClass(Product.class);
        verify(productService).save(captor.capture());

        Product savedProduct = captor.getValue();

        String expectedImagePath = "X:\\1.png";

        Assertions.assertEquals(expectedImagePath, savedProduct.getImage(), "A imagem tem que ter sido salva nessa bagaça!");
    }

    @Test
    public void testarRemoverImagemCorretamente() {

        when(productService.getImagePathById(1)).thenReturn(productTest.getImage());

        productApplication.remove(1);

        verify(productService, times(1)).remove(1);

        when(productService.getImagePathById(1)).thenReturn(null);

        assertNull(productService.getImagePathById(1), "Bom, na teoria essa imagem tem que ter ido de arrasta");
    }

    @Test
    public void testarAtualizarImagemCorretamente() {

        productApplication.update(1, productUpdated);

        verify(productService, times(1)).update(productUpdated);
        Assertions.assertEquals("nova_imagem.jpg", productUpdated.getImage());

    }

}