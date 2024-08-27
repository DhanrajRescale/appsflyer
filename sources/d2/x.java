package d2;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class x extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f13676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(a0 a0Var, int i10) {
        super(0);
        this.f13675a = i10;
        this.f13676b = a0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int actionMasked;
        q qVar;
        int i10 = this.f13675a;
        a0 a0Var = this.f13676b;
        switch (i10) {
            case 0:
                MotionEvent motionEvent = a0Var.C0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    a0Var.D0 = SystemClock.uptimeMillis();
                    a0Var.post(a0Var.G0);
                }
                return Unit.f23355a;
            default:
                qVar = a0Var.get_viewTreeOwners();
                return qVar;
        }
    }
}
