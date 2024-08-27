package os;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ls.n0;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class u implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ls.d0 f30392a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f30393b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f30394c;

    /* renamed from: d, reason: collision with root package name */
    public final d f30395d;

    /* renamed from: f, reason: collision with root package name */
    public final h8.h f30397f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f30398g;

    /* renamed from: h, reason: collision with root package name */
    public final t f30399h;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.firebase.messaging.t f30396e = new com.google.firebase.messaging.t(13);

    /* renamed from: i, reason: collision with root package name */
    public final float f30400i = Resources.getSystem().getDisplayMetrics().scaledDensity;

    /* renamed from: j, reason: collision with root package name */
    public final Set f30401j = Collections.newSetFromMap(new ConcurrentHashMap());

    public u(Context context, String str, n0 n0Var, h8.h hVar) {
        this.f30392a = ls.d0.a(context);
        this.f30393b = context;
        this.f30397f = hVar;
        this.f30398g = n0Var.f25269k;
        HandlerThread handlerThread = new HandlerThread(u.class.getCanonicalName());
        handlerThread.setPriority(10);
        handlerThread.start();
        t tVar = new t(this, context, str, handlerThread.getLooper(), this);
        this.f30399h = tVar;
        this.f30395d = new d(n0Var, tVar);
        this.f30394c = n0Var;
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new q(this));
        o oVar = new o(this);
        synchronized (hVar) {
            ((List) hVar.f18059e).add(oVar);
        }
    }

    @Override // os.n
    public final void a(JSONArray jSONArray) {
        if (jSONArray != null) {
            t tVar = this.f30399h;
            Message obtainMessage = tVar.obtainMessage(5);
            obtainMessage.obj = jSONArray;
            tVar.sendMessage(obtainMessage);
        }
    }

    @Override // os.n
    public final void b(JSONArray jSONArray) {
        if (jSONArray != null) {
            t tVar = this.f30399h;
            Message obtainMessage = tVar.obtainMessage(13);
            obtainMessage.obj = jSONArray;
            tVar.sendMessage(obtainMessage);
        }
    }

    @Override // os.n
    public final void c() {
        this.f30399h.f30378d.unlock();
        g();
    }

    @Override // os.n
    public final void g() {
        t tVar = this.f30399h;
        tVar.sendMessage(tVar.obtainMessage(0));
    }

    @Override // os.n
    public final void j(JSONArray jSONArray) {
        if (jSONArray != null) {
            t tVar = this.f30399h;
            Message obtainMessage = tVar.obtainMessage(9);
            obtainMessage.obj = jSONArray;
            tVar.sendMessage(obtainMessage);
        }
    }
}
