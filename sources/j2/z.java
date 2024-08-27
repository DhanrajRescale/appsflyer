package j2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n1.w0;

/* loaded from: classes.dex */
public final class z extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final z f20796b = new z(0);

    /* renamed from: c, reason: collision with root package name */
    public static final z f20797c = new z(1);

    /* renamed from: d, reason: collision with root package name */
    public static final z f20798d = new z(2);

    /* renamed from: e, reason: collision with root package name */
    public static final z f20799e = new z(3);

    /* renamed from: f, reason: collision with root package name */
    public static final z f20800f = new z(4);

    /* renamed from: g, reason: collision with root package name */
    public static final z f20801g = new z(5);

    /* renamed from: h, reason: collision with root package name */
    public static final z f20802h = new z(6);

    /* renamed from: i, reason: collision with root package name */
    public static final z f20803i = new z(7);

    /* renamed from: j, reason: collision with root package name */
    public static final z f20804j = new z(8);

    /* renamed from: k, reason: collision with root package name */
    public static final z f20805k = new z(9);

    /* renamed from: l, reason: collision with root package name */
    public static final z f20806l = new z(10);

    /* renamed from: m, reason: collision with root package name */
    public static final z f20807m = new z(11);

    /* renamed from: n, reason: collision with root package name */
    public static final z f20808n = new z(12);

    /* renamed from: o, reason: collision with root package name */
    public static final z f20809o = new z(13);

    /* renamed from: p, reason: collision with root package name */
    public static final z f20810p = new z(14);

    /* renamed from: q, reason: collision with root package name */
    public static final z f20811q = new z(15);

    /* renamed from: r, reason: collision with root package name */
    public static final z f20812r = new z(16);

    /* renamed from: s, reason: collision with root package name */
    public static final z f20813s = new z(17);

    /* renamed from: t, reason: collision with root package name */
    public static final z f20814t = new z(18);

    /* renamed from: u, reason: collision with root package name */
    public static final z f20815u = new z(19);

    /* renamed from: v, reason: collision with root package name */
    public static final z f20816v = new z(20);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20817a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i10) {
        super(1);
        this.f20817a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        List list2;
        String str;
        List list3;
        d dVar;
        g gVar;
        Integer num;
        Integer num2;
        String str2;
        s sVar;
        b0 b0Var;
        j0 j0Var;
        i0 i0Var;
        j jVar;
        i iVar;
        String str3;
        String str4;
        String str5;
        q2.c cVar;
        Float f10;
        Float f11;
        u2.i iVar2;
        u2.k kVar;
        w2.m mVar;
        u2.p pVar;
        n1.t tVar;
        m1.c cVar2;
        Float f12;
        n1.t tVar2;
        w2.m mVar2;
        o2.d0 d0Var;
        o2.z zVar;
        o2.a0 a0Var;
        String str6;
        w2.m mVar3;
        u2.a aVar;
        u2.o oVar;
        q2.d dVar2;
        n1.t tVar3;
        u2.j jVar2;
        w0 w0Var;
        w2.m mVar4;
        w2.m mVar5;
        Integer num3;
        Integer num4;
        Float f13;
        w2.n nVar;
        String str7;
        String str8;
        int i10 = 0;
        switch (this.f20817a) {
            case 0:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list4 = (List) obj;
                Object obj2 = list4.get(1);
                d1.r rVar = a0.f20635b;
                Boolean bool = Boolean.FALSE;
                if (Intrinsics.a(obj2, bool) || obj2 == null) {
                    list = null;
                } else {
                    list = (List) rVar.f13290b.invoke(obj2);
                }
                Object obj3 = list4.get(2);
                if (Intrinsics.a(obj3, bool) || obj3 == null) {
                    list2 = null;
                } else {
                    list2 = (List) rVar.f13290b.invoke(obj3);
                }
                Object obj4 = list4.get(0);
                if (obj4 != null) {
                    str = (String) obj4;
                } else {
                    str = null;
                }
                Intrinsics.c(str);
                if (list == null || list.isEmpty()) {
                    list = null;
                }
                if (list2 == null || list2.isEmpty()) {
                    list2 = null;
                }
                Object obj5 = list4.get(3);
                if (Intrinsics.a(obj5, bool) || obj5 == null) {
                    list3 = null;
                } else {
                    list3 = (List) rVar.f13290b.invoke(obj5);
                }
                return new e(list, list2, list3, str);
            case 1:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                ArrayList arrayList = new ArrayList(list5.size());
                int size = list5.size();
                while (i10 < size) {
                    Object obj6 = list5.get(i10);
                    d1.r rVar2 = a0.f20636c;
                    if (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) {
                        dVar = null;
                    } else {
                        dVar = (d) rVar2.f13290b.invoke(obj6);
                    }
                    Intrinsics.c(dVar);
                    arrayList.add(dVar);
                    i10++;
                }
                return arrayList;
            case 2:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj7 = list6.get(0);
                if (obj7 != null) {
                    gVar = (g) obj7;
                } else {
                    gVar = null;
                }
                Intrinsics.c(gVar);
                Object obj8 = list6.get(2);
                if (obj8 != null) {
                    num = (Integer) obj8;
                } else {
                    num = null;
                }
                Intrinsics.c(num);
                int intValue = num.intValue();
                Object obj9 = list6.get(3);
                if (obj9 != null) {
                    num2 = (Integer) obj9;
                } else {
                    num2 = null;
                }
                Intrinsics.c(num2);
                int intValue2 = num2.intValue();
                Object obj10 = list6.get(4);
                if (obj10 != null) {
                    str2 = (String) obj10;
                } else {
                    str2 = null;
                }
                Intrinsics.c(str2);
                switch (gVar.ordinal()) {
                    case 0:
                        Object obj11 = list6.get(1);
                        d1.r rVar3 = a0.f20641h;
                        if (Intrinsics.a(obj11, Boolean.FALSE) || obj11 == null) {
                            sVar = null;
                        } else {
                            sVar = (s) rVar3.f13290b.invoke(obj11);
                        }
                        Intrinsics.c(sVar);
                        return new d(str2, intValue, intValue2, sVar);
                    case 1:
                        Object obj12 = list6.get(1);
                        d1.r rVar4 = a0.f20642i;
                        if (Intrinsics.a(obj12, Boolean.FALSE) || obj12 == null) {
                            b0Var = null;
                        } else {
                            b0Var = (b0) rVar4.f13290b.invoke(obj12);
                        }
                        Intrinsics.c(b0Var);
                        return new d(str2, intValue, intValue2, b0Var);
                    case 2:
                        Object obj13 = list6.get(1);
                        d1.r rVar5 = a0.f20637d;
                        if (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) {
                            j0Var = null;
                        } else {
                            j0Var = (j0) rVar5.f13290b.invoke(obj13);
                        }
                        Intrinsics.c(j0Var);
                        return new d(str2, intValue, intValue2, j0Var);
                    case 3:
                        Object obj14 = list6.get(1);
                        d1.r rVar6 = a0.f20638e;
                        if (Intrinsics.a(obj14, Boolean.FALSE) || obj14 == null) {
                            i0Var = null;
                        } else {
                            i0Var = (i0) rVar6.f13290b.invoke(obj14);
                        }
                        Intrinsics.c(i0Var);
                        return new d(str2, intValue, intValue2, i0Var);
                    case 4:
                        Object obj15 = list6.get(1);
                        d1.r rVar7 = a0.f20639f;
                        if (Intrinsics.a(obj15, Boolean.FALSE) || obj15 == null) {
                            jVar = null;
                        } else {
                            jVar = (j) rVar7.f13290b.invoke(obj15);
                        }
                        Intrinsics.c(jVar);
                        return new d(str2, intValue, intValue2, jVar);
                    case 5:
                        Object obj16 = list6.get(1);
                        d1.r rVar8 = a0.f20640g;
                        if (Intrinsics.a(obj16, Boolean.FALSE) || obj16 == null) {
                            iVar = null;
                        } else {
                            iVar = (i) rVar8.f13290b.invoke(obj16);
                        }
                        Intrinsics.c(iVar);
                        return new d(str2, intValue, intValue2, iVar);
                    case 6:
                        Object obj17 = list6.get(1);
                        if (obj17 != null) {
                            str3 = (String) obj17;
                        } else {
                            str3 = null;
                        }
                        Intrinsics.c(str3);
                        return new d(str2, intValue, intValue2, str3);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 3:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Float");
                return new u2.a(((Float) obj).floatValue());
            case 4:
                if (obj != null) {
                    str4 = (String) obj;
                } else {
                    str4 = null;
                }
                Intrinsics.c(str4);
                return new i(str4);
            case 5:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.ULong");
                return new n1.t(((ut.t) obj).f37408a);
            case 6:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new o2.d0(((Integer) obj).intValue());
            case 7:
                if (obj != null) {
                    str5 = (String) obj;
                } else {
                    str5 = null;
                }
                Intrinsics.c(str5);
                return new j(str5);
            case 8:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list7.size());
                int size2 = list7.size();
                while (i10 < size2) {
                    Object obj18 = list7.get(i10);
                    d1.r rVar9 = a0.f20654u;
                    if (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) {
                        cVar = null;
                    } else {
                        cVar = (q2.c) rVar9.f13290b.invoke(obj18);
                    }
                    Intrinsics.c(cVar);
                    arrayList2.add(cVar);
                    i10++;
                }
                return new q2.d(arrayList2);
            case 9:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
                q2.f.f31581a.getClass();
                return new q2.c(new q2.a(Locale.forLanguageTag((String) obj)));
            case 10:
                if (Intrinsics.a(obj, Boolean.FALSE)) {
                    return new m1.c(m1.c.f27235d);
                }
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list8 = (List) obj;
                Object obj19 = list8.get(0);
                if (obj19 != null) {
                    f10 = (Float) obj19;
                } else {
                    f10 = null;
                }
                Intrinsics.c(f10);
                float floatValue = f10.floatValue();
                Object obj20 = list8.get(1);
                if (obj20 != null) {
                    f11 = (Float) obj20;
                } else {
                    f11 = null;
                }
                Intrinsics.c(f11);
                return new m1.c(t0.t.g(floatValue, f11.floatValue()));
            case 11:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list9 = (List) obj;
                Object obj21 = list9.get(0);
                if (obj21 != null) {
                    iVar2 = (u2.i) obj21;
                } else {
                    iVar2 = null;
                }
                Intrinsics.c(iVar2);
                int i11 = iVar2.f36683a;
                Object obj22 = list9.get(1);
                if (obj22 != null) {
                    kVar = (u2.k) obj22;
                } else {
                    kVar = null;
                }
                Intrinsics.c(kVar);
                int i12 = kVar.f36688a;
                Object obj23 = list9.get(2);
                w2.n[] nVarArr = w2.m.f38803b;
                d1.r rVar10 = a0.f20651r;
                Boolean bool2 = Boolean.FALSE;
                if (Intrinsics.a(obj23, bool2) || obj23 == null) {
                    mVar = null;
                } else {
                    mVar = (w2.m) rVar10.f13290b.invoke(obj23);
                }
                Intrinsics.c(mVar);
                long j10 = mVar.f38805a;
                Object obj24 = list9.get(3);
                u2.p pVar2 = u2.p.f36695c;
                d1.r rVar11 = a0.f20645l;
                if (Intrinsics.a(obj24, bool2) || obj24 == null) {
                    pVar = null;
                } else {
                    pVar = (u2.p) rVar11.f13290b.invoke(obj24);
                }
                return new s(i11, i12, j10, pVar, null, null, 0, Integer.MIN_VALUE, null);
            case 12:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list10 = (List) obj;
                Object obj25 = list10.get(0);
                int i13 = n1.t.f28178j;
                d1.r rVar12 = a0.f20650q;
                Boolean bool3 = Boolean.FALSE;
                if (Intrinsics.a(obj25, bool3) || obj25 == null) {
                    tVar = null;
                } else {
                    tVar = (n1.t) rVar12.f13290b.invoke(obj25);
                }
                Intrinsics.c(tVar);
                long j11 = tVar.f28179a;
                Object obj26 = list10.get(1);
                int i14 = m1.c.f27236e;
                d1.r rVar13 = a0.f20652s;
                if (Intrinsics.a(obj26, bool3) || obj26 == null) {
                    cVar2 = null;
                } else {
                    cVar2 = (m1.c) rVar13.f13290b.invoke(obj26);
                }
                Intrinsics.c(cVar2);
                long j12 = cVar2.f27237a;
                Object obj27 = list10.get(2);
                if (obj27 != null) {
                    f12 = (Float) obj27;
                } else {
                    f12 = null;
                }
                Intrinsics.c(f12);
                return new w0(j11, j12, f12.floatValue());
            case 13:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj28 = list11.get(0);
                int i15 = n1.t.f28178j;
                d1.r rVar14 = a0.f20650q;
                Boolean bool4 = Boolean.FALSE;
                if (Intrinsics.a(obj28, bool4) || obj28 == null) {
                    tVar2 = null;
                } else {
                    tVar2 = (n1.t) rVar14.f13290b.invoke(obj28);
                }
                Intrinsics.c(tVar2);
                long j13 = tVar2.f28179a;
                Object obj29 = list11.get(1);
                w2.n[] nVarArr2 = w2.m.f38803b;
                d1.r rVar15 = a0.f20651r;
                if (Intrinsics.a(obj29, bool4) || obj29 == null) {
                    mVar2 = null;
                } else {
                    mVar2 = (w2.m) rVar15.f13290b.invoke(obj29);
                }
                Intrinsics.c(mVar2);
                long j14 = mVar2.f38805a;
                Object obj30 = list11.get(2);
                o2.d0 d0Var2 = o2.d0.f29460b;
                d1.r rVar16 = a0.f20646m;
                if (Intrinsics.a(obj30, bool4) || obj30 == null) {
                    d0Var = null;
                } else {
                    d0Var = (o2.d0) rVar16.f13290b.invoke(obj30);
                }
                Object obj31 = list11.get(3);
                if (obj31 != null) {
                    zVar = (o2.z) obj31;
                } else {
                    zVar = null;
                }
                Object obj32 = list11.get(4);
                if (obj32 != null) {
                    a0Var = (o2.a0) obj32;
                } else {
                    a0Var = null;
                }
                Object obj33 = list11.get(6);
                if (obj33 != null) {
                    str6 = (String) obj33;
                } else {
                    str6 = null;
                }
                Object obj34 = list11.get(7);
                if (Intrinsics.a(obj34, bool4) || obj34 == null) {
                    mVar3 = null;
                } else {
                    mVar3 = (w2.m) rVar15.f13290b.invoke(obj34);
                }
                Intrinsics.c(mVar3);
                long j15 = mVar3.f38805a;
                Object obj35 = list11.get(8);
                d1.r rVar17 = a0.f20647n;
                if (Intrinsics.a(obj35, bool4) || obj35 == null) {
                    aVar = null;
                } else {
                    aVar = (u2.a) rVar17.f13290b.invoke(obj35);
                }
                Object obj36 = list11.get(9);
                d1.r rVar18 = a0.f20644k;
                if (Intrinsics.a(obj36, bool4) || obj36 == null) {
                    oVar = null;
                } else {
                    oVar = (u2.o) rVar18.f13290b.invoke(obj36);
                }
                Object obj37 = list11.get(10);
                d1.r rVar19 = a0.f20653t;
                if (Intrinsics.a(obj37, bool4) || obj37 == null) {
                    dVar2 = null;
                } else {
                    dVar2 = (q2.d) rVar19.f13290b.invoke(obj37);
                }
                Object obj38 = list11.get(11);
                if (Intrinsics.a(obj38, bool4) || obj38 == null) {
                    tVar3 = null;
                } else {
                    tVar3 = (n1.t) rVar14.f13290b.invoke(obj38);
                }
                Intrinsics.c(tVar3);
                long j16 = tVar3.f28179a;
                Object obj39 = list11.get(12);
                d1.r rVar20 = a0.f20643j;
                if (Intrinsics.a(obj39, bool4) || obj39 == null) {
                    jVar2 = null;
                } else {
                    jVar2 = (u2.j) rVar20.f13290b.invoke(obj39);
                }
                Object obj40 = list11.get(13);
                w0 w0Var2 = w0.f28204d;
                d1.r rVar21 = a0.f20649p;
                if (Intrinsics.a(obj40, bool4) || obj40 == null) {
                    w0Var = null;
                } else {
                    w0Var = (w0) rVar21.f13290b.invoke(obj40);
                }
                return new b0(j13, j14, d0Var, zVar, a0Var, null, str6, j15, aVar, oVar, dVar2, j16, jVar2, w0Var, 49184);
            case 14:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new u2.j(((Integer) obj).intValue());
            case 15:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list12 = (List) obj;
                return new u2.o(((Number) list12.get(0)).floatValue(), ((Number) list12.get(1)).floatValue());
            case 16:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj41 = list13.get(0);
                w2.n[] nVarArr3 = w2.m.f38803b;
                d1.r rVar22 = a0.f20651r;
                Boolean bool5 = Boolean.FALSE;
                if (Intrinsics.a(obj41, bool5) || obj41 == null) {
                    mVar4 = null;
                } else {
                    mVar4 = (w2.m) rVar22.f13290b.invoke(obj41);
                }
                Intrinsics.c(mVar4);
                Object obj42 = list13.get(1);
                if (Intrinsics.a(obj42, bool5) || obj42 == null) {
                    mVar5 = null;
                } else {
                    mVar5 = (w2.m) rVar22.f13290b.invoke(obj42);
                }
                Intrinsics.c(mVar5);
                return new u2.p(mVar4.f38805a, mVar5.f38805a);
            case 17:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj43 = list14.get(0);
                if (obj43 != null) {
                    num3 = (Integer) obj43;
                } else {
                    num3 = null;
                }
                Intrinsics.c(num3);
                int intValue3 = num3.intValue();
                Object obj44 = list14.get(1);
                if (obj44 != null) {
                    num4 = (Integer) obj44;
                } else {
                    num4 = null;
                }
                Intrinsics.c(num4);
                return new f0(d2.w0.b(intValue3, num4.intValue()));
            case 18:
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list15 = (List) obj;
                Object obj45 = list15.get(0);
                if (obj45 != null) {
                    f13 = (Float) obj45;
                } else {
                    f13 = null;
                }
                Intrinsics.c(f13);
                float floatValue2 = f13.floatValue();
                Object obj46 = list15.get(1);
                if (obj46 != null) {
                    nVar = (w2.n) obj46;
                } else {
                    nVar = null;
                }
                Intrinsics.c(nVar);
                return new w2.m(yk.j.i1(nVar.f38807a, floatValue2));
            case 19:
                if (obj != null) {
                    str7 = (String) obj;
                } else {
                    str7 = null;
                }
                Intrinsics.c(str7);
                return new i0(str7);
            default:
                if (obj != null) {
                    str8 = (String) obj;
                } else {
                    str8 = null;
                }
                Intrinsics.c(str8);
                return new j0(str8);
        }
    }
}
