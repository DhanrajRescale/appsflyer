package u5;

import e5.x;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements b5.k {

    /* renamed from: d, reason: collision with root package name */
    public static final String f36793d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f36794e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f36795f;

    /* renamed from: a, reason: collision with root package name */
    public final int f36796a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f36797b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36798c;

    static {
        int i10 = x.f15050a;
        f36793d = Integer.toString(0, 36);
        f36794e = Integer.toString(1, 36);
        f36795f = Integer.toString(2, 36);
    }

    public j(int i10, int i11, int[] iArr) {
        this.f36796a = i10;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f36797b = copyOf;
        this.f36798c = i11;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f36796a == jVar.f36796a && Arrays.equals(this.f36797b, jVar.f36797b) && this.f36798c == jVar.f36798c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f36797b) + (this.f36796a * 31)) * 31) + this.f36798c;
    }
}
