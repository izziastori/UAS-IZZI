package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;

import simple.example.hewanpedia.model.Ayam;
import simple.example.hewanpedia.model.Beruang;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Ayam;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Beruang;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Ayam> initDataayam(Context ctx) { {
        List<Ayam> ayams = new ArrayList<>();
        ayams.add(new Ayam(ctx.getString(R.string.gallus_gallus_domesticus_nama),ctx.getString(R.string.gallus_gallus_domesticus_asal),
                ctx.getString(R.string.gallus_gallus_domesticus_deskripsi), R.drawable.ayam_kampung));
        ayams.add(new Ayam(ctx.getString(R.string.ayam_serama_nama),ctx.getString(R.string.ayam_serama_asal),
                ctx.getString(R.string.ayam_serama_deskripsi), R.drawable.ayam_serama));
        ayams.add(new Ayam(ctx.getString(R.string.ayam_bangkok_nama),ctx.getString(R.string.ayam_bangkok_asal),
                ctx.getString(R.string.ayam_bangkok_deskripsi), R.drawable.ayam_bangkok));
        ayams.add(new Ayam(ctx.getString(R.string.ayam_betet_nama),ctx.getString(R.string.ayam_betet_asal),
                ctx.getString(R.string.ayam_betet_deskripsi), R.drawable.ayam_betet));
        return ayams;
    }
    }
    private static List<Beruang> initDataBeruangs(Context ctx) {
        List<Beruang> Beruangs = new ArrayList<>();
        Beruangs.add(new Beruang(ctx.getString(R.string.andes_nama),ctx.getString(R.string.andes_asal),
                ctx.getString(R.string.andes_deskripsi), R.drawable.beruang_andes));
        Beruangs.add(new Beruang(ctx.getString(R.string.coklat_nama),ctx.getString(R.string.coklat_asal),
                ctx.getString(R.string.coklat_deskripsi), R.drawable.beruang_cokelat));
        Beruangs.add(new Beruang(ctx.getString(R.string.hitam_nama),ctx.getString(R.string.hitam_asal),
                ctx.getString(R.string.hitam_deskripsi), R.drawable.hitam));
        Beruangs.add(new Beruang(ctx.getString(R.string.hitam_asia_nama),ctx.getString(R.string.hitam_asia_asal),
                ctx.getString(R.string.hitam_asia_diskripsi), R.drawable.beruang_hitam_asia));
        return Beruangs;
    }
    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci(ctx.getString(R.string.netherland_dwarf_nama),ctx.getString(R.string.netherland_dwarf_asal),
                ctx.getString(R.string.netherland_dwarf_diskripsi), R.drawable.kelinci_netherland_dwarf));
        kelincis.add(new Kelinci(ctx.getString(R.string.orictolagus_cuniculus_nama),ctx.getString(R.string.orictolagus_cuniculus_asal),
                ctx.getString(R.string.orictolagus_cuniculus_diskripsi), R.drawable.kelinci_orictolagus_cuniculus));
        kelincis.add(new Kelinci(ctx.getString(R.string.holland_lop_nama),ctx.getString(R.string.holland_lop_asal),
                ctx.getString(R.string.holland_lop_diskripsi), R.drawable.kelinci_holland_lop));
        kelincis.add(new Kelinci(ctx.getString(R.string.mini_lop_nama),ctx.getString(R.string.mini_lop_asal),
                ctx.getString(R.string.mini_lop_diskripsi), R.drawable.kelinci_mini_lop));
        kelincis.add(new Kelinci(ctx.getString(R.string.raksasa_nama),ctx.getString(R.string.raksasa_asal),
                ctx.getString(R.string.raksasa_diskripsi), R.drawable.kelinci_raksasa));
        kelincis.add(new Kelinci(ctx.getString(R.string.rex_nama),ctx.getString(R.string.rex_asal),
                ctx.getString(R.string.rex_diskripsi), R.drawable.kelinci_rex));
        return kelincis;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataayam(ctx));
        hewans.addAll(initDataBeruangs(ctx));
        hewans.addAll(initDataKelinci(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
