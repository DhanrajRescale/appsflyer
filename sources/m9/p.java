package m9;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends e {

    /* renamed from: i, reason: collision with root package name */
    public final r9.k f27666i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f27667j;

    /* renamed from: k, reason: collision with root package name */
    public List f27668k;

    public p(List list) {
        super(list);
        this.f27666i = new r9.k();
        this.f27667j = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m9.e
    public final Object g(x9.a aVar, float f10) {
        boolean z10;
        int i10;
        int i11;
        PointF pointF;
        PointF pointF2;
        int i12;
        boolean z11;
        int i13;
        ArrayList arrayList;
        r9.k kVar;
        int i14;
        PointF pointF3;
        PointF pointF4;
        int i15;
        p pVar = this;
        r9.k kVar2 = (r9.k) aVar.f40115b;
        r9.k kVar3 = (r9.k) aVar.f40116c;
        r9.k kVar4 = pVar.f27666i;
        if (kVar4.f33514b == null) {
            kVar4.f33514b = new PointF();
        }
        int i16 = 1;
        boolean z12 = 0;
        if (!kVar2.f33515c && !kVar3.f33515c) {
            z10 = false;
        } else {
            z10 = true;
        }
        kVar4.f33515c = z10;
        ArrayList arrayList2 = kVar2.f33513a;
        int size = arrayList2.size();
        int size2 = kVar3.f33513a.size();
        ArrayList arrayList3 = kVar3.f33513a;
        if (size != size2) {
            w9.b.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int min = Math.min(arrayList2.size(), arrayList3.size());
        ArrayList arrayList4 = kVar4.f33513a;
        if (arrayList4.size() < min) {
            for (int size3 = arrayList4.size(); size3 < min; size3++) {
                arrayList4.add(new p9.a());
            }
        } else if (arrayList4.size() > min) {
            for (int size4 = arrayList4.size() - 1; size4 >= min; size4--) {
                arrayList4.remove(arrayList4.size() - 1);
            }
        }
        PointF pointF5 = kVar2.f33514b;
        PointF pointF6 = kVar3.f33514b;
        kVar4.a(w9.e.d(pointF5.x, pointF6.x, f10), w9.e.d(pointF5.y, pointF6.y, f10));
        for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
            p9.a aVar2 = (p9.a) arrayList2.get(size5);
            p9.a aVar3 = (p9.a) arrayList3.get(size5);
            PointF pointF7 = aVar2.f30768a;
            PointF pointF8 = aVar3.f30768a;
            ((p9.a) arrayList4.get(size5)).f30768a.set(w9.e.d(pointF7.x, pointF8.x, f10), w9.e.d(pointF7.y, pointF8.y, f10));
            p9.a aVar4 = (p9.a) arrayList4.get(size5);
            PointF pointF9 = aVar2.f30769b;
            float f11 = pointF9.x;
            PointF pointF10 = aVar3.f30769b;
            aVar4.f30769b.set(w9.e.d(f11, pointF10.x, f10), w9.e.d(pointF9.y, pointF10.y, f10));
            p9.a aVar5 = (p9.a) arrayList4.get(size5);
            PointF pointF11 = aVar2.f30770c;
            float f12 = pointF11.x;
            PointF pointF12 = aVar3.f30770c;
            aVar5.f30770c.set(w9.e.d(f12, pointF12.x, f10), w9.e.d(pointF11.y, pointF12.y, f10));
        }
        List list = pVar.f27668k;
        if (list != null) {
            int size6 = list.size() - 1;
            while (size6 >= 0) {
                l9.r rVar = (l9.r) pVar.f27668k.get(size6);
                rVar.getClass();
                ArrayList arrayList5 = kVar4.f33513a;
                if (arrayList5.size() > 2) {
                    float floatValue = ((Float) rVar.f24356b.f()).floatValue();
                    if (floatValue != s0.g.f34069a) {
                        boolean z13 = kVar4.f33515c;
                        int i17 = z12;
                        for (int size7 = arrayList5.size() - i16; size7 >= 0; size7--) {
                            p9.a aVar6 = (p9.a) arrayList5.get(size7);
                            p9.a aVar7 = (p9.a) arrayList5.get(l9.r.c(size7 - 1, arrayList5.size()));
                            if (size7 == 0 && !z13) {
                                pointF3 = kVar4.f33514b;
                            } else {
                                pointF3 = aVar7.f30770c;
                            }
                            if (size7 == 0 && !z13) {
                                pointF4 = pointF3;
                            } else {
                                pointF4 = aVar7.f30769b;
                            }
                            PointF pointF13 = aVar6.f30768a;
                            if (!kVar4.f33515c && size7 == 0 && size7 == arrayList5.size() - i16) {
                                i15 = i16;
                            } else {
                                i15 = z12;
                            }
                            if (pointF4.equals(pointF3) && pointF13.equals(pointF3) && i15 == 0) {
                                i17 += 2;
                            } else {
                                i17++;
                            }
                        }
                        r9.k kVar5 = rVar.f24357c;
                        if (kVar5 == null || kVar5.f33513a.size() != i17) {
                            ArrayList arrayList6 = new ArrayList(i17);
                            for (int i18 = z12; i18 < i17; i18++) {
                                arrayList6.add(new p9.a());
                            }
                            rVar.f24357c = new r9.k(new PointF(s0.g.f34069a, s0.g.f34069a), z12, arrayList6);
                        }
                        r9.k kVar6 = rVar.f24357c;
                        kVar6.f33515c = z13;
                        PointF pointF14 = kVar4.f33514b;
                        kVar6.a(pointF14.x, pointF14.y);
                        ArrayList arrayList7 = kVar6.f33513a;
                        boolean z14 = kVar4.f33515c;
                        int i19 = z12;
                        int i20 = i19;
                        while (i19 < arrayList5.size()) {
                            p9.a aVar8 = (p9.a) arrayList5.get(i19);
                            p9.a aVar9 = (p9.a) arrayList5.get(l9.r.c(i19 - 1, arrayList5.size()));
                            p9.a aVar10 = (p9.a) arrayList5.get(l9.r.c(i19 - 2, arrayList5.size()));
                            if (i19 == 0 && !z14) {
                                pointF = kVar4.f33514b;
                            } else {
                                pointF = aVar9.f30770c;
                            }
                            if (i19 == 0 && !z14) {
                                pointF2 = pointF;
                            } else {
                                pointF2 = aVar9.f30769b;
                            }
                            PointF pointF15 = aVar8.f30768a;
                            PointF pointF16 = aVar10.f30770c;
                            boolean z15 = z14;
                            if (!kVar4.f33515c && i19 == 0) {
                                i12 = 1;
                                if (i19 == arrayList5.size() - 1) {
                                    z11 = true;
                                    if (!pointF2.equals(pointF) && pointF15.equals(pointF) && !z11) {
                                        float f13 = pointF.x;
                                        float f14 = f13 - pointF16.x;
                                        float f15 = pointF.y;
                                        float f16 = f15 - pointF16.y;
                                        PointF pointF17 = aVar8.f30770c;
                                        arrayList = arrayList5;
                                        float f17 = pointF17.x - f13;
                                        float f18 = pointF17.y - f15;
                                        double d10 = f14;
                                        i13 = size6;
                                        i14 = i19;
                                        float hypot = (float) Math.hypot(d10, f16);
                                        r9.k kVar7 = kVar4;
                                        float hypot2 = (float) Math.hypot(f17, f18);
                                        float min2 = Math.min(floatValue / hypot, 0.5f);
                                        float min3 = Math.min(floatValue / hypot2, 0.5f);
                                        float f19 = pointF.x;
                                        float b10 = nn.d.b(pointF16.x, f19, min2, f19);
                                        float f20 = pointF.y;
                                        float b11 = nn.d.b(pointF16.y, f20, min2, f20);
                                        float b12 = nn.d.b(pointF17.x, f19, min3, f19);
                                        float b13 = nn.d.b(pointF17.y, f20, min3, f20);
                                        float f21 = b10 - ((b10 - f19) * 0.5519f);
                                        float f22 = b11 - ((b11 - f20) * 0.5519f);
                                        float f23 = b12 - ((b12 - f19) * 0.5519f);
                                        float f24 = b13 - ((b13 - f20) * 0.5519f);
                                        p9.a aVar11 = (p9.a) arrayList7.get(l9.r.c(i20 - 1, arrayList7.size()));
                                        p9.a aVar12 = (p9.a) arrayList7.get(i20);
                                        kVar = kVar7;
                                        aVar11.f30769b.set(b10, b11);
                                        aVar11.f30770c.set(b10, b11);
                                        if (i14 == 0) {
                                            kVar6.a(b10, b11);
                                        }
                                        aVar12.f30768a.set(f21, f22);
                                        p9.a aVar13 = (p9.a) arrayList7.get(i20 + 1);
                                        aVar12.f30769b.set(f23, f24);
                                        aVar12.f30770c.set(b12, b13);
                                        aVar13.f30768a.set(b12, b13);
                                        i20 += 2;
                                    } else {
                                        i13 = size6;
                                        arrayList = arrayList5;
                                        kVar = kVar4;
                                        i14 = i19;
                                        p9.a aVar14 = (p9.a) arrayList7.get(l9.r.c(i20 - 1, arrayList7.size()));
                                        p9.a aVar15 = (p9.a) arrayList7.get(i20);
                                        PointF pointF18 = aVar9.f30769b;
                                        aVar14.f30769b.set(pointF18.x, pointF18.y);
                                        PointF pointF19 = aVar9.f30770c;
                                        aVar14.f30770c.set(pointF19.x, pointF19.y);
                                        PointF pointF20 = aVar8.f30768a;
                                        aVar15.f30768a.set(pointF20.x, pointF20.y);
                                        i20++;
                                    }
                                    i19 = i14 + 1;
                                    z14 = z15;
                                    i16 = i12;
                                    arrayList5 = arrayList;
                                    size6 = i13;
                                    kVar4 = kVar;
                                }
                            } else {
                                i12 = 1;
                            }
                            z11 = false;
                            if (!pointF2.equals(pointF)) {
                            }
                            i13 = size6;
                            arrayList = arrayList5;
                            kVar = kVar4;
                            i14 = i19;
                            p9.a aVar142 = (p9.a) arrayList7.get(l9.r.c(i20 - 1, arrayList7.size()));
                            p9.a aVar152 = (p9.a) arrayList7.get(i20);
                            PointF pointF182 = aVar9.f30769b;
                            aVar142.f30769b.set(pointF182.x, pointF182.y);
                            PointF pointF192 = aVar9.f30770c;
                            aVar142.f30770c.set(pointF192.x, pointF192.y);
                            PointF pointF202 = aVar8.f30768a;
                            aVar152.f30768a.set(pointF202.x, pointF202.y);
                            i20++;
                            i19 = i14 + 1;
                            z14 = z15;
                            i16 = i12;
                            arrayList5 = arrayList;
                            size6 = i13;
                            kVar4 = kVar;
                        }
                        i10 = size6;
                        i11 = i16;
                        kVar4 = kVar6;
                        size6 = i10 - 1;
                        pVar = this;
                        i16 = i11;
                        z12 = 0;
                    }
                }
                i10 = size6;
                i11 = i16;
                size6 = i10 - 1;
                pVar = this;
                i16 = i11;
                z12 = 0;
            }
        }
        Path path = this.f27667j;
        path.reset();
        PointF pointF21 = kVar4.f33514b;
        path.moveTo(pointF21.x, pointF21.y);
        PointF pointF22 = w9.e.f38891a;
        pointF22.set(pointF21.x, pointF21.y);
        int i21 = 0;
        while (true) {
            ArrayList arrayList8 = kVar4.f33513a;
            if (i21 >= arrayList8.size()) {
                break;
            }
            p9.a aVar16 = (p9.a) arrayList8.get(i21);
            PointF pointF23 = aVar16.f30768a;
            boolean equals = pointF23.equals(pointF22);
            PointF pointF24 = aVar16.f30769b;
            PointF pointF25 = aVar16.f30770c;
            if (equals && pointF24.equals(pointF25)) {
                path.lineTo(pointF25.x, pointF25.y);
            } else {
                path.cubicTo(pointF23.x, pointF23.y, pointF24.x, pointF24.y, pointF25.x, pointF25.y);
            }
            pointF22.set(pointF25.x, pointF25.y);
            i21++;
        }
        if (kVar4.f33515c) {
            path.close();
        }
        return path;
    }
}
