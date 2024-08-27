package v5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class l extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final int f37743a;

    /* renamed from: b, reason: collision with root package name */
    public final m f37744b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37745c;

    /* renamed from: d, reason: collision with root package name */
    public k f37746d;

    /* renamed from: e, reason: collision with root package name */
    public IOException f37747e;

    /* renamed from: f, reason: collision with root package name */
    public int f37748f;

    /* renamed from: g, reason: collision with root package name */
    public Thread f37749g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f37750h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f37751i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f37752j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, Looper looper, m mVar, k kVar, int i10, long j10) {
        super(looper);
        this.f37752j = oVar;
        this.f37744b = mVar;
        this.f37746d = kVar;
        this.f37743a = i10;
        this.f37745c = j10;
    }

    public final void a(boolean z10) {
        this.f37751i = z10;
        this.f37747e = null;
        if (hasMessages(0)) {
            this.f37750h = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f37750h = true;
                    this.f37744b.f();
                    Thread thread = this.f37749g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.f37752j.f37756b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            k kVar = this.f37746d;
            kVar.getClass();
            kVar.h(this.f37744b, elapsedRealtime, elapsedRealtime - this.f37745c, true);
            this.f37746d = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f37751i) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.f37747e = null;
            o oVar = this.f37752j;
            ExecutorService executorService = oVar.f37755a;
            l lVar = oVar.f37756b;
            lVar.getClass();
            executorService.execute(lVar);
            return;
        }
        if (i10 != 3) {
            this.f37752j.f37756b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f37745c;
            k kVar = this.f37746d;
            kVar.getClass();
            if (this.f37750h) {
                kVar.h(this.f37744b, elapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.f37747e = iOException;
                    int i12 = this.f37748f + 1;
                    this.f37748f = i12;
                    j b10 = kVar.b(this.f37744b, elapsedRealtime, j10, iOException, i12);
                    int i13 = b10.f37741a;
                    if (i13 == 3) {
                        this.f37752j.f37757c = this.f37747e;
                        return;
                    }
                    if (i13 != 2) {
                        if (i13 == 1) {
                            this.f37748f = 1;
                        }
                        long j11 = b10.f37742b;
                        if (j11 == -9223372036854775807L) {
                            j11 = Math.min((this.f37748f - 1) * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, 5000);
                        }
                        o oVar2 = this.f37752j;
                        if (oVar2.f37756b != null) {
                            z10 = false;
                        }
                        yk.j.H0(z10);
                        oVar2.f37756b = this;
                        if (j11 > 0) {
                            sendEmptyMessageDelayed(0, j11);
                            return;
                        } else {
                            this.f37747e = null;
                            oVar2.f37755a.execute(this);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            try {
                kVar.j(this.f37744b, elapsedRealtime, j10);
                return;
            } catch (RuntimeException e10) {
                e5.m.d("LoadTask", "Unexpected exception handling load completed", e10);
                this.f37752j.f37757c = new Loader$UnexpectedLoaderException(e10);
                return;
            }
        }
        throw ((Error) message.obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.f37750h;
                this.f37749g = Thread.currentThread();
            }
            if (z10) {
                e5.a.a("load:".concat(this.f37744b.getClass().getSimpleName()));
                try {
                    this.f37744b.e();
                    e5.a.i();
                } catch (Throwable th2) {
                    e5.a.i();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f37749g = null;
                Thread.interrupted();
            }
            if (!this.f37751i) {
                sendEmptyMessage(1);
            }
        } catch (IOException e10) {
            if (!this.f37751i) {
                obtainMessage(2, e10).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f37751i) {
                e5.m.d("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(3, e11).sendToTarget();
            }
            throw e11;
        } catch (Exception e12) {
            if (!this.f37751i) {
                e5.m.d("LoadTask", "Unexpected exception loading stream", e12);
                obtainMessage(2, new Loader$UnexpectedLoaderException(e12)).sendToTarget();
            }
        } catch (OutOfMemoryError e13) {
            if (!this.f37751i) {
                e5.m.d("LoadTask", "OutOfMemory error loading stream", e13);
                obtainMessage(2, new Loader$UnexpectedLoaderException(e13)).sendToTarget();
            }
        }
    }
}
