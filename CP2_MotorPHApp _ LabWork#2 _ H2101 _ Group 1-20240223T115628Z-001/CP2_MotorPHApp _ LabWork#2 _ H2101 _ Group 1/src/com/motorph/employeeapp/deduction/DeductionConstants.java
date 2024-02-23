package com.motorph.employeeapp.deduction;

public interface DeductionConstants {
    interface SSS {
        int MINIMUM_SALARY_RANGE = 3_250;
        int MAXIMUM_SALARY_RANGE = 3_750;
        float MINIMUM_CONTRIBUTION = 157.50f;
        float MAXIMUM_CONTRIBUTION = 1_125.00f;
    }
    interface PAGIBIG {
        int MAXIMUM_CONTRIBUTION = 100;
        float EMPLOYERS_CONTRIBUTION_RATE = 0.02f;
    }
    interface PHILHEALTH {
        float PREMIUM_RATE = 0.03f;
        int EMPLOYEE_SHARE = 2;
    }
}