package y6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import e5.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class h implements s6.b {

    /* renamed from: a, reason: collision with root package name */
    public final e f41288a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f41289b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f41290c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f41291d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f41292e;

    public h(e eVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f41288a = eVar;
        this.f41291d = hashMap2;
        this.f41292e = hashMap3;
        this.f41290c = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        eVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f41289b = jArr;
    }

    @Override // s6.b
    public final int a(long j10) {
        long[] jArr = this.f41289b;
        int b10 = x.b(jArr, j10, false);
        if (b10 >= jArr.length) {
            return -1;
        }
        return b10;
    }

    @Override // s6.b
    public final long b(int i10) {
        return this.f41289b[i10];
    }

    @Override // s6.b
    public final List c(long j10) {
        Map map = this.f41290c;
        Map map2 = this.f41291d;
        e eVar = this.f41288a;
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        eVar.g(j10, eVar.f41253h, arrayList);
        TreeMap treeMap = new TreeMap();
        eVar.i(j10, false, eVar.f41253h, treeMap);
        eVar.h(j10, map, map2, eVar.f41253h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) this.f41292e.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                f fVar = (f) map2.get(pair.first);
                fVar.getClass();
                arrayList2.add(new d5.b(null, null, null, decodeByteArray, fVar.f41261c, 0, fVar.f41263e, fVar.f41260b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f41264f, fVar.f41265g, false, -16777216, fVar.f41268j, s0.g.f34069a));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f fVar2 = (f) map2.get(entry.getKey());
            fVar2.getClass();
            d5.a aVar = (d5.a) entry.getValue();
            CharSequence charSequence = aVar.f13877a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar2 : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.f13881e = fVar2.f41261c;
            aVar.f13882f = fVar2.f41262d;
            aVar.f13883g = fVar2.f41263e;
            aVar.f13884h = fVar2.f41260b;
            aVar.f13888l = fVar2.f41264f;
            aVar.f13887k = fVar2.f41267i;
            aVar.f13886j = fVar2.f41266h;
            aVar.f13892p = fVar2.f41268j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // s6.b
    public final int d() {
        return this.f41289b.length;
    }
}
