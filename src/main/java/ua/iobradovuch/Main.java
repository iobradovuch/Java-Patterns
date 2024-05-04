package ua.iobradovuch;

import ua.iobradovuch.lab1.abstractFactory.ArtifactFactory;
import ua.iobradovuch.lab1.abstractFactory.FireArtifactFactory;
import ua.iobradovuch.lab1.abstractFactory.IceArtifactFactory;
import ua.iobradovuch.lab1.builder.MagicLocation;
import ua.iobradovuch.lab1.factoryMethod.Monster;
import ua.iobradovuch.lab1.prototype.ElementKeeper;
import ua.iobradovuch.lab1.singleton.WiseDragon;
import ua.iobradovuch.lab2.bridge.GooglePaymentGateway;
import ua.iobradovuch.lab2.bridge.PayPalPaymentGateway;
import ua.iobradovuch.lab2.bridge.PaymentGateway;
import ua.iobradovuch.lab2.composite.CompositePayment;
import ua.iobradovuch.lab2.composite.Payment;
import ua.iobradovuch.lab2.composite.SinglePayment;
import ua.iobradovuch.lab2.decorator.DiscountDecorator;
import ua.iobradovuch.lab2.facade.PaymentFacade;
import ua.iobradovuch.lab2.flyweight.PaymentMethod;
import ua.iobradovuch.lab2.flyweight.PaymentMethodFlyweightFactory;
import ua.iobradovuch.lab2.proxy.PaymentProxy;
import ua.iobradovuch.lab2.wrapper.GooglePaymentService;
import ua.iobradovuch.lab2.wrapper.PayPalPaymentService;
import ua.iobradovuch.lab2.wrapper.PaymentServiceWrapper;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Prototype
        ElementKeeper originalKeeper = new ElementKeeper("Fire", "Flame Control", "Red Robes");
        ElementKeeper clonedKeeper = originalKeeper.clone();
        System.out.println("Original Keeper: " + originalKeeper);
        System.out.println("Cloned Keeper: " + clonedKeeper);
        System.out.println();

        // Factory Method
        List<String> monsterTypes = Arrays.asList("Fire", "Ice");
        monsterTypes.stream()
                .map(Monster::createMonster)
                .forEach(monster -> System.out.println("Created Monster: " + monster));
        System.out.println();

        // Abstract Factory
        List<ArtifactFactory> factories = Arrays.asList(new FireArtifactFactory(), new IceArtifactFactory());
        factories.stream()
                .map(ArtifactFactory::createArtifact)
                .forEach(artifact -> System.out.println("Created Artifact: " + artifact));
        System.out.println();

        // Builder
        MagicLocation enchantedForest = new MagicLocation.Builder()
                .withName("Enchanted Forest")
                .withElement("Trees")
                .withElement("Magic Mist")
                .build();
        System.out.println("Built Magic Location: " + enchantedForest);
        MagicLocation enchantedDesert = new MagicLocation.Builder()
                .withElement("Sandy wind")
                .withName("Enchanted Desert")
                .build();
        System.out.println("Built Magic Location: " + enchantedDesert);
        System.out.println();

        // Singleton
        WiseDragon wiseDragon = WiseDragon.getInstance();
        System.out.println("Wise Dragon: " + wiseDragon);
        wiseDragon.getAdvice();
        System.out.println();
        System.out.println();
        System.out.println();

        //lab2
        // Wrapper
        PaymentServiceWrapper paypalWrapper = new PaymentServiceWrapper(new PayPalPaymentService());
        PaymentServiceWrapper googleWrapper = new PaymentServiceWrapper(new GooglePaymentService());

        paypalWrapper.processPayment(100.0);
        googleWrapper.processPayment(50.0);
        System.out.println();

        // Bridge
        PaymentGateway paypalGateway = new PayPalPaymentGateway();
        PaymentGateway googleGateway = new GooglePaymentGateway();

        paypalGateway.processPayment(75.0);
        googleGateway.processPayment(25.0);
        System.out.println();

        // Composite
        Payment singlePayment = new SinglePayment(10.0);
        Payment compositePayment = new CompositePayment(List.of(
                new SinglePayment(5.0),
                new SinglePayment(15.0),
                new CompositePayment(List.of(
                        new SinglePayment(3.0),
                        new SinglePayment(7.0)
                ))
        ));

        singlePayment.processPayment();
        System.out.println("Total amount: $" + compositePayment.getAmount());
        compositePayment.processPayment();
        System.out.println();

        // Decorator
        Payment payment = new DiscountDecorator(new SinglePayment(100.0));
        payment.processPayment();
        System.out.println("Amount with discount: $" + payment.getAmount());
        System.out.println();

        // Facade
        PaymentFacade facade = new PaymentFacade(List.of(
                new PayPalPaymentService(),
                new GooglePaymentService()
        ));
        facade.processPayment(200.0);
        System.out.println();

        // Flyweight
        PaymentMethod cc1 = PaymentMethodFlyweightFactory.getPaymentMethod("CreditCard", "1234567890123456", "12/25", "123");
        PaymentMethod cc2 = PaymentMethodFlyweightFactory.getPaymentMethod("CreditCard", "1234567890123456", "12/25", "123");
        PaymentMethod paypal1 = PaymentMethodFlyweightFactory.getPaymentMethod("PayPal", "iobradovuch@gmail.com");

        System.out.println(cc1 == cc2);

        cc1.processPayment(100.0);
        cc2.processPayment(100.0);
        cc1.processPayment(100.0);
        cc1.processPayment(100.0);
        paypal1.processPayment(50.0);
        System.out.println();

        // Proxy
        PaymentProxy paymentProxy = new PaymentProxy();
        paymentProxy.registerPaymentService("paypal", new PayPalPaymentService());
        paymentProxy.registerPaymentService("google", new GooglePaymentService());

        paymentProxy.processPayment(125.0);

        paymentProxy.setCurrentPaymentService("paypal");
        paymentProxy.processPayment(100.0);

        paymentProxy.setCurrentPaymentService("google");
        paymentProxy.processPayment(50.0);
    }
}