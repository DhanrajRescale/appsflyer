package up;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzhd;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final zzjb f37319a = zzjb.zzi("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b, reason: collision with root package name */
    public static final zzja f37320b = zzja.zzj("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    public static final zzja f37321c = zzja.zzi("auto", "app", "am");

    /* renamed from: d, reason: collision with root package name */
    public static final zzja f37322d = zzja.zzh("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    public static final zzja f37323e;

    /* renamed from: f, reason: collision with root package name */
    public static final zzja f37324f;

    static {
        zzix zzixVar = new zzix();
        zzixVar.zza(zzhd.zza);
        zzixVar.zza(zzhd.zzb);
        f37323e = zzixVar.zzb();
        f37324f = zzja.zzh("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str, String str2, Bundle bundle) {
        char c10;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!c(str) || bundle == null) {
            return false;
        }
        zzja zzjaVar = f37322d;
        int size = zzjaVar.size();
        int i10 = 0;
        while (i10 < size) {
            boolean containsKey = bundle.containsKey((String) zzjaVar.get(i10));
            i10++;
            if (containsKey) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    c10 = 2;
                }
                c10 = 65535;
            } else {
                if (str.equals("fdl")) {
                    c10 = 1;
                }
                c10 = 65535;
            }
        } else {
            if (str.equals(AppMeasurement.FCM_ORIGIN)) {
                c10 = 0;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    return false;
                }
                bundle.putString("_cis", "fiam_integration");
                return true;
            }
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        bundle.putString("_cis", "fcm_integration");
        return true;
    }

    public static boolean b(Bundle bundle, String str) {
        if (f37320b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            zzja zzjaVar = f37322d;
            int size = zzjaVar.size();
            int i10 = 0;
            while (i10 < size) {
                boolean containsKey = bundle.containsKey((String) zzjaVar.get(i10));
                i10++;
                if (containsKey) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean c(String str) {
        if (!f37321c.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean d(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if ("_ln".equals(str2)) {
                if (str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    return true;
                }
                return false;
            }
            if (f37323e.contains(str2)) {
                return false;
            }
            zzja zzjaVar = f37324f;
            int size = zzjaVar.size();
            int i10 = 0;
            while (i10 < size) {
                boolean matches = str2.matches((String) zzjaVar.get(i10));
                i10++;
                if (matches) {
                    return false;
                }
            }
            return true;
        }
        if (str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc")) {
            return true;
        }
        return false;
    }
}
