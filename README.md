##  Тестовое задание (JSchool): управление пользователями
Необходимо разработать веб-приложение, позволяющее управлять пользователями
(создавать, редактировать, просматривать список и детали, удалять)

### Функциональные требования к веб-приложению:
 * Наличие ролевой модели (обычный пользователь или администратор)
 * Наличие RESTful интерфейса;
 * Поддержка операций авторизации (логин и логаут) и управления (создания,
чтения, редактирования и удаления) пользователями (только для
администратора). 
 * Пользователь определяется следующими значениями:
  * Имя
  * Фамилия
  * Дата рождения
  * Логин
  * Пароль
  * Поле ввода “О себе”
  * Адрес проживания
  * Роли
 * Наличие пользовательского WEB-интерфейса
 * Пользователь с ролью «пользователь» должен уметь управлять только своим
профилем.

### Нефункциональные требования:
 * JavaEE стек технологий;
 * Фреймворки, библиотеки: Hibernate, Spring. Front: VueJS/React и др. (на выбор)
 * Система хранения данных: PostgreSQL
 * Код приложения необходимо снабдить комментариями
 * Приложение должно собираться при помощи maven без установки или
настройки каких либо дополнительных компонент;
 * Архив с результатом тестового задания должен содержать текстовый файл
readme.txt с инструкцией по сборке, настройке, конфигурированию и
развертыванию приложения (если необходимо).