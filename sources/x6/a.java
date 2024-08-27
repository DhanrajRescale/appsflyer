package x6;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import e5.m;
import e5.p;
import eb.f;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kp.e;
import okhttp3.HttpUrl;
import s0.g;
import s6.b;

/* loaded from: classes.dex */
public final class a extends s6.a {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f40069o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f40070p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m, reason: collision with root package name */
    public final StringBuilder f40071m = new StringBuilder();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f40072n = new ArrayList();

    public static long h(Matcher matcher, int i10) {
        long j10;
        String group = matcher.group(i10 + 1);
        if (group != null) {
            j10 = Long.parseLong(group) * 3600000;
        } else {
            j10 = 0;
        }
        String group2 = matcher.group(i10 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j10;
        String group3 = matcher.group(i10 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x0127. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x0191. Please report as an issue. */
    @Override // s6.a
    public final b f(byte[] bArr, int i10, boolean z10) {
        String h10;
        String str;
        p pVar;
        Charset charset;
        char c10;
        int i11;
        char c11;
        int i12;
        int i13;
        int i14;
        float f10;
        float f11;
        d5.b bVar;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        int i15 = 1;
        f fVar = new f(i15);
        p pVar2 = new p(bArr, i10);
        Charset B = pVar2.B();
        if (B == null) {
            B = e.f23433c;
        }
        while (true) {
            String h11 = pVar2.h(B);
            int i16 = 0;
            if (h11 != null) {
                if (h11.length() != 0) {
                    try {
                        Integer.parseInt(h11);
                        h10 = pVar2.h(B);
                    } catch (NumberFormatException unused) {
                        m.f("SubripDecoder", "Skipping invalid index: ".concat(h11));
                    }
                    if (h10 == null) {
                        m.f("SubripDecoder", "Unexpected end");
                    } else {
                        Matcher matcher = f40069o.matcher(h10);
                        if (matcher.matches()) {
                            fVar.h(h(matcher, i15));
                            fVar.h(h(matcher, 6));
                            StringBuilder sb2 = aVar.f40071m;
                            sb2.setLength(0);
                            ArrayList arrayList2 = aVar.f40072n;
                            arrayList2.clear();
                            String h12 = pVar2.h(B);
                            while (!TextUtils.isEmpty(h12)) {
                                if (sb2.length() > 0) {
                                    sb2.append("<br>");
                                }
                                String trim = h12.trim();
                                StringBuilder sb3 = new StringBuilder(trim);
                                Matcher matcher2 = f40070p.matcher(trim);
                                int i17 = i16;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i17;
                                    int length = group.length();
                                    sb3.replace(start, start + length, HttpUrl.FRAGMENT_ENCODE_SET);
                                    i17 += length;
                                }
                                sb2.append(sb3.toString());
                                h12 = pVar2.h(B);
                                i16 = 0;
                            }
                            Spanned fromHtml = Html.fromHtml(sb2.toString());
                            int i18 = 0;
                            while (true) {
                                if (i18 < arrayList2.size()) {
                                    str = (String) arrayList2.get(i18);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i18++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            if (str == null) {
                                bVar = new d5.b(fromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, g.f34069a);
                                pVar = pVar2;
                                charset = B;
                            } else {
                                pVar = pVar2;
                                charset = B;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c10 = 6;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c10 = 7;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c10 = 4;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c10 = '\b';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c10 = 5;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    default:
                                        c10 = 65535;
                                        break;
                                }
                                if (c10 != 0 && c10 != 1 && c10 != 2) {
                                    if (c10 != 3 && c10 != 4 && c10 != 5) {
                                        i11 = 1;
                                    } else {
                                        i11 = 2;
                                    }
                                } else {
                                    i11 = 0;
                                }
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c11 = 0;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c11 = 1;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c11 = 2;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c11 = 6;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c11 = 7;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c11 = '\b';
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c11 = 3;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c11 = 4;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c11 = 5;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    default:
                                        c11 = 65535;
                                        break;
                                }
                                if (c11 != 0 && c11 != 1 && c11 != 2) {
                                    if (c11 != 3 && c11 != 4 && c11 != 5) {
                                        i12 = 1;
                                    } else {
                                        i12 = 0;
                                    }
                                } else {
                                    i12 = 2;
                                }
                                if (i11 != 0) {
                                    i13 = 1;
                                    if (i11 != 1) {
                                        i14 = 2;
                                        if (i11 == 2) {
                                            f10 = 0.92f;
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    } else {
                                        i14 = 2;
                                        f10 = 0.5f;
                                    }
                                } else {
                                    i13 = 1;
                                    i14 = 2;
                                    f10 = 0.08f;
                                }
                                if (i12 != 0) {
                                    if (i12 != i13) {
                                        if (i12 == i14) {
                                            f11 = 0.92f;
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    } else {
                                        f11 = 0.5f;
                                    }
                                } else {
                                    f11 = 0.08f;
                                }
                                bVar = new d5.b(fromHtml, null, null, null, f11, 0, i12, f10, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, g.f34069a);
                            }
                            arrayList.add(bVar);
                            arrayList.add(d5.b.f13894r);
                            aVar = this;
                            pVar2 = pVar;
                            B = charset;
                            i15 = 1;
                        } else {
                            m.f("SubripDecoder", "Skipping invalid timing: ".concat(h10));
                            aVar = this;
                            i15 = 1;
                        }
                    }
                }
            }
        }
        return new w6.e(1, (d5.b[]) arrayList.toArray(new d5.b[0]), Arrays.copyOf((long[]) fVar.f15309b, fVar.f15308a));
    }
}
