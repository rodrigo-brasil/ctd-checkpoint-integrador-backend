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


        Category smartphone = new Category("smartphone");
        Category conectividade = new Category("conectividade");
        Category audio = new Category("audio");
        Category perifericos = new Category("perifericos");

        //Categories inital data
        categoryRepository.save(smartphone);
        categoryRepository.save(conectividade);
        categoryRepository.save(audio);
        categoryRepository.save(perifericos);

        //Smartphone
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
