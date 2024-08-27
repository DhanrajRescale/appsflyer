package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class x1 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f32803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f32804c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(z2 z2Var, Function0 function0, int i10) {
        super(1);
        this.f32802a = i10;
        this.f32803b = z2Var;
        this.f32804c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z2 z2Var = this.f32803b;
        Function0 function0 = this.f32804c;
        int i10 = this.f32802a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        if (!z2Var.c()) {
                            function0.mo2invoke();
                            break;
                        }
                        break;
                    default:
                        if (!z2Var.c()) {
                            function0.mo2invoke();
                            break;
                        }
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 0:
                        if (!z2Var.c()) {
                            function0.mo2invoke();
                            break;
                        }
                        break;
                    default:
                        if (!z2Var.c()) {
                            function0.mo2invoke();
                            break;
                        }
                        break;
                }
                return Unit.f23355a;
        }
    }
}
