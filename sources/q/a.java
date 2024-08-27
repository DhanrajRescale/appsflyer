package q;

import android.content.ComponentName;
import android.content.Context;
import com.google.firebase.messaging.t;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31438b;

    public a(Context context) {
        this.f31438b = context;
    }

    @Override // q.g
    public final void a(ComponentName componentName, t tVar) {
        tVar.y();
        this.f31438b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
