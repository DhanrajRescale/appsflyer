package b5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f3583a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f3584b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        d4.c0 f10;
        int c10;
        if (str == null) {
            return false;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c11 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c11 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c11 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c11 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c11 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c11 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c11 = '\n';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                if (str2 == null || (f10 = f(str2)) == null || (c10 = f10.c()) == 0 || c10 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : e5.x.O(str)) {
            String d10 = d(str2);
            if (d10 != null && j(d10)) {
                return d10;
            }
        }
        return null;
    }

    public static int c(String str, String str2) {
        d4.c0 f10;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (f10 = f(str2)) == null) {
                    return 0;
                }
                return f10.c();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case '\b':
                return 9;
            case '\t':
                return 20;
            case '\n':
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        d4.c0 f10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String P1 = dp.b.P1(str.trim());
        if (!P1.startsWith("avc1") && !P1.startsWith("avc3")) {
            if (!P1.startsWith("hev1") && !P1.startsWith("hvc1")) {
                if (!P1.startsWith("dvav") && !P1.startsWith("dva1") && !P1.startsWith("dvhe") && !P1.startsWith("dvh1")) {
                    if (P1.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!P1.startsWith("vp9") && !P1.startsWith("vp09")) {
                        if (!P1.startsWith("vp8") && !P1.startsWith("vp08")) {
                            if (P1.startsWith("mp4a")) {
                                if (P1.startsWith("mp4a.") && (f10 = f(P1)) != null) {
                                    str2 = e(f10.f13727a);
                                }
                                if (str2 == null) {
                                    return "audio/mp4a-latm";
                                }
                                return str2;
                            }
                            if (P1.startsWith("mha1")) {
                                return "audio/mha1";
                            }
                            if (P1.startsWith("mhm1")) {
                                return "audio/mhm1";
                            }
                            if (!P1.startsWith("ac-3") && !P1.startsWith("dac3")) {
                                if (!P1.startsWith("ec-3") && !P1.startsWith("dec3")) {
                                    if (P1.startsWith("ec+3")) {
                                        return "audio/eac3-joc";
                                    }
                                    if (!P1.startsWith("ac-4") && !P1.startsWith("dac4")) {
                                        if (P1.startsWith("dtsc")) {
                                            return "audio/vnd.dts";
                                        }
                                        if (P1.startsWith("dtse")) {
                                            return "audio/vnd.dts.hd;profile=lbr";
                                        }
                                        if (!P1.startsWith("dtsh") && !P1.startsWith("dtsl")) {
                                            if (P1.startsWith("dtsx")) {
                                                return "audio/vnd.dts.uhd;profile=p2";
                                            }
                                            if (P1.startsWith("opus")) {
                                                return "audio/opus";
                                            }
                                            if (P1.startsWith("vorbis")) {
                                                return "audio/vorbis";
                                            }
                                            if (P1.startsWith("flac")) {
                                                return "audio/flac";
                                            }
                                            if (P1.startsWith("stpp")) {
                                                return "application/ttml+xml";
                                            }
                                            if (P1.startsWith("wvtt")) {
                                                return "text/vtt";
                                            }
                                            if (P1.contains("cea708")) {
                                                return "application/cea-708";
                                            }
                                            if (!P1.contains("eia608") && !P1.contains("cea608")) {
                                                ArrayList arrayList = f3583a;
                                                if (arrayList.size() <= 0) {
                                                    return null;
                                                }
                                                a3.a.u(arrayList.get(0));
                                                throw null;
                                            }
                                            return "application/cea-608";
                                        }
                                        return "audio/vnd.dts.hd";
                                    }
                                    return "audio/ac4";
                                }
                                return "audio/eac3";
                            }
                            return "audio/ac3";
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return "video/x-vnd.on2.vp9";
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    public static String e(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static d4.c0 f(String str) {
        int i10;
        Matcher matcher = f3584b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i10 = Integer.parseInt(group2);
            } else {
                i10 = 0;
            }
            return new d4.c0(parseInt, i10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (j(str)) {
            return 1;
        }
        if (l(str)) {
            return 2;
        }
        if (k(str)) {
            return 3;
        }
        if ("image".equals(g(str))) {
            return 4;
        }
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
            if ("application/x-camera-motion".equals(str)) {
                return 6;
            }
            ArrayList arrayList = f3583a;
            if (arrayList.size() <= 0) {
                return -1;
            }
            a3.a.u(arrayList.get(0));
            throw null;
        }
        return 5;
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : e5.x.O(str)) {
            String d10 = d(str2);
            if (d10 != null && l(d10)) {
                return d10;
            }
        }
        return null;
    }

    public static boolean j(String str) {
        return "audio".equals(g(str));
    }

    public static boolean k(String str) {
        if (!"text".equals(g(str)) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean l(String str) {
        return "video".equals(g(str));
    }
}
