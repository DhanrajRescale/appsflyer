package wl;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum r {
    SUCCESS("success"),
    CANCEL("cancel"),
    ERROR("error");


    /* renamed from: a, reason: collision with root package name */
    public final String f39267a;

    r(String str) {
        this.f39267a = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static r[] valuesCustom() {
        return (r[]) Arrays.copyOf(values(), 3);
    }
}
