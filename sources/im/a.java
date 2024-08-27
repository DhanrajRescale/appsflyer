package im;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import dj.e;
import pp.g;
import zp.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static a f20112b;

    /* renamed from: a, reason: collision with root package name */
    public FirebaseAuth f20113a;

    public static boolean a(FirebaseAuth firebaseAuth, am.b bVar) {
        h hVar;
        if (bVar.f752l && (hVar = firebaseAuth.f11632f) != null && hVar.R()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [im.a, java.lang.Object] */
    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            try {
                if (f20112b == null) {
                    f20112b = new Object();
                }
                aVar = f20112b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public final FirebaseAuth c(am.b bVar) {
        g i10;
        if (this.f20113a == null) {
            zl.c a10 = zl.c.a(bVar.f741a);
            try {
                i10 = g.e("FUIScratchApp");
            } catch (IllegalStateException unused) {
                g gVar = a10.f42561a;
                gVar.a();
                gVar.a();
                i10 = g.i(gVar.f31271a, gVar.f31273c, "FUIScratchApp");
            }
            this.f20113a = FirebaseAuth.getInstance(i10);
        }
        return this.f20113a;
    }

    public final Task d(zp.d dVar, zp.d dVar2, am.b bVar) {
        return c(bVar).c(dVar).continueWithTask(new e(dVar2, 9));
    }
}
