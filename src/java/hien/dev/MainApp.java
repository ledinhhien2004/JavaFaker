/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hien.dev;

//import hien.dev.data.dao.CategoryDao;
import hien.dev.data.dao.Database;
//import hien.dev.data.model.Category;
//import hien.dev.data.impl.CategoryImpl;
//import hien.dev.data.model.Order;
//import hien.dev.data.model.OrderItem;
//import hien.dev.data.model.Product;
import hien.dev.data.dao.DatabaseDao;
//import hien.dev.data.dao.OrderDao;
//import hien.dev.data.dao.OrderItemDao;
//import hien.dev.data.dao.ProductDao;
import hien.dev.data.dao.UserDao;
//import hien.dev.data.impl.UserImpl;
//import hien.dev.data.model.User;
//import hien.dev.data.seeder.CategorySeeder;
//import hien.dev.data.seeder.ProductSeeder;
import hien.dev.data.seeder.UserSeeder;

//import java.util.List;
//import java.util.Locale;
import com.github.javafaker.Faker;
//import hien.dev.data.seeder.OrderSeeder;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                DatabaseDao.init(new Database());
                Faker faker = new Faker();
		//Insert User	
	        UserDao userDao = DatabaseDao.getInstance().getUserDao();
	        UserSeeder userSign = new UserSeeder(userDao);
	        userSign.seedUsers(5);        
//	        Insert Category
//	        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
//	        CategorySeeder categorySeeder = new CategorySeeder(categoryDao);
//	        categorySeeder.seedCategories(5);
//	        //Insert Product
//	        ProductDao productDao = DatabaseDao.getInstance().getProductDao();
//	        ProductSeeder productSeeder = new ProductSeeder(productDao, categoryDao);
//	        productSeeder.seedProducts(10);
//	        //Insert Order
//              OrderDao orderDao = DatabaseDao.getInstance().getOrderDao();
//	        OrderSeeder orderSeeder = new OrderSeeder(orderDao, userDao);
//	        orderSeeder.seedOrders(5);
                //Insert OrderItem
                
	        System.out.println("Seeded fake users successfully!");
			
	}
	
}