package visitor;

import visitor.model.Bank;
import visitor.model.Company;
import visitor.model.Resident;
import visitor.model.Restaurant;

public interface Visitor {
    void visit(Bank bank);

    void visit(Company company);

    void visit(Resident resident);

    void visit(Restaurant restaurant);

}
