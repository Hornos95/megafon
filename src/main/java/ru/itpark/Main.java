package ru.itpark;

import ru.itpark.model.OtherDevice;
import ru.itpark.model.OtherRate;
import ru.itpark.model.TurnOn;
import ru.itpark.service.CartService;

public class Main {
    public static void main(String[] args) {
        CartService service = new CartService();
        service.add(new TurnOn("pishi", "Включайся Пиши", "Кино и сериалы в мегафон ТВ", 650, "Безлимитный интернет", 1200, 300, true));
        service.add(new TurnOn("obschaysya", "Включайся Общайся", "Всегда на связи", 350, "Безлимитный интернет", 600, 0, true));
        service.add(new OtherDevice("tvoj_bezlimit_na_6_mesyacev", " Твой безлимит на 6 месяцев", "Трафик без ограничений для использования дома и в поездках по России", 3100, "Безлимитный интернет", 6));
        service.add(new OtherDevice("tvoj_bezlimit_na_12_mesyacev", " Твой безлимит на 12 месяцев", "Трафик без ограничений для использования дома и в поездках по России", 5100, "Безлимитный интернет", 12));
        service.add(new OtherDevice("megafon-online", "Мегафон онлайн", "Базовый тариф для подключения интернет-опций и использования на устройствах", 0, "1 мегабайт интернета 2.5 рубля", 0));
        service.add(new OtherRate("perehodi_na_nol", "Переходи на ноль", "Тариф без абонентской платы для выгодных звонков", 0, "100 мегабайт интернета 25 рублей", 0, "Звонки 1 рубль в минуту"));
        service.add(new OtherRate("hello", "#Hello", "Тариф для иностранных туристов", 750, "30 гигабайт", 14, "Безлимитные звонки на внутренние номера Мегафон"));

    }
}
