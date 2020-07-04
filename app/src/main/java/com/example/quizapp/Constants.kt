package com.example.quizapp

    object Constants {

        fun getQuestions(): ArrayList<Question> {
            val questionsList = ArrayList<Question>()

            val que1 = Question(1,"What country does this flag belong to ?",
                R.drawable.indian_flag,
                "Ireland",
                "Poland",
                "Romania",
                "India",
                4)

            questionsList.add(que1)

            val que2 = Question(1,"What car was manufactured in Ireland?",
                R.drawable.delor,
                "Ford Focus",
                "DeLorean DMC-12",
                "Volvo S40",
                "MINI Cooper S",
                2)

            questionsList.add(que2)

            val que3 = Question(1,"Who invented the beer ?",
                R.drawable.beer,
                "Greeks",
                "Egyptians",
                "Mesopotamians",
                "Vikings",
                4)

            questionsList.add(que3)

            return questionsList
        }
    }