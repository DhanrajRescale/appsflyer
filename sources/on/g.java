package on;

import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import i5.w;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f30134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jn.i f30135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f30137d;

    public /* synthetic */ g(h hVar, jn.i iVar, int i10, Runnable runnable) {
        this.f30134a = hVar;
        this.f30135b = iVar;
        this.f30136c = i10;
        this.f30137d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jn.i iVar = this.f30135b;
        int i10 = this.f30136c;
        Runnable runnable = this.f30137d;
        h hVar = this.f30134a;
        j jVar = hVar.f30141d;
        qn.b bVar = hVar.f30143f;
        try {
            try {
                pn.d dVar = hVar.f30140c;
                Objects.requireNonNull(dVar);
                ((pn.j) bVar).g(new dj.e(dVar, 15));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) hVar.f30138a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    hVar.a(iVar, i10);
                } else {
                    pn.j jVar2 = (pn.j) bVar;
                    SQLiteDatabase a10 = jVar2.a();
                    jVar2.f(new dj.e(a10, 18), new w(11));
                    try {
                        ((c) jVar).a(iVar, i10 + 1, false);
                        a10.setTransactionSuccessful();
                    } finally {
                        a10.endTransaction();
                    }
                }
            } catch (SynchronizationException unused) {
                ((c) jVar).a(iVar, i10 + 1, false);
            }
            runnable.run();
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }
}
