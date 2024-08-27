package kq;

import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import y3.q;

/* loaded from: classes2.dex */
public final class d implements f, g {

    /* renamed from: a, reason: collision with root package name */
    public final mq.c f23461a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f23462b;

    /* renamed from: c, reason: collision with root package name */
    public final mq.c f23463c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f23464d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f23465e;

    public d(Context context, String str, Set set, mq.c cVar, Executor executor) {
        this.f23461a = new pp.c(context, str);
        this.f23464d = set;
        this.f23465e = executor;
        this.f23463c = cVar;
        this.f23462b = context;
    }

    public final void a() {
        if (this.f23464d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!q.a(this.f23462b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f23465e, new c(this, 1));
        }
    }
}
