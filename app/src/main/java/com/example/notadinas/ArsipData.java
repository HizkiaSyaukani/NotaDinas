package com.example.notadinas;

import java.util.ArrayList;

public class ArsipData {
    private static String [] NamaArsipDummy={
            "Hizkia Syaukani",
            "Hizkia",
            "Syaukani",
            "hizkia",
            "syaukani",
    };
    private static String [] DetailArsipDummy={
            "Hizkia Syaukani",
            "Hizkia Syaukani",
            "Hizkia Syaukani",
            "Hizkia Syaukani",
            "Hizkia Syaukani",
    };
    private static String [] StatusArsipDummy={
            "Ditolak",
            "Ditolak",
            "Ditolak",
            "Ditolak",
            "Ditolak",
    };
    static ArrayList<Arsip> getListData() {
        ArrayList<Arsip> list = new ArrayList<>();
        for (int position = 0; position < NamaArsipDummy.length; position++) {
            Arsip arsip = new Arsip();
            arsip.setName(NamaArsipDummy[position]);
            arsip.setDetail(DetailArsipDummy[position]);
            arsip.setStatus(StatusArsipDummy[position]);
            list.add(arsip);
        }
        return list;
    }
}
