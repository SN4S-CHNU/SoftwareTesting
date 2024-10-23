package org.example;

/*
    @author sn4s
    @project SoftwareTesting
    @class org.example
    @version 1
    @SE 20.09.24 - 18:40
*/
import java.util.List;

public class ICompanyServiceImplementation implements ICompanyService {
    @Override
    public Company getTopLevelParent(Company child) {
        if (child == null){
            return null;
        }
        if (child.getParent() == null){
            return child;
        }
        return getTopLevelParent(child.getParent());
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        long totalEmployeeCount = company.getEmployeeCount();

        for (Company child : companies) {
            if (company.equals(child.getParent())) {
                totalEmployeeCount += getEmployeeCountForCompanyAndChildren(child, companies);
            }
        }

        return totalEmployeeCount;
    }
}