package g7;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17002a;

    /* JADX WARN: Type inference failed for: r0v0, types: [au.i, yt.a, g7.p1] */
    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        ?? iVar = new au.i(2, aVar);
        iVar.f17002a = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p1) create((j1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        j1 j1Var = (j1) this.f17002a;
        if (Log.isLoggable("Paging", 2)) {
            String message = "Sent " + j1Var;
            Intrinsics.checkNotNullParameter(message, "message");
            Log.v("Paging", message, null);
        }
        return Unit.f23355a;
    }
}
