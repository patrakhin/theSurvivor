/*
Решение задания 2.5

EmployeesTerritories
Связь: один ко миногим
    Один работник закреплен за разными территориями.

Order Details
Связь: один ко многим
    Один заказ включает разные продукты.

Orders
Связь: многие ко многим
    У одного клиента несколько закрепленных работников, а у работника - несколько клиентов.
    Участвуют таблицы: Order Details, Customers, Employees - справочные таблицы
    Orders - таблица хранящая пары ключей (клиент/исполнитель)

Products
Связь: один ко многим
    Один поставщик поставляет разные продукты.

Territories
Связь: один ко многим
    Один регион включает в себя несколько территорий.
*/