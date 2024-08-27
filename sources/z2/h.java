package z2;

import android.os.Handler;
import android.os.Looper;
import d2.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f41931b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(r rVar, int i10) {
        super(1);
        this.f41930a = i10;
        this.f41931b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Looper looper;
        int i10 = this.f41930a;
        r rVar = this.f41931b;
        switch (i10) {
            case 0:
                a2.u G = ((a2.u) obj).G();
                Intrinsics.c(G);
                rVar.l(G);
                return Unit.f23355a;
            case 1:
                rVar.m161setPopupContentSizefhxjrPA(new w2.j(((w2.j) obj).f38798a));
                rVar.m();
                return Unit.f23355a;
            default:
                Function0 function0 = (Function0) obj;
                Handler handler = rVar.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    function0.mo2invoke();
                } else {
                    Handler handler2 = rVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new y(function0, 3));
                    }
                }
                return Unit.f23355a;
        }
    }
}
