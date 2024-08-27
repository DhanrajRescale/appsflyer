package jv;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class j implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f21694c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

    /* renamed from: d, reason: collision with root package name */
    public static final j f21695d = new j("Z", "+HH:MM:ss");

    /* renamed from: a, reason: collision with root package name */
    public final String f21696a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21697b;

    static {
        new j("0", "+HH:MM:ss");
    }

    public j(String str, String str2) {
        el.l.D0(str2, "pattern");
        this.f21696a = str;
        int i10 = 0;
        while (true) {
            String[] strArr = f21694c;
            if (i10 < 9) {
                if (strArr[i10].equals(str2)) {
                    this.f21697b = i10;
                    return;
                }
                i10++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str2));
            }
        }
    }

    @Override // jv.e
    public final boolean a(e5.o oVar, StringBuilder sb2) {
        String str;
        String str2;
        Long e10 = oVar.e(lv.a.OFFSET_SECONDS);
        if (e10 == null) {
            return false;
        }
        int J0 = el.l.J0(e10.longValue());
        String str3 = this.f21696a;
        if (J0 == 0) {
            sb2.append(str3);
        } else {
            int abs = Math.abs((J0 / 3600) % 100);
            int abs2 = Math.abs((J0 / 60) % 60);
            int abs3 = Math.abs(J0 % 60);
            int length = sb2.length();
            if (J0 < 0) {
                str = "-";
            } else {
                str = "+";
            }
            sb2.append(str);
            sb2.append((char) ((abs / 10) + 48));
            sb2.append((char) ((abs % 10) + 48));
            int i10 = this.f21697b;
            if (i10 >= 3 || (i10 >= 1 && abs2 > 0)) {
                int i11 = i10 % 2;
                String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (i11 == 0) {
                    str2 = ":";
                } else {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                sb2.append(str2);
                sb2.append((char) ((abs2 / 10) + 48));
                sb2.append((char) ((abs2 % 10) + 48));
                abs += abs2;
                if (i10 >= 7 || (i10 >= 5 && abs3 > 0)) {
                    if (i11 == 0) {
                        str4 = ":";
                    }
                    sb2.append(str4);
                    sb2.append((char) ((abs3 / 10) + 48));
                    sb2.append((char) ((abs3 % 10) + 48));
                    abs += abs3;
                }
            }
            if (abs == 0) {
                sb2.setLength(length);
                sb2.append(str3);
            }
        }
        return true;
    }

    public final String toString() {
        return a3.a.k(new StringBuilder("Offset("), f21694c[this.f21697b], ",'", this.f21696a.replace("'", "''"), "')");
    }
}
