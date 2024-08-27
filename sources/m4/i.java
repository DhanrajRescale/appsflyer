package m4;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import t.j0;

/* loaded from: classes.dex */
public final class i implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27478b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f27477a = i10;
        this.f27478b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        int i10 = this.f27477a;
        Object obj = this.f27478b;
        switch (i10) {
            case 0:
                ((m) obj).f27488b.run();
                return;
            default:
                p4.c cVar = (p4.c) ((t9.c) ((p4.b) obj).f3178b).f35633b;
                long uptimeMillis = SystemClock.uptimeMillis();
                cVar.getClass();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = cVar.f30630b;
                    if (i11 < arrayList.size()) {
                        p4.a aVar = (p4.a) arrayList.get(i11);
                        if (aVar != null) {
                            j0 j0Var = cVar.f30629a;
                            Long l10 = (Long) j0Var.get(aVar);
                            if (l10 != null) {
                                if (l10.longValue() < uptimeMillis2) {
                                    j0Var.remove(aVar);
                                }
                            }
                            p4.h hVar = (p4.h) aVar;
                            long j11 = hVar.f30652h;
                            if (j11 == 0) {
                                hVar.f30652h = uptimeMillis;
                                hVar.c(hVar.f30646b);
                            } else {
                                hVar.f30652h = uptimeMillis;
                                boolean e10 = hVar.e(uptimeMillis - j11);
                                float min = Math.min(hVar.f30646b, Float.MAX_VALUE);
                                hVar.f30646b = min;
                                float max = Math.max(min, hVar.f30651g);
                                hVar.f30646b = max;
                                hVar.c(max);
                                if (e10) {
                                    hVar.b();
                                }
                            }
                        }
                        i11++;
                    } else {
                        if (cVar.f30633e) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                            cVar.f30633e = false;
                        }
                        if (arrayList.size() > 0) {
                            if (cVar.f30632d == null) {
                                cVar.f30632d = new p4.b(cVar.f30631c);
                            }
                            cVar.f30632d.h();
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
