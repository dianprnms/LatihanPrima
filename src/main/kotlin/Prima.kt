//class Prima (var angka : Int){
//    fun sum() {
//        if((angka / angka == 1) || (angka % 2 == 1)){
//            print("Prima")
//        }else{
//            print("Bukan Prima")
//        }
//    }
//}

class Prima(var number : Int) {
    fun sum() {
        if (number <= 1) {
            print("Bukan Prima")
        }

        for (i in 2..(number / 2)) {
            if (number % i == 0) {
                print("Bukan Prima")
            }
        }
        print("Prima")

    }

}