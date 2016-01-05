package com.epam.efimova.xml.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anna_Efimova on 1/5/2016.
 */
public class Position {
    public String jobTitle;
    public String level;
    public List<Item> items;

    public Position() {
        items = new ArrayList<>();
    }

    public static class Item {
        public String description;
        public String value;

        public void setDescription(String description) {
            this.description = description;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Item [ description = " + description + ", value = " + value + "]";
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Position [jobTitle= " + jobTitle + ", level = " + level + ", items" + items + " ]";
    }
}
