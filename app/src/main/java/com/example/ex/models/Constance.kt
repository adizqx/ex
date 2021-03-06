package com.example.ex.models

import com.example.ex.R

class Constance {
    companion object {
        val news = arrayListOf<data>(
            data(newsNames.news1.ordinal, "Society & Issues", "https://raw.githubusercontent.com/adizqx/calc/main/news1.jpg", R.color.teal_200, R.color.black,"Jacinda Ardern, prime minister of New Zealand, hugs a mosque-goer at the Kilbirnie mosque in Wellington, on March 17, 2019."),
            data(newsNames.news2.ordinal, "Disasters","https://raw.githubusercontent.com/adizqx/calc/main/news2.jpg",R.color.red, R.color.green,"The spire of Notre-Dame collapses as the cathedral is engulfed in flames in central Paris on April 15, 2019."),
            data(newsNames.news3.ordinal, "Celebrity Gossip & Social","https://raw.githubusercontent.com/adizqx/calc/main/news3.jpg",R.color.green, R.color.white,"Spike Lee, winner of the Best Adapted Screenplay award for BlacKkKlansman, attends the 91st"),
            data(newsNames.news4.ordinal, "Marketing Technology","https://raw.githubusercontent.com/adizqx/calc/main/news4.jpg",R.color.orange, R.color.purple_700,"People raise their hands during a mass opposition rally against President Nicolás Maduro"),
            data(newsNames.news5.ordinal, "Politics","https://raw.githubusercontent.com/adizqx/calc/main/news5.jpg",R.color.purple_200, R.color.pink,"President Donald Trump turns to House Speaker Nancy Pelosi of California"),
            data(newsNames.news6.ordinal, "Religion","https://raw.githubusercontent.com/adizqx/calc/main/news6.jpg",R.color.pink,R.color.blue1,"People are evacuated by a member of security forces at the scene of a terror"),
            data(newsNames.news7.ordinal, "Adventure & Outdoors","https://raw.githubusercontent.com/adizqx/calc/main/news7.jpg",R.color.purple_700, R.color.yellow,"Dogs pull a sled on water-covered sea ice near Qaanaaq, Greenland, on June 13, 2019."),
            data(newsNames.news8.ordinal, "Foreign Affairs/World","https://raw.githubusercontent.com/adizqx/calc/main/news8.jpg",R.color.yellow, R.color.red2,"A boy walks out of the sea while removing oil spilled on Itapuama beach, located in the city of Cabo"),
            data(newsNames.news9.ordinal, "Economic news","https://raw.githubusercontent.com/adizqx/calc/main/news9.jpg",R.color.red2, R.color.teal_700,"Thousands of pro-democracy protesters march on a street after leaving a rally in Victoria Park on August 18"),
            data(newsNames.news10.ordinal, "National Security","https://raw.githubusercontent.com/adizqx/calc/main/news10.jpg",R.color.teal_700, R.color.green2,"Police detain pro-democracy demonstrators during a demonstration in Hong Kong on September 29, 2019.")

        )
    }
}
    enum class newsNames(value: Int) {
        news1(1),
        news2(2),
        news3(3),
        news4(4),
        news5(5),
        news6(6),
        news7(7),
        news8(8),
        news9(9),
        news10(10)
    }