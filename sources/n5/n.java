package n5;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import j5.d0;

/* loaded from: classes.dex */
public final class n implements p {
    @Override // n5.p
    public final i b(l lVar, b5.v vVar) {
        if (vVar.f3655o == null) {
            return null;
        }
        return new t(new DrmSession$DrmSessionException(6001, new Exception()));
    }

    @Override // n5.p
    public final void c(Looper looper, d0 d0Var) {
    }

    @Override // n5.p
    public final int d(b5.v vVar) {
        if (vVar.f3655o != null) {
            return 1;
        }
        return 0;
    }
}
