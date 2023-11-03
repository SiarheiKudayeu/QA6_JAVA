package lesson9.ex_task;

public class Service {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Service(String name) {
        this.name = name;
    }

    public void needToGoForToBeforeTrip(Contract contract, City city) {
        if (city.getDistance() > contract.getHuman().getAuto().getDistanceBeforeTo()) {
            System.out.println(" Уважаемый " + contract.getHuman().getName() + ".\n" +
                    "   Прежде чем вы направитесь в " + city.getName() + " вам понадобится пройти ТО.");
        } else {
            System.out.println(" Уважаемый " + contract.getHuman().getName() + ".\n" +
                    "   Езжайте в  " + city.getName() + " . Но не забывайте, что согласно\n" +
                    "   договору " + contract.getId() + " вы обслуживаетесь у нас.\n" +
                    "   Ваша " + name + "*/");
        }
    }
    /*Если при поездке в определеный город, пробег после финального ТО превышает расстояние,
   после проезда которго автомобиль должен проходить ТО. То на консоль выводится сообщение типа:

   Уважаемый {Имя человека}.
   Прежде чем вы направитесь в {Название города} вам понадобится пройти ТО.

   Уважаемый {Имя человека}.
   Езжайте в {Название города}. Но не забывайте, что согласно
   договору {айди договора} вы обслуживаетесь у нас.
   Ваша {Название Сервиса}*/
}
