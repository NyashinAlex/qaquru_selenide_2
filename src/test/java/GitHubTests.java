import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTests {

    @Test
    @DisplayName(value = "На главной странице GitHub выберите меню Solutions -> Enterprize с помощью команды hover для Solutions. " +
            "Убедитесь что загрузилась нужная страница (например что заголовок - \"Build like the best.\"")
    void checkPartMenuAndCorrectPage() {
        open("https://github.com/");
        $$(".d-lg-flex.list-style-none button").get(1).hover();
        $(byText("Enterprise")).hover();
    }
}
