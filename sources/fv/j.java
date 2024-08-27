package fv;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.WebSocket;
import vt.p0;

/* loaded from: classes2.dex */
public final class j extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f16307b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, int i10) {
        super(0);
        this.f16306a = i10;
        this.f16307b = mVar;
    }

    public final void a() {
        int i10 = this.f16306a;
        int i11 = 0;
        m mVar = this.f16307b;
        switch (i10) {
            case 0:
                mVar.d("Socket attempting to reconnect");
                mVar.f(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, null, new hj.b(this, 5));
                return;
            case 1:
                mVar.d("Transport: Connected to " + mVar.f16316a);
                mVar.f16332q = false;
                if (mVar.c()) {
                    ArrayList arrayList = mVar.f16327l;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Function0) it.next()).mo2invoke();
                        }
                        arrayList.clear();
                    }
                }
                mVar.f16331p.a();
                mVar.f16330o = null;
                i iVar = mVar.f16329n;
                if (iVar != null) {
                    iVar.f16305a.cancel(true);
                }
                mVar.f16329n = null;
                long j10 = mVar.f16319d;
                TimeUnit unit = TimeUnit.MILLISECONDS;
                int i12 = 2;
                j jVar = new j(mVar, i12);
                h hVar = mVar.f16323h;
                hVar.getClass();
                Intrinsics.e(unit, "unit");
                ScheduledFuture<?> scheduledFuture = hVar.f16304a.scheduleAtFixedRate(new gs.a(jVar, i12), j10, j10, unit);
                Intrinsics.b(scheduledFuture, "scheduledFuture");
                mVar.f16329n = new i(scheduledFuture);
                Iterator it2 = ((List) mVar.f16325j.f11782b).iterator();
                while (it2.hasNext()) {
                    ((Function0) it2.next()).mo2invoke();
                }
                return;
            default:
                if (mVar.c()) {
                    if (mVar.f16330o != null) {
                        mVar.f16330o = null;
                        mVar.d("Transport: Heartbeat timeout. Attempt to re-establish connection");
                        mVar.f16332q = false;
                        o oVar = mVar.f16333r;
                        if (oVar != null) {
                            WebSocket webSocket = oVar.f16341a;
                            if (webSocket != null) {
                                webSocket.close(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, "heartbeat timeout");
                            }
                            oVar.f16341a = null;
                            return;
                        }
                        return;
                    }
                    int i13 = mVar.f16328m;
                    if (i13 != Integer.MAX_VALUE) {
                        i11 = i13 + 1;
                    }
                    mVar.f16328m = i11;
                    mVar.f16330o = String.valueOf(i11);
                    mVar.e("phoenix", "heartbeat", mVar.f16330o, null, p0.d());
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f16306a) {
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
