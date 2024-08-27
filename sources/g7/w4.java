package g7;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class w4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17112a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17113b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17114c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17115d;

    public w4(int i10, int i11, int i12, int i13) {
        this.f17112a = i10;
        this.f17113b = i11;
        this.f17114c = i12;
        this.f17115d = i13;
    }

    public final int a(b1 loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return this.f17113b;
                }
                throw new NoWhenBranchMatchedException();
            }
            return this.f17112a;
        }
        throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj;
        if (this.f17112a == w4Var.f17112a && this.f17113b == w4Var.f17113b && this.f17114c == w4Var.f17114c && this.f17115d == w4Var.f17115d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.f17115d) + Integer.hashCode(this.f17114c) + Integer.hashCode(this.f17113b) + Integer.hashCode(this.f17112a);
    }
}
