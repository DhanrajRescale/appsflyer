package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class n1 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f32603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f32604c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f32605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(z2 z2Var, qu.f0 f0Var, Function0 function0, int i10) {
        super(0);
        this.f32602a = i10;
        this.f32603b = z2Var;
        this.f32604c = f0Var;
        this.f32605d = function0;
    }

    public final void a() {
        qu.f0 f0Var = this.f32604c;
        int i10 = this.f32602a;
        Function0 function0 = this.f32605d;
        z2 z2Var = this.f32603b;
        switch (i10) {
            case 0:
                if (((a3) z2Var.f32833c.f32721f.getValue()) == a3.f32325b) {
                    f1 d10 = z2Var.f32833c.d();
                    if (d10.f32396a.containsKey(a3.f32326c)) {
                        yk.g.H(f0Var, null, null, new k1(z2Var, null), 3);
                        return;
                    }
                }
                yk.g.H(f0Var, null, null, new l1(z2Var, null), 3).I(new m1(function0, 0));
                return;
            default:
                if (((Boolean) z2Var.f32833c.f32718c.invoke(a3.f32324a)).booleanValue()) {
                    yk.g.H(f0Var, null, null, new w1(z2Var, null), 3).I(new x1(z2Var, function0, 0));
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f32602a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
