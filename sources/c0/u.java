package c0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0.z f7589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7590c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7592e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(d0.z zVar, long j10, int i10, int i11, int i12) {
        super(3);
        this.f7588a = i12;
        this.f7589b = zVar;
        this.f7590c = j10;
        this.f7591d = i10;
        this.f7592e = i11;
    }

    public final a2.n0 a(int i10, int i11, Function1 function1) {
        int i12 = this.f7588a;
        d0.z zVar = this.f7589b;
        int i13 = this.f7592e;
        long j10 = this.f7590c;
        int i14 = this.f7591d;
        switch (i12) {
            case 0:
                return ((d0.a0) zVar).f13136b.n0(hl.f.L(i10 + i14, j10), hl.f.K(i11 + i13, j10), vt.p0.d(), function1);
            default:
                return ((d0.a0) zVar).f13136b.n0(hl.f.L(i10 + i14, j10), hl.f.K(i11 + i13, j10), vt.p0.d(), function1);
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f7588a) {
            case 0:
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1) obj3);
            default:
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1) obj3);
        }
    }
}
