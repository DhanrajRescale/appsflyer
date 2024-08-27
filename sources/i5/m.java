package i5;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19547a;

    /* renamed from: b, reason: collision with root package name */
    public final yq.b f19548b = new yq.b();

    public m(Context context) {
        this.f19547a = context;
    }

    @Override // i5.i1
    public final f[] a(Handler handler, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4) {
        ArrayList arrayList = new ArrayList();
        Context context = this.f19547a;
        com.google.firebase.messaging.m mVar = o5.q.R;
        arrayList.add(new x5.g(context, this.f19548b, mVar, handler, d0Var));
        k5.x xVar = new k5.x(this.f19547a);
        xVar.f22204d = false;
        xVar.f22205e = false;
        xVar.f22206f = 0;
        if (xVar.f22203c == null) {
            xVar.f22203c = new h.c(new c5.c[0]);
        }
        arrayList.add(new k5.h0(this.f19547a, this.f19548b, mVar, handler, d0Var2, new k5.e0(xVar)));
        arrayList.add(new t5.f(d0Var3, handler.getLooper()));
        arrayList.add(new p5.b(d0Var4, handler.getLooper()));
        arrayList.add(new y5.b());
        return (f[]) arrayList.toArray(new f[0]);
    }
}
