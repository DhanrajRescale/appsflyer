package yu;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import vu.z;

/* loaded from: classes2.dex */
public final class k extends z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f41842e;

    public k(long j10, k kVar, int i10) {
        super(j10, kVar, i10);
        this.f41842e = new AtomicReferenceArray(j.f41841f);
    }

    @Override // vu.z
    public final int f() {
        return j.f41841f;
    }

    @Override // vu.z
    public final void g(int i10, CoroutineContext coroutineContext) {
        this.f41842e.set(i10, j.f41840e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f38412c + ", hashCode=" + hashCode() + ']';
    }
}
