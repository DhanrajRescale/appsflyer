package uq;

import com.google.android.gms.common.util.VisibleForTesting;
import gr.i;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class c implements a {
    private final b appStateMonitor;
    private boolean isRegisteredForAppState = false;
    private i currentAppState = i.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<a> appStateCallback = new WeakReference<>(this);

    public c(b bVar) {
        this.appStateMonitor = bVar;
    }

    public i getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public WeakReference<a> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i10) {
        this.appStateMonitor.f37339h.addAndGet(i10);
    }

    @Override // uq.a
    public void onUpdateAppState(i iVar) {
        i iVar2 = this.currentAppState;
        i iVar3 = i.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (iVar2 == iVar3) {
            this.currentAppState = iVar;
        } else {
            if (iVar2 == iVar || iVar == iVar3) {
                return;
            }
            this.currentAppState = i.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        b bVar = this.appStateMonitor;
        this.currentAppState = bVar.f37346o;
        WeakReference<a> weakReference = this.appStateCallback;
        synchronized (bVar.f37337f) {
            bVar.f37337f.add(weakReference);
        }
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (!this.isRegisteredForAppState) {
            return;
        }
        b bVar = this.appStateMonitor;
        WeakReference<a> weakReference = this.appStateCallback;
        synchronized (bVar.f37337f) {
            bVar.f37337f.remove(weakReference);
        }
        this.isRegisteredForAppState = false;
    }
}
