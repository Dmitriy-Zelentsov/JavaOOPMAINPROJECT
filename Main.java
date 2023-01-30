import model.data.Partner;
import model.service.PartnerService;
import view.PartnerView;

public class Main {
    public static void main(String[] args) {
        
        // Создание списка контрагентов
        PartnerService partnerService = new PartnerService();
        partnerService.addContact(new Partner(
            "ИП Рога и копыта", 
            "юр. лицо", 
            12334556, 
            "производство шуб", 
            "г. Москва", 
            "qwerty@mail.ru", 
            "+7 848 335 34 56", 
            "@qwerty"));
        partnerService.addContact(new Partner(
            "Зеленцов Дмитрий Михайлович", 
            "физ. лицо", 
            223456,
            "студент", 
            "г. Москва",
            "ytrewq@yandex.ru",
            "+7 222 2222",
            "@ytrewq"));
        
        
        partnerService.save();
        
        // partnerService.load();
        
        new PartnerView(partnerService).showContacts();


    }
}