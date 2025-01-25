import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Starkiller extends JFrame implements KeyListener,ActionListener {
    public ImageIcon icon;

    public ImageIcon star_killer;
    public ImageIcon troop;
    public ImageIcon rogue;
    public JButton try_again;
    public JLabel game_over;
    public JLabel stage_passed;
    public JLabel starr_killer;
    public JLabel trooper1;
    public JLabel trooper2;
    public JLabel trooper3;
    public JLabel trooper4;
    public JLabel trooper5;
    public JLabel trooper6;
    public JLabel rogue_Shadow;

    Starkiller(){
        icon = new ImageIcon("Images\\Starkiller.jfif");
        star_killer = new ImageIcon("Images\\Starkillerzz.png");
        troop = new ImageIcon("Images\\Stormtrooper.png");
        rogue = new ImageIcon("Images\\Rogue_Shadow.png");

        try_again = new JButton("Try again");
        try_again.setBounds(375,600,250,100);
        try_again.setFocusable(false);
        try_again.setFont(new Font("Arial",Font.PLAIN,20));
        try_again.setForeground(Color.WHITE);
        try_again.setBackground(Color.BLACK);
        try_again.setVisible(false);
        try_again.addActionListener(this);

        game_over = new JLabel("Game Over");
        game_over.setFont(new Font("Comic Sans",Font.PLAIN,40));
        game_over.setBounds(400,120,300,300);
        game_over.setForeground(Color.WHITE);
        game_over.setVisible(false);

        stage_passed = new JLabel("Stage Passed");
        stage_passed.setFont(new Font("Comic Sans",Font.PLAIN,40));
        stage_passed.setBounds(400,200,200,200);
        stage_passed.setForeground(Color.WHITE);
        stage_passed.setVisible(false);

        starr_killer = new JLabel();
        starr_killer.setIcon(star_killer);
        starr_killer.setBounds(0,0,200,267);
        starr_killer.setLocation(430,700);

        trooper1 = new JLabel();
        trooper1.setIcon(troop);
        trooper1.setBounds(0,0,200,267);
        trooper1.setLocation(180,450);

        trooper2 = new JLabel();
        trooper2.setIcon(troop);
        trooper2.setBounds(0,0,200,267);
        trooper2.setLocation(430,450);

        trooper3 = new JLabel();
        trooper3.setIcon(troop);
        trooper3.setBounds(0,0,200,267);
        trooper3.setLocation(680,450);

        trooper4 = new JLabel();
        trooper4.setIcon(troop);
        trooper4.setBounds(0,0,200,267);
        trooper4.setLocation(180,200);

        trooper5 = new JLabel();
        trooper5.setIcon(troop);
        trooper5.setBounds(0,0,200,267);
        trooper5.setLocation(430,200);

        trooper6 = new JLabel();
        trooper6.setIcon(troop);
        trooper6.setBounds(0,0,200,267);
        trooper6.setLocation(680,200);

        rogue_Shadow = new JLabel();
        rogue_Shadow.setIcon(rogue);
        rogue_Shadow.setBounds(0,0,200,267);
        rogue_Shadow.setLocation(375,10);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Star-killer");
        this.setIconImage(icon.getImage());
        this.setSize(new Dimension(1000,1000));
        this.getContentPane().setBackground(new Color(0,0,0));
        this.addKeyListener(this);
        this.setResizable(false);
        this.setLocation(500,30);
        this.setLayout(null);
        this.add(try_again);
        this.add(game_over);
        this.add(starr_killer);
        this.add(trooper1);
        this.add(trooper2);
        this.add(trooper3);
        this.add(trooper4);
        this.add(trooper5);
        this.add(trooper6);
        this.add(rogue_Shadow);
        this.setVisible(true);

    }
    private boolean contact(){
        Rectangle stark_killer = starr_killer.getBounds();
        Rectangle trooper = trooper1.getBounds();
        return stark_killer.intersects(trooper);
    }
    private boolean contact2(){
        Rectangle stark_killer = starr_killer.getBounds();
        Rectangle trooper = trooper2.getBounds();
        return stark_killer.intersects(trooper);
    }
    private boolean contact3(){
        Rectangle stark_killer = starr_killer.getBounds();
        Rectangle trooper = trooper3.getBounds();
        return stark_killer.intersects(trooper);
    }
    private boolean contact4(){
        Rectangle stark_killer = starr_killer.getBounds();
        Rectangle trooper = trooper4.getBounds();
        return stark_killer.intersects(trooper);
    }
    private boolean contact5(){
        Rectangle stark_killer = starr_killer.getBounds();
        Rectangle trooper = trooper5.getBounds();
        return stark_killer.intersects(trooper);
    }
    private boolean contact6(){
        Rectangle stark_killer = starr_killer.getBounds();
        Rectangle trooper = trooper6.getBounds();
        return stark_killer.intersects(trooper);
    }
    private boolean contact7(){
        Rectangle stark_killer = starr_killer.getBounds();
        Rectangle rogue = rogue_Shadow.getBounds();
        return stark_killer.intersects(rogue);
    }
    private void visible(){
        if(contact()){
            starr_killer.setVisible(false);
            rogue_Shadow.setVisible(false);
            trooper1.setVisible(false);
            trooper2.setVisible(false);
            trooper3.setVisible(false);
            trooper4.setVisible(false);
            trooper5.setVisible(false);
            trooper6.setVisible(false);
            game_over.setVisible(true);
            try_again.setVisible(true);

        }else if(contact2()){
            starr_killer.setVisible(false);
            rogue_Shadow.setVisible(false);
            trooper1.setVisible(false);
            trooper2.setVisible(false);
            trooper3.setVisible(false);
            trooper4.setVisible(false);
            trooper5.setVisible(false);
            trooper6.setVisible(false);
            game_over.setVisible(true);
            try_again.setVisible(true);

        } else if (contact3()) {
            starr_killer.setVisible(false);
            rogue_Shadow.setVisible(false);
            trooper1.setVisible(false);
            trooper2.setVisible(false);
            trooper3.setVisible(false);
            trooper4.setVisible(false);
            trooper5.setVisible(false);
            trooper6.setVisible(false);
            game_over.setVisible(true);
            try_again.setVisible(true);

        } else if (contact4()) {
            starr_killer.setVisible(false);
            rogue_Shadow.setVisible(false);
            trooper1.setVisible(false);
            trooper2.setVisible(false);
            trooper3.setVisible(false);
            trooper4.setVisible(false);
            trooper5.setVisible(false);
            trooper6.setVisible(false);
            game_over.setVisible(true);
            try_again.setVisible(true);


        } else if (contact5()) {
            starr_killer.setVisible(false);
            rogue_Shadow.setVisible(false);
            trooper1.setVisible(false);
            trooper2.setVisible(false);
            trooper3.setVisible(false);
            trooper4.setVisible(false);
            trooper5.setVisible(false);
            trooper6.setVisible(false);
            game_over.setVisible(true);
            try_again.setVisible(true);


        } else if (contact6()) {
            starr_killer.setVisible(false);
            rogue_Shadow.setVisible(false);
            trooper1.setVisible(false);
            trooper2.setVisible(false);
            trooper3.setVisible(false);
            trooper4.setVisible(false);
            trooper5.setVisible(false);
            trooper6.setVisible(false);
            game_over.setVisible(true);
            try_again.setVisible(true);

        } else if (contact7()) {
            new Level();
            dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'w'-> starr_killer.setLocation(starr_killer.getX() , starr_killer.getY()-15);
            case 'a'->starr_killer.setLocation(starr_killer.getX()-15 , starr_killer.getY() );
            case 's'->starr_killer.setLocation(starr_killer.getX() , starr_killer.getY()+15);
            case 'd'->starr_killer.setLocation(starr_killer.getX()+15 , starr_killer.getY());

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 38-> starr_killer.setLocation(starr_killer.getX() , starr_killer.getY()-15);
            case 37->starr_killer.setLocation(starr_killer.getX()-15 , starr_killer.getY() );
            case 40->starr_killer.setLocation(starr_killer.getX() , starr_killer.getY()+15);
            case 39->starr_killer.setLocation(starr_killer.getX()+15 , starr_killer.getY());

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
        System.out.println(e.getKeyCode());
        visible();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == try_again){
          this.dispose();
          new Starkiller();
        }
    }
}
