import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {

        // 1. Siapkan DATA terlebih dahulu
        CharacterManager manager = new CharacterManager();

        manager.addCharacter(new Character("Arjuna", CharacterType.WARRIOR, 5));
        manager.addCharacter(new Character("Merlin", CharacterType.MAGE, 3));
        manager.addCharacter(new Character("Athena", CharacterType.ARCHER, 4));
        manager.addCharacter(new Character("Ade", CharacterType.ARCHER, 9));
        manager.addCharacter(new Character("hena", CharacterType.MAGE, 1));

        // 2. Ambil daftar karakter
        ArrayList<Character> characters = manager.getAllCharacters();

        // 3. Hitung rata-rata level
        double averageLevel = characters.stream()
                .mapToInt(Character::getLevel)
                .average()
                .orElse(0.0);

        // 4. Jalankan GUI di Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(characters, averageLevel);
            window.setVisible(true);
        });
    }
}