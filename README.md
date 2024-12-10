<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS
**C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.**

In file 'mainscreen.html' I added a style sheet that occupies lines 14-88.

``` 
<style>
        .custom-theme {
            color: #2c3e50;
            background-color: #f5f5f5;
            font-family: "Crimson Text", "Times New Roman", serif;
            font-size: 1.1em;
            line-height: 1.6;
            padding: 2em;
        }

        .custom-theme h1 {
            font-family: "Playfair Display", "Times New Roman", serif;
            color: #2c3e50;
            line-height: 1.2;
            font-size: 2.4em;
            margin-bottom: 0.5em;
        }

        .custom-theme h2 {
            font-family: "Playfair Display", "Times New Roman", serif;
            color: #2c3e50;
            font-size: 1.8em;
            margin: 1em 0;
        }

        .custom-theme .table {
            background: white;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        }

        .custom-theme .thead-dark {
            background-color: #2c3e50;
            color: white;
        }

        .custom-theme .btn-primary {
            background-color: #2c5282;
            border-color: #2c5282;
        }

        .custom-theme .btn-primary:hover {
            background-color: #2B6CB0;
            border-color: #2B6CB0;
        }

        .custom-theme form {
            background: white;
            padding: 1.5em;
            border-radius: 4px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
            margin: 1em 0;
        }

        .custom-theme input[type="text"] {
            padding: 0.5em;
            border: 1px solid #e2e8f0;
            border-radius: 4px;
            margin-right: 0.5em;
        }

        .custom-theme input[type="submit"],
        .custom-theme input[type="button"] {
            background-color: #2c5282;
            color: white;
            border: none;
            padding: 0.5em 1em;
            border-radius: 4px;
            cursor: pointer;
        }

        .custom-theme input[type="submit"]:hover,
        .custom-theme input[type="button"]:hover {
            background-color: #2B6CB0;
        }
    </style>
```

Line 90 I changed the title to 'Cole's Custom Keyboards'

```
<h1>Cole's Custom Keyboards</h1>
```

Line 94 I changed the header to 'Cole's Custom Keyboards'

```
<h1>Cole's Custom Keyboards</h1>
```

Line 97 I changed the header to 'Keyboard Components'

```
<h2>Keyboard components</h2>
```

Line 132 I changed the header to 'Pre-Built Keyboards'

```
<h2>Pre-built Keyboards</h2>
```

Line 8 I added reference to google fonts to allow my font in the style

```
<link href="https://fonts.googleapis.com/css2?family=Crimson+Text:wght@400;600&family=Playfair+Display:wght@400;700&display=swap" rel="stylesheet">
```

**D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.**

File: mainscreen.html 

Line 96 added a button to navigate to about.html

```
<a href="/about" class="btn btn-info">About Cole's Custom Keyboards</a>
```

In MainScreenControllerr.java

Line 56 added a controller to enable access to about.html

```
    @GetMapping("/about")
    public String about() {
        return "about";
    }
```

NEW about.html

Line 1-130 added a new about us page using the same styling as the mainscreen but with different structure for 'Our Story' and 'Our Products'.

```
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css2?family=Crimson+Text:wght@400;600&family=Playfair+Display:wght@400;700&display=swap" rel="stylesheet">

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom CSS -->
  <style>
    .custom-theme {
      color: #2c3e50;
      background-color: #f5f5f5;
      font-family: "Crimson Text", "Times New Roman", serif;
      font-size: 1.1em;
      line-height: 1.6;
      padding: 2em;
    }

    .custom-theme h1 {
      font-family: "Playfair Display", "Times New Roman", serif;
      color: #2c3e50;
      line-height: 1.2;
      font-size: 2.4em;
      margin-bottom: 0.5em;
    }

    .custom-theme h2 {
      font-family: "Playfair Display", "Times New Roman", serif;
      color: #2c3e50;
      font-size: 1.8em;
      margin: 1em 0;
    }

    .custom-theme .section {
      background: white;
      padding: 2em;
      margin: 2em 0;
      border-radius: 4px;
      box-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }

    .custom-theme .btn-primary {
      background-color: #2c5282;
      border-color: #2c5282;
      margin: 0.5em 0;
    }

    .custom-theme .btn-primary:hover {
      background-color: #2B6CB0;
      border-color: #2B6CB0;
    }

    .custom-theme .navigation {
      background: white;
      padding: 1em;
      margin-bottom: 2em;
      border-radius: 4px;
      box-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }

    .custom-theme .product-card {
      background: white;
      padding: 1.5em;
      margin: 1em 0;
      border-radius: 4px;
      box-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }

    .custom-theme .product-img {
      width: 100%;
      height: auto;
      border-radius: 4px;
      margin-bottom: 1em;
    }
  </style>

  <title>About Us - Cole's Custom Keyboards</title>
</head>
<body>
<div class="container custom-theme">
  <!-- Navigation -->
  <div class="navigation">
    <a href="mainscreen" class="btn btn-primary">Home</a>
    <a href="about" class="btn btn-primary">About Us</a>
  </div>

  <h1>About Cole's Custom Keyboards</h1>
  <hr>

  <!-- Our Story Section -->
  <div class="section">
    <h2>Our Story</h2>
    <p>Founded in 2024, Cole's Custom Keyboards emerged from a deep-rooted passion for creating exceptional typing experiences. Our journey began with a simple belief: every keyboard should be a masterpiece of craftsmanship and precision. As enthusiasts ourselves, we understand that a keyboard is more than just a tool—it's an extension of your creativity and productivity.</p>
    <p>What sets us apart is our unwavering commitment to premium quality and attention to detail. Each keyboard and component we offer is carefully selected and tested to meet our exacting standards. From the smooth action of our switches to the precise fit of our keycaps, we ensure every element contributes to a superior typing experience. Our dedication to quality extends beyond our products to our customer service, where we take pride in helping each client find their perfect keyboard configuration.</p>
    <p>At Cole's Custom Keyboards, we believe that premium craftsmanship shouldn't be a luxury—it should be the standard. This philosophy drives us to continuously source the finest components and maintain the highest quality control standards in the industry.</p>
  </div>

  <!-- Our Products Section -->
  <div class="section">
    <h2>Our Products</h2>
    <div class="row">
      <!-- Custom Keyboards -->
      <div class="col-md-6">
        <div class="product-card">
          <img src="/api/placeholder/400/300" alt="Custom Keyboards" class="product-img">
          <h3>Premium Pre-built Keyboards</h3>
          <p>Our pre-built keyboards represent the pinnacle of mechanical keyboard craftsmanship. Each keyboard is meticulously assembled by our expert team, using only the finest materials and components available. We take pride in our rigorous quality control process, where every keyboard undergoes extensive testing to ensure perfect functionality, consistent feel, and flawless finish.</p>
          <p>From our signature series featuring premium aluminum cases to our specially curated switch selections, each keyboard is built to deliver an exceptional typing experience that will last for years to come. We don't just build keyboards; we create instruments of productivity and enjoyment that reflect our passion for perfection.</p>
        </div>
      </div>
      <!-- Components -->
      <div class="col-md-6">
        <div class="product-card">
          <img src="/api/placeholder/400/300" alt="Keyboard Components" class="product-img">
          <h3>Premium Components</h3>
          <p>We understand that exceptional keyboards start with exceptional components. That's why we carefully source and stock only the highest quality parts in the industry. Our component selection includes premium switches known for their smooth action and reliability, high-grade keycaps crafted from the finest materials, and precision-engineered stabilizers that ensure consistent feel across every key.</p>
          <p>Each component in our inventory is hand-selected and tested to meet our strict quality standards. Whether you're building your own keyboard or upgrading an existing one, our premium components provide the foundation for an unparalleled typing experience.</p>
        </div>
      </div>
    </div>
  </div>
</div>

</body>
</html>
```

**E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.**

In BootStrapData.java

Line 3-7 added import statements for InhousePartForm

```
import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
```

Line 27-38 - inserted repo for inhouse parts

```
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
```

Line 43-136 Added my parts to the part repository, both inhouse and outsourced.

```
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
```

Line 138-148 - added my products to the product repository

```
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
```

**F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:**

**•  The “Buy Now” button must be next to the buttons that update and delete products.**

File: mainscreen.html

Line 161 - Created a 'buy now' button next to the buttons that update and delete products.

```
 <a th:href="@{/buyProduct(productID=${tempProduct.id})}" class="btn btn-primary btn-sm mb-3">Buy</a>
```

**•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.**

New File: BuyProductController.java

Line 1-56 - New controller and logic to handling the inventory changes associated with purchasing products. This will also return the view associated with the actions. (buysuccess/buyfailure).

```
package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class BuyProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    @Transactional
    public String buyProduct(@RequestParam("productID") Long theId, Model theModel) {
        try {
            // Attempt to find the product in the database
            Optional<Product> productToBuy = productRepository.findById(theId);

            // Check if the product exists
            if (!productToBuy.isPresent()) {
                theModel.addAttribute("errorMessage", "Product not found in catalog");
                return "confirmbuyfailure";  // Return failure view if product not found
            }
            // Get the actual product from the Optional
            Product product = productToBuy.get();
            // Check if the product is in stock
            if (product.getInv() <= 0) {
                theModel.addAttribute("errorMessage", "Product is out of stock");
                return "confirmbuyfailure"; // Return failure view if out of stock
            }
            // Decrement the inventory count
            product.setInv(product.getInv() - 1);
            // Save the updated inventory count to the database
            productRepository.save(product);

            // Add the purchased product to the model for the success view
            theModel.addAttribute("product", product);
            return "confirmbuysuccess"; // Return success view

        } catch (Exception e) {
            // Handle any unexpected errors during the purchase process
            theModel.addAttribute("errorMessage", "An error occurred while processing your purchase");
            return "confirmbuyfailure"; // Return failure view if exception occurs
        }
    }
}
```

**•  Display a message that indicates the success or failure of a purchase.**

New File: confirmbuyfailure.html

Line 1-11 - New html document to fulfill the requirements of indicating a purchase failure upon purchase failure.

```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Unable to fulfill purchase.</title>
</head>
<body>
<h1>We are unable to complete your purchase. Check to see if the product is out of stock. Please refresh your page or contact us for further assistance.</h1>
<a href="http://localhost:8080/">Back to Home</a>
</body>
</html>
```

New File: confirmbuysuccess.html

Line 1-11 - New html document to fulfill the requirements of indicating a purchase success upon purchase success.

```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Purchase Successful!</title>
</head>
<body>
<h1> Your purchase was successful! Thank you for your support!</h1>
<a href="http://localhost:8080/">Back to Home</a>
</body>
</html>
```

**G.  Modify the parts to track maximum and minimum inventory by doing the following:**

**•  Add additional fields to the part entity for maximum and minimum inventory.**

File: Part.java

Line 31-35 - Added fields to part entity for  minimum and maximum inventory values.

```
    @Min(value = 0, message = "Minimum inventory value must be positive")
    int minInv;
    @Min(value = 0, message = "Maximum inventory must be positive")
    @Max(value = 200, message = "Maximum inventory value must fall within set maximum")
    int maxInv;
```

Line 38-57 - Assigned default inventory values to the constructors.

```
    public Part() {

    }

    public Part(String name, double price, int inv) {
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.minInv = 0; //default minimum inventory
        this.maxInv = 100; //default maximum inventory
    }

    public Part(long id, String name, double price, int inv, int minInv, int maxInv) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.minInv = minInv; //default min inventory
        this.maxInv = maxInv; //default max inventory
    }

```

Line 99-105 - getters and setters for min/maxinv

```
    public int getMinInv() { return minInv;}

    public void setMinInv(int minInv) { this.minInv = minInv;}

    public int getMaxInv() { return maxInv;}

    public void setMaxInv(int maxInv) { this.maxInv = maxInv;}
```

File: InhousePart.java

Line 17-19 - set default inventory values for inhouse parts.

```
    public InhousePart() {
        this.minInv = 0;
        this.maxInv = 100;

    }
```

File: OutsourcedPart.java

Line 17-19 - set default values for outsourced parts. 

```
    public OutsourcedPart() {
        this.minInv = 0;
        this.maxInv = 100;
    }
```

**•  Modify the sample inventory to include the maximum and minimum fields.**

File: BootStrapData.java

Line 51 & 52 - set min and max inventory variable.

```
ihp1.setMinInv(1);
ihp1.setMaxInv(100);
```

Line 65 & 66 - set min and max inventory variable.

```
ihp2.setMinInv(1);
ihp2.setMaxInv(100);
```

Line 88 & 89 - set min and max inventory variable.

```
op1.setMinInv(1);
op1.setMaxInv(100);
```

Line 105 & 106 - set min and max inventory variable.

```
op2.setMinInv(1);
op2.setMaxInv(100);
```

Line 122 & 123 - set min and max inventory variable.

```
op3.setMinInv(1);
op3.setMaxInv(100);
```

**•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.**

File: InhousePartForm.html

Line 24-28 - set inventory ranges for fields in inhousepartform

```
<p><input type="text" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('minInv')}" th:errors="*{minInv}">Minimum Inventory Error</p>

<p><input type="text" th:field="*{maxInv}" placeholder="Maximum Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('maxInv')}" th:errors="*{maxInv}">Maximum Inventory Error</p>
```

File: OutsourcedPartForm.html

Line 25-29 - set inventory ranges for fields in OutsourcedPartForm

```
<p><input type="text" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('minInv')}" th:errors="*{minInv}">Minimum Inventory Error</p>

<p><input type="text" th:field="*{maxInv}" placeholder="Maximum Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('maxInv')}" th:errors="*{maxInv}">Maximum Inventory Error</p>
```

**•  Rename the file the persistent storage is saved to.**

File: application.properties

Line 6 - change storage to 'cole-kb-db2'

```
spring.datasource.url=jdbc:h2:file:~/cole-kb-db2
```

**•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.**

File: Part.java

Line 126 - created validateLimits method to ensure inventory values fall within the specified range. Will throw errors in cases where inventory values are greater than max or less then minimum accepted values.

```
    public void validateLimits() {
        if (this.inv < this.minInv) {
            throw new RuntimeException("This value falls below required minimum.");
        } else if (this.inv > this.maxInv) {
            throw new RuntimeException("This value exceeds the allowed maximum.");
        }
    }
```

File: PartServiceImpl

Line 59 - Implemented the previous method to validate limits before saving changes.

```
 thePart.validateLimits();
```

File: OutsourcedPartServiceImpl.java

Line - 52 - Implemented the previous method to validate limits

```
thePart.validateLimits();
```

File: InhousePartServiceImpl.java

Line - 54 - Implemented the previous method to validate limits

```
thePart.validateLimits();
```

**H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:**

**•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.**

**•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.**

New File: ValidMinimum

Line 1-16 - Display error message in cases where inventory value under minimum.

```
package com.example.demo.validators;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {MinimumValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMinimum {
    String message() default "Part count falls below set minimum";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
```

New File: MinimumValidator

Line 1-20 - Logic beind message being displayed in cases where inventory value over maximum.

```
package com.example.demo.validators;
import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MinimumValidator implements ConstraintValidator<ValidMinimum, Part> {
    @Autowired
    private ApplicationContext context;
    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidMinimum constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() > part.getMinInv();
    }

}
```

File: Part.java

Line 4 - import statement.

```
import com.example.demo.validators.ValidMinimum;
```

Line 13 - implement validMinimum

```
@ValidMinimum
```

File: EnufPartsValidator.java

Line 37-40 - validation logic to check for inventory value and decrement when an item is purchased, implemented an error message in cases where its needed.

```
if (p.getInv() < (product.getInv() - myProduct.getInv())) {
constraintValidatorContext.disableDefaultConstraintViolation();
constraintValidatorContext.buildConstraintViolationWithTemplate("Insufficient inventory for part: " + p.getName()).addConstraintViolation();
return false;
```

File: Product.java

Line 3- Import ValidEnufParts

```
import com.example.demo.validators.ValidEnufParts;
```

Line 15- Implement new validation to product class.

```
@ValidEnufParts
```

New File: ValidMaximum

Line 1-24 - Display error mesage in cases where inventory value over maximum.

```
package com.example.demo.validators;

import com.example.demo.validators.MaximumValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */
@Constraint(validatedBy = {MaximumValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMaximum {
    String message() default "Part count is above set maximum";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
```

New File: MaximumValidator

Line 1-20 - Logic beind message being displayed in cases where inventory value over maximum.

```
package com.example.demo.validators;
import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MaximumValidator implements ConstraintValidator<ValidMaximum, Part> {
    @Autowired
    private ApplicationContext context;
    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidMaximum constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() <= part.getMaxInv();
    }
}
```

File: Part.java

Line 12 - Implement ValidMaximum

```
@ValidMaximum
```

 File:InhousePartForm.html 

 Line 35-39 - Display errors as messages

 ```
    <div th:if="${#fields.hasErrors()}">
        <ul>
            <li th:each="err : ${#fields.allErrors()}" th:text="${err}" class="error"/>
        </ul>
    </div>
 ```

 File:OursourcedPartForm.html

 Line 33-37 - Display errors as messages.

 ```
    <div th:if="${#fields.hasErrors()}">
        <ul>
            <li th:each="err : ${#fields.allErrors()}" th:text="${err}" class="error"/>
        </ul>
    </div>
 ```

**I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.**

File: PartTest.java

Line 160-194 -Added unit test for getters and setters ans for checking minimum inventory values following similar guidelines to the tests above.

```
    @Test
    void getMinInv() {
        int min_inv=5;
        partIn.setMinInv(min_inv);
        assertEquals(min_inv,partIn.getMinInv());
        partOut.setMinInv(min_inv);
        assertEquals(min_inv,partOut.getMinInv());
    }

    @Test
    void setMinInv() {
        int min_inv=5;
        partIn.setMinInv(min_inv);
        assertEquals(min_inv,partIn.getMinInv());
        partOut.setMinInv(min_inv);
        assertEquals(min_inv,partOut.getMinInv());
    }

    @Test
    void getMaxInv() {
        int max_inv=195;
        partIn.setMaxInv(max_inv);
        assertEquals(max_inv,partIn.getMaxInv());
        partOut.setMaxInv(max_inv);
        assertEquals(max_inv,partOut.getMaxInv());
    }

    @Test
    void setMaxInv() {
        int max_inv=195;
        partIn.setMaxInv(max_inv);
        assertEquals(max_inv,partIn.getMaxInv());
        partOut.setMaxInv(max_inv);
        assertEquals(max_inv,partOut.getMaxInv());
    }
```

**J.  Remove the class files for any unused validators in order to clean your code.**

- Deleted unused class files (DeletePathValidator.java, ValidDeletePart.java)
