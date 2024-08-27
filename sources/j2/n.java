package j2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class n implements r {

    /* renamed from: a, reason: collision with root package name */
    public final e f20740a;

    /* renamed from: b, reason: collision with root package name */
    public final List f20741b;

    /* renamed from: c, reason: collision with root package name */
    public final ut.g f20742c;

    /* renamed from: d, reason: collision with root package name */
    public final ut.g f20743d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f20744e;

    public n(e eVar, g0 g0Var, List list, w2.b bVar, o2.r rVar) {
        s sVar;
        String str;
        int i10;
        ArrayList arrayList;
        int i11;
        ArrayList arrayList2;
        String str2;
        List list2;
        int i12;
        int i13;
        e eVar2 = eVar;
        this.f20740a = eVar2;
        this.f20741b = list;
        ut.i iVar = ut.i.f37392a;
        this.f20742c = ut.h.b(new m(this, 1));
        this.f20743d = ut.h.b(new m(this, 0));
        e eVar3 = f.f20709a;
        int length = eVar2.f20699a.length();
        List list3 = eVar2.f20701c;
        list3 = list3 == null ? vt.i0.f38321a : list3;
        ArrayList arrayList3 = new ArrayList();
        int size = list3.size();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            sVar = g0Var.f20723b;
            if (i14 >= size) {
                break;
            }
            d dVar = (d) list3.get(i14);
            s sVar2 = (s) dVar.f20685a;
            int i16 = dVar.f20686b;
            if (i16 != i15) {
                arrayList3.add(new d(i15, i16, sVar));
            }
            s a10 = sVar.a(sVar2);
            int i17 = dVar.f20687c;
            arrayList3.add(new d(i16, i17, a10));
            i14++;
            i15 = i17;
        }
        if (i15 != length) {
            arrayList3.add(new d(i15, length, sVar));
        }
        if (arrayList3.isEmpty()) {
            arrayList3.add(new d(0, 0, sVar));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i18 = 0;
        while (i18 < size2) {
            d dVar2 = (d) arrayList3.get(i18);
            int i19 = dVar2.f20686b;
            int i20 = dVar2.f20687c;
            if (i19 != i20) {
                str = eVar2.f20699a.substring(i19, i20);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            List b10 = f.b(eVar2, i19, i20);
            new e(b10, null, null, str);
            s sVar3 = (s) dVar2.f20685a;
            if (!u2.k.a(sVar3.f20756b, Integer.MIN_VALUE)) {
                arrayList2 = arrayList4;
                i10 = size2;
                arrayList = arrayList3;
                i11 = i18;
                str2 = str;
            } else {
                i10 = size2;
                arrayList = arrayList3;
                i11 = i18;
                arrayList2 = arrayList4;
                str2 = str;
                sVar3 = new s(sVar3.f20755a, sVar.f20756b, sVar3.f20757c, sVar3.f20758d, sVar3.f20759e, sVar3.f20760f, sVar3.f20761g, sVar3.f20762h, sVar3.f20763i);
            }
            g0 g0Var2 = new g0(g0Var.f20722a, sVar.a(sVar3));
            if (b10 == null) {
                list2 = vt.i0.f38321a;
            } else {
                list2 = b10;
            }
            List list4 = this.f20741b;
            ArrayList arrayList5 = new ArrayList(list4.size());
            int size3 = list4.size();
            int i21 = 0;
            while (true) {
                i12 = dVar2.f20686b;
                if (i21 >= size3) {
                    break;
                }
                Object obj = list4.get(i21);
                d dVar3 = (d) obj;
                if (f.c(i12, i20, dVar3.f20686b, dVar3.f20687c)) {
                    arrayList5.add(obj);
                }
                i21++;
            }
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size4 = arrayList5.size();
            for (int i22 = 0; i22 < size4; i22++) {
                d dVar4 = (d) arrayList5.get(i22);
                int i23 = dVar4.f20686b;
                if (i12 <= i23 && (i13 = dVar4.f20687c) <= i20) {
                    arrayList6.add(new d(i23 - i12, i13 - i12, dVar4.f20685a));
                } else {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                }
            }
            q qVar = new q(new r2.c(g0Var2, rVar, bVar, str2, list2, arrayList6), i12, i20);
            arrayList4 = arrayList2;
            arrayList4.add(qVar);
            i18 = i11 + 1;
            eVar2 = eVar;
            size2 = i10;
            arrayList3 = arrayList;
        }
        this.f20744e = arrayList4;
    }

    @Override // j2.r
    public final boolean a() {
        ArrayList arrayList = this.f20744e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((q) arrayList.get(i10)).f20752a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // j2.r
    public final float b() {
        return ((Number) this.f20742c.getValue()).floatValue();
    }

    @Override // j2.r
    public final float c() {
        return ((Number) this.f20743d.getValue()).floatValue();
    }
}
