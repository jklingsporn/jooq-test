/*
 * This file is generated by jOOQ.
 */
package test.generated.schema.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITest extends Serializable {

    /**
     * Setter for <code>public.test.foo</code>.
     */
    public ITest setFoo(Integer value);

    /**
     * Getter for <code>public.test.foo</code>.
     */
    public Integer getFoo();

    /**
     * Setter for <code>public.test.bar</code>.
     */
    public ITest setBar(String value);

    /**
     * Getter for <code>public.test.bar</code>.
     */
    public String getBar();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ITest
     */
    public void from(test.generated.schema.tables.interfaces.ITest from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ITest
     */
    public <E extends test.generated.schema.tables.interfaces.ITest> E into(E into);
}