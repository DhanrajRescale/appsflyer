package b3;

import android.os.Handler;
import android.os.Looper;
import d2.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f3133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i10) {
        super(1);
        this.f3132a = i10;
        this.f3133b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f3132a;
        n nVar = this.f3133b;
        switch (i10) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
                    function0.mo2invoke();
                } else {
                    Handler handler = nVar.f3135b;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        nVar.f3135b = handler;
                    }
                    handler.post(new y(function0, 4));
                }
                return Unit.f23355a;
            default:
                nVar.f3137d = true;
                return Unit.f23355a;
        }
    }
}
