package qu;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class b0 extends kotlin.coroutines.a implements kotlin.coroutines.f {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f32183b = new a0(0);

    public b0() {
        super(kotlin.coroutines.f.O);
    }

    public abstract void b0(CoroutineContext coroutineContext, Runnable runnable);

    public void c0(CoroutineContext coroutineContext, Runnable runnable) {
        b0(coroutineContext, runnable);
    }

    public boolean d0() {
        return !(this instanceof p2);
    }

    public b0 e0(int i10) {
        hl.f.C(i10);
        return new vu.n(this, i10);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element g(kotlin.coroutines.i key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            bVar.getClass();
            kotlin.coroutines.i key2 = this.f23358a;
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 != bVar && bVar.f23360b != key2) {
                return null;
            }
            Intrinsics.checkNotNullParameter(this, "element");
            CoroutineContext.Element element = (CoroutineContext.Element) bVar.f23359a.invoke(this);
            if (!(element instanceof CoroutineContext.Element)) {
                return null;
            }
            return element;
        }
        if (kotlin.coroutines.f.O != key) {
            return null;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + i0.w(this);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext z(kotlin.coroutines.i key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            bVar.getClass();
            kotlin.coroutines.i key2 = this.f23358a;
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 == bVar || bVar.f23360b == key2) {
                Intrinsics.checkNotNullParameter(this, "element");
                if (((CoroutineContext.Element) bVar.f23359a.invoke(this)) != null) {
                    return kotlin.coroutines.k.f23369a;
                }
            }
        } else if (kotlin.coroutines.f.O == key) {
            return kotlin.coroutines.k.f23369a;
        }
        return this;
    }
}
