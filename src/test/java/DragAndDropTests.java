import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests {

    @Test
    @DisplayName("Запрограммируйте Drag&Drop с помощью Selenide.actions()")
    void swappingSquares() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));

        $$("#content .column header").get(0).shouldBe(text("B"));
        $$("#content .column header").get(1).shouldBe(text("A"));
        sleep(2000);
    }
}