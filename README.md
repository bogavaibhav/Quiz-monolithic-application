POSTMAN URLs

getByCategory(GET) -  http://localhost:8080/question/category/Java

getAllQuestions(GET) -  http://localhost:8080/question/allQuestions

addQuestion(POST) - http://localhost:8080/question/add
{
		"questionTitle": "What is the Maximum value for byte in Java",
		"option1": "100",
		"option2": "127",
		"option3": "255",
		"option4": "999",
		"rightAnswer": "127",
		"difficultylevel": "Easy",
		"category": "Java"
	}

 updateQuestion(PUT) - http://localhost:8080/question/update/203
 {
		"questionTitle": "Byte value in Java, what is maximum?",
		"option1": "100",
		"option2": "127",
		"option3": "255",
		"option4": "999",
		"rightAnswer": "127",
		"difficultylevel": "Easy",
		"category": "Java"
	}

 deleteQuestion(DELETE) :  http://localhost:8080/question/delete/203

 createQuiz(POST) :  http://localhost:8080/quiz/create?category=Java&numQ=5&title=JQuiz

 getQuizQuestions(GET) : http://localhost:8080/quiz/get/1

 submitQuiz(POST) : http://localhost:8080/quiz/submit/1
[
	{
		"id":9,
		"response":"+"
	},
	{
		"id":202,
		"response":"127"
	},
	{
		"id":7,
		"response":"do-while loop"
	},
	{
		"id":6,
		"response":"final int x = 5;"
	},
	{
		"id":5,
		"response":"It indicates that a method can be accessed without creating an instance of the class."
	}
]
