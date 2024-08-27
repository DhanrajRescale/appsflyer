package d2;

import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f13577b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(a0 a0Var, int i10) {
        super(1);
        this.f13576a = i10;
        this.f13577b = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l1.b bVar;
        int i10;
        int i11 = this.f13576a;
        boolean z10 = true;
        boolean z11 = true;
        Looper looper = null;
        a0 a0Var = this.f13577b;
        switch (i11) {
            case 0:
                int i12 = ((u1.a) obj).f36664a;
                if (i12 == 1) {
                    z10 = a0Var.isInTouchMode();
                } else if (i12 == 2) {
                    if (a0Var.isInTouchMode()) {
                        z10 = a0Var.requestFocusFromTouch();
                    }
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                KeyEvent keyEvent = ((v1.b) obj).f37671a;
                a0Var.getClass();
                long a10 = androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode());
                if (v1.a.a(a10, v1.a.f37663h)) {
                    if (keyEvent.isShiftPressed()) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    bVar = new l1.b(i10);
                } else if (v1.a.a(a10, v1.a.f37661f)) {
                    bVar = new l1.b(4);
                } else if (v1.a.a(a10, v1.a.f37660e)) {
                    bVar = new l1.b(3);
                } else if (v1.a.a(a10, v1.a.f37658c) || v1.a.a(a10, v1.a.f37666k)) {
                    bVar = new l1.b(5);
                } else if (v1.a.a(a10, v1.a.f37659d) || v1.a.a(a10, v1.a.f37667l)) {
                    bVar = new l1.b(6);
                } else if (v1.a.a(a10, v1.a.f37662g) || v1.a.a(a10, v1.a.f37664i) || v1.a.a(a10, v1.a.f37668m)) {
                    bVar = new l1.b(7);
                } else if (v1.a.a(a10, v1.a.f37657b) || v1.a.a(a10, v1.a.f37665j)) {
                    bVar = new l1.b(8);
                } else {
                    bVar = null;
                }
                if (bVar != null && yk.j.S0(androidx.compose.ui.input.key.a.b(keyEvent), 2)) {
                    Boolean b10 = ((androidx.compose.ui.focus.b) a0Var.getFocusOwner()).b(bVar.f23884a, null, new c2.e1(bVar, z10 ? 1 : 0));
                    if (b10 != null) {
                        z11 = b10.booleanValue();
                    }
                    return Boolean.valueOf(z11);
                }
                return Boolean.FALSE;
            case 2:
                Function0 function0 = (Function0) obj;
                Handler handler = a0Var.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                }
                if (looper == Looper.myLooper()) {
                    function0.mo2invoke();
                } else {
                    Handler handler2 = a0Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new y(function0, 0));
                    }
                }
                return Unit.f23355a;
            default:
                return new c1(a0Var, a0Var.getTextInputService(), (qu.f0) obj);
        }
    }
}
