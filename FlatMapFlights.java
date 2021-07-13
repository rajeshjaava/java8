public class FlatMapFlights
{
public static void main(String[] args)
{

}
public Set<String> collectAirports(Collection<Flight> flights) {
return flights.stream()
// flights -> stream of list of legs
.map(Flight::getLegs)
// each list of legs -> stream of legs
.flatMap(Collection::stream)
// each leg -> stream of airports
.flatMap(this::getLegAirports)
// collect results
.collect(toSet());
}
// Extract leg airports as stream:
public static  Stream<String> getLegAirports(Leg leg) {
return Stream.of(leg.origin, leg.destination);
}

static class Flight {
private final List<Leg> legs;

public Flight(List<Leg> legs) {
this.legs = legs;
System.out.println("Flight with legs: " + legs);
}

public List<Leg> getLegs() {
return legs;
}
}
static class Leg {
String origin, destination;

public Leg(String origin, String destination) {
this.origin = origin;
this.destination = destination;
}

@Override
public String toString() {
return "Leg(" + origin + "->" + destination + ')';
}
}
