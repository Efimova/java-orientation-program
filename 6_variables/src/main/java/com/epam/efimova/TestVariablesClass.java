package com.epam.efimova;

/**
 * Created by Anna_Efimova on 12/18/2015.
 */
public class TestVariablesClass {
    private String propertyA;
    private Integer propertyB;
    private int propertyC;

    public TestVariablesClass(String propertyA, Integer propertyB, int propertyC) {
        this.propertyA = propertyA;
        this.propertyB = propertyB;
        this.propertyC = propertyC;
    }

    public TestVariablesClass(String propertyA, int propertyC) {
        this.propertyA = propertyA;
        this.propertyC = propertyC;
    }

    public TestVariablesClass() {

    }

    public String getPropertyA() {
        return propertyA;
    }

    public void setPropertyA(String propertyA) {
        this.propertyA = propertyA;
    }

    public Integer getPropertyB() {
        return propertyB;
    }

    public void setPropertyB(Integer propertyB) {
        this.propertyB = propertyB;
    }

    public int getPropertyC() {
        return propertyC;
    }

    public void setPropertyC(int propertyC) {
        this.propertyC = propertyC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestVariablesClass that = (TestVariablesClass) o;

        if (getPropertyC() != that.getPropertyC()) return false;
        if (!getPropertyA().equals(that.getPropertyA())) return false;
        return !(getPropertyB() != null ? !getPropertyB().equals(that.getPropertyB()) : that.getPropertyB() != null);

    }

    @Override
    public int hashCode() {
        int result = getPropertyA().hashCode();
        result = 31 * result + (getPropertyB() != null ? getPropertyB().hashCode() : 0);
        result = 31 * result + getPropertyC();
        return result;
    }

    @Override
    public String toString() {
        return TestVariablesClass.class.getName() + ": " + propertyA + ", " + propertyB + ", " + propertyC;
    }
}
