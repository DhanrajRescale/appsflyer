package x1;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f39825b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(c0 c0Var, int i10) {
        super(1);
        this.f39824a = i10;
        this.f39825b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c0 c0Var = this.f39825b;
        int i10 = this.f39824a;
        switch (i10) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (i10) {
                    case 0:
                        Function1 function1 = c0Var.f39832b;
                        if (function1 != null) {
                            function1.invoke(motionEvent);
                            break;
                        } else {
                            Intrinsics.k("onTouchEvent");
                            throw null;
                        }
                    default:
                        Function1 function12 = c0Var.f39832b;
                        if (function12 != null) {
                            function12.invoke(motionEvent);
                            break;
                        } else {
                            Intrinsics.k("onTouchEvent");
                            throw null;
                        }
                }
                return Unit.f23355a;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                switch (i10) {
                    case 0:
                        Function1 function13 = c0Var.f39832b;
                        if (function13 != null) {
                            function13.invoke(motionEvent2);
                            break;
                        } else {
                            Intrinsics.k("onTouchEvent");
                            throw null;
                        }
                    default:
                        Function1 function14 = c0Var.f39832b;
                        if (function14 != null) {
                            function14.invoke(motionEvent2);
                            break;
                        } else {
                            Intrinsics.k("onTouchEvent");
                            throw null;
                        }
                }
                return Unit.f23355a;
        }
    }
}
