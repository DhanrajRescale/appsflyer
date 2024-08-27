package k5;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import i5.g1;
import i5.m0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22099a;

    /* renamed from: b, reason: collision with root package name */
    public final r f22100b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f22101c;

    /* renamed from: d, reason: collision with root package name */
    public final e f22102d;

    /* renamed from: e, reason: collision with root package name */
    public final h.a0 f22103e;

    /* renamed from: f, reason: collision with root package name */
    public final f f22104f;

    /* renamed from: g, reason: collision with root package name */
    public c f22105g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22106h;

    public g(Context context, r rVar) {
        e eVar;
        h.a0 a0Var;
        Uri uri;
        Context applicationContext = context.getApplicationContext();
        this.f22099a = applicationContext;
        this.f22100b = rVar;
        int i10 = e5.x.f15050a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f22101c = handler;
        int i11 = e5.x.f15050a;
        if (i11 >= 23) {
            eVar = new e(this);
        } else {
            eVar = null;
        }
        this.f22102d = eVar;
        if (i11 >= 21) {
            a0Var = new h.a0(this);
        } else {
            a0Var = null;
        }
        this.f22103e = a0Var;
        if (c.a()) {
            uri = Settings.Global.getUriFor("external_surround_sound_enabled");
        } else {
            uri = null;
        }
        this.f22104f = uri != null ? new f(this, handler, applicationContext.getContentResolver(), uri) : null;
    }

    public static void a(g gVar, c cVar) {
        boolean z10;
        g1 g1Var;
        boolean z11;
        m0 m0Var;
        if (gVar.f22106h && !cVar.equals(gVar.f22105g)) {
            gVar.f22105g = cVar;
            e0 e0Var = gVar.f22100b.f22198a;
            if (e0Var.f22069f0 == Looper.myLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            yk.j.H0(z10);
            if (!cVar.equals(e0Var.e())) {
                e0Var.f22086w = cVar;
                hr.c cVar2 = e0Var.f22081r;
                if (cVar2 != null) {
                    h0 h0Var = (h0) cVar2.f18690b;
                    synchronized (h0Var.f19408a) {
                        g1Var = h0Var.f19421n;
                    }
                    if (g1Var != null) {
                        u5.p pVar = (u5.p) g1Var;
                        synchronized (pVar.f36829c) {
                            z11 = pVar.f36833g.f36790e0;
                        }
                        if (z11 && (m0Var = pVar.f36845a) != null) {
                            m0Var.f19558h.d(26);
                        }
                    }
                }
            }
        }
    }
}
