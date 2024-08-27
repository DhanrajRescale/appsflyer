package m4;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j implements f0, e {

    /* renamed from: a, reason: collision with root package name */
    public final n f27479a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f27480b = null;

    public j(m mVar, int i10, ReferenceQueue referenceQueue) {
        this.f27479a = new n(mVar, i10, this, referenceQueue);
    }

    @Override // m4.e
    public final void a(e0 e0Var) {
        t tVar;
        WeakReference weakReference = this.f27480b;
        if (weakReference == null) {
            tVar = null;
        } else {
            tVar = (t) weakReference.get();
        }
        if (tVar != null) {
            e0Var.observe(tVar, this);
        }
    }

    @Override // m4.e
    public final void b(t tVar) {
        t tVar2;
        WeakReference weakReference = this.f27480b;
        if (weakReference == null) {
            tVar2 = null;
        } else {
            tVar2 = (t) weakReference.get();
        }
        LiveData liveData = (LiveData) this.f27479a.f27502c;
        if (liveData != null) {
            if (tVar2 != null) {
                liveData.removeObserver(this);
            }
            if (tVar != null) {
                liveData.observe(tVar, this);
            }
        }
        if (tVar != null) {
            this.f27480b = new WeakReference(tVar);
        }
    }

    @Override // m4.e
    public final void c(Object obj) {
        ((LiveData) obj).removeObserver(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.f0
    public final void d(Object obj) {
        n nVar = this.f27479a;
        m mVar = (m) nVar.get();
        if (mVar == null) {
            nVar.a();
        }
        if (mVar != null) {
            Object obj2 = nVar.f27502c;
            if (!mVar.f27499m && mVar.k(nVar.f27501b, 0, obj2)) {
                mVar.m();
            }
        }
    }
}
