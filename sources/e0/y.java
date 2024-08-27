package e0;

import a2.k1;
import b0.h1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import y.g1;

/* loaded from: classes.dex */
public final class y extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f14808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f14809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14810c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f14811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f14812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f14813f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f14814g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function0 f14815h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g1.c f14816i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1.b f14817j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14818k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z.n f14819l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g1 g1Var, h1 h1Var, boolean z10, j0 j0Var, float f10, n nVar, ou.e eVar, Function0 function0, g1.c cVar, g1.b bVar, int i10, z.n nVar2) {
        super(2);
        this.f14808a = g1Var;
        this.f14809b = h1Var;
        this.f14810c = z10;
        this.f14811d = j0Var;
        this.f14812e = f10;
        this.f14813f = nVar;
        this.f14814g = eVar;
        this.f14815h = function0;
        this.f14816i = cVar;
        this.f14817j = bVar;
        this.f14818k = i10;
        this.f14819l = nVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v63, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r3v76, types: [kotlin.ranges.c] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        g1 g1Var;
        int m02;
        int m03;
        int i10;
        int h10;
        long j10;
        int i11;
        int i12;
        long j11;
        Function1 function1;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        vt.q qVar;
        int i22;
        int i23;
        int i24;
        k kVar;
        int i25;
        x xVar;
        List list;
        x xVar2;
        List list2;
        g1 g1Var2;
        g1 g1Var3;
        boolean z11;
        int i26;
        int i27;
        boolean z12;
        k kVar2;
        ArrayList arrayList;
        g1 g1Var4;
        int i28;
        int i29;
        List list3;
        ArrayList arrayList2;
        ?? arrayList3;
        List list4;
        boolean z13;
        Object obj3;
        int i30;
        int i31;
        float e10;
        j0 j0Var;
        boolean z14;
        z zVar;
        int i32;
        int i33;
        int i34;
        vt.q qVar2;
        int i35;
        d0.z zVar2 = (d0.z) obj;
        long j12 = ((w2.a) obj2).f38776a;
        g1 g1Var5 = g1.f40723a;
        g1 g1Var6 = this.f14808a;
        if (g1Var6 == g1Var5) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            g1Var = g1Var5;
        } else {
            g1Var = g1.f40724b;
        }
        androidx.compose.foundation.a.i(j12, g1Var);
        h1 h1Var = this.f14809b;
        if (z10) {
            d0.a0 a0Var = (d0.a0) zVar2;
            m02 = a0Var.f13136b.m0(h1Var.d(a0Var.f13136b.getLayoutDirection()));
        } else {
            d0.a0 a0Var2 = (d0.a0) zVar2;
            m02 = a0Var2.f13136b.m0(androidx.compose.foundation.layout.a.h(h1Var, a0Var2.f13136b.getLayoutDirection()));
        }
        if (z10) {
            d0.a0 a0Var3 = (d0.a0) zVar2;
            m03 = a0Var3.f13136b.m0(h1Var.b(a0Var3.f13136b.getLayoutDirection()));
        } else {
            d0.a0 a0Var4 = (d0.a0) zVar2;
            m03 = a0Var4.f13136b.m0(androidx.compose.foundation.layout.a.g(h1Var, a0Var4.f13136b.getLayoutDirection()));
        }
        d0.a0 a0Var5 = (d0.a0) zVar2;
        int m04 = a0Var5.f13136b.m0(h1Var.c());
        float a10 = h1Var.a();
        k1 k1Var = a0Var5.f13136b;
        int m05 = k1Var.m0(a10);
        int i36 = m04 + m05;
        int i37 = m02 + m03;
        if (z10) {
            i10 = i36;
        } else {
            i10 = i37;
        }
        boolean z15 = this.f14810c;
        if (z10 && !z15) {
            m03 = m04;
        } else if (z10 && z15) {
            m03 = m05;
        } else if (!z10 && !z15) {
            m03 = m02;
        }
        int i38 = i10 - m03;
        int i39 = m03;
        long F0 = hl.f.F0(-i37, -i36, j12);
        j0 j0Var2 = this.f14811d;
        j0Var2.f14731q = zVar2;
        int m06 = k1Var.m0(this.f14812e);
        if (z10) {
            h10 = w2.a.g(j12) - i36;
        } else {
            h10 = w2.a.h(j12) - i37;
        }
        int i40 = h10;
        if (z15 && i40 <= 0) {
            if (!z10) {
                m02 += i40;
            }
            if (z10) {
                i35 = m04 + i40;
            } else {
                i35 = m04;
            }
            j10 = hl.f.j(m02, i35);
        } else {
            j10 = hl.f.j(m02, m04);
        }
        ((m) this.f14813f).getClass();
        if (g1Var6 == g1Var5) {
            i11 = w2.a.h(F0);
        } else {
            i11 = i40;
        }
        if (g1Var6 != g1Var5) {
            i12 = w2.a.g(F0);
        } else {
            i12 = i40;
        }
        j0Var2.f14740z = hl.f.c(i11, i12, 5);
        w wVar = (w) this.f14814g.mo2invoke();
        z.n nVar = this.f14819l;
        e1.i h11 = yq.b.h();
        if (h11 != null) {
            j11 = F0;
            function1 = h11.f();
        } else {
            j11 = F0;
            function1 = null;
        }
        e1.i i41 = yq.b.i(h11);
        try {
            c0 c0Var = j0Var2.f14718d;
            int i42 = c0Var.f14650b.i();
            int l10 = iu.j.l(i42, wVar, c0Var.f14653e);
            if (i42 != l10) {
                i13 = i37;
                c0Var.f14650b.j(l10);
                c0Var.f14654f.b(i42);
            } else {
                i13 = i37;
            }
            c0Var.a();
            float i43 = c0Var.f14651c.i();
            j0Var2.j();
            nVar.getClass();
            float f10 = 0;
            int i44 = i40 + m06;
            int b10 = ku.c.b(f10 - (i43 * i44));
            Unit unit = Unit.f23355a;
            yq.b.l(h11, i41, function1);
            List a11 = d0.p.a(wVar, j0Var2.A, j0Var2.f14736v);
            int intValue = ((Number) this.f14815h.mo2invoke()).intValue();
            g1 g1Var7 = this.f14808a;
            g1.c cVar = this.f14816i;
            g1.b bVar = this.f14817j;
            boolean z16 = this.f14810c;
            int i45 = this.f14818k;
            z.n nVar2 = this.f14819l;
            int i46 = i39;
            List list5 = a11;
            c0.u uVar = new c0.u(zVar2, j12, i13, i36, 1);
            if (i46 >= 0) {
                if (i38 >= 0) {
                    if (i44 < 0) {
                        i14 = 0;
                    } else {
                        i14 = i44;
                    }
                    if (intValue <= 0) {
                        zVar = new z(vt.i0.f38321a, i40, m06, i38, g1Var7, -i46, i40 + i38, i45, nVar2, (a2.n0) uVar.b(Integer.valueOf(w2.a.j(j11)), Integer.valueOf(w2.a.i(j11)), d.f14656c));
                        j0Var = j0Var2;
                    } else {
                        g1 g1Var8 = g1Var5;
                        g1 g1Var9 = g1Var7;
                        if (g1Var9 == g1Var8) {
                            i15 = w2.a.h(j11);
                        } else {
                            i15 = i40;
                        }
                        if (g1Var9 != g1Var8) {
                            i16 = w2.a.g(j11);
                        } else {
                            i16 = i40;
                        }
                        long c10 = hl.f.c(i15, i16, 5);
                        while (l10 > 0 && b10 > 0) {
                            l10--;
                            b10 -= i14;
                        }
                        int i47 = b10 * (-1);
                        if (l10 >= intValue) {
                            l10 = intValue - 1;
                            i47 = 0;
                        }
                        vt.q qVar3 = new vt.q();
                        int i48 = -i46;
                        int i49 = m06;
                        if (i49 < 0) {
                            i17 = i49;
                        } else {
                            i17 = 0;
                        }
                        int i50 = i17 + i48;
                        int i51 = 0;
                        int i52 = l10;
                        int i53 = i47 + i50;
                        int i54 = i52;
                        while (i53 < 0 && i54 > 0) {
                            int i55 = i54 - 1;
                            int i56 = i50;
                            d0.z zVar3 = zVar2;
                            int i57 = i46;
                            vt.q qVar4 = qVar3;
                            g1 g1Var10 = g1Var9;
                            d0.z zVar4 = zVar2;
                            int i58 = i14;
                            int i59 = i40;
                            k m07 = al.d.m0(zVar3, i55, c10, wVar, j10, g1Var10, bVar, cVar, k1Var.getLayoutDirection(), z16, i59);
                            qVar4.add(0, m07);
                            i51 = Math.max(i51, m07.f14751k);
                            i53 += i58;
                            qVar3 = qVar4;
                            i54 = i55;
                            i14 = i58;
                            i46 = i57;
                            i49 = i49;
                            i48 = i48;
                            g1Var9 = g1Var10;
                            g1Var8 = g1Var8;
                            zVar2 = zVar4;
                            i50 = i56;
                            f10 = f10;
                            i40 = i59;
                            j0Var2 = j0Var2;
                            intValue = intValue;
                        }
                        d0.z zVar5 = zVar2;
                        int i60 = i46;
                        int i61 = i50;
                        int i62 = i49;
                        vt.q qVar5 = qVar3;
                        int i63 = i48;
                        g1 g1Var11 = g1Var9;
                        int i64 = i14;
                        g1 g1Var12 = g1Var8;
                        int i65 = i53;
                        float f11 = f10;
                        int i66 = i40;
                        j0 j0Var3 = j0Var2;
                        int i67 = intValue;
                        int i68 = i61;
                        if (i65 < i68) {
                            i65 = i68;
                        }
                        int i69 = i65 - i68;
                        int i70 = i66;
                        int i71 = i70 + i38;
                        if (i71 < 0) {
                            i18 = 0;
                        } else {
                            i18 = i71;
                        }
                        int i72 = -i69;
                        int i73 = 0;
                        boolean z17 = false;
                        int i74 = i54;
                        while (i73 < qVar5.f38332c) {
                            if (i72 >= i18) {
                                qVar5.e(i73);
                                z17 = true;
                            } else {
                                i74++;
                                i72 += i64;
                                i73++;
                            }
                        }
                        int i75 = i69;
                        boolean z18 = z17;
                        int i76 = i74;
                        int i77 = i54;
                        int i78 = i51;
                        int i79 = i67;
                        int i80 = i72;
                        while (i76 < i79 && (i80 < i18 || i80 <= 0 || qVar5.isEmpty())) {
                            int i81 = i79;
                            vt.q qVar6 = qVar5;
                            int i82 = i78;
                            int i83 = i76;
                            int i84 = i18;
                            int i85 = i70;
                            int i86 = i68;
                            k m08 = al.d.m0(zVar5, i76, c10, wVar, j10, g1Var11, bVar, cVar, k1Var.getLayoutDirection(), z16, i85);
                            int i87 = i81 - 1;
                            if (i83 == i87) {
                                i34 = i85;
                            } else {
                                i34 = i64;
                            }
                            i80 += i34;
                            if (i80 <= i86 && i83 != i87) {
                                i75 -= i64;
                                i78 = i82;
                                i77 = i83 + 1;
                                qVar2 = qVar6;
                                z18 = true;
                            } else {
                                int max = Math.max(i82, m08.f14751k);
                                qVar2 = qVar6;
                                qVar2.h(m08);
                                i78 = max;
                            }
                            i76 = i83 + 1;
                            i79 = i81;
                            qVar5 = qVar2;
                            i70 = i85;
                            i18 = i84;
                            i68 = i86;
                        }
                        vt.q qVar7 = qVar5;
                        int i88 = i79;
                        int i89 = i78;
                        int i90 = i76;
                        if (i80 < i70) {
                            int i91 = i70 - i80;
                            int i92 = i75 - i91;
                            i80 += i91;
                            int i93 = i89;
                            int i94 = i92;
                            int i95 = i60;
                            while (i94 < i95 && i77 > 0) {
                                i77--;
                                int i96 = i70;
                                int i97 = i88;
                                vt.q qVar8 = qVar7;
                                k m09 = al.d.m0(zVar5, i77, c10, wVar, j10, g1Var11, bVar, cVar, k1Var.getLayoutDirection(), z16, i96);
                                qVar8.add(0, m09);
                                i93 = Math.max(i93, m09.f14751k);
                                i94 += i64;
                                i70 = i96;
                                qVar7 = qVar8;
                                i95 = i95;
                                i90 = i90;
                                i88 = i97;
                            }
                            i19 = i88;
                            i20 = i90;
                            i60 = i95;
                            int i98 = i94;
                            i22 = i93;
                            i21 = i70;
                            qVar = qVar7;
                            if (i98 < 0) {
                                i80 += i98;
                                i23 = 0;
                            } else {
                                i23 = i98;
                            }
                        } else {
                            i19 = i88;
                            i20 = i90;
                            i21 = i70;
                            qVar = qVar7;
                            i22 = i89;
                            i23 = i75;
                        }
                        if (i23 >= 0) {
                            int i99 = -i23;
                            k kVar3 = (k) qVar.first();
                            if (i60 <= 0 && i62 >= 0) {
                                i25 = i23;
                                i24 = i64;
                                kVar = kVar3;
                            } else {
                                int i100 = qVar.f38332c;
                                int i101 = i23;
                                int i102 = 0;
                                while (i102 < i100 && i101 != 0) {
                                    i24 = i64;
                                    if (i24 > i101 || i102 == vt.y.f(qVar)) {
                                        break;
                                    }
                                    i101 -= i24;
                                    i102++;
                                    kVar3 = (k) qVar.get(i102);
                                    i64 = i24;
                                }
                                i24 = i64;
                                kVar = kVar3;
                                i25 = i101;
                            }
                            x xVar3 = r10;
                            int i103 = i24;
                            int i104 = i22;
                            k kVar4 = kVar;
                            x xVar4 = new x(zVar5, c10, wVar, j10, g1Var11, bVar, cVar, z16, i21, 1);
                            int max2 = Math.max(0, i77 - i45);
                            int i105 = i77 - 1;
                            if (max2 <= i105) {
                                list = null;
                                while (true) {
                                    if (list == null) {
                                        list = new ArrayList();
                                    }
                                    xVar = xVar3;
                                    list.add(xVar.invoke(Integer.valueOf(i105)));
                                    if (i105 == max2) {
                                        break;
                                    }
                                    i105--;
                                    xVar3 = xVar;
                                }
                            } else {
                                xVar = xVar3;
                                list = null;
                            }
                            int size = list5.size();
                            int i106 = 0;
                            while (i106 < size) {
                                List list6 = list5;
                                int intValue2 = ((Number) list6.get(i106)).intValue();
                                if (intValue2 < max2) {
                                    if (list == null) {
                                        list = new ArrayList();
                                    }
                                    list.add(xVar.invoke(Integer.valueOf(intValue2)));
                                }
                                i106++;
                                list5 = list6;
                            }
                            List list7 = list5;
                            if (list == null) {
                                list = vt.i0.f38321a;
                            }
                            List list8 = list;
                            int size2 = list8.size();
                            int i107 = i104;
                            for (int i108 = 0; i108 < size2; i108++) {
                                i107 = Math.max(i107, ((k) list8.get(i108)).f14751k);
                            }
                            int i109 = ((k) qVar.last()).f14741a;
                            x xVar5 = r9;
                            int i110 = i107;
                            List list9 = list7;
                            int i111 = i80;
                            x xVar6 = new x(zVar5, c10, wVar, j10, g1Var11, bVar, cVar, z16, i21, 0);
                            int min = Math.min(i109 + i45, i19 - 1);
                            int i112 = i109 + 1;
                            if (i112 <= min) {
                                list2 = null;
                                while (true) {
                                    if (list2 == null) {
                                        list2 = new ArrayList();
                                    }
                                    xVar2 = xVar5;
                                    list2.add(xVar2.invoke(Integer.valueOf(i112)));
                                    if (i112 == min) {
                                        break;
                                    }
                                    i112++;
                                    xVar5 = xVar2;
                                }
                            } else {
                                xVar2 = xVar5;
                                list2 = null;
                            }
                            int size3 = list9.size();
                            int i113 = 0;
                            while (i113 < size3) {
                                List list10 = list9;
                                int intValue3 = ((Number) list10.get(i113)).intValue();
                                int i114 = i19;
                                if (min + 1 <= intValue3 && intValue3 < i114) {
                                    if (list2 == null) {
                                        list2 = new ArrayList();
                                    }
                                    list2.add(xVar2.invoke(Integer.valueOf(intValue3)));
                                }
                                i113++;
                                list9 = list10;
                                i19 = i114;
                            }
                            int i115 = i19;
                            if (list2 == null) {
                                list2 = vt.i0.f38321a;
                            }
                            int size4 = list2.size();
                            int i116 = i110;
                            for (int i117 = 0; i117 < size4; i117++) {
                                i116 = Math.max(i116, ((k) list2.get(i117)).f14751k);
                            }
                            if (Intrinsics.a(kVar4, qVar.first()) && list8.isEmpty() && list2.isEmpty()) {
                                z11 = true;
                                g1Var2 = g1Var11;
                                g1Var3 = g1Var12;
                            } else {
                                g1Var2 = g1Var11;
                                g1Var3 = g1Var12;
                                z11 = false;
                            }
                            if (g1Var2 == g1Var3) {
                                i26 = i116;
                            } else {
                                i26 = i111;
                            }
                            long j13 = j11;
                            int L = hl.f.L(i26, j13);
                            if (g1Var2 == g1Var3) {
                                i116 = i111;
                            }
                            int K = hl.f.K(i116, j13);
                            int i118 = i21;
                            if (g1Var2 == g1Var3) {
                                i27 = K;
                            } else {
                                i27 = L;
                            }
                            if (i111 < Math.min(i27, i118)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            int i119 = i99;
                            if (z12 && i119 != 0) {
                                throw new IllegalStateException(jr.h.n("non-zero pagesScrollOffset=", i119).toString());
                            }
                            ArrayList arrayList4 = new ArrayList(list2.size() + list8.size() + qVar.getF38332c());
                            if (z12) {
                                if (list8.isEmpty() && list2.isEmpty()) {
                                    int f38332c = qVar.getF38332c();
                                    int[] iArr = new int[f38332c];
                                    for (int i120 = 0; i120 < f38332c; i120++) {
                                        iArr[i120] = i118;
                                    }
                                    int[] iArr2 = new int[f38332c];
                                    int i121 = 0;
                                    while (i121 < f38332c) {
                                        iArr2[i121] = 0;
                                        i121++;
                                        arrayList4 = arrayList4;
                                    }
                                    ArrayList arrayList5 = arrayList4;
                                    kVar2 = kVar4;
                                    b0.i iVar = new b0.i(k1Var.N(i62), false, null);
                                    w2.k kVar5 = w2.k.f38799a;
                                    if (g1Var2 == g1Var3) {
                                        arrayList = arrayList5;
                                        i28 = i62;
                                        g1Var4 = g1Var2;
                                        i29 = i111;
                                        i32 = i27;
                                        iVar.c(zVar5, i27, iArr, kVar5, iArr2);
                                    } else {
                                        arrayList = arrayList5;
                                        g1Var4 = g1Var2;
                                        i28 = i62;
                                        i29 = i111;
                                        i32 = i27;
                                        iVar.c(zVar5, i32, iArr, kVar5, iArr2);
                                    }
                                    IntRange q10 = vt.v.q(iArr2);
                                    if (z16) {
                                        Intrinsics.checkNotNullParameter(q10, "<this>");
                                        c.Companion companion = kotlin.ranges.c.INSTANCE;
                                        int i122 = -q10.f23383c;
                                        companion.getClass();
                                        q10 = new kotlin.ranges.c(q10.f23382b, q10.f23381a, i122);
                                    }
                                    int i123 = q10.f23381a;
                                    int i124 = q10.f23382b;
                                    int i125 = q10.f23383c;
                                    if ((i125 > 0 && i123 <= i124) || (i125 < 0 && i124 <= i123)) {
                                        while (true) {
                                            int i126 = iArr2[i123];
                                            if (!z16) {
                                                i33 = i123;
                                            } else {
                                                i33 = (f38332c - i123) - 1;
                                            }
                                            k kVar6 = (k) qVar.get(i33);
                                            if (z16) {
                                                i126 = (i32 - i126) - kVar6.f14742b;
                                            }
                                            kVar6.b(i126, L, K);
                                            arrayList.add(kVar6);
                                            if (i123 == i124) {
                                                break;
                                            }
                                            i123 += i125;
                                        }
                                    }
                                    list3 = list8;
                                } else {
                                    throw new IllegalArgumentException("No extra pages".toString());
                                }
                            } else {
                                kVar2 = kVar4;
                                arrayList = arrayList4;
                                g1Var4 = g1Var2;
                                i28 = i62;
                                i29 = i111;
                                int size5 = list8.size();
                                int i127 = i119;
                                for (int i128 = 0; i128 < size5; i128++) {
                                    k kVar7 = (k) list8.get(i128);
                                    i127 -= i44;
                                    kVar7.b(i127, L, K);
                                    arrayList.add(kVar7);
                                }
                                list3 = list8;
                                int f38332c2 = qVar.getF38332c();
                                for (int i129 = 0; i129 < f38332c2; i129++) {
                                    k kVar8 = (k) qVar.get(i129);
                                    kVar8.b(i119, L, K);
                                    arrayList.add(kVar8);
                                    i119 += i44;
                                }
                                int size6 = list2.size();
                                for (int i130 = 0; i130 < size6; i130++) {
                                    k kVar9 = (k) list2.get(i130);
                                    kVar9.b(i119, L, K);
                                    arrayList.add(kVar9);
                                    i119 += i44;
                                }
                            }
                            if (z11) {
                                arrayList2 = arrayList;
                            } else {
                                arrayList2 = new ArrayList(arrayList.size());
                                int size7 = arrayList.size();
                                for (int i131 = 0; i131 < size7; i131++) {
                                    Object obj4 = arrayList.get(i131);
                                    k kVar10 = (k) obj4;
                                    if (kVar10.f14741a >= ((k) qVar.first()).f14741a) {
                                        if (kVar10.f14741a <= ((k) qVar.last()).f14741a) {
                                            arrayList2.add(obj4);
                                        }
                                    }
                                }
                            }
                            if (list3.isEmpty()) {
                                arrayList3 = vt.i0.f38321a;
                            } else {
                                arrayList3 = new ArrayList(arrayList.size());
                                int size8 = arrayList.size();
                                for (int i132 = 0; i132 < size8; i132++) {
                                    Object obj5 = arrayList.get(i132);
                                    if (((k) obj5).f14741a < ((k) qVar.first()).f14741a) {
                                        arrayList3.add(obj5);
                                    }
                                }
                            }
                            List list11 = arrayList3;
                            if (list2.isEmpty()) {
                                list4 = vt.i0.f38321a;
                            } else {
                                ArrayList arrayList6 = new ArrayList(arrayList.size());
                                int size9 = arrayList.size();
                                for (int i133 = 0; i133 < size9; i133++) {
                                    Object obj6 = arrayList.get(i133);
                                    if (((k) obj6).f14741a > ((k) qVar.last()).f14741a) {
                                        arrayList6.add(obj6);
                                    }
                                }
                                list4 = arrayList6;
                            }
                            if (arrayList2.isEmpty()) {
                                z13 = true;
                                obj3 = null;
                            } else {
                                Object obj7 = arrayList2.get(0);
                                int i134 = ((k) obj7).f14753m;
                                nVar2.getClass();
                                float f12 = -Math.abs(i134 - f11);
                                int f13 = vt.y.f(arrayList2);
                                z13 = true;
                                if (1 <= f13) {
                                    int i135 = 1;
                                    while (true) {
                                        Object obj8 = arrayList2.get(i135);
                                        float f14 = -Math.abs(((k) obj8).f14753m - f11);
                                        if (Float.compare(f12, f14) < 0) {
                                            obj7 = obj8;
                                            f12 = f14;
                                        }
                                        if (i135 == f13) {
                                            break;
                                        }
                                        i135++;
                                    }
                                }
                                obj3 = obj7;
                            }
                            k kVar11 = (k) obj3;
                            nVar2.getClass();
                            if (kVar11 != null) {
                                i31 = kVar11.f14753m;
                                i30 = i103;
                            } else {
                                i30 = i103;
                                i31 = 0;
                            }
                            if (i30 == 0) {
                                e10 = s0.g.f34069a;
                            } else {
                                e10 = kotlin.ranges.d.e((0 - i31) / i30, -0.5f, 0.5f);
                            }
                            Integer valueOf = Integer.valueOf(L);
                            Integer valueOf2 = Integer.valueOf(K);
                            j0Var = j0Var3;
                            a2.n0 n0Var = (a2.n0) uVar.b(valueOf, valueOf2, new x.z(9, arrayList, j0Var.B));
                            if (i20 >= i115 && i29 <= i118) {
                                z14 = false;
                            } else {
                                z14 = z13;
                            }
                            zVar = new z(arrayList2, i118, i28, i38, g1Var4, i63, i71, i45, kVar2, kVar11, e10, i25, z14, nVar2, n0Var, z18, list11, list4);
                        } else {
                            throw new IllegalArgumentException("invalid currentFirstPageScrollOffset".toString());
                        }
                    }
                    j0Var.g(zVar, false);
                    return zVar;
                }
                throw new IllegalArgumentException("negative afterContentPadding".toString());
            }
            throw new IllegalArgumentException("negative beforeContentPadding".toString());
        } catch (Throwable th2) {
            yq.b.l(h11, i41, function1);
            throw th2;
        }
    }
}
