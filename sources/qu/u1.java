package qu;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u1 implements i1 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32278b = AtomicIntegerFieldUpdater.newUpdater(u1.class, "_isCompleting$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32279c = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_rootCause$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32280d = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final c2 f32281a;

    public u1(c2 c2Var, Throwable th2) {
        this.f32281a = c2Var;
        this._rootCause$volatile = th2;
    }

    public final void a(Throwable th2) {
        Throwable c10 = c();
        if (c10 == null) {
            f32279c.set(this, th2);
            return;
        }
        if (th2 == c10) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32280d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th2);
            return;
        }
        if (obj instanceof Throwable) {
            if (th2 == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th2);
            atomicReferenceFieldUpdater.set(this, arrayList);
            return;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(th2);
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
    }

    @Override // qu.i1
    public final boolean b() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    public final Throwable c() {
        return (Throwable) f32279c.get(this);
    }

    @Override // qu.i1
    public final c2 d() {
        return this.f32281a;
    }

    public final boolean e() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (f32278b.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final ArrayList g(Throwable th2) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32280d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable c10 = c();
        if (c10 != null) {
            arrayList.add(0, c10);
        }
        if (th2 != null && !Intrinsics.a(th2, c10)) {
            arrayList.add(th2);
        }
        atomicReferenceFieldUpdater.set(this, y1.f32305e);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + f32280d.get(this) + ", list=" + this.f32281a + ']';
    }
}
