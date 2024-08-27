package le;

import ek.u;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f24611b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(d dVar, int i10) {
        super(0);
        this.f24610a = i10;
        this.f24611b = dVar;
    }

    public final void a() {
        int i10 = this.f24610a;
        d dVar = this.f24611b;
        switch (i10) {
            case 0:
                Object[] objArr = new Object[0];
                Intrinsics.checkNotNullParameter("SocketConnectionManager", "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g("Socket Opened", "s", objArr, "params", "SocketConnectionManager").getClass();
                u.k(objArr);
                if (dVar != null) {
                    dVar.e(true);
                    return;
                }
                return;
            case 1:
                Object[] objArr2 = new Object[0];
                Intrinsics.checkNotNullParameter("SocketConnectionManager", "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g("Socket Closed", "s", objArr2, "params", "SocketConnectionManager").getClass();
                u.k(objArr2);
                if (dVar != null) {
                    dVar.e(false);
                    return;
                }
                return;
            default:
                if (dVar != null) {
                    dVar.e(false);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f24610a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
