package y6;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import e5.m;
import e5.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f41246a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41247b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41248c;

    /* renamed from: d, reason: collision with root package name */
    public final long f41249d;

    /* renamed from: e, reason: collision with root package name */
    public final long f41250e;

    /* renamed from: f, reason: collision with root package name */
    public final g f41251f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f41252g;

    /* renamed from: h, reason: collision with root package name */
    public final String f41253h;

    /* renamed from: i, reason: collision with root package name */
    public final String f41254i;

    /* renamed from: j, reason: collision with root package name */
    public final e f41255j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f41256k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f41257l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f41258m;

    public e(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, e eVar) {
        boolean z10;
        this.f41246a = str;
        this.f41247b = str2;
        this.f41254i = str4;
        this.f41251f = gVar;
        this.f41252g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41248c = z10;
        this.f41249d = j10;
        this.f41250e = j11;
        str3.getClass();
        this.f41253h = str3;
        this.f41255j = eVar;
        this.f41256k = new HashMap();
        this.f41257l = new HashMap();
    }

    public static e a(String str) {
        return new e(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, HttpUrl.FRAGMENT_ENCODE_SET, null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            d5.a aVar = new d5.a();
            aVar.f13877a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((d5.a) treeMap.get(str)).f13877a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final e b(int i10) {
        ArrayList arrayList = this.f41258m;
        if (arrayList != null) {
            return (e) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f41258m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        boolean z11;
        String str = this.f41246a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z10 || equals || (equals2 && this.f41254i != null)) {
            long j10 = this.f41249d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f41250e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f41258m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f41258m.size(); i10++) {
            e eVar = (e) this.f41258m.get(i10);
            if (!z10 && !equals) {
                z11 = false;
            } else {
                z11 = true;
            }
            eVar.d(treeSet, z11);
        }
    }

    public final boolean f(long j10) {
        long j11 = this.f41249d;
        long j12 = this.f41250e;
        return (j11 == -9223372036854775807L && j12 == -9223372036854775807L) || (j11 <= j10 && j12 == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < j12) || (j11 <= j10 && j10 < j12));
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f41253h;
        if (!HttpUrl.FRAGMENT_ENCODE_SET.equals(str3)) {
            str = str3;
        }
        if (f(j10) && "div".equals(this.f41246a) && (str2 = this.f41254i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j10, str, arrayList);
        }
    }

    public final void h(long j10, Map map, Map map2, String str, TreeMap treeMap) {
        String str2;
        int i10;
        char c10;
        char c11;
        int i11;
        int i12;
        e eVar;
        int i13;
        g V;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (!f(j10)) {
            return;
        }
        String str3 = this.f41253h;
        if (HttpUrl.FRAGMENT_ENCODE_SET.equals(str3)) {
            str2 = str;
        } else {
            str2 = str3;
        }
        for (Map.Entry entry : this.f41257l.entrySet()) {
            String str4 = (String) entry.getKey();
            HashMap hashMap = this.f41256k;
            if (hashMap.containsKey(str4)) {
                i10 = ((Integer) hashMap.get(str4)).intValue();
            } else {
                i10 = 0;
            }
            int intValue = ((Integer) entry.getValue()).intValue();
            if (i10 != intValue) {
                d5.a aVar = (d5.a) treeMap.get(str4);
                aVar.getClass();
                f fVar = (f) map2.get(str2);
                fVar.getClass();
                g V2 = yk.g.V(this.f41251f, this.f41252g, map);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.f13877a;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    aVar.f13877a = spannableStringBuilder;
                }
                if (V2 != null) {
                    int i19 = V2.f41276h;
                    int i20 = 1;
                    if (i19 == -1 && V2.f41277i == -1) {
                        i11 = -1;
                    } else {
                        if (i19 == 1) {
                            c10 = 1;
                        } else {
                            c10 = 0;
                        }
                        if (V2.f41277i == 1) {
                            c11 = 2;
                        } else {
                            c11 = 0;
                        }
                        i11 = c10 | c11;
                    }
                    if (i11 != -1) {
                        int i21 = V2.f41276h;
                        if (i21 == -1) {
                            if (V2.f41277i == -1) {
                                i18 = -1;
                                i20 = 1;
                                StyleSpan styleSpan = new StyleSpan(i18);
                                i12 = 33;
                                spannableStringBuilder.setSpan(styleSpan, i10, intValue, 33);
                            } else {
                                i20 = 1;
                            }
                        }
                        if (i21 == i20) {
                            i16 = i20;
                        } else {
                            i16 = 0;
                        }
                        if (V2.f41277i == i20) {
                            i17 = 2;
                        } else {
                            i17 = 0;
                        }
                        i18 = i16 | i17;
                        StyleSpan styleSpan2 = new StyleSpan(i18);
                        i12 = 33;
                        spannableStringBuilder.setSpan(styleSpan2, i10, intValue, 33);
                    } else {
                        i12 = 33;
                    }
                    if (V2.f41274f == i20) {
                        spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, intValue, i12);
                    }
                    if (V2.f41275g == i20) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, intValue, i12);
                    }
                    if (V2.f41271c) {
                        if (V2.f41271c) {
                            vl.b.b(spannableStringBuilder, new ForegroundColorSpan(V2.f41270b), i10, intValue);
                        } else {
                            throw new IllegalStateException("Font color has not been defined.");
                        }
                    }
                    if (V2.f41273e) {
                        if (V2.f41273e) {
                            vl.b.b(spannableStringBuilder, new BackgroundColorSpan(V2.f41272d), i10, intValue);
                        } else {
                            throw new IllegalStateException("Background color has not been defined.");
                        }
                    }
                    if (V2.f41269a != null) {
                        vl.b.b(spannableStringBuilder, new TypefaceSpan(V2.f41269a), i10, intValue);
                    }
                    b bVar = V2.f41286r;
                    if (bVar != null) {
                        int i22 = bVar.f41230a;
                        if (i22 == -1) {
                            int i23 = fVar.f41268j;
                            if (i23 != 2 && i23 != 1) {
                                i15 = 1;
                            } else {
                                i15 = 3;
                            }
                            i22 = i15;
                            i14 = 1;
                        } else {
                            i14 = bVar.f41231b;
                        }
                        int i24 = bVar.f41232c;
                        if (i24 == -2) {
                            i24 = 1;
                        }
                        vl.b.b(spannableStringBuilder, new d5.g(i22, i14, i24), i10, intValue);
                    }
                    int i25 = V2.f41281m;
                    if (i25 != 2) {
                        if (i25 == 3 || i25 == 4) {
                            spannableStringBuilder.setSpan(new Object(), i10, intValue, 33);
                        }
                    } else {
                        e eVar2 = this.f41255j;
                        while (true) {
                            if (eVar2 != null) {
                                g V3 = yk.g.V(eVar2.f41251f, eVar2.f41252g, map);
                                if (V3 != null && V3.f41281m == 1) {
                                    break;
                                } else {
                                    eVar2 = eVar2.f41255j;
                                }
                            } else {
                                eVar2 = null;
                                break;
                            }
                        }
                        if (eVar2 != null) {
                            ArrayDeque arrayDeque = new ArrayDeque();
                            arrayDeque.push(eVar2);
                            while (true) {
                                if (!arrayDeque.isEmpty()) {
                                    e eVar3 = (e) arrayDeque.pop();
                                    g V4 = yk.g.V(eVar3.f41251f, eVar3.f41252g, map);
                                    if (V4 != null && V4.f41281m == 3) {
                                        eVar = eVar3;
                                        break;
                                    }
                                    for (int c12 = eVar3.c() - 1; c12 >= 0; c12--) {
                                        arrayDeque.push(eVar3.b(c12));
                                    }
                                } else {
                                    eVar = null;
                                    break;
                                }
                            }
                            if (eVar != null) {
                                if (eVar.c() == 1 && eVar.b(0).f41247b != null) {
                                    String str5 = eVar.b(0).f41247b;
                                    int i26 = x.f15050a;
                                    g V5 = yk.g.V(eVar.f41251f, eVar.f41252g, map);
                                    if (V5 != null) {
                                        i13 = V5.f41282n;
                                    } else {
                                        i13 = -1;
                                    }
                                    if (i13 == -1 && (V = yk.g.V(eVar2.f41251f, eVar2.f41252g, map)) != null) {
                                        i13 = V.f41282n;
                                    }
                                    spannableStringBuilder.setSpan(new d5.f(str5, i13), i10, intValue, 33);
                                } else {
                                    m.e("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                        }
                    }
                    if (V2.f41285q == 1) {
                        vl.b.b(spannableStringBuilder, new Object(), i10, intValue);
                    }
                    int i27 = V2.f41278j;
                    if (i27 != 1) {
                        if (i27 != 2) {
                            if (i27 == 3) {
                                vl.b.b(spannableStringBuilder, new RelativeSizeSpan(V2.f41279k / 100.0f), i10, intValue);
                            }
                        } else {
                            vl.b.b(spannableStringBuilder, new RelativeSizeSpan(V2.f41279k), i10, intValue);
                        }
                    } else {
                        vl.b.b(spannableStringBuilder, new AbsoluteSizeSpan((int) V2.f41279k, true), i10, intValue);
                    }
                    if ("p".equals(this.f41246a)) {
                        float f10 = V2.f41287s;
                        if (f10 != Float.MAX_VALUE) {
                            aVar.f13893q = (f10 * (-90.0f)) / 100.0f;
                        }
                        Layout.Alignment alignment = V2.f41283o;
                        if (alignment != null) {
                            aVar.f13879c = alignment;
                        }
                        Layout.Alignment alignment2 = V2.f41284p;
                        if (alignment2 != null) {
                            aVar.f13880d = alignment2;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        for (int i28 = 0; i28 < c(); i28++) {
            b(i28).h(j10, map, map2, str2, treeMap);
        }
    }

    public final void i(long j10, boolean z10, String str, TreeMap treeMap) {
        String str2;
        boolean z11;
        HashMap hashMap = this.f41256k;
        hashMap.clear();
        HashMap hashMap2 = this.f41257l;
        hashMap2.clear();
        String str3 = this.f41246a;
        if ("metadata".equals(str3)) {
            return;
        }
        String str4 = this.f41253h;
        if (HttpUrl.FRAGMENT_ENCODE_SET.equals(str4)) {
            str2 = str;
        } else {
            str2 = str4;
        }
        if (this.f41248c && z10) {
            SpannableStringBuilder e10 = e(str2, treeMap);
            String str5 = this.f41247b;
            str5.getClass();
            e10.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str3) && z10) {
            e(str2, treeMap).append('\n');
            return;
        }
        if (f(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((d5.a) entry.getValue()).f13877a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str3);
            for (int i10 = 0; i10 < c(); i10++) {
                e b10 = b(i10);
                if (!z10 && !equals) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                b10.i(j10, z11, str2, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e11 = e(str2, treeMap);
                int length = e11.length() - 1;
                while (length >= 0 && e11.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e11.charAt(length) != '\n') {
                    e11.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((d5.a) entry2.getValue()).f13877a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
