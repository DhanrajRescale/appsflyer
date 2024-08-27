package g7;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: f, reason: collision with root package name */
    public static final a1 f16645f;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f16646a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f16647b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f16648c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16649d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16650e;

    static {
        y0 y0Var = y0.f17134c;
        f16645f = new a1(y0Var, y0Var, y0Var);
    }

    public a1(z0 refresh, z0 prepend, z0 append) {
        boolean z10;
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        this.f16646a = refresh;
        this.f16647b = prepend;
        this.f16648c = append;
        boolean z11 = false;
        if (!(refresh instanceof w0) && !(append instanceof w0) && !(prepend instanceof w0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f16649d = z10;
        if ((refresh instanceof y0) && (append instanceof y0) && (prepend instanceof y0)) {
            z11 = true;
        }
        this.f16650e = z11;
    }

    public static a1 a(a1 a1Var, z0 refresh, z0 prepend, z0 append, int i10) {
        if ((i10 & 1) != 0) {
            refresh = a1Var.f16646a;
        }
        if ((i10 & 2) != 0) {
            prepend = a1Var.f16647b;
        }
        if ((i10 & 4) != 0) {
            append = a1Var.f16648c;
        }
        a1Var.getClass();
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        return new a1(refresh, prepend, append);
    }

    public final a1 b(b1 loadType, z0 newState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int ordinal = loadType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return a(this, null, null, newState, 3);
                }
                throw new NoWhenBranchMatchedException();
            }
            return a(this, null, newState, null, 5);
        }
        return a(this, newState, null, null, 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.a(this.f16646a, a1Var.f16646a) && Intrinsics.a(this.f16647b, a1Var.f16647b) && Intrinsics.a(this.f16648c, a1Var.f16648c);
    }

    public final int hashCode() {
        return this.f16648c.hashCode() + ((this.f16647b.hashCode() + (this.f16646a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.f16646a + ", prepend=" + this.f16647b + ", append=" + this.f16648c + ')';
    }
}
