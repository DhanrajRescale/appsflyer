package wl;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum p {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ONLY(true, true, false, false, false, true),
    /* JADX INFO: Fake field, exist only in values array */
    KATANA_ONLY(false, true, false, false, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_ONLY(false, false, true, false, true, false),
    /* JADX INFO: Fake field, exist only in values array */
    DIALOG_ONLY(false, true, true, false, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_AUTH(false, false, false, true, false, false);


    /* renamed from: a, reason: collision with root package name */
    public final boolean f39239a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f39240b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f39241c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f39242d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f39243e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f39244f;

    p(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f39239a = z10;
        this.f39240b = z11;
        this.f39241c = z12;
        this.f39242d = z13;
        this.f39243e = z14;
        this.f39244f = z15;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static p[] valuesCustom() {
        return (p[]) Arrays.copyOf(values(), 6);
    }
}
