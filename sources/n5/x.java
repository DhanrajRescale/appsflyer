package n5;

import java.util.UUID;

/* loaded from: classes.dex */
public final class x implements h5.b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f28323d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f28324a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f28325b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28326c;

    static {
        boolean z10;
        if ("Amazon".equals(e5.x.f15052c)) {
            String str = e5.x.f15053d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f28323d = z10;
            }
        }
        z10 = false;
        f28323d = z10;
    }

    public x(UUID uuid, byte[] bArr, boolean z10) {
        this.f28324a = uuid;
        this.f28325b = bArr;
        this.f28326c = z10;
    }
}
