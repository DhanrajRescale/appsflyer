package im;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import da.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jr.h;
import okhttp3.HttpUrl;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20117a = String.valueOf(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Locale f20118b;

    /* renamed from: c, reason: collision with root package name */
    public static final am.a f20119c;

    /* renamed from: d, reason: collision with root package name */
    public static final SparseArray f20120d;

    /* renamed from: e, reason: collision with root package name */
    public static Map f20121e;

    static {
        Locale locale = Locale.US;
        f20118b = locale;
        f20119c = new am.a(1, locale);
        SparseArray sparseArray = new SparseArray(215);
        sparseArray.put(1, Arrays.asList("US", "AG", "AI", "AS", "BB", "BM", "BS", "CA", "DM", "DO", "GD", "GU", "JM", "KN", "KY", "LC", "MP", "MS", "PR", "SX", "TC", "TT", "VC", "VG", "VI"));
        sparseArray.put(7, Arrays.asList("RU", "KZ"));
        sparseArray.put(20, Collections.singletonList("EG"));
        e.x("ZA", sparseArray, 27, "GR", 30);
        e.x("NL", sparseArray, 31, "BE", 32);
        e.x("FR", sparseArray, 33, "ES", 34);
        e.x("HU", sparseArray, 36, "IT", 39);
        e.x("RO", sparseArray, 40, "CH", 41);
        sparseArray.put(43, Collections.singletonList("AT"));
        sparseArray.put(44, Arrays.asList("GB", "GG", "IM", "JE"));
        sparseArray.put(45, Collections.singletonList("DK"));
        sparseArray.put(46, Collections.singletonList("SE"));
        sparseArray.put(47, Arrays.asList("NO", "SJ"));
        sparseArray.put(48, Collections.singletonList("PL"));
        e.x("DE", sparseArray, 49, "PE", 51);
        e.x("MX", sparseArray, 52, "CU", 53);
        e.x("AR", sparseArray, 54, "BR", 55);
        e.x("CL", sparseArray, 56, "CO", 57);
        e.x("VE", sparseArray, 58, "MY", 60);
        sparseArray.put(61, Arrays.asList("AU", "CC", "CX"));
        sparseArray.put(62, Collections.singletonList("ID"));
        e.x("PH", sparseArray, 63, "NZ", 64);
        e.x("SG", sparseArray, 65, "TH", 66);
        e.x("JP", sparseArray, 81, "KR", 82);
        e.x("VN", sparseArray, 84, "CN", 86);
        e.x("TR", sparseArray, 90, "IN", 91);
        e.x("PK", sparseArray, 92, "AF", 93);
        e.x("LK", sparseArray, 94, "MM", 95);
        e.x("IR", sparseArray, 98, "SS", 211);
        sparseArray.put(212, Arrays.asList("MA", "EH"));
        sparseArray.put(213, Collections.singletonList("DZ"));
        e.x("TN", sparseArray, 216, "LY", 218);
        e.x("GM", sparseArray, 220, "SN", 221);
        e.x("MR", sparseArray, 222, "ML", 223);
        e.x("GN", sparseArray, 224, "CI", 225);
        e.x("BF", sparseArray, 226, "NE", 227);
        e.x("TG", sparseArray, 228, "BJ", 229);
        e.x("MU", sparseArray, 230, "LR", 231);
        e.x("SL", sparseArray, 232, "GH", 233);
        e.x("NG", sparseArray, 234, "TD", 235);
        e.x("CF", sparseArray, 236, "CM", 237);
        e.x("CV", sparseArray, 238, "ST", 239);
        e.x("GQ", sparseArray, 240, "GA", 241);
        e.x("CG", sparseArray, 242, "CD", 243);
        e.x("AO", sparseArray, 244, "GW", 245);
        e.x("IO", sparseArray, 246, "AC", 247);
        e.x("SC", sparseArray, 248, "SD", 249);
        e.x("RW", sparseArray, 250, "ET", 251);
        e.x("SO", sparseArray, 252, "DJ", 253);
        e.x("KE", sparseArray, 254, "TZ", 255);
        e.x("UG", sparseArray, 256, "BI", 257);
        e.x("MZ", sparseArray, 258, "ZM", 260);
        sparseArray.put(261, Collections.singletonList("MG"));
        sparseArray.put(262, Arrays.asList("RE", "YT"));
        sparseArray.put(263, Collections.singletonList("ZW"));
        e.x("NA", sparseArray, 264, "MW", 265);
        e.x("LS", sparseArray, 266, "BW", 267);
        e.x("SZ", sparseArray, 268, "KM", 269);
        sparseArray.put(290, Arrays.asList("SH", "TA"));
        sparseArray.put(291, Collections.singletonList("ER"));
        e.x("AW", sparseArray, 297, "FO", 298);
        e.x("GL", sparseArray, 299, "GI", 350);
        e.x("PT", sparseArray, 351, "LU", 352);
        e.x("IE", sparseArray, 353, "IS", 354);
        e.x("AL", sparseArray, 355, "MT", 356);
        sparseArray.put(357, Collections.singletonList("CY"));
        sparseArray.put(358, Arrays.asList("FI", "AX"));
        sparseArray.put(359, Collections.singletonList("BG"));
        e.x("LT", sparseArray, 370, "LV", 371);
        e.x("EE", sparseArray, 372, "MD", 373);
        e.x("AM", sparseArray, 374, "BY", 375);
        e.x("AD", sparseArray, 376, "MC", 377);
        e.x("SM", sparseArray, 378, "VA", 379);
        e.x("UA", sparseArray, 380, "RS", 381);
        e.x("ME", sparseArray, 382, "XK", 383);
        e.x("HR", sparseArray, 385, "SI", 386);
        e.x("BA", sparseArray, 387, "MK", 389);
        e.x("CZ", sparseArray, 420, "SK", StatusLine.HTTP_MISDIRECTED_REQUEST);
        e.x("LI", sparseArray, 423, "FK", 500);
        e.x("BZ", sparseArray, 501, "GT", 502);
        e.x("SV", sparseArray, 503, "HN", 504);
        e.x("NI", sparseArray, 505, "CR", 506);
        e.x("PA", sparseArray, 507, "PM", 508);
        sparseArray.put(509, Collections.singletonList("HT"));
        sparseArray.put(590, Arrays.asList("GP", "BL", "MF"));
        sparseArray.put(591, Collections.singletonList("BO"));
        e.x("GY", sparseArray, 592, "EC", 593);
        e.x("GF", sparseArray, 594, "PY", 595);
        e.x("MQ", sparseArray, 596, "SR", 597);
        sparseArray.put(598, Collections.singletonList("UY"));
        sparseArray.put(599, Arrays.asList("CW", "BQ"));
        sparseArray.put(670, Collections.singletonList("TL"));
        e.x("NF", sparseArray, 672, "BN", 673);
        e.x("NR", sparseArray, 674, "PG", 675);
        e.x("TO", sparseArray, 676, "SB", 677);
        e.x("VU", sparseArray, 678, "FJ", 679);
        e.x("PW", sparseArray, 680, "WF", 681);
        e.x("CK", sparseArray, 682, "NU", 683);
        e.x("WS", sparseArray, 685, "KI", 686);
        e.x("NC", sparseArray, 687, "TV", 688);
        e.x("PF", sparseArray, 689, "TK", 690);
        e.x("FM", sparseArray, 691, "MH", 692);
        e.x("001", sparseArray, 800, "001", 808);
        e.x("KP", sparseArray, 850, "HK", 852);
        e.x("MO", sparseArray, 853, "KH", 855);
        e.x("LA", sparseArray, 856, "001", 870);
        e.x("001", sparseArray, 878, "BD", 880);
        e.x("001", sparseArray, 881, "001", 882);
        e.x("001", sparseArray, 883, "TW", 886);
        e.x("001", sparseArray, 888, "MV", 960);
        e.x("LB", sparseArray, 961, "JO", 962);
        e.x("SY", sparseArray, 963, "IQ", 964);
        e.x("KW", sparseArray, 965, "SA", 966);
        e.x("YE", sparseArray, 967, "OM", 968);
        e.x("PS", sparseArray, 970, "AE", 971);
        e.x("IL", sparseArray, 972, "BH", 973);
        e.x("QA", sparseArray, 974, "BT", 975);
        e.x("MN", sparseArray, 976, "NP", 977);
        e.x("001", sparseArray, 979, "TJ", 992);
        e.x("TM", sparseArray, 993, "AZ", 994);
        e.x("GE", sparseArray, 995, "KG", 996);
        sparseArray.put(998, Collections.singletonList("UZ"));
        f20120d = sparseArray;
    }

    public static String a(String str, am.a aVar) {
        if (str.startsWith("+")) {
            return str;
        }
        return "+" + String.valueOf(aVar.f740c) + str.replaceAll("[^\\d.]", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public static Integer b(String str) {
        if (f20121e == null) {
            f();
        }
        if (str == null) {
            return null;
        }
        return (Integer) f20121e.get(str.toUpperCase(Locale.getDefault()));
    }

    public static String c(String str) {
        String replaceFirst = str.replaceFirst("^\\+", HttpUrl.FRAGMENT_ENCODE_SET);
        int length = replaceFirst.length();
        for (int i10 = 1; i10 <= 3 && i10 <= length; i10++) {
            String substring = replaceFirst.substring(0, i10);
            if (f20120d.indexOfKey(Integer.valueOf(substring).intValue()) >= 0) {
                return substring;
            }
        }
        return null;
    }

    public static am.a d(Context context) {
        String str;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        Locale locale = null;
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            locale = new Locale(HttpUrl.FRAGMENT_ENCODE_SET, str);
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        am.a aVar = f20119c;
        if (locale == null) {
            return aVar;
        }
        Integer b10 = b(locale.getCountry());
        if (b10 != null) {
            return new am.a(b10.intValue(), locale);
        }
        return aVar;
    }

    public static am.c e(String str) {
        String country;
        Locale locale = f20118b;
        String country2 = locale.getCountry();
        boolean startsWith = str.startsWith("+");
        String str2 = f20117a;
        if (startsWith) {
            String c10 = c(str);
            if (c10 != null) {
                str2 = c10;
            }
            List list = (List) f20120d.get(Integer.parseInt(str2));
            if (list != null) {
                country = (String) list.get(0);
            } else {
                country = locale.getCountry();
            }
            country2 = country;
            str = str.replaceFirst("^\\+?" + str2, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return new am.c(str, country2, str2);
    }

    public static void f() {
        HashMap hashMap = new HashMap(248);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = f20120d;
            if (i10 < sparseArray.size()) {
                int keyAt = sparseArray.keyAt(i10);
                for (String str : (List) sparseArray.get(keyAt)) {
                    if (!str.equals("001")) {
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, Integer.valueOf(keyAt));
                        } else {
                            throw new IllegalStateException(h.n("Duplicate regions for country code: ", keyAt));
                        }
                    }
                }
                i10++;
            } else {
                hashMap.remove("TA");
                hashMap.put("HM", 672);
                hashMap.put("GS", 500);
                f20121e = Collections.unmodifiableMap(hashMap);
                return;
            }
        }
    }
}
