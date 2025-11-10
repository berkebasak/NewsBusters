package app;

import view.TopHeadlinesView;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TopHeadlinesView app = new TopHeadlinesView();
            app.setVisible(true);
        });
    }
}
