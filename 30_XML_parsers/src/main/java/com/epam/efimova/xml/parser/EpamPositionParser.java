package com.epam.efimova.xml.parser;

import com.epam.efimova.xml.model.Position;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Created by Anna_Efimova on 1/5/2016.
 */
public class EpamPositionParser {

    public void parse(Element root) {
        Position position = new Position();
        NodeList positionNode = root.getElementsByTagName("position");

        for (int i = 0; i < positionNode.getLength(); i++) {
            Element positionElement = (Element) positionNode.item(i);


            NodeList jobTitleNode = positionElement.getElementsByTagName("job_title");
            position.setJobTitle(jobTitleNode.item(0).getTextContent());
            position.setLevel(positionElement.getAttribute("level"));
            for (int l = 1; l < 10; l++) {
                Position.Item item = new Position.Item();
                NodeList itemNode = positionElement.getElementsByTagName("item" + l);
                item.setDescription(((Element) itemNode.item(0)).getAttribute("desc"));
                item.setValue((itemNode.item(0)).getTextContent());
                position.getItems().add(item);
            }

            System.out.println(position);
            //        for (int j = 0; j < cr.getLength(); j++) {
//                Element elem = (Element) cr.item(j);
//                getCredits().add(elem.getAttribute("type"));
//                getCredits().add(getBabyValue(elem, "description"));
//                getCredits().add(getBabyValue(elem, "isRepayment"));
//                getCredits().add(getBabyValue(elem, "isVoucher"));
//                getCredits().add(getBabyValue(elem, "initialSum"));
//                getCredits().add(getBabyValue(elem, "finiteSum"));
//                getCredits().add(getBabyValue(elem, "interestRate"));
//                getCredits().add(getBabyValue(elem, "countMonth"));
//                getCredits().add(getBabyValue(elem, "comission"));
//                getCreditMap().put(
//                        banksNodes.item(i).getAttributes().item(1)
//                                .getTextContent(), getCredits());
//            }
        }
    }
}
