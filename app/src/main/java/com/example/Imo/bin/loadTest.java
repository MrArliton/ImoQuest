package com.example.Imo.bin;

public class loadTest {
    public static String question = "";
    public static String result = "";
    public static String Q4 = "";
    public static String Q3 = "";
    public static String Q2 = "";
    public static String Q1 = "";
    public static int S4 = 0;
    public static int S3 = 0;
    public static int S2 = 0;
    public static int S1 = 0;
    public static int Summ = 0;
    public static int ts = 0;
    public static int tsN = 1;
    public static boolean nx = false;
    public static String SNX4 = "";
    public static String SNX3 = "";
    public static String SNX2 = "";
    public static String SNX1 = "";
    public static int buff = 0;
    public static boolean rx = false;
    public boolean loadTest(){
        if(tsN==1) {
            if (ts == 1) {
                rx = false;
                result = "-";
                question = "Что вам написал незнакомец?";
                Q1 = "Предлагает/просит денежные средства, рекламирует что-либо.";
                Q2 = "Просит зайти на посторонний сайт.";
                Q3 = "Приветсвует, без просьб.";
                Q4 = "Представляется работником сервиса и запрашивает у вас конфиденциальные данные.";
                S1 = 15;
                S2 = 30;
                S3 = 5;
                S4 = 50;
            } else if (ts == 2) {
                question = "Как выглядит страница незнакомца.";
                Q1 = "Закрытый или пустой профиль.";
                Q2 = "У незнакомца мало фотографий и нет подробных данных.";
                Q3 = "Страница обычного пользователя без особых подозрений.";
                Q4 = "Подозрительная страница, но есть данные и фотографии.";
                S1 = 30;
                S2 = 20;
                S3 = 5;
                S4 = 10;
            } else if (ts == 3) {
                question = "Что делает незнакомец на вопрос \"Сколько будет трижды шесть?\"";
                Q1 = "Отвечает на вопрос.";
                Q2 = "Не обращает внимание на вопрос.";
                Q3 = "Не понимает смысл заданного вопроса \"А зачем тебе?\"";
                Q4 = "Отвечает странным сообщением.";
                S1 = 5;
                S2 = 25;
                S3 = 5;
                S4 = 15;
            } else { // Записываем результат теста
                rx = true;
                if (Summ >= 90) {
                    result = "Вероятно это фишинг.\n"+
                    "Ни при каких условиях не сообщать свои данные,\n"+
                    "Сразу же обратиться к онлайн поддержке сервиса или подать жалобу\n"+
                    "(Чаще всего можно сделать на странице незнакомца).";
                } else if (Summ >= 60) {
                    result = "Возможно, это спам. Перечень действий для спамера (спам - бота) -\n" +
                            "1)зайти на страницу спамера (спам - бота)\n" +
                            "2)Выбрать пункт \"Пожаловаться на страницу\"\n" +
                            "3)Выбрать графу \"Спам\"\n" +
                            "4)(По желанию) Описать проблему\n" +
                            "5)Нажать на галочку перед надписью \"Закрыть (имя фамилия спамера (спам - бота) доступ к моей странице\"\n" +
                            "6)Нажать на кнопку \"Отправить\"";
                } else if (Summ >= 10) {
                    result = "Вероятно, что это обычный человек.\n"+
                            "Но при подозрительной активности рекомендуется прекратить общение.";
                } else if (Summ > 0) {
                    result = "Недостаточно данных, для предположения.\n"+
                    "Перепройдите тест, отвечая более подробно.";
                }
                return true;
            }
        }else if(tsN==2){
            if (ts == 1) {
                nx = true;
                question = "Какой из паролей не является безопастным?";
                Q1 = "\"Qwe13972qWe\"";
                Q2 = "\"olegdmitrovich2003\"";
                Q3 = "\"olegdMitROvich2003\"";
                Q4 = "\"Ofsd561*fer16FD\"";
                SNX1 = "Верно, безопасный пароль должен состоять из  8 и больше символов,\n"+
                        "содержать буквы всех регистров(Большие,малые буквы),\n"+
                        "а также не должен иметь в себе имёна,даты,фамилии,простые комбинации клавиш и т.д.";
                SNX2 = "Верно, безопасный пароль должен состоять из  8 и больше символов,\n"+
                "содержать буквы всех регистров(Большие,малые буквы),\n"+
                "а также не должен иметь в себе имёна,даты,фамилии,простые комбинации клавиш и т.д.";
                SNX3= "Верно, безопасный пароль должен состоять из 8 и больше символов,\n"+
                        "содержать буквы всех регистров(Большие,малые буквы),\n"+
                        "а также не должен иметь в себе имёна,даты,фамилии,простые комбинации клавиш и т.д.";
                SNX4 = "Неверно, данный пароль является безопасным:\n"+
                "безопасный пароль должен состоять из 8 и больше символов,\n"+
                        "содержать буквы всех регистров(Большие,малые буквы),\n"+
                        "а также не должен иметь в себе имёна,даты,фамилии,простые комбинации клавиш и т.д.";
            }else if(ts == 2){
                question = "Какие данные можно сообщать другим пользователям?";
                Q1 = "Пароль, Логин, Почта";
                Q2 = "Домашний адрес, данные личных документов, номер телефона.";
                Q3 = "ФИО, общедоступные данные.";
                Q4 = "Чужие данные, адреса, номера телефонов и т.д.";
                SNX1 = "Сообщая данные ,используемые для авторизации, вы очень сильно упрощаете жизнь мошеннику.\n"+
                "Не рекомендуется сообщать кому-либо свой логин и почту, пароль! Это поможет предотвратить взлом вашего аккаунта.";
                SNX2 = "Сообщая свои личные данные, вы можете начать получать спам сообщения на телефон,\n"+
                "получать неизвестные письма или подвергнуть себя опасности. Данные ваших личных документов могут быть использованы для проведения незаконных операций\n"+
                "поэтому категорически не рекомендуется сообщать их кому-либо.";
                SNX3= "Верно, данные ,предложенные в этом варианте, не несут никакой опасности для пользователя,\n"+
                "поэтому их распространения не повлечёт никаких последствий.";
                SNX4 = "Распространения чужих данных без согласия владельца,\n"+
                "может повлечь за собой ответственность со стороны закона.\n"+
                        "Поэтому категорически не рекомендуется сообщать чужие данные.";
            }else if(ts == 3){
                question = "Ваши первые действия при обнаружении подозрительных действий от лица вашей страницы?";
                Q1 = "Удалить страницу.";
                Q2 = "Обратиться в поддержку сервиса,\n сменить пароль на странице и почте.";
                Q3 = "Ничего не делать.";
                Q4 = "Сообщить всем(друзьям) о том,\n что тебя взломали.";
                SNX1 = "Удаление страницы не лучший способ. Вы должны первым делом попытаться сменить пароль,"+
                "после этого сразу же обратиться в поддержку сервиса и сообщить о своей ситуации. При невозможности смены пароля\n"+
                "не паниковать, а написать об этой проблеме в поддержку.";
                SNX2 = "Ваши действия будут совершенно верными,\n после их выполнения вы можете сообщить другим пользователям(друзьям) о взломе вашего аккаунта.";
                SNX3= "Оставлять всё как есть не рекомендуется,\n от имени вашего аккаунта могут обмануть других пользователей,\n"+
                "а также узнать о ваших личных данных или попытаться унизить вас.";
                SNX4 = "Это является правильным решением,\n но прежде стоит сменить пароль \nи сообщить в поддержку сервиса и своей проблеме.";
            }else{
                nx = true;
                rx = true;
            }

        }
        return false;
    }
}
