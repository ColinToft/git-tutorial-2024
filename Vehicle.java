class Vehicle {
    static int count = 0; // number of vehicles

    private int passengers; // number of passengers

    private String colour; // colour of the vehicle

    private int maxSpeed; // maximum speed of the vehicle in km/h

   
    public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Vehicle.count = count;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	// Constructor
    Vehicle(int passengers, String colour, int maxSpeed) {
        this.passengers = passengers;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        count++;
    }

    // Display the vehicle's details
    void display() {
        // TODO
    }
}