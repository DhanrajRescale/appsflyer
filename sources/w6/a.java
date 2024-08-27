package w6;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import b5.f;
import e5.m;
import e5.p;
import e5.x;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import s0.g;
import yk.j;

/* loaded from: classes.dex */
public final class a extends s6.a {

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f38815r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m, reason: collision with root package name */
    public final boolean f38816m;

    /* renamed from: n, reason: collision with root package name */
    public final f f38817n;

    /* renamed from: o, reason: collision with root package name */
    public LinkedHashMap f38818o;

    /* renamed from: p, reason: collision with root package name */
    public float f38819p = -3.4028235E38f;

    /* renamed from: q, reason: collision with root package name */
    public float f38820q = -3.4028235E38f;

    public a(List list) {
        if (list != null && !list.isEmpty()) {
            this.f38816m = true;
            String m10 = x.m((byte[]) list.get(0));
            j.E0(m10.startsWith("Format:"));
            f b10 = f.b(m10);
            b10.getClass();
            this.f38817n = b10;
            i(new p((byte[]) list.get(1)), kp.e.f23433c);
            return;
        }
        this.f38816m = false;
        this.f38817n = null;
    }

    public static int h(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j10) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            } else {
                i10 = 0;
                break;
            }
        }
        arrayList.add(i10, Long.valueOf(j10));
        if (i10 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i10 - 1));
        }
        arrayList2.add(i10, arrayList3);
        return i10;
    }

    public static long j(String str) {
        Matcher matcher = f38815r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i10 = x.f15050a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:88:0x0219. Please report as an issue. */
    @Override // s6.a
    public final s6.b f(byte[] bArr, int i10, boolean z10) {
        f fVar;
        p pVar;
        Charset charset;
        f fVar2;
        d dVar;
        float f10;
        int i11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i12;
        PointF pointF;
        int i13;
        int i14;
        float f11;
        float f12;
        float f13;
        float f14;
        int i15;
        float f15;
        int i16;
        int i17;
        int i18;
        Integer num;
        int i19;
        int i20;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        p pVar2 = new p(bArr, i10);
        Charset B = pVar2.B();
        if (B == null) {
            B = kp.e.f23433c;
        }
        boolean z11 = aVar.f38816m;
        if (!z11) {
            aVar.i(pVar2, B);
        }
        if (z11) {
            fVar = aVar.f38817n;
        } else {
            fVar = null;
        }
        while (true) {
            String h10 = pVar2.h(B);
            if (h10 != null) {
                if (h10.startsWith("Format:")) {
                    fVar = f.b(h10);
                } else {
                    if (h10.startsWith("Dialogue:")) {
                        if (fVar == null) {
                            m.f("SsaDecoder", "Skipping dialogue line before complete format: ".concat(h10));
                        } else {
                            j.E0(h10.startsWith("Dialogue:"));
                            String substring = h10.substring(9);
                            int i21 = fVar.f3280e;
                            String[] split = substring.split(",", i21);
                            if (split.length != i21) {
                                m.f("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(h10));
                            } else {
                                long j10 = j(split[fVar.f3276a]);
                                if (j10 == -9223372036854775807L) {
                                    m.f("SsaDecoder", "Skipping invalid timing: ".concat(h10));
                                } else {
                                    long j11 = j(split[fVar.f3277b]);
                                    if (j11 == -9223372036854775807L) {
                                        m.f("SsaDecoder", "Skipping invalid timing: ".concat(h10));
                                    } else {
                                        LinkedHashMap linkedHashMap = aVar.f38818o;
                                        if (linkedHashMap != null && (i20 = fVar.f3278c) != -1) {
                                            dVar = (d) linkedHashMap.get(split[i20].trim());
                                        } else {
                                            dVar = null;
                                        }
                                        String str = split[fVar.f3279d];
                                        Matcher matcher = c.f38832a.matcher(str);
                                        int i22 = -1;
                                        PointF pointF2 = null;
                                        while (matcher.find()) {
                                            p pVar3 = pVar2;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a10 = c.a(group);
                                                if (a10 != null) {
                                                    pointF2 = a10;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher2 = c.f38835d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i19 = d.a(group2);
                                                } else {
                                                    i19 = -1;
                                                }
                                                if (i19 != -1) {
                                                    i22 = i19;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            pVar2 = pVar3;
                                        }
                                        pVar = pVar2;
                                        String replace = c.f38832a.matcher(str).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f16 = aVar.f38819p;
                                        float f17 = aVar.f38820q;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (dVar != null) {
                                            Integer num2 = dVar.f38838c;
                                            if (num2 != null) {
                                                charset = B;
                                                fVar2 = fVar;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                charset = B;
                                                fVar2 = fVar;
                                            }
                                            if (dVar.f38845j == 3 && (num = dVar.f38839d) != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f18 = dVar.f38840e;
                                            if (f18 != -3.4028235E38f && f17 != -3.4028235E38f) {
                                                f14 = f18 / f17;
                                                i15 = 1;
                                            } else {
                                                f14 = -3.4028235E38f;
                                                i15 = Integer.MIN_VALUE;
                                            }
                                            boolean z12 = dVar.f38842g;
                                            boolean z13 = dVar.f38841f;
                                            if (z13 && z12) {
                                                f15 = f14;
                                                i16 = i15;
                                                i17 = 0;
                                                i18 = 33;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                f15 = f14;
                                                i16 = i15;
                                                i17 = 0;
                                                i18 = 33;
                                                if (z13) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z12) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (dVar.f38843h) {
                                                spannableString.setSpan(new UnderlineSpan(), i17, spannableString.length(), i18);
                                            }
                                            if (dVar.f38844i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i17, spannableString.length(), i18);
                                            }
                                            i11 = i16;
                                            f10 = f15;
                                        } else {
                                            charset = B;
                                            fVar2 = fVar;
                                            f10 = -3.4028235E38f;
                                            i11 = Integer.MIN_VALUE;
                                        }
                                        int i23 = -1;
                                        if (i22 != -1) {
                                            i23 = i22;
                                        } else if (dVar != null) {
                                            i23 = dVar.f38837b;
                                        }
                                        switch (i23) {
                                            case 0:
                                            default:
                                                nn.d.u("Unknown alignment: ", i23, "SsaDecoder");
                                            case -1:
                                                alignment2 = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                alignment2 = alignment;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                alignment2 = alignment;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                alignment2 = alignment;
                                                break;
                                        }
                                        int i24 = Integer.MIN_VALUE;
                                        switch (i23) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                nn.d.u("Unknown alignment: ", i23, "SsaDecoder");
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i12 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i12 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i12 = 2;
                                                break;
                                        }
                                        i12 = Integer.MIN_VALUE;
                                        switch (i23) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                nn.d.u("Unknown alignment: ", i23, "SsaDecoder");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                pointF = pointF2;
                                                i24 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                pointF = pointF2;
                                                i24 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                pointF = pointF2;
                                                i24 = 0;
                                                break;
                                        }
                                        pointF = pointF2;
                                        float f19 = -3.4028235E38f;
                                        if (pointF != null && f17 != -3.4028235E38f && f16 != -3.4028235E38f) {
                                            float f20 = pointF.x / f16;
                                            f12 = pointF.y / f17;
                                            f13 = f20;
                                        } else {
                                            if (i12 != 0) {
                                                i13 = 1;
                                                if (i12 != 1) {
                                                    i14 = 2;
                                                    if (i12 != 2) {
                                                        f11 = -3.4028235E38f;
                                                    } else {
                                                        f11 = 0.95f;
                                                    }
                                                } else {
                                                    i14 = 2;
                                                    f11 = 0.5f;
                                                }
                                            } else {
                                                i13 = 1;
                                                i14 = 2;
                                                f11 = 0.05f;
                                            }
                                            if (i24 != 0) {
                                                if (i24 != i13) {
                                                    if (i24 == i14) {
                                                        f19 = 0.95f;
                                                    }
                                                } else {
                                                    f19 = 0.5f;
                                                }
                                            } else {
                                                f19 = 0.05f;
                                            }
                                            f12 = f19;
                                            f13 = f11;
                                        }
                                        d5.b bVar = new d5.b(spannableString, alignment2, null, null, f12, 0, i24, f13, i12, i11, f10, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, g.f34069a);
                                        int h11 = h(j11, arrayList2, arrayList);
                                        for (int h12 = h(j10, arrayList2, arrayList); h12 < h11; h12++) {
                                            ((List) arrayList.get(h12)).add(bVar);
                                        }
                                        aVar = this;
                                        pVar2 = pVar;
                                        B = charset;
                                        fVar = fVar2;
                                    }
                                }
                            }
                        }
                    }
                    pVar = pVar2;
                    charset = B;
                    fVar2 = fVar;
                    aVar = this;
                    pVar2 = pVar;
                    B = charset;
                    fVar = fVar2;
                }
            } else {
                return new e(0, arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(e5.p r29, java.nio.charset.Charset r30) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.a.i(e5.p, java.nio.charset.Charset):void");
    }
}
