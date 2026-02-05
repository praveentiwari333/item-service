🧾 Item Service – Spring Boot REST API

📌 Project Overview

This is a simple Spring Boot REST API that manages Item data using an in-memory list (no database).

The project demonstrates:

How to create REST APIs using Spring Boot

How to add and fetch data

How to send GET and POST requests


📂 Data Initialization

⚠️ Since this is in-memory data, all data will be lost when the application restarts.

▶️ How to Run the Application

1️⃣ Clone the repository

git clone https://github.com/praveentiwari333/item-service.git

2️⃣ Open the project

Open the project in IntelliJ IDEA / Eclipse / STS.

3️⃣ Run the application

Run the main Spring Boot class

The application is available on:

https://item-service-es8n.onrender.com

🔗 API Endpoints

1️⃣ Get Item By ID

Endpoint

GET /items/{id}


Example

GET   https://item-service-es8n.onrender.com/items/1

📤 How to Send GET Request

Option 1: Browser

Open in browser:

https://item-service-es8n.onrender.com/items/2

Option 2: Postman

Method: GET

URL:

https://item-service-es8n.onrender.com/items/1

📥 Sample GET Response

{
    "expiry": "10 Years",
    "description": "One of the best laptop for gaming",
    "name": "Lenovo Ideapad Slim3",
    "id": 1
}

2️⃣ Add New Item (POST Request)

📌 Endpoint

POST /items

📤 How to Send POST Request (Postman)

Open Postman

Select method: POST

Enter URL:

https://item-service-es8n.onrender.com/items


Go to Body → raw → JSON

Enter request body:

{
    "name":"Lenovo Ideapad Slim3",
    "description": "One of the best laptop for gaming",
    "expiry": "10 Years"
}


Click Send

📥 Sample POST Response

{
    "expiry": "15 Years",
    "description": "One of the best laptop for gaming",
    "name": "Lenovo Ideapad Slim4",
    "id": 2
}

🧠 Important Notes

No database is used

Data is stored in memory using a List

Restarting the application will reset the data


🕒 Important Note:

The service may go to sleep after inactivity

The first request after some time may take 30–60 seconds to respond

This delay is known as a cold start and is expected behavior on free hosting plans

✅ Once the service wakes up, subsequent requests will respond normally and faster.
