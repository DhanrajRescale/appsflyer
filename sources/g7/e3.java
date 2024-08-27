package g7;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e3 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16738a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f3 f16739b;

    public e3(f3 f3Var) {
        this.f16739b = f3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 listener;
        c0 loadStates = (c0) obj;
        Intrinsics.checkNotNullParameter(loadStates, "loadStates");
        if (this.f16738a) {
            this.f16738a = false;
        } else if (loadStates.f16685d.f16646a instanceof y0) {
            f3 f3Var = this.f16739b;
            if (f3Var.f22653c == k7.y0.f22626c && !f3Var.f16766d) {
                f3Var.r(k7.y0.f22624a);
            }
            Intrinsics.checkNotNullParameter(this, "listener");
            m mVar = f3Var.f16767e;
            mVar.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            CopyOnWriteArrayList copyOnWriteArrayList = mVar.f16907j;
            copyOnWriteArrayList.remove(this);
            if (copyOnWriteArrayList.isEmpty() && (listener = (Function1) mVar.f16906i.get()) != null) {
                i iVar = mVar.f16903f;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                h.c cVar = iVar.f16985e;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                ((CopyOnWriteArrayList) cVar.f17583b).remove(listener);
            }
        }
        return Unit.f23355a;
    }
}
