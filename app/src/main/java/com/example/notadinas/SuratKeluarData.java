package com.example.notadinas;

import java.util.ArrayList;

public class SuratKeluarData {
    private static String [] NamaKeluarDummy={
            "Hizkia Syaukani",
            "Hizkia",
            "Syaukani",
            "hizkia",
            "syaukani",
    };
    private static String [] DetailKeluarDummy={
            "Hizkia Syaukani",
            "Hizkia Syaukani",
            "Hizkia Syaukani",
            "Hizkia Syaukani",
            "Hizkia Syaukani",
    };
    private static String [] StatusKeluarDummy={
            "Ditolak",
            "Ditolak",
            "Ditolak",
            "Ditolak",
            "Ditolak",
    };
    static ArrayList<SuratKeluar> getListData() {
        ArrayList<SuratKeluar> list = new ArrayList<>();
        for (int position = 0; position < NamaKeluarDummy.length; position++) {
            SuratKeluar suratkeluar = new SuratKeluar();
            suratkeluar.setName(NamaKeluarDummy[position]);
            suratkeluar.setDetail(DetailKeluarDummy[position]);
            suratkeluar.setStatus(StatusKeluarDummy[position]);
            list.add(suratkeluar);
        }
        return list;
    }
}
