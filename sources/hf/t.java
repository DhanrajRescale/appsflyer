package hf;

import e0.j0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f18408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f18409c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f18410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f18411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18413g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(g1.o oVar, List list, j0 j0Var, Function2 function2, int i10, int i11, int i12) {
        super(2);
        this.f18407a = i12;
        this.f18408b = oVar;
        this.f18409c = list;
        this.f18410d = j0Var;
        this.f18411e = function2;
        this.f18412f = i10;
        this.f18413g = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f18407a;
        int i12 = this.f18412f;
        switch (i11) {
            case 0:
                z.f(this.f18408b, this.f18409c, this.f18410d, this.f18411e, nVar, t0.t.H0(i12 | 1), this.f18413g);
                return;
            default:
                z.g(this.f18408b, this.f18409c, this.f18410d, this.f18411e, nVar, t0.t.H0(i12 | 1), this.f18413g);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f18407a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
