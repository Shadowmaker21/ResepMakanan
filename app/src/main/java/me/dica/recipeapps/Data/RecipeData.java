package me.dica.recipeapps.Data;

import java.util.ArrayList;

import me.dica.recipeapps.Adapter.RecipeAdapter;

public class RecipeData {
    public static String[][] data = new String[][]{
            {"Resep Sambel Terasi ", "Sambel Enak",
                    "https://www.sambalado.website/wp-content/uploads/2017/01/resep-sambal-terasi-matang.jpg",
                    "Bahan :\n" +
                            "•\t20 buah cabai merah, dibuang bijinya\n" +
                            "•\t1 sdm terasi bakar/ goreng\n" +
                            "•\t2 buah jeruk limau/ nipis, peras airnya\n" +
                            "•\t1 buah tomat besar\n" +
                            "•\tgaram dan gula pasir secukupnya\n" +
                            "•\tminyak goreng secukupnya\n" +
                            "CARA MEMBUAT SAMBAL TERASI :\n" +
                            "•\tCampurkan semua bahan di atas lalu haluskan. Sajikan.\n"
            },
            {
                    "RESEP SATAI/ SATE","Masakan Rumah",
                    "https://www.indoindians.com/wp-content/uploads/2016/03/Sate-Ayam.jpg",
                    "Bahan :\n" +
                            "•\t500 gr daging has dalam\n" +
                            "Bumbu Halus :\n" +
                            "•\t10 butir bawang merah\n" +
                            "•\t3 siung bawang putih\n" +
                            "•\t3 buah cabai merah\n" +
                            "•\t2 cm laos\n" +
                            "•\t2 sdt ketumbar\n" +
                            "•\t¼ sdt jintan\n" +
                            "•\t½ sdt merica\n" +
                            "•\t50 gr gula merah\n" +
                            "•\t2 sdm air asam jawa dari 1 sdt asam jawa\n" +
                            "•\t1 sdt garam\n" +
                            "CARA MEMBUAT SATAI :\n" +
                            "1.\tPotong-potong daging sesuai keinginan jangan terlampau besar lalu tata di tusukan sate. Lumuri dengan bumbu halus lalu diamkan dalam kulkas hingga 3 jam. Bakar sate di atas bara api dengan sesekali diolesi bumbu hingga matang merata.\n" +
                            "2.\tRebus santan hingga mendidih, masukkan sereh, daun jeruk, daun salam, bawang goreng, gula merah, garam dan kacang, masak sebentar.\n" +
                            "3.\tSajikan sate dengan saus kacang yang sudah dilengkapi dengan kecap manis dan jeruk limo.\n" +
                            "\n"
            },
            {
                    "Nasi Goreng Gila","Makan Malam",
                    "http://3.bp.blogspot.com/-nwUdf0cyaLw/UzQg0IYndUI/AAAAAAAAAOc/IY-QNToxrbY/s1600/nasgorgila_cntt.jpg",
                    "Bahan :\n" +
                            "•\t1 piring nasi putih\n" +
                            "•\t1 butir telur ayam\n" +
                            "•\t1 siung bawang putih\n" +
                            "•\t1 batang daung bawang, rajang\n" +
                            "•\t½ butir bawang bombay, rajang tipis\n" +
                            "•\t½ sdt garam\n" +
                            "•\t½ sdt gula pasir\n" +
                            "•\t1 sdm kecap manis\n" +
                            "Pelengkap :\n" +
                            "•\tKerupuk, bawang goreng secukupnya, Acar\n" +
                            "CARA MEMBUAT NASI GORENG GILA :\n" +
                            "1.\tTumis bawang putih hingga harum, masukkan telur, aduk - aduk. Tambahkan nasi dan garam, aduk rata, angkat. Cetak nasi goreng dalam mangkuk kecil, letakan di piring saji, sisihkan.\n" +
                            "2.\tTumis bawang putih dan bawang bombay hingga harum dan agak layu. Masukkan semua bahan kecuali pelengkap, masak hingga matang, angkat. Siram diatas nasi goreng. Sajikan dengan bawang goreng, kerupuk dan acar.\n"
            }
    };

    public static ArrayList<RecipeAdapter> getListData() {
        RecipeAdapter bg = null;
        ArrayList<RecipeAdapter> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            bg = new RecipeAdapter();
            bg.setName(data[i][0]);
            bg.setDesc(data[i][1]);
            bg.setPhoto(data[i][2]);
            bg.setRecipe(data[i][3]);


            list.add(bg);
        }

        return list;
    }

}
