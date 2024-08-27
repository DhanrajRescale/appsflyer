package vk;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f38143a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38144b;

    public a(byte[] bArr) {
        this.f38143a = bArr;
        this.f38144b = Arrays.hashCode(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Arrays.equals(this.f38143a, ((a) obj).f38143a);
    }

    public final int hashCode() {
        return this.f38144b;
    }
}
