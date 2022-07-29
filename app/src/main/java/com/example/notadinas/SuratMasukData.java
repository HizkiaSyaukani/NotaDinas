package com.example.notadinas;

import java.util.ArrayList;

public class SuratMasukData {
        private static String [] SuratDummy={
                "Hizkia Syaukani",
                "Hizkia",
                "Syaukani",
                "hizkia",
                "syaukani",
        };
        private static String [] DetailDummy={
          "Hizkia Syaukani",
          "Hizkia Syaukani",
          "Hizkia Syaukani",
          "Hizkia Syaukani",
          "Hizkia Syaukani",
        };
        static ArrayList<SuratMasuk> getListData() {
            ArrayList<SuratMasuk> list = new ArrayList<>();
            for (int position = 0; position < SuratDummy.length; position++) {
                SuratMasuk suratmasuk = new SuratMasuk();
                suratmasuk.setName(SuratDummy[position]);
                suratmasuk.setDetail(DetailDummy[position]);
                list.add(suratmasuk);
            }
            return list;
        }
}
