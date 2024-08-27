package v5;

import android.os.Looper;
import android.os.SystemClock;
import e5.v;
import e5.x;
import h.q0;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class o implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final j f37753d = new j(2, -9223372036854775807L, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final j f37754e = new j(3, -9223372036854775807L, 0);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f37755a;

    /* renamed from: b, reason: collision with root package name */
    public l f37756b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f37757c;

    public o(String str) {
        String concat = "ExoPlayer:Loader:".concat(str);
        int i10 = x.f15050a;
        this.f37755a = Executors.newSingleThreadExecutor(new v(concat));
    }

    public static j a(long j10, boolean z10) {
        return new j(z10 ? 1 : 0, j10, 0);
    }

    public final boolean b() {
        return this.f37756b != null;
    }

    @Override // v5.p
    public final void c() {
        IOException iOException;
        IOException iOException2 = this.f37757c;
        if (iOException2 == null) {
            l lVar = this.f37756b;
            if (lVar != null && (iOException = lVar.f37747e) != null && lVar.f37748f > lVar.f37743a) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public final void d(n nVar) {
        l lVar = this.f37756b;
        if (lVar != null) {
            lVar.a(true);
        }
        ExecutorService executorService = this.f37755a;
        if (nVar != null) {
            executorService.execute(new q0(nVar, 10));
        }
        executorService.shutdown();
    }

    public final long e(m mVar, k kVar, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        yk.j.I0(myLooper);
        this.f37757c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l lVar = new l(this, myLooper, mVar, kVar, i10, elapsedRealtime);
        if (this.f37756b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        this.f37756b = lVar;
        lVar.f37747e = null;
        this.f37755a.execute(lVar);
        return elapsedRealtime;
    }
}
