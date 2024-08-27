package e1;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t.g0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f14932a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14934c;

    /* renamed from: g, reason: collision with root package name */
    public h f14938g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14939h;

    /* renamed from: i, reason: collision with root package name */
    public u f14940i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f14933b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final androidx.compose.foundation.layout.e f14935d = new androidx.compose.foundation.layout.e(this, 6);

    /* renamed from: e, reason: collision with root package name */
    public final g0 f14936e = new g0(this, 21);

    /* renamed from: f, reason: collision with root package name */
    public final v0.h f14937f = new v0.h(new u[16]);

    /* renamed from: j, reason: collision with root package name */
    public long f14941j = -1;

    public v(Function1 function1) {
        this.f14932a = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(v vVar) {
        boolean z10;
        Set set;
        synchronized (vVar.f14937f) {
            z10 = vVar.f14934c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference atomicReference = vVar.f14933b;
            Object obj = atomicReference.get();
            Set set2 = null;
            r4 = null;
            List list = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else if (obj instanceof List) {
                    List list2 = (List) obj;
                    set = (Set) list2.get(0);
                    if (list2.size() == 2) {
                        list = list2.get(1);
                    } else if (list2.size() > 2) {
                        list = list2.subList(1, list2.size());
                    }
                } else {
                    t0.t.G("Unexpected notification");
                    throw null;
                }
                List list3 = list;
                while (!atomicReference.compareAndSet(obj, list3)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z11;
            }
            synchronized (vVar.f14937f) {
                try {
                    v0.h hVar = vVar.f14937f;
                    int i10 = hVar.f37655c;
                    if (i10 > 0) {
                        Object[] objArr = hVar.f37653a;
                        int i11 = 0;
                        do {
                            if (!((u) objArr[i11]).b(set2) && !z11) {
                                z11 = false;
                                i11++;
                            }
                            z11 = true;
                            i11++;
                        } while (i11 < i10);
                    }
                    Unit unit = Unit.f23355a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f14937f) {
            try {
                v0.h hVar = this.f14937f;
                int i10 = hVar.f37655c;
                if (i10 > 0) {
                    Object[] objArr = hVar.f37653a;
                    int i11 = 0;
                    do {
                        u uVar = (u) objArr[i11];
                        uVar.f14924e.f37656a.a();
                        uVar.f14925f.a();
                        uVar.f14930k.f37656a.a();
                        uVar.f14931l.clear();
                        i11++;
                    } while (i11 < i10);
                }
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(Object obj, Function1 function1, Function0 function0) {
        Object obj2;
        u uVar;
        synchronized (this.f14937f) {
            v0.h hVar = this.f14937f;
            int i10 = hVar.f37655c;
            if (i10 > 0) {
                Object[] objArr = hVar.f37653a;
                int i11 = 0;
                do {
                    obj2 = objArr[i11];
                    if (((u) obj2).f14920a == function1) {
                        break;
                    } else {
                        i11++;
                    }
                } while (i11 < i10);
            }
            obj2 = null;
            uVar = (u) obj2;
            if (uVar == null) {
                Intrinsics.d(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                zq.f.z(1, function1);
                uVar = new u(function1);
                hVar.b(uVar);
            }
        }
        boolean z10 = this.f14939h;
        u uVar2 = this.f14940i;
        long j10 = this.f14941j;
        if (j10 != -1 && j10 != dp.b.f1()) {
            al.d.e1("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j10 + "), currentThread={id=" + dp.b.f1() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            throw null;
        }
        try {
            this.f14939h = false;
            this.f14940i = uVar;
            this.f14941j = Thread.currentThread().getId();
            uVar.a(obj, this.f14936e, function0);
        } finally {
            this.f14940i = uVar2;
            this.f14939h = z10;
            this.f14941j = j10;
        }
    }
}
