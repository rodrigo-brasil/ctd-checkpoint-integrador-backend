package com.projeto.ctd.utils;

import com.projeto.ctd.models.Category;
import com.projeto.ctd.models.Product;
import com.projeto.ctd.repository.CategoryRepository;
import com.projeto.ctd.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader implements ApplicationRunner {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    @Autowired
    public DataLoader(ProductRepository productRepository,CategoryRepository categoryRepository ) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public void run(ApplicationArguments args) {

        Category video = new Category("Vídeo");
        Category informatica = new Category("Informática");
        Category smartphone = new Category("Smartphone");

        //Categories inital data
        categoryRepository.save(video);
        categoryRepository.save(informatica);
        categoryRepository.save(smartphone);

        //Products inital data
        productRepository.save(new Product(null,1199.d,"Monitor LG 29´","IPS, Ultra Wide, Full HD, HDMI, VESA, Ajuste de Ângulo, HDR 10, 99% sRGB, FreeSync - 29WL500","https://drive.google.com/uc?export=view&id=1fex1NmOvFQ1vXOxpMippO5cdaWwismqU",video));
        productRepository.save(new Product(null,869.d,"Monitor LG 23.8´","IPS, Full HD, HDMI, VESA, Ajuste de Ângulo - 24MK430H","https://drive.google.com/uc?export=view&id=1a3l0MCj0MVi0g6WxMndUBHZhTNuWbB_4",video));
        productRepository.save(new Product(null,1499.d,"Monitor Gamer Acer Nitro 27´","IPS, 165 Hz, Full HD, 1ms, FreeSync Premium, HDR 10, 98% sRGB, HDMI/DisplayPort, VESA, Som Integrado - VG270 S","https://drive.google.com/uc?export=view&id=1DD4cCy1O45CrHOTPh-hm0czheHyTiMVc",video));
        productRepository.save(new Product(null,2829.d,"Monitor Gamer Acer Predator 27´","IPS, 240 Hz, Full HD, 1ms, G-Sync, HDR 400, 99% sRGB, HDMI/DisplayPort, VESA, Som Integrado - XB273 GX","https://drive.google.com/uc?export=view&id=165HSsFC16NCKTuiTNTiGiRyleOSEigRW",video));
        productRepository.save(new Product(null,1299.d,"Monitor Gamer AOC Sniper 27´","IPS, Wide, 75 Hz, Full HD, 1ms, Adaptive Sync, 98% sRGB, HDMI/VGA, Ajuste de Ângulo - 27G2HE5","https://drive.google.com/uc?export=view&id=1jqzlPAmdAvmmeNVZ1pJqJxCRH5aIO0ve",video));
        productRepository.save(new Product(null,2169.d,"Monitor Gamer AOC Agon 24.5´"," LED, Wide, 240 Hz, Full HD, 0.5ms, FreeSync, HDMI/DisplayPort/USB-C, Ajuste de Ângulo, Som Integrado - AG251FZ2","https://drive.google.com/uc?export=view&id=1RMscfKGRxRwNix4AmZJoVHieZH4IudXY",video));

        productRepository.save(new Product(null,9499.d,"Smart TV Samsung 65´","4K Neo QLED 65QN85A, Mini Led, 120hz, Processador IA, Tela Infinita, Design Slim, Alexa Built In - QN65QN85AAGXZD","https://drive.google.com/uc?export=view&id=1vTk34SrwOlgcmstFoDsVVmlH0j3Bt0nm",informatica));
        productRepository.save(new Product(null,1299.d,"Smart TV LED 32´","AOC, 3 HDMI, 1 USB, Wi-Fi - 32S5195/78G","https://drive.google.com/uc?export=view&id=1cQvcY-VGLsVXhXE_inQguSnGXLkvUfmA",informatica));
        productRepository.save(new Product(null,2799.d,"Smart TV LG 55´","4K UHD, WiFi, Bluetooth, HDR, Inteligência Artificial, ThinQ, Smart Magic, Google Alexa - 55UP7750PSB\n","https://drive.google.com/uc?export=view&id=1rTYlX0ifj8UiXST601_zms3HDpahYFfB",informatica));
        productRepository.save(new Product(null,1424.d,"Smart TV LG 32´","HD 32LM627B, com WiFi e Bluetooth, HDR, ThinQAI compatível com Inteligência Artificial - 32LM627BPSB","https://drive.google.com/uc?export=view&id=1MSdCEoiFrg6wCUVVTnoTSUwhAB_qqCrd",informatica));
        productRepository.save(new Product(null,2499.d,"Smart TV Philco 50´","PTV50N10N5E, 4K, UHD, LED, HDR10, HDMI/USB/Wi-Fi, Dolby Audio, Conversor Digital, Preto - 99503028","https://drive.google.com/uc?export=view&id=1yGlXHAbiQZ8ElWeiblYbwxy1fd9mFsel",informatica));
        productRepository.save(new Product(null,1699.d,"Smart TV Philco 32´","PTV39G65N5CH, HD, LED, HDMI/USB/Wi-Fi, 60Hz, Preto - 99393043","\n" +
                "https://drive.google.com/uc?export=view&id=12NX2yLf1N6MweJk7JD3Iw09ktOJrFTCb",informatica));

        productRepository.save(new Product(null,4799.d,"iPhone 12","64GB Branco, 5G, Tela de 6.1, Câmera Dupla 12MP + Selfie 12MP - MGJ63BR/A","https://drive.google.com/uc?export=view&id=1sW1e2gdKseJCqyG4cy29hGvDYNsSa3LJ",smartphone));
        productRepository.save(new Product(null,3849.d,"iPhone 11","64GB Vermelho, 4G, Tela de 6.1, Câmera Dupla 12MP + Selfie 12MP - MHDD3BR/A","https://drive.google.com/uc?export=view&id=10NXYXOVbMAl2b9YCYtEkQgHf0jxlzwpO",smartphone));
        productRepository.save(new Product(null,3514.d,"Xiaomi Redmi Note 10 Pro","6GB RAM, 128GB, Tela 6.67´, Cinza - CX314CIN","https://drive.google.com/uc?export=view&id=13xcQeigFLHxa3zgBfoEzfJaQ10fSxxJm",smartphone));
        productRepository.save(new Product(null,1059.d,"Xiaomi Redmi 9A","32GB, 13MP, Tela 6.53´, Azul Sky Blue - CX298AZU","https://drive.google.com/uc?export=view&id=1zeiN7G6-o3U6gfQ2qzL3nu1sBWYYKvDj",smartphone));
        productRepository.save(new Product(null,1259.d,"Motorola Moto G30","128GB, RAM 4GB, Octa-Core, Câmera Quádrupla, 5000mAh, White Lilac - PAMK0001BR","https://drive.google.com/uc?export=view&id=1pLCPLmxdJ-2-ajiYx-kqjoz-vQ-TEf13",smartphone));
        productRepository.save(new Product(null,1799.d,"Motorola G60","128GB, 6GB RAM, Octa-Core, Câmera Tripla, 6000mAh, Azul - PANA0000BR","https://drive.google.com/uc?export=view&id=1zd764QfEWtdLsOU1WtlwQIqrR2k2Pmsr",smartphone));
    }
}
