import javax.swing.JFrame;

public class JFrameApp extends JFrame
{
    public JFrameApp()
    {
        setBounds(250, 250, 265, 400);
        setResizable(false);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add( new JPanelApp());
        setVisible(true);
    }
}
