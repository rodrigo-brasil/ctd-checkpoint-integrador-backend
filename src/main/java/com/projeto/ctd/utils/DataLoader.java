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

        Category informatica = new Category("Informática");
        Category video = new Category("Vídeo");
        Category smartphone = new Category("Smartphones");
        Category conectividade = new Category("Conectividade");
        Category audio = new Category("Áudio");
        Category perifericos = new Category("Periféricos");


        //Categories inital data
        categoryRepository.save(informatica);
        categoryRepository.save(video);
        categoryRepository.save(smartphone);
        categoryRepository.save(conectividade);
        categoryRepository.save(audio);
        categoryRepository.save(perifericos);

        //Informática
        productRepository.save(new Product(null,1199.d,"Monitor LG 29´","IPS, Ultra Wide, Full HD, HDMI, VESA, Ajuste de Ângulo, HDR 10, 99% sRGB, FreeSync - 29WL500","https://drive.google.com/uc?export=view&id=1fex1NmOvFQ1vXOxpMippO5cdaWwismqU",informatica));
        productRepository.save(new Product(null,869.d,"Monitor LG 23.8´","IPS, Full HD, HDMI, VESA, Ajuste de Ângulo - 24MK430H","https://drive.google.com/uc?export=view&id=1a3l0MCj0MVi0g6WxMndUBHZhTNuWbB_4",informatica));
        productRepository.save(new Product(null,1499.d,"Monitor Gamer Acer Nitro 27´","IPS, 165 Hz, Full HD, 1ms, FreeSync Premium, HDR 10, 98% sRGB, HDMI/DisplayPort, VESA, Som Integrado - VG270 S","https://drive.google.com/uc?export=view&id=1DD4cCy1O45CrHOTPh-hm0czheHyTiMVc",informatica));
        productRepository.save(new Product(null,2829.d,"Monitor Gamer Acer Predator 27´","IPS, 240 Hz, Full HD, 1ms, G-Sync, HDR 400, 99% sRGB, HDMI/DisplayPort, VESA, Som Integrado - XB273 GX","https://drive.google.com/uc?export=view&id=165HSsFC16NCKTuiTNTiGiRyleOSEigRW",informatica));
        productRepository.save(new Product(null,1299.d,"Monitor Gamer AOC Sniper 27´","IPS, Wide, 75 Hz, Full HD, 1ms, Adaptive Sync, 98% sRGB, HDMI/VGA, Ajuste de Ângulo - 27G2HE5","https://drive.google.com/uc?export=view&id=1jqzlPAmdAvmmeNVZ1pJqJxCRH5aIO0ve",informatica));
        productRepository.save(new Product(null,2169.d,"Monitor Gamer AOC Agon 24.5´"," LED, Wide, 240 Hz, Full HD, 0.5ms, FreeSync, HDMI/DisplayPort/USB-C, Ajuste de Ângulo, Som Integrado - AG251FZ2","https://drive.google.com/uc?export=view&id=1RMscfKGRxRwNix4AmZJoVHieZH4IudXY",informatica));

        //Video
        productRepository.save(new Product(null,9499.d,"Smart TV Samsung 65´","4K Neo QLED 65QN85A, Mini Led, 120hz, Processador IA, Tela Infinita, Design Slim, Alexa Built In - QN65QN85AAGXZD","https://drive.google.com/uc?export=view&id=1vTk34SrwOlgcmstFoDsVVmlH0j3Bt0nm",video));
        productRepository.save(new Product(null,1299.d,"Smart TV LED 32´","AOC, 3 HDMI, 1 USB, Wi-Fi - 32S5195/78G","https://drive.google.com/uc?export=view&id=1cQvcY-VGLsVXhXE_inQguSnGXLkvUfmA",video));
        productRepository.save(new Product(null,2799.d,"Smart TV LG 55´","4K UHD, WiFi, Bluetooth, HDR, Inteligência Artificial, ThinQ, Smart Magic, Google Alexa - 55UP7750PSB\n","https://drive.google.com/uc?export=view&id=1rTYlX0ifj8UiXST601_zms3HDpahYFfB",video));
        productRepository.save(new Product(null,1424.d,"Smart TV LG 32´","HD 32LM627B, com WiFi e Bluetooth, HDR, ThinQAI compatível com Inteligência Artificial - 32LM627BPSB","https://drive.google.com/uc?export=view&id=1MSdCEoiFrg6wCUVVTnoTSUwhAB_qqCrd",video));
        productRepository.save(new Product(null,2499.d,"Smart TV Philco 50´","PTV50N10N5E, 4K, UHD, LED, HDR10, HDMI/USB/Wi-Fi, Dolby Audio, Conversor Digital, Preto - 99503028","https://drive.google.com/uc?export=view&id=1yGlXHAbiQZ8ElWeiblYbwxy1fd9mFsel",video));
        productRepository.save(new Product(null,1699.d,"Smart TV Philco 32´","PTV39G65N5CH, HD, LED, HDMI/USB/Wi-Fi, 60Hz, Preto - 99393043","\n" +
                "https://drive.google.com/uc?export=view&id=12NX2yLf1N6MweJk7JD3Iw09ktOJrFTCb",informatica));

        //Smartphones
        productRepository.save(new Product(null,4799.d,"iPhone 12","64GB Branco, 5G, Tela de 6.1, Câmera Dupla 12MP + Selfie 12MP - MGJ63BR/A","https://drive.google.com/uc?export=view&id=1sW1e2gdKseJCqyG4cy29hGvDYNsSa3LJ",smartphone));
        productRepository.save(new Product(null,3849.d,"iPhone 11","64GB Vermelho, 4G, Tela de 6.1, Câmera Dupla 12MP + Selfie 12MP - MHDD3BR/A","https://drive.google.com/uc?export=view&id=10NXYXOVbMAl2b9YCYtEkQgHf0jxlzwpO",smartphone));
        productRepository.save(new Product(null,3514.d,"Xiaomi Redmi Note 10 Pro","6GB RAM, 128GB, Tela 6.67´, Cinza - CX314CIN","https://drive.google.com/uc?export=view&id=13xcQeigFLHxa3zgBfoEzfJaQ10fSxxJm",smartphone));
        productRepository.save(new Product(null,1059.d,"Xiaomi Redmi 9A","32GB, 13MP, Tela 6.53´, Azul Sky Blue - CX298AZU","https://drive.google.com/uc?export=view&id=1zeiN7G6-o3U6gfQ2qzL3nu1sBWYYKvDj",smartphone));
        productRepository.save(new Product(null,1259.d,"Motorola Moto G30","128GB, RAM 4GB, Octa-Core, Câmera Quádrupla, 5000mAh, White Lilac - PAMK0001BR","https://drive.google.com/uc?export=view&id=1pLCPLmxdJ-2-ajiYx-kqjoz-vQ-TEf13",smartphone));
        productRepository.save(new Product(null,1799.d,"Motorola G60","128GB, 6GB RAM, Octa-Core, Câmera Tripla, 6000mAh, Azul - PANA0000BR","https://drive.google.com/uc?export=view&id=1zd764QfEWtdLsOU1WtlwQIqrR2k2Pmsr",smartphone));
        productRepository.save(new Product(null,1500.d,"Xiaomi Pocophone Poco X3 Pro Dual SIM 256 GB metal bronze 8 GB RAM","128gb","https://drive.google.com/file/d/1-m5VSJbHYAPtDZXEtpESTbVBq5wcSYq_/view?usp=sharing",smartphone));
        productRepository.save(new Product(null,2345.d,"Iphone 7","128gb","https://drive.google.com/file/d/1-u6u2lOU4YLztB_RF7qYTTEQDyXvv6NZ/view?usp=sharing",smartphone));
        productRepository.save(new Product(null,1300.d,"Samsung A32","64gb","https://drive.google.com/file/d/1-nynbxyiQka7wjBafDPMRaSqHOf8YHrt/view?usp=sharing",smartphone));
        productRepository.save(new Product(null,3200.d,"LG k62","128gb","https://drive.google.com/file/d/1-sqhfrYV4_zXLsF8wSo2D3lQV_fYGKJ6/view?usp=sharing",smartphone));
        productRepository.save(new Product(null,3100.d,"Smartphone Motorola E7","512gb","https://drive.google.com/file/d/1-nUeEySFXrStgC51dG6DUEvH5YfNWRZI/view?usp=sharing",smartphone));

        //Conectividade
        productRepository.save(new Product(null,448.d,"iCLAMPER Pocket 3 Pinos - 10A Preto","Plugue/tomada no padrão brasileiro três pinos( 2p + t)Fonte de alimentação: ac","https://drive.google.com/file/d/1-GzxHyuOueUNdsYUxERUFbAbEKxWgq1Q/view?usp=sharing",conectividade));
        productRepository.save(new Product(null,49.d,"TPlink-Repetidor","Wi-Fi Dual band AC1750 - Simultâneamente 450Mbps em 2.4GHz + 1300Mbps em 5GHz","https://drive.google.com/file/d/1-5QVK4UOKHgEx9kGQIYig55GSlCExmu8/view?usp=sharing",conectividade));
        productRepository.save(new Product(null,1000.d,"Google Chromecast 3","Fácil de configurar: plugue o Chromecast atrás de sua TV, conecte-se no Wi-Fi e comece a transmitir.","https://drive.google.com/file/d/1-B6cDnpSlFXlU3hhXYIX4OZIHYmrSjZw/view?usp=sharing",conectividade));
        productRepository.save(new Product(null,50.d,"Smart Lâmpada Wi-Fi Positivo Casa Inteligente","Compatível com Alexa e Google Assistente – você não precisa mais se levantar para acender/apagar as luzes dos ambientes","https://drive.google.com/file/d/1-5Rz93zMjW_2XxhWekDeAMwgpchsrm-I/view?usp=sharing",conectividade));
        productRepository.save(new Product(null,22.8d,"Adaptador USB Bluetooth 4.0 CSR Dongle","Conectividade: Bluetooth 4.0, Tecnologia Plug & Play, Alcance: 20 m ","https://drive.google.com/file/d/1-0BDL9CyjmhLi012Sf9tasBHIl4eanOe/view?usp=sharing",conectividade));

        //Áudio
        productRepository.save(new Product(null,99.d,"Headphone Philips Wireless BT Preto TAH1205BK/00","15 horas de reprodução e carregamento rápido,Som nítido e claro","https://drive.google.com/file/d/1-c_gvM7UHi0Csnxd7sF5jSh6411Eodvr/view?usp=sharing",audio));
        productRepository.save(new Product(null,154.d,"Caixa de Som Bluetooth JBL Boombox 2 80W Preta - JBLBOOMBOX2BLK","O JBL Boombox 2 vem com graves monstruosos, design arrojado e incrível tempo de reprodução de 24 horas.","https://drive.google.com/file/d/1-en1bVkfuv2FY37wjET7DiLquE_BxxM0/view?usp=sharing",audio));
        productRepository.save(new Product(null,270.d,"Caixa de Som Bluetooth Anker SC Icon Mini, Laranja","A Icon Mini conta com bluetooth 4.2 que garante a transmissão em uma distância de até 20m","https://drive.google.com/file/d/1-lBZSajDdF2E3q1HxsMzOaQwWxqD2FVl/view?usp=sharing",audio));
        productRepository.save(new Product(null,300.d,"Adaptador Receptor Áudio Bluetooth P2 Som Carro","Conecte seu audio muito mais fácil com esse adaptador","https://drive.google.com/file/d/1-ZsOTnPFWhGe4F_91zeuwvQ2Vw0tGp0i/view?usp=sharing",audio));
        productRepository.save(new Product(null,550.d,"Aparelho De Som Carro Automotivo Bluetooth Pendrive Sd Rádio","Som automotivo compatível adaptável","https://drive.google.com/file/d/1-VRTpgF3fiCMgCxWlrKez49qY1vlID-6/view?usp=sharing",audio));

        //Periféricos
        productRepository.save(new Product(null,45.d,"Mouse Gamer 3200dpi Led Com Fio 125hz 6 Botões Tedge","Gamers casuais e profissionais sabem que um mouse preciso e confiável pode fazer a diferença no jogo","https://drive.google.com/file/d/1-TTiCiM-EohAZcZIedbKsck-YEyrnjek/view?usp=sharing",perifericos));
        productRepository.save(new Product(null,78.d,"Teclado Mecânico Gamer Rainbow Iluminação Led Usb Tedge","Somos Tedge, uma marca do Mercado Livre. Criamos soluções de alta tecnologia, com design inovador e excelente qualidade, para proporcionar aos nossos clientes a melhor experiência, todos os dias!","https://drive.google.com/file/d/1-T-11-YLABXI4OyrMOoJaNxEJ4PZbF31/view?usp=sharing",perifericos));
        productRepository.save(new Product(null,145.d,"Full Hd 1080p Webcam Microfone Visão Computador Câmera","Vídeo HD: vídeo Full HD de 1080p, foco automático e correção avançada de luz para conversas nítidas e precisas.Fácil de usar: conexão USB plug-and-play para PC ou Mac com Windows. Campo de visão de 360 graus: veja mais em widescreen real sem precisar reposicionar a câmera.","https://drive.google.com/file/d/1-RvH8jwOfIqluUB7T2VxJThGICsI3H3h/view?usp=sharing",perifericos));
        productRepository.save(new Product(null,123.d,"Caixa De Som Pc Notebook Subwoofer Usb Soundbar","Conheça agora a nova tecnologia da Knup criada para facilitar e ajudar o seu dia a dia. Uma caixa soudbar que não te deixa na mão, com alta potencia e um design elegante e inovador com 6 w de potencia e qualidade. imperdivel! garanta já o seu temos poucas unidades.!","https://drive.google.com/file/d/1-JkY94iGTa90uybA6WetUlj21FbnWA3C/view?usp=sharing",perifericos));
        productRepository.save(new Product(null,450.d,"Mouse sem fio Logitech  Pebble M350 cinza-azulado","Resolução de 1000dpi.Criado para levar a qualquer lugar.Controle inteligente e fácil navegação.","https://drive.google.com/file/d/1-ICZWa19E2HQIXiR4O_CBCbbT_hWOrGc/view?usp=sharing",perifericos));
    }
}
