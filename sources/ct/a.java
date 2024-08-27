package ct;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import rt.e;
import zq.f;

/* loaded from: classes2.dex */
public final class a implements b, ft.a {

    /* renamed from: a, reason: collision with root package name */
    public e f13074a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f13075b;

    public static void g(e eVar) {
        if (eVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : eVar.f34000d) {
            if (obj instanceof b) {
                try {
                    ((b) obj).a();
                } catch (Throwable th2) {
                    f.l0(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw rt.b.b((Throwable) arrayList.get(0));
            }
            throw new CompositeException(arrayList);
        }
    }

    @Override // ct.b
    public final void a() {
        if (this.f13075b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f13075b) {
                    return;
                }
                this.f13075b = true;
                e eVar = this.f13074a;
                this.f13074a = null;
                g(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ft.a
    public final boolean b(b bVar) {
        if (d(bVar)) {
            bVar.a();
            return true;
        }
        return false;
    }

    @Override // ft.a
    public final boolean c(b bVar) {
        if (bVar != null) {
            if (!this.f13075b) {
                synchronized (this) {
                    try {
                        if (!this.f13075b) {
                            e eVar = this.f13074a;
                            if (eVar == null) {
                                eVar = new e(16);
                                this.f13074a = eVar;
                            }
                            eVar.a(bVar);
                            return true;
                        }
                    } finally {
                    }
                }
            }
            bVar.a();
            return false;
        }
        throw new NullPointerException("disposable is null");
    }

    @Override // ft.a
    public final boolean d(b bVar) {
        Object obj;
        if (bVar != null) {
            if (this.f13075b) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f13075b) {
                        return false;
                    }
                    e eVar = this.f13074a;
                    if (eVar != null) {
                        Object[] objArr = eVar.f34000d;
                        int i10 = eVar.f33997a;
                        int hashCode = bVar.hashCode() * (-1640531527);
                        int i11 = (hashCode ^ (hashCode >>> 16)) & i10;
                        Object obj2 = objArr[i11];
                        if (obj2 != null) {
                            if (obj2.equals(bVar)) {
                                eVar.b(i11, i10, objArr);
                                return true;
                            }
                            do {
                                i11 = (i11 + 1) & i10;
                                obj = objArr[i11];
                                if (obj == null) {
                                }
                            } while (!obj.equals(bVar));
                            eVar.b(i11, i10, objArr);
                            return true;
                        }
                    }
                    return false;
                } finally {
                }
            }
        }
        throw new NullPointerException("disposables is null");
    }

    public final void e(b... bVarArr) {
        int i10 = 0;
        if (!this.f13075b) {
            synchronized (this) {
                try {
                    if (!this.f13075b) {
                        e eVar = this.f13074a;
                        if (eVar == null) {
                            eVar = new e(bVarArr.length + 1);
                            this.f13074a = eVar;
                        }
                        int length = bVarArr.length;
                        while (i10 < length) {
                            b bVar = bVarArr[i10];
                            gt.e.a(bVar, "A Disposable in the disposables array is null");
                            eVar.a(bVar);
                            i10++;
                        }
                        return;
                    }
                } finally {
                }
            }
        }
        int length2 = bVarArr.length;
        while (i10 < length2) {
            bVarArr[i10].a();
            i10++;
        }
    }

    public final void f() {
        if (this.f13075b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f13075b) {
                    return;
                }
                e eVar = this.f13074a;
                this.f13074a = null;
                g(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
