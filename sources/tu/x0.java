package tu;

import com.google.android.gms.common.api.Api;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public abstract class x0 {

    /* renamed from: a */
    public static final kp.g f36585a = new kp.g("NO_VALUE", 1);

    public static final w0 a(int i10, int i11, su.a aVar) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                if (i10 <= 0 && i11 <= 0 && aVar != su.a.f34776a) {
                    throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
                }
                int i12 = i11 + i10;
                if (i12 < 0) {
                    i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                return new w0(i10, i12, aVar);
            }
            throw new IllegalArgumentException(jr.h.n("extraBufferCapacity cannot be negative, but was ", i11).toString());
        }
        throw new IllegalArgumentException(jr.h.n("replay cannot be negative, but was ", i10).toString());
    }

    public static /* synthetic */ w0 b(int i10, int i11, int i12) {
        su.a aVar = su.a.f34777b;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            aVar = su.a.f34776a;
        }
        return a(i10, i11, aVar);
    }

    public static final void c(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }

    public static final f d(t0 t0Var, CoroutineContext coroutineContext, int i10, su.a aVar) {
        if ((i10 == 0 || i10 == -3) && aVar == su.a.f34776a) {
            return t0Var;
        }
        return new uu.h(i10, coroutineContext, aVar, t0Var);
    }
}
