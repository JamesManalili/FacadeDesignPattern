# Problem
__Simplified Hotel Management System__

The HotelApp needs to manage various hotel services for guest check-in and check-out. These services include valet parking for vehicles, room cleaning, and handling luggage carts. However, the HotelApp aims to interact with these services through a simplified, single interface provided by the FrontDesk. The FrontDesk class should delegate the client's requests to the appropriate service classes (Valet, HouseKeeping, Cart) while abstracting the service details from the client.

__Class Definitions:__

__HotelService (Interface):__ Defines the common interface for all hotel services.

__Valet:__ A service class implementing the HotelService interface, responsible for vehicle valet parking and pick-up. It includes the pickUpVehicle(plateNumber) method.

__HouseKeeping:__ A service class implementing the HotelService interface, responsible for room cleaning. It includes the cleanRoom(roomNumber) method.

__Cart:__ A service class implementing the HotelService interface, responsible for handling luggage cart requests. It includes the requestCart(numberOfCarts) method.

__FrontDesk:__ The facade class that coordinates interactions between the client (HotelApp) and the individual hotel services.

__HotelApp:__ The client class that uses the FrontDesk facade to access and utilize hotel services seamlessly.

# UML Class Diagram

![FacadeDP](https://github.com/JamesManalili/FacadeDesignPattern/assets/142465145/25a93efe-6708-4cfe-8cc1-b5218e57e4f0)
