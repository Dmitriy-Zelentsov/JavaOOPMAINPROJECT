package view;

import model.data.Partner;
import model.service.UserService;

public class PartnerView extends UserView<Partner> {

    public PartnerView(UserService<Partner> model) {
        super(model);
    }

    @Override
    public void showContacts() {
        super.showContacts();
    }

}