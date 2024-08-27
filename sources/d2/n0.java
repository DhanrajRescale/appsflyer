package d2;

import android.view.accessibility.AccessibilityEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f13553b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(r0 r0Var, int i10) {
        super(1);
        this.f13552a = i10;
        this.f13553b = r0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f13552a;
        r0 r0Var = this.f13553b;
        switch (i10) {
            case 0:
                return Boolean.valueOf(r0Var.f13578d.getParent().requestSendAccessibilityEvent(r0Var.f13578d, (AccessibilityEvent) obj));
            default:
                z2 z2Var = (z2) obj;
                r0Var.getClass();
                if (z2Var.f13702b.contains(z2Var)) {
                    r0Var.f13578d.getSnapshotObserver().a(z2Var, r0Var.M, new x.y0(17, z2Var, r0Var));
                }
                return Unit.f23355a;
        }
    }
}
