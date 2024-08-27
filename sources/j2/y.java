package j2;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n1.w0;

/* loaded from: classes.dex */
public final class y extends iu.k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final y f20774b = new y(0);

    /* renamed from: c, reason: collision with root package name */
    public static final y f20775c = new y(1);

    /* renamed from: d, reason: collision with root package name */
    public static final y f20776d = new y(2);

    /* renamed from: e, reason: collision with root package name */
    public static final y f20777e = new y(3);

    /* renamed from: f, reason: collision with root package name */
    public static final y f20778f = new y(4);

    /* renamed from: g, reason: collision with root package name */
    public static final y f20779g = new y(5);

    /* renamed from: h, reason: collision with root package name */
    public static final y f20780h = new y(6);

    /* renamed from: i, reason: collision with root package name */
    public static final y f20781i = new y(7);

    /* renamed from: j, reason: collision with root package name */
    public static final y f20782j = new y(8);

    /* renamed from: k, reason: collision with root package name */
    public static final y f20783k = new y(9);

    /* renamed from: l, reason: collision with root package name */
    public static final y f20784l = new y(10);

    /* renamed from: m, reason: collision with root package name */
    public static final y f20785m = new y(11);

    /* renamed from: n, reason: collision with root package name */
    public static final y f20786n = new y(12);

    /* renamed from: o, reason: collision with root package name */
    public static final y f20787o = new y(13);

    /* renamed from: p, reason: collision with root package name */
    public static final y f20788p = new y(14);

    /* renamed from: q, reason: collision with root package name */
    public static final y f20789q = new y(15);

    /* renamed from: r, reason: collision with root package name */
    public static final y f20790r = new y(16);

    /* renamed from: s, reason: collision with root package name */
    public static final y f20791s = new y(17);

    /* renamed from: t, reason: collision with root package name */
    public static final y f20792t = new y(18);

    /* renamed from: u, reason: collision with root package name */
    public static final y f20793u = new y(19);

    /* renamed from: v, reason: collision with root package name */
    public static final y f20794v = new y(20);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20795a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i10) {
        super(2);
        this.f20795a = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        g gVar;
        int i10 = 0;
        switch (this.f20795a) {
            case 0:
                d1.d dVar = (d1.d) obj;
                e eVar = (e) obj2;
                Object[] objArr = new Object[4];
                String str = eVar.f20699a;
                d1.r rVar = a0.f20634a;
                objArr[0] = str;
                Object obj3 = eVar.f20700b;
                if (obj3 == null) {
                    obj3 = vt.i0.f38321a;
                }
                d1.r rVar2 = a0.f20635b;
                objArr[1] = a0.a(obj3, rVar2, dVar);
                Object obj4 = eVar.f20701c;
                if (obj4 == null) {
                    obj4 = vt.i0.f38321a;
                }
                objArr[2] = a0.a(obj4, rVar2, dVar);
                objArr[3] = a0.a(eVar.f20702d, rVar2, dVar);
                return vt.y.c(objArr);
            case 1:
                d1.d dVar2 = (d1.d) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i10 < size) {
                    arrayList.add(a0.a((d) list.get(i10), a0.f20636c, dVar2));
                    i10++;
                }
                return arrayList;
            case 2:
                d1.d dVar3 = (d1.d) obj;
                d dVar4 = (d) obj2;
                Object obj5 = dVar4.f20685a;
                if (obj5 instanceof s) {
                    gVar = g.f20713a;
                } else if (obj5 instanceof b0) {
                    gVar = g.f20714b;
                } else if (obj5 instanceof j0) {
                    gVar = g.f20715c;
                } else if (obj5 instanceof i0) {
                    gVar = g.f20716d;
                } else if (obj5 instanceof j) {
                    gVar = g.f20717e;
                } else if (obj5 instanceof i) {
                    gVar = g.f20718f;
                } else {
                    gVar = g.f20719g;
                }
                int ordinal = gVar.ordinal();
                Object obj6 = dVar4.f20685a;
                switch (ordinal) {
                    case 0:
                        Intrinsics.d(obj6, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        obj6 = a0.a((s) obj6, a0.f20641h, dVar3);
                        break;
                    case 1:
                        Intrinsics.d(obj6, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        obj6 = a0.a((b0) obj6, a0.f20642i, dVar3);
                        break;
                    case 2:
                        Intrinsics.d(obj6, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        obj6 = a0.a((j0) obj6, a0.f20637d, dVar3);
                        break;
                    case 3:
                        Intrinsics.d(obj6, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        obj6 = a0.a((i0) obj6, a0.f20638e, dVar3);
                        break;
                    case 4:
                        Intrinsics.d(obj6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        obj6 = a0.a((j) obj6, a0.f20639f, dVar3);
                        break;
                    case 5:
                        Intrinsics.d(obj6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        obj6 = a0.a((i) obj6, a0.f20640g, dVar3);
                        break;
                    case 6:
                        d1.r rVar3 = a0.f20634a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return vt.y.c(gVar, obj6, Integer.valueOf(dVar4.f20686b), Integer.valueOf(dVar4.f20687c), dVar4.f20688d);
            case 3:
                return Float.valueOf(((u2.a) obj2).f36667a);
            case 4:
                String str2 = ((i) obj2).f20726a;
                d1.r rVar4 = a0.f20634a;
                return str2;
            case 5:
                return new ut.t(((n1.t) obj2).f28179a);
            case 6:
                return Integer.valueOf(((o2.d0) obj2).f29469a);
            case 7:
                String str3 = ((j) obj2).f20728a;
                d1.r rVar5 = a0.f20634a;
                return str3;
            case 8:
                d1.d dVar5 = (d1.d) obj;
                List list2 = ((q2.d) obj2).f31579a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i10 < size2) {
                    arrayList2.add(a0.a((q2.c) list2.get(i10), a0.f20654u, dVar5));
                    i10++;
                }
                return arrayList2;
            case 9:
                return ((q2.a) ((q2.c) obj2).f31578a).f31574a.toLanguageTag();
            case 10:
                long j10 = ((m1.c) obj2).f27237a;
                if (m1.c.b(j10, m1.c.f27235d)) {
                    return Boolean.FALSE;
                }
                Float valueOf = Float.valueOf(m1.c.d(j10));
                d1.r rVar6 = a0.f20634a;
                return vt.y.c(valueOf, Float.valueOf(m1.c.e(j10)));
            case 11:
                d1.d dVar6 = (d1.d) obj;
                s sVar = (s) obj2;
                u2.i iVar = new u2.i(sVar.f20755a);
                d1.r rVar7 = a0.f20634a;
                u2.k kVar = new u2.k(sVar.f20756b);
                Object a10 = a0.a(new w2.m(sVar.f20757c), a0.f20651r, dVar6);
                u2.p pVar = u2.p.f36695c;
                return vt.y.c(iVar, kVar, a10, a0.a(sVar.f20758d, a0.f20645l, dVar6));
            case 12:
                d1.d dVar7 = (d1.d) obj;
                w0 w0Var = (w0) obj2;
                return vt.y.c(a0.a(new n1.t(w0Var.f28205a), a0.f20650q, dVar7), a0.a(new m1.c(w0Var.f28206b), a0.f20652s, dVar7), Float.valueOf(w0Var.f28207c));
            case 13:
                d1.d dVar8 = (d1.d) obj;
                b0 b0Var = (b0) obj2;
                n1.t tVar = new n1.t(b0Var.f20659a.a());
                d1.r rVar8 = a0.f20650q;
                Object a11 = a0.a(tVar, rVar8, dVar8);
                w2.m mVar = new w2.m(b0Var.f20660b);
                d1.r rVar9 = a0.f20651r;
                Object a12 = a0.a(mVar, rVar9, dVar8);
                o2.d0 d0Var = o2.d0.f29460b;
                Object a13 = a0.a(b0Var.f20661c, a0.f20646m, dVar8);
                o2.z zVar = b0Var.f20662d;
                o2.a0 a0Var = b0Var.f20663e;
                String str4 = b0Var.f20665g;
                Object a14 = a0.a(new w2.m(b0Var.f20666h), rVar9, dVar8);
                Object a15 = a0.a(b0Var.f20667i, a0.f20647n, dVar8);
                Object a16 = a0.a(b0Var.f20668j, a0.f20644k, dVar8);
                Object a17 = a0.a(b0Var.f20669k, a0.f20653t, dVar8);
                Object a18 = a0.a(new n1.t(b0Var.f20670l), rVar8, dVar8);
                Object a19 = a0.a(b0Var.f20671m, a0.f20643j, dVar8);
                w0 w0Var2 = w0.f28204d;
                return vt.y.c(a11, a12, a13, zVar, a0Var, -1, str4, a14, a15, a16, a17, a18, a19, a0.a(b0Var.f20672n, a0.f20649p, dVar8));
            case 14:
                return Integer.valueOf(((u2.j) obj2).f36687a);
            case 15:
                u2.o oVar = (u2.o) obj2;
                return vt.y.c(Float.valueOf(oVar.f36693a), Float.valueOf(oVar.f36694b));
            case 16:
                d1.d dVar9 = (d1.d) obj;
                u2.p pVar2 = (u2.p) obj2;
                w2.m mVar2 = new w2.m(pVar2.f36696a);
                d1.r rVar10 = a0.f20651r;
                return vt.y.c(a0.a(mVar2, rVar10, dVar9), a0.a(new w2.m(pVar2.f36697b), rVar10, dVar9));
            case 17:
                long j11 = ((f0) obj2).f20712a;
                int i11 = f0.f20711c;
                Integer valueOf2 = Integer.valueOf((int) (j11 >> 32));
                d1.r rVar11 = a0.f20634a;
                return vt.y.c(valueOf2, Integer.valueOf((int) (j11 & 4294967295L)));
            case 18:
                long j12 = ((w2.m) obj2).f38805a;
                Float valueOf3 = Float.valueOf(w2.m.c(j12));
                d1.r rVar12 = a0.f20634a;
                return vt.y.c(valueOf3, new w2.n(w2.m.b(j12)));
            case 19:
                String str5 = ((i0) obj2).f20727a;
                d1.r rVar13 = a0.f20634a;
                return str5;
            default:
                String str6 = ((j0) obj2).f20729a;
                d1.r rVar14 = a0.f20634a;
                return str6;
        }
    }
}
