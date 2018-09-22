package zg;

import javax.swing.*;
import java.awt.*;

public class PaintingBoard {

    public void showUI(){
        //创建窗体对象
        JFrame myFrame = new JFrame();
        myFrame.setSize(660,990);
        myFrame.setTitle("赵港的画布");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLocationRelativeTo(null);

        //布局
        myFrame.setLayout(new FlowLayout());

        //监听器对象
        DrawListener listener=new DrawListener();

        //数组
        String[] shapeArr={"矩形","圆","椭圆","圆柱","直线","表格","多边形","囧","清空"};
        for(int i=0;i<shapeArr.length;i++){
            //创建按钮
            JButton btn=new JButton(shapeArr[i]);
            myFrame.add(btn);
            btn.addActionListener(listener);
        }
        myFrame.addMouseListener(listener);
        myFrame.setVisible(true);

        Graphics g=myFrame.getGraphics();

        System.out.println(g);
        listener.setG(g);

    }

    public static void main(String[] args){
        PaintingBoard pb=new PaintingBoard();
        pb.showUI();
    }
}
