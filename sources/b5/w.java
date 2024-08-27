package b5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class w extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3668e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f3669f;

    /* renamed from: g, reason: collision with root package name */
    public static final i5.w f3670g;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3671c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3672d;

    static {
        int i10 = e5.x.f15050a;
        f3668e = Integer.toString(1, 36);
        f3669f = Integer.toString(2, 36);
        f3670g = new i5.w(19);
    }

    public w() {
        this.f3671c = false;
        this.f3672d = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f3672d != wVar.f3672d || this.f3671c != wVar.f3671c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3671c), Boolean.valueOf(this.f3672d)});
    }

    public w(boolean z10) {
        this.f3671c = true;
        this.f3672d = z10;
    }
}
