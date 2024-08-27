package pd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f30885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30886c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f30887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f30889f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(g1.o oVar, String str, Function1 function1, int i10, int i11, int i12) {
        super(2);
        this.f30884a = i12;
        this.f30885b = oVar;
        this.f30886c = str;
        this.f30887d = function1;
        this.f30888e = i10;
        this.f30889f = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f30884a;
        int i12 = this.f30888e;
        switch (i11) {
            case 0:
                yk.j.e0(this.f30885b, this.f30886c, this.f30887d, nVar, t0.t.H0(i12 | 1), this.f30889f);
                return;
            default:
                el.l.g(this.f30885b, this.f30886c, this.f30887d, nVar, t0.t.H0(i12 | 1), this.f30889f);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f30884a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
