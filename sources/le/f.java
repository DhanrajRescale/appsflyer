package le;

import ek.u;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;

/* loaded from: classes.dex */
public final class f extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f24612a = new k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Throwable throwable = (Throwable) obj;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Object[] objArr = {throwable};
        Intrinsics.checkNotNullParameter("SocketConnectionManager", "tag");
        com.google.android.gms.internal.p002firebaseauthapi.a.g("Socket Errored " + ((Response) obj2), "s", objArr, "params", "SocketConnectionManager").getClass();
        u.k(objArr);
        return Unit.f23355a;
    }
}
