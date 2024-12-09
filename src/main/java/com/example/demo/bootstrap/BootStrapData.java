package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inhousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, InhousePartRepository inhousePartRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.inhousePartRepository = inhousePartRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<InhousePart> inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();

        InhousePart ihp1 = new InhousePart();
        ihp1.setId(801);
        ihp1.setName("Set of Switches");
        ihp1.setPrice(40.00);
        ihp1.setInv(10);
        ihp1.setMinInv(1);
        ihp1.setMaxInv(100);
        inhousePartRepository.save(ihp1);
        InhousePart thePart=null;
        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            if(part.getName().equals("Set of Switches"))thePart=part;
        }

        InhousePart ihp2 = new InhousePart();
        ihp2.setId(802);
        ihp2.setName("Set of Keycaps");
        ihp2.setPrice(20.00);
        ihp2.setInv(20);
        ihp2.setMinInv(1);
        ihp2.setMaxInv(100);
        inhousePartRepository.save(ihp2);
        thePart=null;
        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            if(part.getName().equals("Set of Keycaps"))thePart=part;
        }

        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            System.out.println(part.getName()+" "+part.getId());
        }

        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();


        OutsourcedPart op1= new OutsourcedPart();
        op1.setCompanyName("Dylan's Custom PCB's");
        op1.setName("PCB");
        op1.setInv(10);
        op1.setPrice(30.00);
        op1.setId(701);
        op1.setMinInv(1);
        op1.setMaxInv(100);
        outsourcedPartRepository.save(op1);
        OutsourcedPart theOutPart=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("PCB"))theOutPart=part;
        }

        System.out.println(theOutPart.getCompanyName());

        OutsourcedPart op2= new OutsourcedPart();
        op2.setCompanyName("Aspen 3D Printing");
        op2.setName("Keyboard Case");
        op2.setInv(50);
        op2.setPrice(20.00);
        op2.setId(702);
        op2.setMinInv(1);
        op2.setMaxInv(100);
        outsourcedPartRepository.save(op2);
        theOutPart=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Keyboard Case"))theOutPart=part;
        }

        System.out.println(theOutPart.getCompanyName());

        OutsourcedPart op3= new OutsourcedPart();
        op3.setCompanyName("Dallas Computer Co.");
        op3.setName("USB-C Cable");
        op3.setInv(50);
        op3.setPrice(5.00);
        op3.setId(703);
        op3.setMinInv(1);
        op3.setMaxInv(100);
        outsourcedPartRepository.save(op3);
        theOutPart=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("USB-C Cable"))theOutPart=part;
        }

        System.out.println(theOutPart.getCompanyName());

        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        Product full_keyboard= new Product("Full-size Keyboard",200.00,8);
        Product seventy_keyboard= new Product("70% Keyboard",140.00,4);
        Product ergo_keyboard= new Product("Ergonomic Keyboard",150.00,9);
        Product split_keyboard= new Product("Split Keyboard",200.00, 4);
        Product planck_keyboard= new Product("Planck Keyboard",225.00,7);

        productRepository.save(full_keyboard);
        productRepository.save(seventy_keyboard);
        productRepository.save(ergo_keyboard);
        productRepository.save(split_keyboard);
        productRepository.save(planck_keyboard);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
