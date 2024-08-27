package ka;

import kotlin.jvm.functions.Function0;
import t0.g1;

/* loaded from: classes.dex */
public final class z extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f23010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f23011c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f23012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f23013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, int i10) {
        super(0);
        this.f23009a = i10;
        this.f23010b = g1Var;
        this.f23011c = g1Var2;
        this.f23012d = g1Var3;
        this.f23013e = g1Var4;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f23009a) {
            case 0:
                return mo2invoke();
            default:
                return mo2invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Boolean mo2invoke() {
        int i10 = this.f23009a;
        boolean z10 = false;
        g1 g1Var = this.f23013e;
        g1 g1Var2 = this.f23012d;
        g1 g1Var3 = this.f23011c;
        g1 g1Var4 = this.f23010b;
        switch (i10) {
            case 0:
                if (!((Boolean) g1Var4.getValue()).booleanValue() && !((Boolean) g1Var3.getValue()).booleanValue() && !((Boolean) g1Var2.getValue()).booleanValue() && !((Boolean) g1Var.getValue()).booleanValue()) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                if (!((Boolean) g1Var4.getValue()).booleanValue() && !((Boolean) g1Var3.getValue()).booleanValue() && !((Boolean) g1Var2.getValue()).booleanValue() && !((Boolean) g1Var.getValue()).booleanValue()) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }
}
