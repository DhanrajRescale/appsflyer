package tu;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes2.dex */
public final class k1 extends uu.a implements q0, f, uu.r {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f36489f = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public int f36490e;

    public k1(Object obj) {
        this._state$volatile = obj;
    }

    @Override // tu.p0, tu.g
    public final Object a(Object obj, yt.a aVar) {
        m(obj);
        return Unit.f23355a;
    }

    @Override // tu.t0
    public final List b() {
        return vt.x.a(getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        r6 = r6;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r11, r12) != false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x0091, B:16:0x0099, B:19:0x00a0, B:20:0x00a4, B:24:0x00a7, B:26:0x00c8, B:29:0x00d8, B:32:0x00ad, B:35:0x00b4, B:43:0x004d, B:45:0x0058, B:46:0x0082), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x0091, B:16:0x0099, B:19:0x00a0, B:20:0x00a4, B:24:0x00a7, B:26:0x00c8, B:29:0x00d8, B:32:0x00ad, B:35:0x00b4, B:43:0x004d, B:45:0x0058, B:46:0x0082), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2, types: [uu.c] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [tu.m1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [uu.a] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, tu.k1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d7 -> B:14:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e8 -> B:14:0x0091). Please report as a decompilation issue!!! */
    @Override // tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(tu.g r11, yt.a r12) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.k1.c(tu.g, yt.a):java.lang.Object");
    }

    @Override // tu.p0
    public final void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // uu.r
    public final f e(CoroutineContext coroutineContext, int i10, su.a aVar) {
        kp.g gVar = l1.f36497a;
        if (((i10 >= 0 && i10 < 2) || i10 == -2) && aVar == su.a.f34777b) {
            return this;
        }
        return x0.d(this, coroutineContext, i10, aVar);
    }

    @Override // tu.p0
    public final boolean f(Object obj) {
        m(obj);
        return true;
    }

    @Override // tu.i1
    public final Object getValue() {
        kp.g gVar = uu.u.f37465a;
        Object obj = f36489f.get(this);
        if (obj == gVar) {
            return null;
        }
        return obj;
    }

    @Override // uu.a
    public final uu.c h() {
        return new m1();
    }

    @Override // uu.a
    public final uu.c[] i() {
        return new m1[2];
    }

    public final boolean l(Object obj, Object obj2) {
        if (obj == null) {
            obj = uu.u.f37465a;
        }
        if (obj2 == null) {
            obj2 = uu.u.f37465a;
        }
        return n(obj, obj2);
    }

    public final void m(Object obj) {
        if (obj == null) {
            obj = uu.u.f37465a;
        }
        n(null, obj);
    }

    public final boolean n(Object obj, Object obj2) {
        int i10;
        uu.c[] cVarArr;
        kp.g gVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36489f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.a(obj3, obj)) {
                return false;
            }
            if (Intrinsics.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f36490e;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.f36490e = i12;
                uu.c[] cVarArr2 = this.f37413a;
                Unit unit = Unit.f23355a;
                while (true) {
                    m1[] m1VarArr = (m1[]) cVarArr2;
                    if (m1VarArr != null) {
                        for (m1 m1Var : m1VarArr) {
                            if (m1Var != null) {
                                AtomicReference atomicReference = m1Var.f36503a;
                                while (true) {
                                    Object obj4 = atomicReference.get();
                                    if (obj4 != null && obj4 != (gVar = l1.f36498b)) {
                                        kp.g gVar2 = l1.f36497a;
                                        if (obj4 == gVar2) {
                                            while (!atomicReference.compareAndSet(obj4, gVar)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj4, gVar2)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                            l.Companion companion = ut.l.INSTANCE;
                                            ((qu.i) obj4).resumeWith(Unit.f23355a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i10 = this.f36490e;
                        if (i10 == i12) {
                            this.f36490e = i12 + 1;
                            return true;
                        }
                        cVarArr = this.f37413a;
                        Unit unit2 = Unit.f23355a;
                    }
                    cVarArr2 = cVarArr;
                    i12 = i10;
                }
            } else {
                this.f36490e = i11 + 2;
                return true;
            }
        }
    }
}
