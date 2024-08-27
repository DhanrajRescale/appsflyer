package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19176a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19178c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(int i10, Function0 function0, boolean z10) {
        super(2);
        this.f19177b = z10;
        this.f19179d = function0;
        this.f19178c = i10;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f19176a;
        boolean z10 = this.f19177b;
        int i12 = this.f19178c;
        Object obj = this.f19179d;
        switch (i11) {
            case 0:
                l1.j((l0.v0) obj, z10, nVar, t0.t.H0(i12 | 1));
                return;
            default:
                yk.o.o(z10, (Function0) obj, nVar, t0.t.H0(i12 | 1));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f19176a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(l0.v0 v0Var, boolean z10, int i10) {
        super(2);
        this.f19179d = v0Var;
        this.f19177b = z10;
        this.f19178c = i10;
    }
}
