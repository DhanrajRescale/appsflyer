package d9;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import ut.l;

/* loaded from: classes.dex */
public final class f implements Callback, Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final Call f14224a;

    /* renamed from: b, reason: collision with root package name */
    public final qu.h f14225b;

    public f(Call call, qu.i iVar) {
        this.f14224a = call;
        this.f14225b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        try {
            this.f14224a.cancel();
        } catch (Throwable unused) {
        }
        return Unit.f23355a;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        if (!call.getCanceled()) {
            l.Companion companion = ut.l.INSTANCE;
            this.f14225b.resumeWith(ut.n.a(iOException));
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        l.Companion companion = ut.l.INSTANCE;
        this.f14225b.resumeWith(response);
    }
}
