package v5;

import android.os.SystemClock;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f37702a = 100;

    /* renamed from: b, reason: collision with root package name */
    public long f37703b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f37704c;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f37704c) == null) {
            this.f37704c = exc;
            this.f37703b = this.f37702a + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f37703b) {
            Exception exc2 = (Exception) this.f37704c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f37704c;
            this.f37704c = null;
            throw exc3;
        }
    }
}
