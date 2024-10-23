package org.example;

/*
    @author sn4s
    @project SoftwareTesting
    @class org.example
    @version 1
    @SE 20.09.24 - 18:34
*/

import java.util.List;

public interface ICompanyService {
    Company getTopLevelParent(Company child);
    long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies);
}