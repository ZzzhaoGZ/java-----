package zg;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawListener implements MouseListener, ActionListener {

    int x1,x2,y1,y2;
    private Graphics g;
    public void setG(Graphics arg){
        g=arg;
    }

    //记录图形类型信息
    String shapeType="";
    public void actionPerformed(ActionEvent e){
        //获取动作的事件动作命令
        String action=e.getActionCommand();
        shapeType=action;
    }

    public void mousePressed(MouseEvent e){
        x1=e.getX();
        y1=e.getY();
    }

    public void mouseReleased(MouseEvent e){
        x2=e.getX();
        y2=e.getY();
        if("直线".equals(shapeType)){
            g.setColor(Color.BLACK);
            g.drawLine(x1,y1,x2,y2);
        }
    }
    public void mouseClicked(MouseEvent e){};
    public void mouseEntered(MouseEvent e){};
    public void mouseExited(MouseEvent e){};
}
