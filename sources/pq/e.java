package pq;

import java.util.concurrent.TimeUnit;
import nq.i;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long f31303d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f31304e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final i f31305a = i.a();

    /* renamed from: b, reason: collision with root package name */
    public long f31306b;

    /* renamed from: c, reason: collision with root package name */
    public int f31307c;

    public final synchronized boolean a() {
        boolean z10;
        if (this.f31307c != 0) {
            this.f31305a.f29100a.getClass();
            if (System.currentTimeMillis() <= this.f31306b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void b(int i10) {
        long min;
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f31307c++;
            synchronized (this) {
                if (i10 != 429 && (i10 < 500 || i10 >= 600)) {
                    min = f31303d;
                } else {
                    double pow = Math.pow(2.0d, this.f31307c);
                    this.f31305a.getClass();
                    min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f31304e);
                }
                this.f31305a.f29100a.getClass();
                this.f31306b = System.currentTimeMillis() + min;
            }
            return;
        }
        synchronized (this) {
            this.f31307c = 0;
        }
        return;
    }
}
