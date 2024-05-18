import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class CreationEventsGUI extends JFrame {

    private final JTextField dayInput;
    private final JLabel resultLabel;

    public CreationEventsGUI() {
        // Initialize creation events
        Map<Integer, String[]> creationEvents = new HashMap<>();
        creationEvents.put(1, new String[]{"Light", "Genesis 1:3-5"});
        creationEvents.put(2, new String[]{"Sky and Water", "Genesis 1:6-8"});
        creationEvents.put(3, new String[]{"Land, Seas, and Vegetation", "Genesis 1:9-13"});
        creationEvents.put(4, new String[]{"Sun, Moon, and Stars", "Genesis 1:14-19"});
        creationEvents.put(5, new String[]{"Birds and Sea Creatures", "Genesis 1:20-23"});
        creationEvents.put(6, new String[]{"Animals and Humankind", "Genesis 1:24-31"});
        creationEvents.put(7, new String[]{"Rest", "Genesis 2:1-3"});

        // Setup GUI components
        setTitle("Creation Events");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel dayLabel = new JLabel("Enter the day of the creation week (1-7):");
        dayLabel.setBounds(20, 20, 300, 20);
        add(dayLabel);

        dayInput = new JTextField();
        dayInput.setBounds(20, 50, 50, 20);
        add(dayInput);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(20, 80, 100, 30);
        add(submitButton);

        resultLabel = new JLabel();
        resultLabel.setBounds(20, 120, 350, 20);
        add(resultLabel);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int day = Integer.parseInt(dayInput.getText());
                if (creationEvents.containsKey(day)) {
                    String[] event = creationEvents.get(day);
                    resultLabel.setText("Events: " + event[0] + " | Verse: " + event[1]);
                } else {
                    resultLabel.setText("Invalid day. Please enter a number between 1 and 7.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CreationEventsGUI().setVisible(true);
        });
    }
}
