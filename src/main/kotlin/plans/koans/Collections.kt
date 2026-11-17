package plans.koans

data class Shop(val name: String, val customers: List<Customer>)
data class Customer(val name: String, val city: City, val orders: List<Order>) {
    override fun toString(): String = ""
}

data class City(val name: String)
data class Order(val products: List<Product>, val isDelivered: Boolean)
data class Product(val name: String, val price: Double)

fun Shop.getSetOfCustomers(): Set<Customer> = customers.toSet()

// Return a list of customers, sorted in the descending by number of orders they have made
fun Shop.getCustomersSortedByOrders(): List<Customer> =
    customers.sortedByDescending {
        it.orders.count()
    }

fun Shop.getCustomerCities(): Set<City> = customers.map {
    it.city
}.toSet()

fun Shop.getCustomersFrom(city: City): List<Customer> = customers.filter { it.city == city }

fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all { it.city == city }

// Return true if there is at least one customer from a given city
fun Shop.hasCustomerFrom(city: City): Boolean = customers.any { it.city == city }

// Return the number of customers from a given city
fun Shop.countCustomersFrom(city: City): Int = customers.count { it.city == city }

// Return a customer who lives in a given city, or null if there is none
fun Shop.findCustomerFrom(city: City): Customer? = customers.find { it.city == city }

// Build a map from the customer name to the customer
fun Shop.nameToCustomerMap(): Map<String, Customer> =
    customers.associateBy { it.name }


// Build a map from the customer to their city
fun Shop.customerToCityMap(): Map<Customer, City> =
    customers.associateWith { it.city }

// Build a map from the customer name to their city
fun Shop.customerNameToCityMap(): Map<String, City> =
    customers.associate { it.name to it.city }

// Build a map that stores the customers living in a given city
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> =
    customers.groupBy { it.city }

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> {
    val customersMissingDelivery = mutableListOf<Customer>()
    customers.forEach { customer ->
        val (delivered, undelivered) = customer.orders.partition { it.isDelivered }
        if (delivered.size < undelivered.size) customersMissingDelivery.add(customer)
    }
    return customersMissingDelivery.toSet()
}

// Return all products the given customer has ordered
fun Customer.getOrderedProducts(): List<Product> = orders.flatMap { it.products }

// Return all products that were ordered by at least one customer
fun Shop.getOrderedProducts(): Set<Product> = customers.flatMap { customer ->
    customer.orders.flatMap { it.products }
}.toSet()

fun Shop.getOrderedProducts2(): Set<Product> = customers.flatMap { customer ->
    customer.orders.flatMap { it.products }
}.toSet()

// Return a customer who has placed the maximum amount of orders
fun Shop.getCustomerWithMaxOrders(): Customer? = customers.maxByOrNull { customer ->
    customer.orders.size
}

// Return the most expensive product that has been ordered by the given customer
fun getMostExpensiveProductBy(customer: Customer): Product? = customer.orders.flatMap { order ->
    order.products
}.maxByOrNull {
    it.price
}

// Return the sum of prices for all the products ordered by a given customer
fun moneySpentBy(customer: Customer): Double = customer.orders.flatMap { order ->
    order.products
}.sumOf { it.price }

// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> = customers.map { customer ->
    customer.getOrderedProducts().toSet()
}.reduce { acc, customerProducts ->
    acc.intersect(customerProducts)
}

// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {
    return customer.orders.filter { order ->
        order.isDelivered
    }.flatMap {
        it.products
    }.maxByOrNull {
        it.price
    }
}

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers.flatMap {
        it.getOrderedProducts()
    }.count { it == product }
}

fun doSomethingWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection.groupBy { s -> s.length }

    val maximumSizeOfGroup = groupsByLength.values.map { group -> group.size }.maxOrNull()

    return groupsByLength.values.firstOrNull { group -> group.size == maximumSizeOfGroup }
}



