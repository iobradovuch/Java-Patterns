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
import ua.iobradovuch.lab3.chainOfResponsibility.AttackHandler;
import ua.iobradovuch.lab3.chainOfResponsibility.CriticalAttackHandler;
import ua.iobradovuch.lab3.chainOfResponsibility.NormalAttackHandler;
import ua.iobradovuch.lab3.command.CastSpellCommand;
import ua.iobradovuch.lab3.command.PlayerCommand;
import ua.iobradovuch.lab3.command.UseItemCommand;
import ua.iobradovuch.lab3.iterator.PartyIterator;
import ua.iobradovuch.lab3.mediator.PartyMediator;
import ua.iobradovuch.lab3.mediator.PartyMediatorImpl;
import ua.iobradovuch.lab3.memento.PlayerMemento;
import ua.iobradovuch.lab3.models.*;
import ua.iobradovuch.lab3.observer.PlayerQuestObserver;
import ua.iobradovuch.lab3.observer.QuestSubject;
import ua.iobradovuch.lab3.state.CombatState;
import ua.iobradovuch.lab3.state.PlayerContext;
import ua.iobradovuch.lab3.strategy.BuffStrategy;
import ua.iobradovuch.lab3.strategy.DefenseBuffStrategy;
import ua.iobradovuch.lab3.strategy.StrengthBuffStrategy;
import ua.iobradovuch.lab3.templateMethod.LevelUpBehavior;
import ua.iobradovuch.lab3.templateMethod.MageLevelUpBehavior;
import ua.iobradovuch.lab3.templateMethod.WarriorLevelUpBehavior;
import ua.iobradovuch.lab3.visitor.PlayerBuffVisitor;
import ua.iobradovuch.lab3.visitor.PlayerPrintVisitor;
import ua.iobradovuch.lab3.visitor.PlayerVisitor;

import java.util.ArrayList;
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

        //lab3
        // Create players
        Warrior warrior = new Warrior("Warrior1");
        Mage mage = new Mage("Mage1");

        // Command
        PlayerCommand castSpellCommand = new CastSpellCommand(warrior, new Spell("Fireball", 10));
        PlayerCommand useItemCommand = new UseItemCommand(mage, new Item("Health Potion", 20));

        castSpellCommand.execute();
        useItemCommand.execute();

        // Mediator
        PartyMediator partyMediator = new PartyMediatorImpl();
        partyMediator.addPlayer(warrior);
        partyMediator.addPlayer(mage);

        partyMediator.sendMessage(warrior, "Hello party!");

        // Observer
        QuestSubject questSubject = new QuestSubject();
        questSubject.addObserver(new PlayerQuestObserver(warrior));
        questSubject.addObserver(new PlayerQuestObserver(mage));

        questSubject.notifyObservers("New quest available!");

        // State
        PlayerContext playerContext = new PlayerContext();
        playerContext.request();
        playerContext.setState(new CombatState());
        playerContext.request();

        // Strategy
        BuffStrategy strengthBuff = new StrengthBuffStrategy();
        BuffStrategy defenseBuff = new DefenseBuffStrategy();

        strengthBuff.applyBuff(warrior);
        defenseBuff.applyBuff(mage);

        // Template Method
        LevelUpBehavior warriorLevelUp = new WarriorLevelUpBehavior();
        LevelUpBehavior mageLevelUp = new MageLevelUpBehavior();

        warriorLevelUp.levelUp(warrior);
        mageLevelUp.levelUp(mage);

        // Visitor
        PlayerVisitor printVisitor = new PlayerPrintVisitor();
        PlayerVisitor buffVisitor = new PlayerBuffVisitor();

        warrior.accept(printVisitor);
        mage.accept(printVisitor);

        warrior.accept(buffVisitor);
        mage.accept(buffVisitor);

        // Chain of Responsibility
        AttackHandler normalAttackHandler = new NormalAttackHandler();
        AttackHandler criticalAttackHandler = new CriticalAttackHandler();

        normalAttackHandler.setNext(criticalAttackHandler);

        normalAttackHandler.handleAttack(warrior, mage);

        // Iterator
        List<Player> partyMembers = new ArrayList<>();
        partyMembers.add(warrior);
        partyMembers.add(mage);

        PartyIterator partyIterator = new PartyIterator(partyMembers);
        while (partyIterator.hasNext()) {
            Player player = partyIterator.next();
            System.out.println("Party member: " + player.getName());
        }

        // Memento
        PlayerMemento warriorMemento = warrior.saveState();
        System.out.println("Warrior state saved");

        warrior.setLevel(10);
        warrior.setExperience(5000);

        System.out.println("Warrior current level: " + warrior.getLevel());
        System.out.println("Warrior current experience: " + warrior.getExperience());

        warrior.restoreState(warriorMemento);
        System.out.println("Warrior state restored");
        System.out.println("Warrior level after restoration: " + warrior.getLevel());
        System.out.println("Warrior experience after restoration: " + warrior.getExperience());
    }
}