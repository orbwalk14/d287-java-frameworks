<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS
**C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.**

In file 'mainscreen.html' I added a style sheet that occupies lines 14-88.

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

Line 90 I changed the title to 'Cole's Custom Keyboards'
<h1>Cole's Custom Keyboards</h1>
Line 94 I changed the header to 'Cole's Custom Keyboards'
<h1>Cole's Custom Keyboards</h1>
Line 97 I changed the header to 'Keyboard Components'
<h2>Keyboard components</h2>
Line 132 I changed the header to 'Pre-Built Keyboards'
<h2>Pre-built Keyboards</h2>
Line 8 I added reference to google fonts to allow my font in the style
<link href="https://fonts.googleapis.com/css2?family=Crimson+Text:wght@400;600&family=Playfair+Display:wght@400;700&display=swap" rel="stylesheet">

**D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.**

In mainscreen.html 
Line 96 added a button to navigate to about.html
<a href="/about" class="btn btn-info">About Cole's Custom Keyboards</a>

In MainScreenControllerr.java
Line 56 added a controller to enable access to about.html

    @GetMapping("/about")
    public String about() {
        return "about";
    }

NEW about.html
Line 1-130 added a new about us page using the same styling as the mainscreen but with different structure for 'Our Story' and 'Our Products'.
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

**E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.**

In BootStrapData.java
Line 3-7 added import statements for InhousePartForm

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;

Line 27-38 inserted repo for inhouse parts

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
Line 43-136 Added my parts to the part repository, both inhouse and outsourced.

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
Line 138-148 added my products to the product repository

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

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

J.  Remove the class files for any unused validators in order to clean your code.

