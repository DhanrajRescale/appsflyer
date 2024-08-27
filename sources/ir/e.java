package ir;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f20509a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z10) {
        Clock clock = f.f20510j;
        synchronized (f.class) {
            Iterator it = f.f20512l.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).d(z10);
            }
        }
    }
}
