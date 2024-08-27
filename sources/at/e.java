package at;

import java.util.concurrent.TimeUnit;
import mt.x;

/* loaded from: classes2.dex */
public abstract class e implements f {
    public static mt.j a(long j10, TimeUnit timeUnit) {
        l lVar = st.e.f34774b;
        if (timeUnit != null) {
            if (lVar != null) {
                return new mt.j(Math.max(0L, j10), Math.max(0L, j10), timeUnit, lVar);
            }
            throw new NullPointerException("scheduler is null");
        }
        throw new NullPointerException("unit is null");
    }

    public static e d(int i10) {
        if (i10 >= 0) {
            if (i10 == 0) {
                return mt.d.f28006a;
            }
            if (i10 == 1) {
                if (0 != null) {
                    return new mt.k(0);
                }
                throw new NullPointerException("item is null");
            }
            if (0 + (i10 - 1) <= 2147483647L) {
                return new mt.n(i10);
            }
            throw new IllegalArgumentException("Integer overflow");
        }
        throw new IllegalArgumentException(jr.h.n("count >= 0 required but it was ", i10));
    }

    public static x h(e eVar, mt.j jVar, et.b bVar) {
        ll.o oVar = new ll.o(bVar, 20);
        int i10 = c.f2779a;
        f[] fVarArr = {eVar, jVar};
        gt.e.b(i10, "bufferSize");
        return new x(fVarArr, oVar, i10);
    }

    public final void e(g gVar) {
        if (gVar != null) {
            try {
                f(gVar);
                return;
            } catch (NullPointerException e10) {
                throw e10;
            } catch (Throwable th2) {
                zq.f.l0(th2);
                yk.g.M(th2);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th2);
                throw nullPointerException;
            }
        }
        throw new NullPointerException("observer is null");
    }

    public abstract void f(g gVar);

    public final mt.f g(l lVar) {
        if (lVar != null) {
            return new mt.f(this, lVar, 2);
        }
        throw new NullPointerException("scheduler is null");
    }
}
