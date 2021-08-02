import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame() {

        GamePanel panel = new GamePanel();
        this.add(panel); //tambien pueso reemplazar la linea 6 y 7 por this.add(new GamePanel())
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); //acomoda los componentes
        this.setVisible(true);
        this.setLocationRelativeTo(null);


    }

}
