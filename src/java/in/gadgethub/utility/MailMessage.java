/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.utility;

import java.util.Date;
import javax.mail.MessagingException;

/**
 *
 * @author Hp
 */
public class MailMessage {
        public static void registrationSuccess(String recipientMailId, String name) throws MessagingException {
        String subject = "Registration Successfull";
        String htmlTextMessage = "" + "<html>" + "<body>"
                + "<h2 style='color:green;'>Welcome to " + AppInfo.appName + "</h2>" + "" + "Hi " + name + ","
                + "<br><br>Thanks for singing up with " + AppInfo.appName + ".<br>"
                + "We are glad that you choose us. We invite you to check out our latest collection of new electonics appliances."
                + "<br>We are providing upto 60% OFF on most of the electronic gadgets. So please visit our site and explore the collections."
                + "<br><br>Our Online electronics is growing in a larger amount these days and we are in high demand so we thanks all of you for "
                + "making us up to that level. We Deliver Product to your house with no extra delivery charges and we also have collection of most of the"
                + "branded items.<br><br>As a Welcome gift for our New Customers we are providing additional 10% OFF Upto 500 Rs for the first product purchase. "
                + "<br>To avail this offer you only have "
                + "to enter the promo code given below.<br><br><br> PROMO CODE: " + "" + AppInfo.appName.toUpperCase() + "500<br><br><br>"
                + "Have a good day!<br>" + "" + "</body>" + "</html>";
        JavaMailUtil.sendMail(recipientMailId, subject, htmlTextMessage);
    }
        
        public static void paymentDone(String recipientMailId, String name,double amount,String orderID,String method,Date date) throws MessagingException{
            String subject = "Order Confirmed" ;
            String htmlTextMessage = "<html>\n" +
                        "<head>\n" +
                        "<style>body {\n" +
"            font-family: Arial, sans-serif;\n" +
"            background-color: #f4f4f4;\n" +
"            margin: 0;\n" +
"            padding: 0;\n" +
"        }\n" +
"        .container {\n" +
"            max-width: 600px;\n" +
"            margin: 20px auto;\n" +
"            background-color: #ffffff;\n" +
"            border-radius: 10px;\n" +
"            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\n" +
"            overflow: hidden;\n" +
"        }\n" +
"        .header {\n" +
"            background-color: #007bff;\n" +
"            color: white;\n" +
"            text-align: center;\n" +
"            padding: 20px;\n" +
"            font-size: 24px;\n" +
"            font-weight: bold;\n" +
"        }\n" +
"        .content {\n" +
"            padding: 20px;\n" +
"            color: #333;\n" +
"        }\n" +
"        .order-details {\n" +
"            background-color: #f8f9fa;\n" +
"            padding: 15px;\n" +
"            border-radius: 5px;\n" +
"            margin-top: 10px;\n" +
"        }\n" +
"        .order-details p {\n" +
"            margin: 5px 0;\n" +
"        }\n" +
"        .button {\n" +
"            display: block;\n" +
"            width: 200px;\n" +
"            margin: 20px auto;\n" +
"            padding: 10px;\n" +
"            text-align: center;\n" +
"            background-color: #28a745;\n" +
"            color: white;\n" +
"            text-decoration: none;\n" +
"            border-radius: 5px;\n" +
"            font-weight: bold;\n" +
"        }\n" +
"        .footer {\n" +
"            text-align: center;\n" +
"            padding: 10px;\n" +
"            font-size: 12px;\n" +
"            color: #555;\n" +
"            background-color: #f4f4f4;\n" +
"            border-top: 1px solid #ddd;\n" +
"        }\n" +
"\n" +
"</style>" +
                        "</head>\n" +
                        "<body>" + "<div class=\"container\">\n" +
                        "<div class=\"header\">\n" +
                        "Order Confirmation\n" +
                        "</div>\n" +
                        "<div class=\"content\">\n" +
                        "<p>Dear <strong>"+name+"</strong>,</p>\n" +
                        "<p>We are pleased to inform you that your payment of <strong>Rs. "+amount+"</strong> has been successfully received.</p>\n" +
                        "\n" +
                        "<div class=\"order-details\">\n" +
                        "<p><strong>Order ID:</strong>"+orderID+"</p>\n" +
                        "<p><strong>Order Date:</strong>"+date+"</p>\n" +
                        "<p><strong>Payment Method:</strong>"+"UPI"+"</p>\n" +
                        "<p><strong>Total Amount:</strong> Rs. "+amount+"</p>\n" +
                        "</div>\n" +
                        "\n"+"<p>Your order has been confirmed and is now being processed. You will receive another update once your order is shipped.</p>\n" + 
                        "\n" +"\n" +
                        "<p>If you have any questions, feel free to contact our support team at <strong>rawalpratik05@gmail.com</strong> or call us at <strong>895989***</strong>.</p>\n" +
                        "\n" +
                        "<p>Thank you for shopping with <strong>GadgetHub</strong>! We appreciate your trust in us.</p>\n" +
                        "</div>\n" +
                        "<div class=\"footer\">\n" +
                        "© 2025 GadgetHub | <a href=\"http://127.0.0.1:2024/GadgetHub/LandingServlet\">Visit Website</a> | <a href=\"mailto: rawalpratik05@gmail.com\">Contact Support</a>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</body>\n" +
                        "</html>" ;
            JavaMailUtil.sendMail(recipientMailId,subject,htmlTextMessage);
        }
        
        public static void OrderShipped(String orderid,String prodid,String status, String name,String recipientMailId) throws MessagingException{
            String subject = "Item Shipped.." ;
            Date date = new Date() ;
            String htmlTextMessage = "<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"<style>\n" +
"body {\n" +
"font-family: 'Arial', sans-serif;\n" +
"background-color: #fff0f6;\n" +
"margin: 0;\n" +
"padding: 0;\n" +
"}\n" +
".container {\n" +
"max-width: 600px;\n" +
"margin: 20px auto;\n" +
"background-color: #ffffff;\n" +
"border-radius: 10px;\n" +
"box-shadow: 0px 0px 10px rgba(255, 0, 102, 0.2);\n" +
"overflow: hidden;\n" +
"border: 2px solid #ff4d6d;\n" +
"}\n" +
".header {\n" +
"background-color: #ff4d6d;\n" +
"color: white;\n" +
"text-align: center;\n" +
"padding: 20px;\n" +
"font-size: 26px;\n" +
"font-weight: bold;\n" +
"}\n" +
".content {\n" +
"padding: 20px;\n" +
"color: #333;\n" +
"text-align: center;\n" +
"}\n" +
".order-details {\n" +
"background-color: #fff0f6;\n" +
"padding: 15px;\n" +
"border-radius: 5px;\n" +
"margin-top: 10px;\n" +
"text-align: left;\n" +
"}\n" +
".order-details p {\n" +
"margin: 5px 0;\n" +
"color: #ff4d6d;\n" +
"font-weight: bold;\n" +
"}\n" +
".button {\n" +
"display: block;\n" +
"width: 200px;\n" +
"margin: 20px auto;\n" +
"padding: 12px;\n" +
"text-align: center;\n" +
"background-color: #ff4d6d;\n" +
"color: white;\n" +
"text-decoration: none;\n" +
"border-radius: 30px;\n" +
"font-size: 16px;\n" +
"font-weight: bold;\n" +
"box-shadow: 0px 4px 6px rgba(255, 77, 109, 0.3);\n" +
"}\n" +
".footer {\n" +
"text-align: center;\n" +
"padding: 10px;\n" +
"font-size: 14px;\n" +
"color: #555;\n" +
"background-color: #fff0f6;\n" +
"border-top: 2px solid #ff4d6d;\n" +
"}\n" +
".heart {\n" +
"font-size: 24px;\n" +
"color: #ff4d6d;\n" +
"}\n" +
"</style>\n" +
"</head>\n" +
"<body>\n" +
"<div class=\"container\">\n" +
"<div class=\"header\">\n"+status+"\n" +
"</div>\n" +
"<div class=\"content\">\n" +
"<p>Dear <strong>"+name+"</strong>,</p>\n" +
"<p>Exciting news! Your order has been shipped and is on its way to you. 🎁</p>\n" +
"\n" +
"<div class=\"order-details\">\n" +
"<p><strong>Order ID:</strong>"+orderid+"</p>\n" +
"<p><strong>Shipped On:</strong>"+date.getDate()+"</p>\n" +
"<p><strong>Courier Service:</strong>BlueDart</p>\n" +
"<p><strong>Tracking Number:</strong>"+prodid+"</p>\n" +
"</div>\n" +
"\n" +
"<p>You can track your package and see the estimated delivery time below:</p>\n" +
"\n" +
"<a href=\"gadgethub.com\" class=\"button\">Track Your Order</a>\n" +
"\n" +
"<p>Thank you for shopping with us! We hope you love your purchase. ❤️</p>\n" +
"</div>\n" +
"<div class=\"footer\">\n" +
"With Love, <br>\n" +
"<strong>GadgetHub Team</strong> 💕 | <a href=\"http://127.0.0.1:2024/GadgetHub/LandingServlet\">Visit Website</a> | <a href=\"mailto:rawalpratik05@gmail.com\">Contact Support</a>\n" +
"</div>\n" +
"</div>\n" +
"</body>\n" +
"</html>" ;
    JavaMailUtil.sendMail(recipientMailId,subject,htmlTextMessage);        
        }
}
