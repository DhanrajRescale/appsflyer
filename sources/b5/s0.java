package b5;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import com.assetgro.stockgro.ui.profile.self.ImagePreviewActivity;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import m.a4;

/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements j, e5.j, e5.k, e5.d, n5.o, o5.t, kp.f, e.b, bq.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3585a;

    public /* synthetic */ s0(int i10) {
        this.f3585a = i10;
    }

    @Override // kp.f
    public Object apply(Object obj) {
        switch (this.f3585a) {
            case 0:
                return new j5.w((e5.b) obj);
            default:
                q6.q qVar = (q6.q) obj;
                int i10 = q6.n.f31734w;
                return qVar;
        }
    }

    @Override // e5.d
    public void b(Object obj) {
        ((r5.s0) obj).f33300b.release();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008b  */
    @Override // b5.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b5.k c(android.os.Bundle r36) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.s0.c(android.os.Bundle):b5.k");
    }

    @Override // e.b
    public void d(Object obj) {
        switch (this.f3585a) {
            case 0:
                int i10 = id.g.f19854k;
                return;
            case 1:
                int i11 = gf.e.f17361m;
                return;
            default:
                int i12 = ImagePreviewActivity.f10046n;
                int i13 = ((e.a) obj).f14610a;
                return;
        }
    }

    @Override // e5.k
    public void e(Object obj, t tVar) {
    }

    @Override // o5.t
    public int g(Object obj) {
        switch (this.f3585a) {
            case 27:
                Pattern pattern = o5.u.f29679a;
                String str = ((o5.m) obj).f29630a;
                if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
                    if (e5.x.f15050a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            default:
                Pattern pattern2 = o5.u.f29679a;
                return ((o5.m) obj).f29630a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    @Override // bq.d
    public Object h(a4 a4Var) {
        switch (this.f3585a) {
            case 0:
                return AbtRegistrar.a(a4Var);
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.f11661a.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.f11663c.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.f11662b.get();
            case 4:
                bq.l lVar = ExecutorsRegistrar.f11661a;
                return cq.k.f13068a;
            case 5:
                return TransportRegistrar.a(a4Var);
            case 6:
                return FirebaseInstallationsRegistrar.a(a4Var);
            case 7:
                return FirebaseMessagingRegistrar.a(a4Var);
            case 8:
                return FirebasePerfRegistrar.a(a4Var);
            default:
                Set f10 = a4Var.f(bq.p.a(hr.a.class));
                hr.c cVar = hr.c.f18688c;
                if (cVar == null) {
                    synchronized (hr.c.class) {
                        try {
                            cVar = hr.c.f18688c;
                            if (cVar == null) {
                                cVar = new hr.c(0);
                                hr.c.f18688c = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new hr.b(f10, cVar);
        }
    }

    @Override // e5.j
    public void invoke(Object obj) {
        y0 y0Var = (y0) obj;
        switch (this.f3585a) {
            case 20:
                int i10 = i5.g0.f19446j0;
                y0Var.q(new ExoPlaybackException(2, 1003, new ExoTimeoutException(1)));
                return;
            default:
                y0Var.y();
                return;
        }
    }

    @Override // n5.o
    public void release() {
    }
}
