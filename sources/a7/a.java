package a7;

import e5.p;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f200c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f201d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final p f202a = new p();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f203b = new StringBuilder();

    public static String a(p pVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = pVar.f15037b;
        int i11 = pVar.f15038c;
        while (i10 < i11 && !z10) {
            char c10 = (char) pVar.f15036a[i10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && ((c10 < '0' || c10 > '9') && c10 != '#' && c10 != '-' && c10 != '.' && c10 != '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c10);
            }
        }
        pVar.G(i10 - pVar.f15037b);
        return sb2.toString();
    }

    public static String b(p pVar, StringBuilder sb2) {
        c(pVar);
        if (pVar.a() == 0) {
            return null;
        }
        String a10 = a(pVar, sb2);
        if (!HttpUrl.FRAGMENT_ENCODE_SET.equals(a10)) {
            return a10;
        }
        return HttpUrl.FRAGMENT_ENCODE_SET + ((char) pVar.u());
    }

    public static void c(p pVar) {
        while (true) {
            for (boolean z10 = true; pVar.a() > 0 && z10; z10 = false) {
                int i10 = pVar.f15037b;
                byte[] bArr = pVar.f15036a;
                byte b10 = bArr[i10];
                char c10 = (char) b10;
                if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                    int i11 = pVar.f15038c;
                    int i12 = i10 + 2;
                    if (i12 <= i11) {
                        int i13 = i10 + 1;
                        if (b10 == 47 && bArr[i13] == 42) {
                            while (true) {
                                int i14 = i12 + 1;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (((char) bArr[i12]) == '*' && ((char) bArr[i14]) == '/') {
                                    i12 += 2;
                                    i11 = i12;
                                } else {
                                    i12 = i14;
                                }
                            }
                            pVar.G(i11 - pVar.f15037b);
                        }
                    }
                } else {
                    pVar.G(1);
                }
            }
            return;
        }
    }
}
