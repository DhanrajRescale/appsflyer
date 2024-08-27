package m4;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public transient g f27468a;

    public final void a(int i10) {
        synchronized (this) {
            try {
                g gVar = this.f27468a;
                if (gVar == null) {
                    return;
                }
                m mVar = (m) this;
                synchronized (gVar) {
                    try {
                        gVar.f27472d++;
                        int size = gVar.f27469a.size();
                        long[] jArr = gVar.f27471c;
                        int length = jArr == null ? -1 : jArr.length - 1;
                        gVar.c(mVar, i10, length);
                        gVar.b(mVar, i10, (length + 2) * 64, size, 0L);
                        int i11 = gVar.f27472d - 1;
                        gVar.f27472d = i11;
                        if (i11 == 0) {
                            long[] jArr2 = gVar.f27471c;
                            if (jArr2 != null) {
                                for (int length2 = jArr2.length - 1; length2 >= 0; length2--) {
                                    long j10 = gVar.f27471c[length2];
                                    if (j10 != 0) {
                                        gVar.d((length2 + 1) * 64, j10);
                                        gVar.f27471c[length2] = 0;
                                    }
                                }
                            }
                            long j11 = gVar.f27470b;
                            if (j11 != 0) {
                                gVar.d(0, j11);
                                gVar.f27470b = 0L;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } finally {
            }
        }
    }
}
