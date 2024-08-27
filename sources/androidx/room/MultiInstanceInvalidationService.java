package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;
import l7.p;
import l7.q;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f2438a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2439b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final p f2440c = new p(this);

    /* renamed from: d, reason: collision with root package name */
    public final q f2441d = new q(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f2441d;
    }
}
