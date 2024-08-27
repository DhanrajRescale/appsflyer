package nq;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f29094a;

    public f(TaskCompletionSource taskCompletionSource) {
        this.f29094a = taskCompletionSource;
    }

    @Override // nq.h
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // nq.h
    public final boolean b(oq.a aVar) {
        oq.c cVar = oq.c.f30259c;
        oq.c cVar2 = aVar.f30248b;
        if (cVar2 == cVar || cVar2 == oq.c.f30260d || cVar2 == oq.c.f30261e) {
            this.f29094a.trySetResult(aVar.f30247a);
            return true;
        }
        return false;
    }
}
