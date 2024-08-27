package il;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum d {
    MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
    CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");


    /* renamed from: a, reason: collision with root package name */
    public final String f20103a;

    d(String str) {
        this.f20103a = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        return (d[]) Arrays.copyOf(values(), 2);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f20103a;
    }
}
