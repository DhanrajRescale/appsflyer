package c;

import androidx.activity.q;
import kotlin.jvm.functions.Function0;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class i extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3 f7428a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z10, g1 g1Var) {
        super(z10);
        this.f7428a = g1Var;
    }

    @Override // androidx.activity.q
    public final void handleOnBackPressed() {
        ((Function0) this.f7428a.getValue()).mo2invoke();
    }
}
