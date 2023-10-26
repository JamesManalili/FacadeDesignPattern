package LabFDP;
public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void ValetService(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
        valet.execute();
    }

    public void HouseKeepingService(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
        houseKeeping.execute();
    }

    public void CartService(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
        cart.execute();
    }
}
