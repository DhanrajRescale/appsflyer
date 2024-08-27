package x1;

import android.view.MotionEvent;
import c2.r1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import x.y0;

/* loaded from: classes.dex */
public final class d0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2.k f39840b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(y2.q qVar, int i10) {
        super(1);
        this.f39839a = i10;
        this.f39840b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean dispatchTouchEvent;
        d2.a0 a0Var;
        int i10 = this.f39839a;
        y2.k kVar = this.f39840b;
        switch (i10) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = kVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = kVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
            default:
                r1 r1Var = (r1) obj;
                if (r1Var instanceof d2.a0) {
                    a0Var = (d2.a0) r1Var;
                } else {
                    a0Var = null;
                }
                if (a0Var != null) {
                    y0 y0Var = new y0(16, a0Var, kVar);
                    v0.h hVar = a0Var.F0;
                    if (!hVar.h(y0Var)) {
                        hVar.b(y0Var);
                    }
                }
                kVar.removeAllViewsInLayout();
                return Unit.f23355a;
        }
    }
}
