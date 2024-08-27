package ft;

import java.util.concurrent.atomic.AtomicReference;
import yk.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b implements ct.b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f16240a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f16241b;

    /* JADX WARN: Type inference failed for: r0v0, types: [ft.b, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DISPOSED", 0);
        f16240a = r02;
        f16241b = new b[]{r02};
    }

    public static void b(AtomicReference atomicReference) {
        ct.b bVar;
        ct.b bVar2 = (ct.b) atomicReference.get();
        b bVar3 = f16240a;
        if (bVar2 != bVar3 && (bVar = (ct.b) atomicReference.getAndSet(bVar3)) != bVar3 && bVar != null) {
            bVar.a();
        }
    }

    public static boolean c(ct.b bVar) {
        return bVar == f16240a;
    }

    public static boolean d(AtomicReference atomicReference, ct.b bVar) {
        while (true) {
            ct.b bVar2 = (ct.b) atomicReference.get();
            if (bVar2 == f16240a) {
                if (bVar != null) {
                    bVar.a();
                    return false;
                }
                return false;
            }
            while (!atomicReference.compareAndSet(bVar2, bVar)) {
                if (atomicReference.get() != bVar2) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean e(AtomicReference atomicReference, ct.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("d is null");
        }
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.a();
                if (atomicReference.get() != f16240a) {
                    g.M(new IllegalStateException("Disposable already set!"));
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean f(ct.b bVar, ct.b bVar2) {
        if (bVar2 == null) {
            g.M(new NullPointerException("next is null"));
            return false;
        }
        if (bVar != null) {
            bVar2.a();
            g.M(new IllegalStateException("Disposable already set!"));
            return false;
        }
        return true;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f16241b.clone();
    }

    @Override // ct.b
    public final void a() {
    }
}
