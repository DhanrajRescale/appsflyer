package pd;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f30867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30868c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f30869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f30871f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g1.o oVar, boolean z10, Function0 function0, int i10, int i11, int i12) {
        super(2);
        this.f30866a = i12;
        this.f30867b = oVar;
        this.f30868c = z10;
        this.f30869d = function0;
        this.f30870e = i10;
        this.f30871f = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f30866a;
        int i12 = this.f30870e;
        switch (i11) {
            case 0:
                yk.j.a(this.f30867b, this.f30868c, this.f30869d, nVar, t0.t.H0(i12 | 1), this.f30871f);
                return;
            default:
                yk.j.k(this.f30867b, this.f30868c, this.f30869d, nVar, t0.t.H0(i12 | 1), this.f30871f);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f30866a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
