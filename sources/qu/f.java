package qu;

import java.util.concurrent.Future;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32202a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f32203b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f32202a = i10;
        this.f32203b = obj;
    }

    public final String toString() {
        int i10 = this.f32202a;
        Object obj = this.f32203b;
        switch (i10) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) obj).getClass().getSimpleName() + '@' + i0.w(this) + ']';
            default:
                return "DisposeOnCancel[" + ((t0) obj) + ']';
        }
    }
}
