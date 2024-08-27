package b8;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.q;
import java.util.List;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class m implements ln.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f4117a;

    /* renamed from: b, reason: collision with root package name */
    public Provider f4118b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4119c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4120d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4121e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4122f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4123g;

    /* renamed from: h, reason: collision with root package name */
    public Object f4124h;

    /* renamed from: i, reason: collision with root package name */
    public Object f4125i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, b8.n] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l8.j, java.lang.Object] */
    public final n a() {
        ?? obj = new Object();
        obj.f4134h = new q(androidx.work.k.f2621c);
        obj.f4143q = new Object();
        obj.f4144r = null;
        obj.f4127a = (Context) this.f4117a;
        obj.f4133g = (m8.a) this.f4120d;
        obj.f4136j = (i8.a) this.f4119c;
        obj.f4128b = (String) this.f4123g;
        obj.f4129c = (List) this.f4124h;
        obj.f4130d = (h.c) this.f4125i;
        obj.f4132f = (ListenableWorker) this.f4118b;
        obj.f4135i = (androidx.work.d) this.f4121e;
        WorkDatabase workDatabase = (WorkDatabase) this.f4122f;
        obj.f4137k = workDatabase;
        obj.f4138l = workDatabase.n();
        obj.f4139m = workDatabase.i();
        obj.f4140n = workDatabase.o();
        return obj;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new on.h((Context) ((Provider) this.f4117a).get(), (kn.f) this.f4118b.get(), (pn.d) ((Provider) this.f4119c).get(), (on.j) ((Provider) this.f4120d).get(), (Executor) ((Provider) this.f4121e).get(), (qn.b) ((Provider) this.f4122f).get(), (rn.a) ((Provider) this.f4123g).get(), (rn.a) ((Provider) this.f4124h).get(), (pn.c) ((Provider) this.f4125i).get());
    }
}
