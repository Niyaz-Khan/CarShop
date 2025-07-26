package data.repository


import com.example.domain.models.Car
import com.example.domain.repository.CarRepository
import javax.inject.Inject

class CarRepositoryImpl @Inject constructor(private val carNetworkSource: CarNetworkSource) :
    CarRepository {
    override suspend fun getCars(): List<Car> {
        return carNetworkSource.getCars().map { networkCar ->
            Car(
                carName = networkCar.carName,
                carDescription = networkCar.carDescription,
                carPrice = networkCar.carPrice,
                carPhoto = networkCar.carPhoto
            )
        }

    }

}