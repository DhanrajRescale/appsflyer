package p0;

import iu.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import qu.f0;
import t0.g1;
import t0.k1;

/* loaded from: classes.dex */
public final class p extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30489a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30491c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f30493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, boolean z10, w wVar, w wVar2) {
        super(0);
        this.f30491c = oVar;
        this.f30490b = z10;
        this.f30492d = wVar;
        this.f30493e = wVar2;
    }

    public final void a() {
        int i10 = this.f30489a;
        Object obj = this.f30493e;
        Object obj2 = this.f30492d;
        Object obj3 = this.f30491c;
        boolean z10 = this.f30490b;
        switch (i10) {
            case 0:
                o oVar = (o) obj3;
                boolean c10 = oVar.c();
                f0 f0Var = oVar.f30480a;
                k1 k1Var = oVar.f30487h;
                if (c10 != z10) {
                    oVar.f30483d.setValue(Boolean.valueOf(z10));
                    k1 k1Var2 = oVar.f30485f;
                    float f10 = s0.g.f34069a;
                    k1Var2.j(s0.g.f34069a);
                    if (z10) {
                        f10 = k1Var.i();
                    }
                    yk.g.H(f0Var, null, null, new n(oVar, f10, null), 3);
                }
                oVar.f30486g.j(((w) obj2).f20557a);
                float f11 = ((w) obj).f20557a;
                if (k1Var.i() != f11) {
                    k1Var.j(f11);
                    if (oVar.c()) {
                        yk.g.H(f0Var, null, null, new n(oVar, f11, null), 3);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (z10) {
                    ((Function0) obj3).mo2invoke();
                } else {
                    ((Function0) obj2).mo2invoke();
                }
                ((g1) obj).setValue(Boolean.FALSE);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f30489a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z10, Function0 function0, Function0 function02, g1 g1Var) {
        super(0);
        this.f30490b = z10;
        this.f30491c = function0;
        this.f30492d = function02;
        this.f30493e = g1Var;
    }
}
