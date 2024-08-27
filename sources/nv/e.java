package nv;

import kotlin.Unit;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class e implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final e f29199a = new Object();

    @Override // nv.o
    public final Object e(Object obj) {
        ((ResponseBody) obj).close();
        return Unit.f23355a;
    }
}
