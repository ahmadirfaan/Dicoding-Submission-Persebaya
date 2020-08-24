package com.dicoding.picodiploma.submissionpemainpersebaya

object playersdata {
    private val playersName = arrayOf("Rivky Mokodompit",
        "Hansamu Yama",
        "Rizky Ridho",
        "Arif Satria",
        "Koko Ari Araya",
        "Muhammad Hidayat",
        "Hambali Thalib",
        "Aryn Williams",
        "Makan Konate",
        "Irfan Jaya",
        "David Da Silva"
    )

    private val playersDetail = arrayOf("Rivky Mokodompit lahir di Kotamobagu, Sulawesi Utara, pada 5 Desember 1988. Ia Mengawali karier juniornya bersama Persibom Bolaang Mongodow sejak 2005.",
    "Hansamu Yama lahir di Mojokerto, 16 Januari 1995. Ia mengawali karier juniornya bersama SSB Mojokerto Muda, sebelum membela Persebaya ia sempat membela Bali United.",
    "Rizky Ridho lahir di Surabaya, 24 Juni 2001. Ia merupakan pemain binaan dari Persebaya Junior.",
    "Arif Satria merupakan pemain kelahiran 17 September 1995 yang berposisi sebagai bek kiri maupun bek kanan.",
    "Koko Ari Araya lahir di Surabaya, 09 Januari 2000, merupakan pemain dari akademi Persebaya yang bisa dimainkan di posisi bek ataupun gelandang.",
    "Muhammad Hidayat lahir di Bontang, 26 April 1996 merupakan gelandang pengangkut air andalan Persebaya terkenal dengan pressing yang ngeyel khas Surabaya.",
    "Hambali Thalib lahir di Makassar, 20 Juni 2000 merupakan pemain yang berposisi sebagai gelandang serang terkenal dengan sebutan Messi Indonesia.",
    "Aryn Williams pemain berdarah Australia yang lahir pada 28 Oktober 1993.",
    "Makan Konate lahir pada 10 November 1991 merupakan playmaker andalan Persebaya.",
    "Irfan Jaya lahir 01 Mei 1996 pemain yang memiliki kecepatan dan determinasi tinggi dalam menyerang andalan Persebaya sejak dari Liga 2.",
    "David Da Silva merupakan pemain kelahiran 12 November 1989. Pemain berkebangsaan Brazil ini sering dijuluki oleh arek Bonek sebagai Cak Gundul.")

    private val gambarPemain = intArrayOf(
        R.drawable.rivky_mokodompit,
        R.drawable.hansamu_yama,
        R.drawable.rizky_ridho,
        R.drawable.arif_satria,
        R.drawable.koko_ari_araya,
        R.drawable.muhammad_hidayat,
        R.drawable.khambali_thalib,
        R.drawable.aryn,
        R.drawable.makan_konate,
        R.drawable.irfan_jaya,
        R.drawable.david_da_silva)

    private val identitas = arrayOf(
        "20\n" + "Kotamabu,Sulawesi Utara\n" + "5 Desember 1998\n" + "27\n" + "0\n",
        "23\n" + "Mojokerto\n" + "16 Januari 1995\n" + "35\n" + "5\n",
        "32\n" + "Surabaya\n" + "24 Juni 2001\n" + "10\n" + "1\n",
        "24\n" + "Lamongan\n" + "17 September 1995\n" + "30\n" + "0\n",
        "33\n" + "Surabaya\n" + "09 Januari 2000\n" + "15\n" + "2\n",
        "96\n" + "Bontang\n" + "26 April 1996\n" + "13\n" + "0\n",
        "89\n" + "Makassar\n" + "20 Juni 2000\n" + "24\n" + "8\n",
        "28\n" + "Australia\n" + "28 Oktober 1993\n" + "27\n" + "5\n",
        "10\n" + "Mali\n" + "10 November 1991\n" + "38\n" + "13\n",
        "41\n" + "Makassar\n" + "01 Mei 1996\n" + "33\n" + "10\n",
        "7\n" + "Brazil\n" + "12 November 1989\n" + "32\n" + "25\n"
    )

    val listData: ArrayList<Pemain>
        get() {
            val list = arrayListOf<Pemain>()
            for (position in playersName.indices) {
                val pemain = Pemain()
                pemain.name = playersName[position]
                pemain.detail = playersDetail[position]
                pemain.photo = gambarPemain[position]
                pemain.identity = identitas[position]
                list.add(pemain)
            }
            return list
        }
}