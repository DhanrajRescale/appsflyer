package l5;

import android.os.Handler;
import android.os.Message;
import e5.x;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class r implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final v5.e f24086a;

    /* renamed from: b, reason: collision with root package name */
    public final t9.c f24087b;

    /* renamed from: f, reason: collision with root package name */
    public m5.c f24091f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24092g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24093h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24094i;

    /* renamed from: e, reason: collision with root package name */
    public final TreeMap f24090e = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f24089d = x.l(this);

    /* renamed from: c, reason: collision with root package name */
    public final g6.b f24088c = new g6.b(1);

    public r(m5.c cVar, t9.c cVar2, v5.e eVar) {
        this.f24091f = cVar;
        this.f24087b = cVar2;
        this.f24086a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f24094i) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        p pVar = (p) message.obj;
        long j10 = pVar.f24079a;
        TreeMap treeMap = this.f24090e;
        long j11 = pVar.f24080b;
        Long l10 = (Long) treeMap.get(Long.valueOf(j11));
        if (l10 == null) {
            treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
        }
        return true;
    }
}
