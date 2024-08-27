package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i1 extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f38524b = new i1(2);

    /* renamed from: c, reason: collision with root package name */
    public static final i1 f38525c = new i1(3);

    /* renamed from: d, reason: collision with root package name */
    public static final i1 f38526d = new i1(4);

    /* renamed from: e, reason: collision with root package name */
    public static final i1 f38527e = new i1(5);

    /* renamed from: f, reason: collision with root package name */
    public static final i1 f38528f = new i1(6);

    /* renamed from: g, reason: collision with root package name */
    public static final i1 f38529g = new i1(7);

    /* renamed from: h, reason: collision with root package name */
    public static final i1 f38530h = new i1(8);

    /* renamed from: i, reason: collision with root package name */
    public static final i1 f38531i = new i1(9);

    /* renamed from: j, reason: collision with root package name */
    public static final i1 f38532j = new i1(10);

    /* renamed from: k, reason: collision with root package name */
    public static final i1 f38533k = new i1(11);

    /* renamed from: l, reason: collision with root package name */
    public static final i1 f38534l = new i1(12);

    /* renamed from: m, reason: collision with root package name */
    public static final i1 f38535m = new i1(13);

    /* renamed from: n, reason: collision with root package name */
    public static final i1 f38536n = new i1(14);

    /* renamed from: o, reason: collision with root package name */
    public static final i1 f38537o = new i1(15);

    /* renamed from: p, reason: collision with root package name */
    public static final i1 f38538p = new i1(16);

    /* renamed from: q, reason: collision with root package name */
    public static final i1 f38539q = new i1(17);

    /* renamed from: r, reason: collision with root package name */
    public static final i1 f38540r = new i1(18);

    /* renamed from: s, reason: collision with root package name */
    public static final i1 f38541s = new i1(19);

    /* renamed from: t, reason: collision with root package name */
    public static final i1 f38542t = new i1(20);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38543a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(int i10) {
        super(1);
        this.f38543a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38543a) {
            case 0:
                return Unit.f23355a;
            case 1:
                return Unit.f23355a;
            case 2:
                return Unit.f23355a;
            case 3:
                long j10 = ((w2.f) obj).f38786a;
                return new q(w2.f.a(j10), w2.f.b(j10));
            case 4:
                q qVar = (q) obj;
                return new w2.f(hl.f.f(qVar.f38641a, qVar.f38642b));
            case 5:
                return new p(((w2.e) obj).f38783a);
            case 6:
                return new w2.e(((p) obj).f38635a);
            case 7:
                return new p(((Number) obj).floatValue());
            case 8:
                return Float.valueOf(((p) obj).f38635a);
            case 9:
                long j11 = ((w2.h) obj).f38793a;
                int i10 = w2.h.f38792c;
                return new q((int) (j11 >> 32), (int) (4294967295L & j11));
            case 10:
                q qVar2 = (q) obj;
                return new w2.h(hl.f.j(Math.round(qVar2.f38641a), Math.round(qVar2.f38642b)));
            case 11:
                long j12 = ((w2.j) obj).f38798a;
                return new q((int) (j12 >> 32), (int) (4294967295L & j12));
            case 12:
                q qVar3 = (q) obj;
                return new w2.j(hl.f.k(Math.round(qVar3.f38641a), Math.round(qVar3.f38642b)));
            case 13:
                return new p(((Number) obj).intValue());
            case 14:
                return Integer.valueOf((int) ((p) obj).f38635a);
            case 15:
                long j13 = ((m1.c) obj).f27237a;
                return new q(m1.c.d(j13), m1.c.e(j13));
            case 16:
                q qVar4 = (q) obj;
                return new m1.c(t0.t.g(qVar4.f38641a, qVar4.f38642b));
            case 17:
                m1.d dVar = (m1.d) obj;
                return new s(dVar.f27239a, dVar.f27240b, dVar.f27241c, dVar.f27242d);
            case 18:
                s sVar = (s) obj;
                return new m1.d(sVar.f38670a, sVar.f38671b, sVar.f38672c, sVar.f38673d);
            case 19:
                long j14 = ((m1.f) obj).f27254a;
                return new q(m1.f.e(j14), m1.f.c(j14));
            default:
                q qVar5 = (q) obj;
                return new m1.f(t0.t.j(qVar5.f38641a, qVar5.f38642b));
        }
    }
}
