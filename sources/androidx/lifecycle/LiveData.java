package androidx.lifecycle;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private o.g mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public LiveData(T t10) {
        this.mDataLock = new Object();
        this.mObservers = new o.g();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new y(this);
        this.mData = t10;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        n.b.u0().f28109g.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException(nn.d.k("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void considerNotify(b0 b0Var) {
        if (!b0Var.f1882b) {
            return;
        }
        if (!b0Var.i()) {
            b0Var.a(false);
            return;
        }
        int i10 = b0Var.f1883c;
        int i11 = this.mVersion;
        if (i10 >= i11) {
            return;
        }
        b0Var.f1883c = i11;
        b0Var.f1881a.d(this.mData);
    }

    public void changeActiveCounter(int i10) {
        boolean z10;
        boolean z11;
        int i11 = this.mActiveCount;
        this.mActiveCount = i10 + i11;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i12 = this.mActiveCount;
                if (i11 != i12) {
                    if (i11 == 0 && i12 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 > 0 && i12 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10) {
                        onActive();
                    } else if (z11) {
                        onInactive();
                    }
                    i11 = i12;
                } else {
                    this.mChangingActiveState = false;
                    return;
                }
            } catch (Throwable th2) {
                this.mChangingActiveState = false;
                throw th2;
            }
        }
    }

    public void dispatchingValue(b0 b0Var) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (b0Var != null) {
                considerNotify(b0Var);
                b0Var = null;
            } else {
                o.g gVar = this.mObservers;
                gVar.getClass();
                o.d dVar = new o.d(gVar);
                gVar.f29337c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    considerNotify((b0) ((Map.Entry) dVar.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t10 = (T) this.mData;
        if (t10 != NOT_SET) {
            return t10;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        if (this.mObservers.f29338d > 0) {
            return true;
        }
        return false;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(@NonNull t tVar, @NonNull f0 f0Var) {
        assertMainThread("observe");
        if (tVar.getLifecycle().b() == n.f1947a) {
            return;
        }
        a0 a0Var = new a0(this, tVar, f0Var);
        b0 b0Var = (b0) this.mObservers.e(f0Var, a0Var);
        if (b0Var != null && !b0Var.h(tVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b0Var != null) {
            return;
        }
        tVar.getLifecycle().a(a0Var);
    }

    public void observeForever(@NonNull f0 f0Var) {
        assertMainThread("observeForever");
        b0 b0Var = new b0(this, f0Var);
        b0 b0Var2 = (b0) this.mObservers.e(f0Var, b0Var);
        if (!(b0Var2 instanceof a0)) {
            if (b0Var2 != null) {
                return;
            }
            b0Var.a(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t10) {
        boolean z10;
        synchronized (this.mDataLock) {
            if (this.mPendingData == NOT_SET) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.mPendingData = t10;
        }
        if (!z10) {
            return;
        }
        n.b.u0().w0(this.mPostValueRunnable);
    }

    public void removeObserver(@NonNull f0 f0Var) {
        assertMainThread("removeObserver");
        b0 b0Var = (b0) this.mObservers.g(f0Var);
        if (b0Var == null) {
            return;
        }
        b0Var.e();
        b0Var.a(false);
    }

    public void removeObservers(@NonNull t tVar) {
        assertMainThread("removeObservers");
        Iterator it = this.mObservers.iterator();
        while (true) {
            o.e eVar = (o.e) it;
            if (eVar.hasNext()) {
                Map.Entry entry = (Map.Entry) eVar.next();
                if (((b0) entry.getValue()).h(tVar)) {
                    removeObserver((f0) entry.getKey());
                }
            } else {
                return;
            }
        }
    }

    public void setValue(T t10) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t10;
        dispatchingValue(null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new o.g();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new y(this);
        this.mData = obj;
        this.mVersion = -1;
    }
}
