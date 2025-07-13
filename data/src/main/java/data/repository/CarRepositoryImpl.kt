package data.repository


import com.example.domain.models.Car
import com.example.domain.repository.CarRepository
import javax.inject.Inject

class CarRepositoryImpl @Inject constructor(): CarRepository{
    override suspend fun getCars(): List<Car> {
        return listOf(
            Car(
                carName = "BMW M5",
                carDescription = "Легендарный немецкий седан с мощным двигателем и спортивным характером.",
                carPrice = "$128,000",
                carPhoto = "https://mediapool.bmwgroup.com/cache/P9/202408/P90564521/P90564521-the-all-new-bmw-m5-touring-08-2024-600px.jpg"
            ),
            Car(
                carName = "Mercedes-AMG E63",
                carDescription = "Роскошный и быстрый седан от Mercedes-AMG с полным приводом 4MATIC+.",
                carPrice = "$135,000",
                carPhoto = "https://kolesa-uploads.ru/-/8d13ba68-b9db-42a7-99dc-20ee4df1160e/mercedes-amg-e63-front2-mini.jpg"
            ),
            Car(
                carName = "Audi RS7",
                carDescription = "Стильный и технологичный спортбэк с фирменным quattro и динамичным дизайном.",
                carPrice = "$125,000",
                carPhoto = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRFPnMfmqVHalbk7OwM-byP5Jd2kfORlV65A&s"
            ),
            Car(
                carName = "Porsche 911 Turbo S",
                carDescription = "Икона спортивных автомобилей с безупречной управляемостью и мощным оппозитным двигателем.",
                carPrice = "$220,000",
                carPhoto = "https://1evel.ru/wa-data/public/shop/categories/2183/advancedparams/1920x960.jpg"
            ),
            Car(
                carName = "Tesla Model S Plaid",
                carDescription = "Электрический суперкар с рекордной динамикой и автопилотом.",
                carPrice = "$120,000",
                carPhoto = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwm1Xzz200FZmRkQHp6J6-um8kxInrI-QehQ&s"
            ),
            Car(
                carName = "Lexus LC 500",
                carDescription = "Японский GT-автомобиль с атмосферным V8 и элегантным дизайном.",
                carPrice = "$95,000",
                carPhoto = "https://autoreview.ru/images/Article/1590/Article_159058_860_575.jpg"
            ),
            Car(
                carName = "Jaguar F-Type R",
                carDescription = "Британский спорткар с мощным V8 и агрессивным звуком выхлопа.",
                carPrice = "$110,000",
                carPhoto = "https://jaguar.borishof.ru/b65a6e99-acd2-486b-b0da-c8b4aa8642b6/JAGUAR%20F-TYPE%20%D0%9A%D0%90%D0%91%D0%A0%D0%98%D0%9E%D0%9B%D0%95%D0%A2.jpg"
            ),
            Car(
                carName = "Ford Mustang Shelby GT500",
                carDescription = "Американский мускул-кар с наддувным V8 и экстремальной мощью.",
                carPrice = "$80,000",
                carPhoto = "https://www.livecars.ru/l/news/2018/01/22/ford-mustang-shelby-gt500/picture.jpg?1516591234"
            ),
            Car(
                carName = "Lamborghini Huracan",
                carDescription = "Итальянский суперкар с диким дизайном и фирменным атмосферным V10.",
                carPrice = "$250,000",
                carPhoto = "https://storage.googleapis.com/trinityrental-e51d5.appspot.com/main_d805b8efd0/main_d805b8efd0.jpg"
            ),
            Car(
                carName = "Toyota Supra MK5",
                carDescription = "Легендарный спорткар с турбированным рядным шестицилиндровым двигателем от BMW.",
                carPrice = "$55,000",
                carPhoto = "https://news.store.rambler.ru/img/c19b4ecf243205d9177d78a884e08ee6?img-format=auto&img-1-resize=height:400,fit:max&img-2-filter=sharpen"
            )
        )
    }

}