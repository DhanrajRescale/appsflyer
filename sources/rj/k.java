package rj;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import t0.g1;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f33888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f33889c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f33890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(boolean z10, g1 g1Var, int i10, int i11) {
        super(0);
        this.f33887a = i11;
        this.f33888b = z10;
        this.f33889c = g1Var;
        this.f33890d = i10;
    }

    public final void a() {
        int i10 = this.f33887a;
        int i11 = this.f33890d;
        g1 g1Var = this.f33889c;
        boolean z10 = this.f33888b;
        switch (i10) {
            case 0:
                if (!z10) {
                    g1Var.setValue(Integer.valueOf(Math.min(Math.max(((Number) g1Var.getValue()).intValue() - i11, 1), 999999)));
                    return;
                }
                return;
            default:
                if (!z10) {
                    g1Var.setValue(Integer.valueOf(Math.min(Math.max(((Number) g1Var.getValue()).intValue() + i11, 1), 999999)));
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f33887a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
