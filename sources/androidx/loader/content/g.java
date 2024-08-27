package androidx.loader.content;

import android.database.Cursor;
import android.os.Binder;
import android.os.Process;
import androidx.core.os.OperationCanceledException;
import androidx.work.k;
import j8.m;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import l7.s;
import l7.t;
import q6.l;
import t.j0;

/* loaded from: classes.dex */
public final class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2031a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f2032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2033c;

    public g(a aVar) {
        this.f2033c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [t.j0, t.f] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, j8.j] */
    /* JADX WARN: Type inference failed for: r8v0, types: [t.j0, t.f] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f2031a;
        Object obj = null;
        Object obj2 = this.f2033c;
        switch (i10) {
            case 0:
                a aVar = (a) obj2;
                aVar.f2025e.set(true);
                try {
                    Process.setThreadPriority(10);
                    a aVar2 = (a) obj2;
                    Object[] objArr = (Object[]) this.f2032b;
                    aVar2.getClass();
                    try {
                        obj = aVar2.f2028h.onLoadInBackground();
                    } catch (OperationCanceledException e10) {
                        if (!aVar2.f2024d.get()) {
                            throw e10;
                        }
                    }
                    Binder.flushPendingCommands();
                    return obj;
                } catch (Throwable th2) {
                    try {
                        ((a) obj2).f2024d.set(true);
                        throw th2;
                    } finally {
                        aVar.a(null);
                    }
                }
            default:
                Object obj3 = ((m) obj2).f21093a;
                ((s) obj3).c();
                try {
                    Cursor P = yk.g.P((s) ((m) obj2).f21093a, (t) this.f2032b, true);
                    try {
                        int i11 = l.i(P, "id");
                        int i12 = l.i(P, "state");
                        int i13 = l.i(P, "output");
                        int i14 = l.i(P, "run_attempt_count");
                        ?? j0Var = new j0(0);
                        ?? j0Var2 = new j0(0);
                        while (P.moveToNext()) {
                            if (!P.isNull(i11)) {
                                String string = P.getString(i11);
                                if (((ArrayList) j0Var.get(string)) == null) {
                                    j0Var.put(string, new ArrayList());
                                }
                            }
                            if (!P.isNull(i11)) {
                                String string2 = P.getString(i11);
                                if (((ArrayList) j0Var2.get(string2)) == null) {
                                    j0Var2.put(string2, new ArrayList());
                                }
                            }
                        }
                        P.moveToPosition(-1);
                        ((m) obj2).b(j0Var);
                        ((m) obj2).a(j0Var2);
                        ArrayList arrayList3 = new ArrayList(P.getCount());
                        while (P.moveToNext()) {
                            if (!P.isNull(i11)) {
                                arrayList = (ArrayList) j0Var.get(P.getString(i11));
                            } else {
                                arrayList = null;
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (!P.isNull(i11)) {
                                arrayList2 = (ArrayList) j0Var2.get(P.getString(i11));
                            } else {
                                arrayList2 = null;
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ?? obj4 = new Object();
                            obj4.f21067a = P.getString(i11);
                            obj4.f21068b = yk.g.F(P.getInt(i12));
                            obj4.f21069c = k.a(P.getBlob(i13));
                            obj4.f21070d = P.getInt(i14);
                            obj4.f21071e = arrayList;
                            obj4.f21072f = arrayList2;
                            arrayList3.add(obj4);
                        }
                        ((s) ((m) obj2).f21093a).h();
                        P.close();
                        return arrayList3;
                    } catch (Throwable th3) {
                        P.close();
                        throw th3;
                    }
                } finally {
                    ((s) obj3).f();
                }
        }
    }

    public final void finalize() {
        switch (this.f2031a) {
            case 1:
                ((t) this.f2032b).release();
                return;
            default:
                super.finalize();
                return;
        }
    }

    public g(m mVar, t tVar) {
        this.f2033c = mVar;
        this.f2032b = tVar;
    }
}
