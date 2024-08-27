package x;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o1 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f39651b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(q1 q1Var, int i10) {
        super(0);
        this.f39650a = i10;
        this.f39651b = q1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f39650a;
        q1 q1Var = this.f39651b;
        switch (i10) {
            case 0:
                return new m1.c(q1Var.B);
            default:
                View view = q1Var.f39694x;
                View view2 = (View) c2.g.p(q1Var, AndroidCompositionLocals_androidKt.f1433g);
                q1Var.f39694x = view2;
                w2.b bVar = q1Var.f39695y;
                w2.b bVar2 = (w2.b) c2.g.p(q1Var, d2.s1.f13620e);
                q1Var.f39695y = bVar2;
                if (q1Var.f39696z == null || !Intrinsics.a(view2, view) || !Intrinsics.a(bVar2, bVar)) {
                    q1Var.Q0();
                }
                q1Var.R0();
                return Unit.f23355a;
        }
    }
}
