package v5;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f37711a;

    public final void a(int i10) {
        int i11;
        h hVar = this.f37711a;
        synchronized (hVar) {
            int i12 = hVar.f37732i;
            if (i12 == 0 || hVar.f37728e) {
                if (i12 != i10) {
                    hVar.f37732i = i10;
                    if (i10 != 1 && i10 != 0 && i10 != 8) {
                        hVar.f37735l = hVar.b(i10);
                        ((e5.r) hVar.f37727d).getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (hVar.f37729f > 0) {
                            i11 = (int) (elapsedRealtime - hVar.f37730g);
                        } else {
                            i11 = 0;
                        }
                        hVar.c(i11, hVar.f37731h, hVar.f37735l);
                        hVar.f37730g = elapsedRealtime;
                        hVar.f37731h = 0L;
                        hVar.f37734k = 0L;
                        hVar.f37733j = 0L;
                        t tVar = hVar.f37726c;
                        tVar.f37770b.clear();
                        tVar.f37772d = -1;
                        tVar.f37773e = 0;
                        tVar.f37774f = 0;
                    }
                }
            }
        }
    }
}
