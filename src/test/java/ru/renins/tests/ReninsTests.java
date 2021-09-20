package ru.renins.tests;

import com.codeborne.selenide.Condition;
import ru.renins.helpers.DriverUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class ReninsTests extends TestBase {
    @Test
    @DisplayName("Check title main page")
    void checkTitleTests() {
        step("Open https://www.renins.ru/", () -> {
            open("https://www.renins.ru/");
        });
        step("Compare text titles ", () -> {
            String title = title();
            assertThat(title).contains("Ренессанс страхование - универсальная страховая компания - renins.com");
        });
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.renins.ru/'", () -> {
            open("https://www.renins.ru/");
        });

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            assertThat(consoleLogs).doesNotContain("SEVERE");
        });
    }

    @Test
    @DisplayName("Check contact at the career page")
    void checkCCareerContactTest() {
        step("Open https://www.renins.ru/", () -> {
            open("https://www.renins.ru/");
        });
        step("Find career section", () -> {
            $(byText("Работать у нас")).click();
            $(byText("Контакты для карьеры")).click();
            $(".rn-page-title_title").shouldHave(text("Контакты для карьеры"));
        });
        step("Check career contacts", () -> {
            $(".rn-page-title_title").shouldHave(text("Контакты для карьеры"));
        });
    }

    @Test
    @DisplayName("Check QA engineer in job list")
    void searchQAVacancyTest() {
        step("Open https://www.renins.ru/", () -> {
            open("https://www.renins.ru/");
        });
        step("Find career section", () -> {
            $(byText("Работать у нас")).click();
            $(byText("Тестировщик ПО")).click();
            switchTo().window(1);
            $(".posting-headline").shouldHave(text("QA engineer"));
        });
        step("Check QA Engineer vacancy", () -> {
            $(".posting-headline").shouldHave(text("QA engineer"));
        });
    }
}