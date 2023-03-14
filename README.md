## Проект по автоматизации мобильного тестирования приложения Wikipedia.
<a name="Ссылка"></a>
<p align="center">
<img title="Wikipedia" src="media/screen/WikiMain.png">
</p>

## :pushpin: Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins)
- Allure-отчет
- Интеграция с Allure TestOps
- Интеграция с Jira
- Уведомление в Telegram о результатах прогона тестов

## :pushpin:Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="media/icons/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="media/icons/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="media/icons/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="media/icons/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="media/icons/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://www.browserstack.com/"><img src="media/icons/Browserstack.svg" width="50" height="50"  alt="Browserstack"/></a>
<a href="https://aerokube.com/selenoid/"><img src="media/icons/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/icons/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://qameta.io/"><img src="media/icons/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a>
<a href="https://www.jenkins.io/"><img src="media/icons/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

## :bookmark_tabs: Список проверок, реализованных в автотестах

- [x] Поиск статьи в приложении для android
- [x] Login в личный кабинет для ios

## :computer: Запуск тестов

###  Запуск в Jenkins:
1. Открыть <a target="_blank" href="https://jenkins.autotests.cloud/job/Wiki/">проект</a>
2. Нажать **Собрать с параметрами**
3. Выбрать для какой платформы будут запущены тесты

## <img src="media/icons/Allure.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/Wiki/28/allure/">Allure report</a>

*После выполнения сборки, в блоке <code><strong>*История сборок*</strong></code> напротив номера сборки появится
значок <img width="2%" title="Allure Report" src="media/icons/Allure.svg"><code><strong>*Allure
Report*</strong></code>, кликнув по которому, откроется страница с сформированным html-отчетом.*

## <img width="4%" title="Allure Report" src="media/icons/Allure.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/Wiki/28/allure/)

### :pushpin: Общая информация

*Главная страница Allure-отчета содержит следующие информационные блоки:*

> - [x] <code><strong>*ALLURE REPORT*</strong></code> - отображает дату и время прохождения теста, общее количество прогнанных кейсов, а также диаграмму с указанием процента и количества успешных, упавших и сломавшихся в процессе выполнения тестов
>- [x] <code><strong>*TREND*</strong></code> - отображает тренд прохождения тестов от сборки к сборке
>- [x] <code><strong>*SUITES*</strong></code> - отображает распределение результатов тестов по тестовым наборам
>- [x] <code><strong>*ENVIRONMENT*</strong></code> - отображает тестовое окружение, на котором запускались тесты (в данном случае информация не задана)
>- [x] <code><strong>*CATEGORIES*</strong></code> - отображает распределение неуспешно прошедших тестов по видам дефектов
>- [x] <code><strong>*FEATURES BY STORIES*</strong></code> - отображает распределение тестов по функционалу, который они проверяют
>- [x] <code><strong>*EXECUTORS*</strong></code> - отображает исполнителя текущей сборки (ссылка на сборку в Jenkins)

<p align="center">
  <img src="media/screen/AllureReport.png" alt="Allure Report" width="900">
</p>

## <img width="4%" title="Allure TestOPS" src="media/icons/Allure_TO.svg"> Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/20297)

### :pushpin: Основной дашборд

<p align="center">
  <img src="media/screen/AllureReportTO.png" alt="dashboards" width="900">
</p>

### :pushpin: Тест-кейсы android

<p align="center">
  <img src="media/screen/AllureReportTOCase.png" alt="test cases" width="900">
</p>

### :pushpin: Тест-кейсы ios

<p align="center">
  <img src="media/screen/AllureReportTOCaseIOS.png" alt="test cases" width="900">
</p>

## <img width="4%" title="Telegram" src="media/icons/Telegram.svg"> Уведомления в Telegram с использованием бота

> После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

<p align="center">
<img title="Telegram Notifications" src="media/screens/TgResults.png">
</p>

## <img src="media/icons/Browserstack.svg" width="25" height="25"  alt="Browserstack"/></a> Пример видео прохождения теста в Browserstack
<p align="center">
<img title="Browserstack Video" src="media/gif/TestVideo.gif"alt="video2">
</p>
