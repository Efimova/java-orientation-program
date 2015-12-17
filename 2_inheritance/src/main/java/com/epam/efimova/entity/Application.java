package com.epam.efimova.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Anna_Efimova on 12/7/2015.
 */
public abstract class Application {
    private Logger logger = LoggerFactory.getLogger(Application.class);
    private Integer pId;

    public Application() {
        setpId(ProcessorIDGeneration.getId());
        logger.info("Process ID = " + getpId().toString());
        launch();
    }

    public Integer getpId() {
        return pId;
    }

    private void setpId(Integer pId) {
        this.pId = pId;
    }

    protected abstract void launch();


    public abstract void close();

    static class ProcessorIDGeneration {
        private static Integer currentId = 1000;

        private static Integer getId() {
            synchronized (currentId) {
                return ++currentId;
            }
        }
    }
}
